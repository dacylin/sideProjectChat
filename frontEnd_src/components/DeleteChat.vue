<template>
  <h5>刪除留言</h5>
  <el-input v-model="id" placeholder="輸入要刪除的ID"></el-input>
  <el-button type="primary" @click="deletechat">確定刪除</el-button>
  <hr />
  {{ message }}
</template>
<script>
import axios from "axios";
export default {
  name: "DeleteChat",
  data() {
    return {
      id: "",
      message: "",
    };
  },

  methods: {
    deletechat() {
      let ID = this.id;

      axios
        .delete("http://192.168.7.94:8080/chat/deletechat/" + ID)
        .then((response) => (this.message = response.data))
        .catch(function (error) {
          console.log(error);
        });
    },
  },
};
</script>
<style></style>
