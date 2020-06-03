<template>
  <van-form @submit="onSubmit">
    <van-field
      v-model="username"
      name="username"
      label="用户名"
      placeholder="用户名"
      :rules="[{ required: true, message: '请填写用户名' }]"
    />
    <van-field
      v-model="password"
      type="password"
      name="password"
      label="密码"
      placeholder="密码"
      :rules="[{ required: true, message: '请填写密码' }]"
    />
    <div style="margin: 16px;">
      <van-button round block type="info" native-type="submit" @click="submit">
        提交
      </van-button>
    </div>
  </van-form>
</template>
<script>

export default {
  data() {
    return {
      username: '',
      password: '',
    };
  },
  props: {
    ip: {
      type: String,
      default: ''
    }
  },

  computed: {
    formatIp() {
      return'http://' + this.ip
    }
  },
  methods: {
    onSubmit(values) {
      let _ = this

      // this.ip
      // this.formatIp
      // this.username


      console.info(values)
      this.api.demoInsert(values).then(res => {
        console.log('submit', res);
      })

      $.ajax({
        url: 'http://localhost/ssm-demo/demo/insert',
        data: {

        }
      })
    },
  },
};
</script>

<style>

</style>
