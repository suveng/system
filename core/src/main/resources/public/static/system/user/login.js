/**
 * 系统
 */
$(document).ready(function () {
   console.log("系统登录功能");
   document.getElementById("login").addEventListener("click",login);
});

/**
 * 校验脚本
 */
check = function () {
    console.log("校验脚本")

};

/**
 * 登录脚本
 */
login = function () {
    console.log("登录脚本");
    $.ajax({
        url:"/sys/console/user/login",
        type:"post",
        dataType: "json",
        data: {"username":"su","password":"123"},
        success: function (data) {
            console.log(data);
            window.location.href="/sys/console/";
        }
    })
};


