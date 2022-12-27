function login()
{
    var userName = document.getElementById("user1").value;
    var userPass = document.getElementById("passwd1").value;

   if (userName == "" || userName == null) {
        alert("用户名不能为空");
        return false;
    }
    else if (userPass == "" || userPass == null) {
        alert("密码不能为空");
        return false;
    }
    $.ajax({
        url: "http://localhost:8080/controller_login",
        method: "post",
        data: {'name': $("#user1").val(), 'password': $("#passwd1").val()},
        // xhrFields: {
        //   withCredentials: true //允许跨域带Cookie
        // },
        success: function (result) {
            if(result == "Y")
                window.location.href ="../home_page.html";
            else
                alert("密码错误");
        },
        error: function (result) {
            alert(result.responseText)
        }
    })
}