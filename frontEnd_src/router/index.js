import { createRouter, createWebHistory } from "vue-router";
import HomePage from "../views/HomePage.vue";
import AllChat from "../components/AllChat.vue";
import AddChat from "../components/AddChat.vue";
import UpdateChat from "../components/UpdateChat.vue";
import DeleteChat from "../components/DeleteChat.vue";

const routes = [
  { path: "/homepage", component: HomePage },
  { path: "/allchat", component: AllChat },
  { path: "/addchat", component: AddChat },
  { path: "/updatechat", component: UpdateChat },
  { path: "/deletechat", component: DeleteChat },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
