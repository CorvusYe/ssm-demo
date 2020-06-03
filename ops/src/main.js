// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import { Api } from '@/api/api'
import router from './router'
import Vant from 'vant'
import 'vant/lib/index.css'

Vue.config.productionTip = false

Vue.prototype.api = new Api({
  domain: 'http://localhost/ssm-demo'
})

Vue.use(Vant)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
