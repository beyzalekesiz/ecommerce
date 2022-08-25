import Vue from 'vue'
import Vuex from 'vuex'
//import axios from "axios";
Vue.use(Vuex);
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'
import RegisterPage from "@/components/RegisterPage";
import LoginPage from "@/components/LoginPage";
import Admin from "@/views/AdminView";
import AddCategory from "@/components/AddCategory";
import CategoryPage from "@/components/CategoryPage";
//import createPersistedState from "vuex-persistedstate";
//import auth from './index';

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/about',
    name: 'about',
    component: AboutView
  }, {
    path: '/register',
    name: 'register',
    component: RegisterPage
  },
  {
    path: '/login',
    name: 'login',
    component: LoginPage
  },
  {
    path: '/admin',
    name: 'admin',
    component: Admin
  },
  {
    path: '/category',
    name: 'Category',
    component: CategoryPage
  },
  {
    path: '/admin/category',
    name: 'AdminCategory',
    component: CategoryPage
  },
  {
    path: '/admin/addCategory',
    name: 'AddCategory',
    component: AddCategory
  }


]
const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router;



