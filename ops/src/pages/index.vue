<template>
  <div class="index">
    <van-list
      finished-text="没有更多了"
    >
    <van-row v-for="user in users" :key="user.id">
      <van-col :span="12"><van-cell>{{user.id}}</van-cell></van-col>
      <van-col :span="6"><van-cell>{{user.username}}</van-cell></van-col>
      <van-col :span="6"><van-cell>{{user.password}}</van-cell></van-col>
    </van-row>
    </van-list>
  </div>
</template>
<script>

export default {
  components: {
  },
  data() {
    return {
      users: []
    }
  },
  methods: {
    getUsers() {
      let _ = this
      _.api.demoUsers().then(res => {
        _.users = res
      })
    }
  },
  mounted() {
    let _ = this
    _.getUsers()
  }
}
</script>
<style>
.index .card.van-cell-group.van-panel {
    margin: 10px;
    border-radius: 12px;
    overflow: hidden;
}
</style>
