<template>
  <div id="app">
    <header>留言版</header>
    <main><RouterView></RouterView></main>
    <aside>
      <div class="in">
        <p>
          <RouterLink to="/homepage">
            <img
              src="@/assets/home.png"
              alt="回頁首"
              style="cursor: pointer; width: 32px; height: 32px"
            />
          </RouterLink>
        </p>

        <p>
          <RouterLink to="/allchat">
            <img
              src="@/assets/allchat.png"
              alt="查詢全部"
              style="cursor: pointer; width: 32px; height: 32px"
            />
          </RouterLink>
        </p>

        <p>
          <RouterLink to="/addchat">
            <img
              src="@/assets/addchat.png"
              alt="新增"
              style="cursor: pointer; width: 32px; height: 32px"
            />
          </RouterLink>
        </p>
        <p>
          <RouterLink to="/updatechat">
            <img
              src="@/assets/update.png"
              alt="修改"
              style="cursor: pointer; width: 32px; height: 32px"
            />
          </RouterLink>
        </p>
        <p>
          <RouterLink to="/deletechat">
            <img
              src="@/assets/delete.png"
              alt="刪除"
              style="cursor: pointer; width: 32px; height: 32px"
            />
          </RouterLink>
        </p>
      </div>
    </aside>
    <footer>FOOTER</footer>
  </div>
</template>
<script></script>
<style>
@charset "UTF-8";
* {
  margin: 0;
  padding: 0;
}

.in {
  display: flex;
  flex-direction: column;
  gap: 16px;
  margin-top: 30px;
  margin-left: 55px;
}

body {
  width: 80%;
  min-width: 600px;
  max-width: 960px;
  background: beige;
  margin: 0 auto;
}
header {
  text-align: center;
  width: 100%;
  height: 20px;
  background: #eaeaea;
}
main {
  width: 80%;
  height: 300px;
  background: deepskyblue;
  float: right;
}
aside {
  width: 18%;
  height: 300px;
  background: orange;
  float: left;
}
footer {
  width: 100%;
  height: 20px;
  text-align: center;
  background: #eaeaea;
  clear: both;
}
</style>
