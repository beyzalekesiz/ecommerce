<template>
<!--  <v-card class="overflow-hidden">-->
<!--    <v-app-bar-->
<!--        absolute-->
<!--        color="#6A76AB"-->
<!--        dark-->
<!--        shrink-on-scroll-->
<!--        prominent-->
<!--        v-bind:src="require('@/assets/ecommerce-home-bar.jpg')"-->
<!--        fade-img-on-scroll-->
<!--        scroll-target="#scrolling-techniques-3"-->
<!--    >-->
<!--      <template v-slot:img="{ props }">-->
<!--        <v-img-->
<!--            v-bind="props"-->
<!--            gradient="to top right, rgba(100,115,201,.7), rgba(25,32,72,.7)"-->
<!--        ></v-img>-->
<!--      </template>-->

<!--      <v-app-bar-nav-icon></v-app-bar-nav-icon>-->

<!--      <v-app-bar-title>Welcome</v-app-bar-title>-->

<!--      <v-spacer></v-spacer>-->

<!--      <v-btn>-->
<!--        Sign Up-->
<!--        <v-icon>mdi-account</v-icon>-->
<!--      </v-btn> &nbsp;-->

<!--      <v-btn>-->
<!--        Sign In-->
<!--        <v-icon>mdi-account</v-icon>-->
<!--      </v-btn>-->

<!--      <v-btn icon>-->
<!--        <v-icon>mdi-heart</v-icon>-->
<!--      </v-btn>-->

<!--      <v-btn icon>-->
<!--        <v-icon>mdi-dots-vertical</v-icon>-->
<!--      </v-btn>-->

<!--      <template v-slot:extension>-->
<!--        <v-tabs align-with-title>-->
<!--          <v-tab>Tab 1</v-tab>-->
<!--          <v-tab>Tab 2</v-tab>-->
<!--          <v-tab>Tab 3</v-tab>-->
<!--        </v-tabs>-->
<!--      </template>-->
<!--    </v-app-bar>-->
<!--    <v-sheet-->
<!--        id="scrolling-techniques-3"-->
<!--        class="overflow-y-auto"-->
<!--        max-height="1000"-->
<!--    >-->
<!--      <v-container style="height: 1300px;"></v-container>-->
<!--    </v-sheet>-->
<!--  </v-card>-->
  <div>
    <h1>Welcome</h1> <br>
    <v-row>

      <v-btn @click="$router.push('about')">
<!--        <router-link to="/about"> &nbsp;-->
          ABOUT
<!--        </router-link>-->
      </v-btn>

      &nbsp; &nbsp;
      <v-btn @click="$router.push('register')">
        <!--        <router-link to="/about"> &nbsp;-->
        SIGN UP
        <!--        </router-link>-->
      </v-btn>

      &nbsp; &nbsp;
      <v-btn @click="$router.push('login')">
        <!--        <router-link to="/about"> &nbsp;-->
        SIGN IN
        <!--        </router-link>-->
      </v-btn>

      &nbsp; &nbsp;
      <v-btn @click="$router.push('admin')">
        <!--        <router-link to="/about"> &nbsp;-->
        ADMIN PANEL
        <!--        </router-link>-->
      </v-btn>

      &nbsp; &nbsp;
      <v-btn @click="$router.push('category')">
        <!--        <router-link to="/about"> &nbsp;-->
        CATEGORIES
        <!--        </router-link>-->
      </v-btn>

      &nbsp; &nbsp;
      <v-btn @click="$router.push('product')">
        <!--        <router-link to="/about"> &nbsp;-->
        PRODUCTS
        <!--        </router-link>-->
      </v-btn>

    </v-row>
  </div>

</template>

<script>

</script>