<template>
  <form @submit.prevent="submitLogin">
    <h1>Sign In</h1> <br><br>
    <label>Email:</label> &nbsp;
    <input type = "email" required v-model="email"> <br><br>

    <label>Password:</label> &nbsp;
    <input type = "password" required v-model="password"> <br><br>

    <!--
    <div class="submit" type="button">
      <button>Submit
      </button>
    </div> <br><br> -->

    <v-btn class="submit" @click = "submitLogin">
      <div v-if="isLogin" >

      </div>
    </v-btn>

    <p>Email: {{ email }}</p>
    <p>Password: {{ password }}</p>
  </form>

</template>

<script>
import axios from "axios";
//import router from "@/router";
//import router from "@/router";

export default {
  name: "LoginPage",
  data() {
    return {
      email: '',
      password: '',
      isLogin: false
    }
  },

  methods: {
    async submitLogin() {
      const userInfo = {
        email: this.email,
        password: this.password
      }
      await axios.post('http://localhost:8080/users/login', {userInfo})
          .then(res => this.isLogin = res.data.success);
      console.log(this.isLogin);



    }

  }
}
</script>

<style scoped>

</style>