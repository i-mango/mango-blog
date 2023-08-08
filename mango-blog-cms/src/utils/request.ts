import axios from "axios";
import NProgress from "nprogress";
import 'nprogress/nprogress.css'
import { Message } from "@element-plus/icons-vue";

const request = axios.create({
  baseURL: "http://localhost:3000",
  timeout: 5000
});

// 请求拦截器
request.interceptors.request.use(config => {
  const userJson = localStorage.getItem("user") || "{}";
  const user = userJson ? JSON.parse(userJson) : null;
  if (userJson !== '{}' && user.role !== 'ROLE_admin' && config.method !== 'get') {
    return config
  }
  NProgress.start()
  const token = window.localStorage.getItem('token')
  if (token) {
    config.headers.Authorization = token
  }
  return config
},
  (error) => {
    return Promise.reject(error)
  }
  )

// 响应拦截器
request.interceptors.response.use(response => {
  NProgress.done()
  const res = response.data
  if(res.code === 200) {
    let msg = res.msg || "操作成功";
    Message.error(msg)
    return Promise.reject(new Error(msg))
  }
  return res
},error => {
  Message.error(error.message)
  return Promise.reject(error)
}
)

export default request;