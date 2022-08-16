<template>
  <form @submit.prevent="submitLogin">
    <h1>Sign In</h1> <br><br>
    <label>Email:</label> &nbsp;
    <input type = "email" required v-model="email"> <br><br>

    <label>Password:</label> &nbsp;
    <input type = "password" required v-model="password"> <br><br>

    <div class="submit" type="button">
      <button>Submit</button>
    </div> <br><br>
    <p>Email: {{ email }}</p>
    <p>Password: {{ password }}</p>
  </form>

</template>

<script>
import axios from "axios";
import router from "@/router";

export default {
  name: "LoginPage",
  data() {
    return {
      email: '',
      password: ''
    }
  },

  methods: {
    submitLogin() {
      console.log("Successfully signed in.")
      console.log('email: ', this.email)
      alert("Successfully signed in.")

      axios.post('http://localhost:8080/users/login', {
        email: this.email,
        password: this.password
      })
          .then(function (response) {
            console.log(response);
            router.push('home');
          })
          .catch(function (error) {
            console.log(error);
          })
    }

  }
}
</script>

<style scoped>

</style>