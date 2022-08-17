<template>
  <form @submit.prevent="submitLogin">
    <h1>Sign In</h1> <br><br>
    <label>Email:</label> &nbsp;
    <input type = "email" required v-model="email"> <br><br>

    <label>Password:</label> &nbsp;
    <input type = "password" required v-model="password"> <br><br>

   <!-- <div class="submit" type="button">
      <button>Submit
      </button>
    </div> <br><br> -->

    <v-btn
        class="mr-4"
        type="submit"
        @click = "submitLogin"
    >

      <div v-if="isLogin" v-bind:style="{ 'background-color': 'red' }">
        <router-link class="mr-4"  type="submit" tag="button" to="/">Submit</router-link>
      </div>

    </v-btn>

    <div v-if="!isLogin">
      <p>Password or email is invalid!</p>
    </div>

    <p>Email: {{ email }}</p>
    <p>Password: {{ password }}</p>
  </form>

</template>

<script>
import axios from "axios";
//import router from "@/router";

export default {
  name: "LoginPage",
  data() {
    return {
      email: '',
      password: '',
      isLogin:false
    }
  },

  methods: {
    async submitLogin() {

      await axios.post('http://localhost:8080/users/login', {
        email: this.email,
        password: this.password
      })
          .then(res => this.isLogin = res.data.success);
      console.log(this.isLogin);
    }

  }
}
</script>

<style scoped>

</style>