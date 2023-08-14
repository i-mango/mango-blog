import defaultSettings from '../../settings'

interface State {
  title: string
  logo: string
  fixedHeader: boolean
  sidebarLogo: boolean
  defaultOpeneds: string[]
}

const state: State = {
  title: defaultSettings.title,
  logo: defaultSettings.logo,
  fixedHeader: defaultSettings.fixedHeader,
  sidebarLogo: defaultSettings.sidebarLogo,
  defaultOpeneds: defaultSettings.defaultOpeneds,
}

interface Mutation {
  CHANGE_SETTING: (state: State, payload: { key: keyof State, value: any }) => void
}

const mutations: Mutation = {
  CHANGE_SETTING(state, { key, value }) {
    if (Object.prototype.hasOwnProperty.call(state, key)) {
      state[key] = value
    }
  }
}

interface ActionContext {
  commit: (mutationType: keyof Mutation, payload: any) => void
}

interface Actions {
  changeSetting(context: ActionContext, data: { key: keyof State, value: any }): void
}

const actions: Actions = {
  changeSetting({ commit }, data) {
    commit('CHANGE_SETTING', data)
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}

