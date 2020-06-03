
import { apis } from './apis'
import axios from 'axios'

let token = localStorage.getItem('token')
axios.defaults.headers.common['auth'] = `Bearer ${token}`;

axios.defaults.headers['Content-Type'] = 'application/x-www-form-urlencoded'

export class Api {
  constructor(conf) {
    this.domain = conf.domain
    this.apis = conf.apis || apis
    this._init()
  }

  _init() {
    let _ = this
    for (var k in _.apis) {
      this[k] = _._get(k)
    }
  }

  _getApi(apiId) {
    return this.apis[apiId]
  }

  _get(apiId) {
    let _ = this
    return (params) => {
      let q = Object.assign({}, _._getApi(apiId))
      q.data = params
      q.url = `${_.domain}${q.url}`
      return fetch(q.url , {
        method: "POST",
        mode: 'cors',
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded'
        },
        body:  params ? Object.keys(params).map((key) => {
          return encodeURIComponent(key) + '=' + encodeURIComponent(params[key]);
        }).join('&') : null
      }).then(res => {
        return res.json()
      })
    }
  }
}
