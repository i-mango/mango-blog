import { defineStore } from 'pinia';

export const useAppStore = defineStore('app', {
  state: () => ({
    sidebar: false,
    device: 'desktop',
  }),
  getters: {
    sidebar: state => state.sidebar,
    device: state => state.device,
  },
});