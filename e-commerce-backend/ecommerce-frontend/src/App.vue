<template>
  <v-app>
    <v-main>
      <HomeView/>
      <!--<Toolbar/>-->
      <br> <br>
      <router-view/>
      <!-- <RegisterPage/> -->

    </v-main>
  </v-app>
</template>

<script>
//import Toolbar from './components/ToolBar'
//import RegisterPage from "@/components/RegisterPage";
//import HomeView from "@/views/HomeView";
export default {
  name: 'App',
  //components: {Toolbar},
  data: () => ({
    //
  }),
};
</script>
