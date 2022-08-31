<template>
  <form @submit.prevent="submitEvent">
    <h1>Sign Up</h1> <br><br>
    <label>Name:</label> &nbsp;
    <input type = "name" required v-model="name"> <br><br>

    <label>Email:</label> &nbsp;
    <input type = "email" required v-model="email"> <br><br>

    <label>Password:</label> &nbsp;
    <input type = "password" required v-model="password"> <br><br>

    <div class="terms"> &nbsp;
      <input type = "checkbox" required v-model="terms">
      &nbsp; <label>Accept terms and conditions</label>
    </div> <br><br>

    <div class="submit" type="button">
      <button>Submit</button>
    </div> <br><br>

    <p>Email: {{ email }}</p>
    <p>Terms accepted: {{ terms }}</p>
  </form>
</template>


<script>
import axios from "axios";
import router from "@/router";
//import router from "@/router";

export default {
  data() {
    return {
      email: '',
      password: '',
      terms: false,
      passwordError: ''
    }
  },
  methods: {
    submitEvent() {
      console.log("Successfully registered.")
      console.log('name: ', this.name)
      console.log('email: ', this.email)
      console.log('terms accepted: ', this.terms)
      alert("Successfully signed up.")

      axios.post('http://localhost:8080/users/addUser', {
        name: this.name,
        email: this.email,
        password: this.password
      })
          .then(function (response) {
            console.log(response);
            router.push('login');
          })
          .catch(function (error) {
            console.log(error);
          })
    },
    mounted() {

    }

  }
}
</script>


<style>

form{
  max-width: 500px;
  margin: 30px auto;
  background: cadetblue;
  text-align: left;
  padding: 40px;
  border-radius: 10px;
  border: 1px solid black;
}

 input {
   display: block;
   padding: 10px 6px;
   background: white;
   width: 100%;
   box-sizing: border-box;
   /*border-bottom: 1px solid black;*/
   border-radius: 8px;
 }

 input[type="checkbox"] {
   display: inline-block;
   position: relative;
   width: 20px;
 }

 button {
   background: midnightblue;
   padding: 10px 20px;
   color: white;
   border-radius: 8px;

 }
 .submit {
   text-align: left;
 }
</style>