$(document).ready(function(){
    $(".login-style-right input").focus(function(){
        $(this).parent().css("border","2px solid #11A3E7");
    }).blur(function(){
        $(this).parent().css("border","2px solid #DDDDDD");
    });
    $("#login-user").focus(function(){
        $(this).parent().css("border","2px solid #11A3E7");
    }).blur(function(){
        var userval=$("#login-user").val();
        if(userval==null|userval==""){
            $(this).parent().css("border","2px solid #F13B35");
            $("#login-error").html("用户名不能为空");
            $("#login-error").css("display","block");
        } 
    })
    $("#login-pwd").focus(function(){
        $(this).parent().css("border","2px solid #11A3E7");
        var userval=$("#login-user").val();
        if(userval==null|userval==""){
            $("#login-error").html("用户名不能为空");
            $("#login-error").css("display","block");
        }else{
            $("#login-error").css("display","none");
        }
    }).blur(function(){
        var user=$("#login-user").val();
        var userpwd=$("#login-pwd").val();
        if(userpwd==null|userpwd==""){
            $("#login-error").html("密码不能为空");
           if(user==null|user==""){
            $("#login-error").html("用户名、密码不能为空");
           }
           $("#login-error").css("display","block");
           $(this).parent().css("border","2px solid #F13B35");
        }   
    });
    $("#login-vcode").focus(function () {
        $(this).parent().css("border","2px solid #11A3E7");
    }).blur(function () {
        var uservcode=$("#login-vcode").val();
        if(uservcode==""||uservcode==null){
            $("#login-error").html("验证码不能为空");
            $("#login-error").css("display","block");
            $(this).parent().css("border","2px solid #F13B35");
        }
    })
    $("#login-btn").click(function () {
        var username=$("#login-user").val();
        var userpwd=$("#login-pwd").val();
        var uservcode=$("#login-vcode").val();
        if(username==null||username==""){
            $("#login-error").css("display","block");
            $("#login-error").html("账号不能为空");
            if(userpwd==null||userpwd==""){
                $("#login-error").css("display","block");
                $("#login-error").html("账号、密码不能为空");
                if(uservcode==null||uservcode=="") {
                    $("#login-error").css("display", "block");
                    $("#login-error").html("账号、密码、验证码不能为空");
                }
            }
        }else {
            if(userpwd==null||userpwd==""){
                $("#login-error").css("display","block");
                $("#login-error").html("密码不能为空");
            }else {
                if(uservcode==null||uservcode=="") {
                    $("#login-error").css("display", "block");
                    $("#login-error").html("验证码不能为空");
                }else {
                    $.post("/login.action",{username:username,userpwd:userpwd,uservcode:uservcode},function f(result) {
                        if(result=="true"){
                            $(location).attr("href", "/");
                        }else {
                            $("#login-error").html(result);
                            $("#login-error").css("display", "block");
                        }
                    })
                }
            }
        }
    });
});
function changeVerifyCode() {
    document.getElementById("login-vcode-img").src = "verifycode.action?t=" + Math.random();
}
