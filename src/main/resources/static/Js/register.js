$(document).ready(function(){
    var isregister_flag=0;
    var register_btn_change=0;
    function isPhoneNo(phone) { 
        if(!(/^((13[0-9])|(15[^4,\\D])|(18[0-9])|(17[0-9])|(14[0-9])|(19[9]))\d{8}$/.test(phone))){ 
            return false; 
        }  
        return true;
    }
    function strCheck(str){
        if(str.length>7){
            if(/([a-zA-Z]+[0-9]+|[0-9]+[a-zA-Z])/.exec(str)){
                return true;
            }else{
                return false;
            }
        }else{
          return false;
        }
    }
    function isEmailNo(email) { 
        if(!(/^[\w\-\.]+@[\w\-\.]+(\.\w+)+$/.test(email))){ 
            return false; 
        }  
        return true;
    }
    $(".register-style input").focus(function() {
        $(this).parent().css("border", "2px solid #11A3E7");
        $(this).parent().parent().parent().next().children(".register-error").css("display", "none");
        $(this).nextAll("span").css("display", "none");
        $(this).val("");
    }).blur(function(){
        $(this).parent().css("border","2px solid #DDDDDD");
        $(this).nextAll(".register-icon-ok").css("display","inline");
        isregister_flag=0;
    });
    $("#username").blur(function(){
        verifyusername();
    });
    $("#userphone").blur(function(){
        verifyuserphone();
    });
    $("#useremail").blur(function(){
        verifyuseremail();
    });
    $("#userpwd1").blur(function(){
        verifyuserpwd1();
    });
    $("#userpwd2").blur(function(){
        verifyuserpwd2();
    });
    $("#uservcode").blur(function () {
        verifyuservcode();
    });
    $(".register-tip a").click(function(){
        if(register_btn_change==0){
            $("#phone-register").css("display","none");
            $("#phone-register").next().css("display","none");
            $("#email-register").css("display","table-row");
            $(this).html("手机注册");
            register_btn_change=1;
        }else{
            $("#email-register").css("display","none");
            $("#email-register").next().css("display","none");
            $("#phone-register").css("display","table-row");
            $(this).html("邮箱注册");
            register_btn_change=0;
        }
    })
    function verifyusername(){
        var username=$("#username").val();
        if(username==""){
            $("#username-error").html("用户名不能为空");
            $("#username").parent().css("border","2px solid #F13B35");
            $("#username-error").css("display","block");
            $("#username").nextAll(".register-icon-remove").css("display","inline");
            $("#username").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }else if(!strCheck(username)){
            $("#username-error").html("用户名必须包含数字和字符两种字符，并且是8个字符及以上");
            $("#username").parent().css("border","2px solid #F13B35");
            $("#username-error").css("display","block");
            $("#username").nextAll(".register-icon-remove").css("display","inline");
            $("#username").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }
    }
    function verifyuserphone(){
        var userphone=$("#userphone").val();
        if(userphone==""){
            $("#userphone-error").html("手机号不能为空");
            $("#userphone").parent().css("border","2px solid #F13B35");
            $("#userphone-error").css("display","block");
            $("#userphone").nextAll(".register-icon-remove").css("display","inline");
            $("#userphone").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }else if(!isPhoneNo(userphone)){
            $("#userphone-error").html("请正确输入手机号");
            $("#userphone").parent().css("border","2px solid #F13B35");
            $("#userphone-error").css("display","block");
            $("#userphone").nextAll(".register-icon-remove").css("display","inline");
            $("#userphone").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }
    }
    function verifyuseremail(){
        var useremail=$("#useremail").val();
        if(useremail==""){
            $("#useremail-error").html("邮箱号不能为空");
            $("#useremail").parent().css("border","2px solid #F13B35");
            $("#useremail-error").css("display","block");
            $("#useremail").nextAll(".register-icon-remove").css("display","inline");
            $("#useremail").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }else if(!isEmailNo(useremail)){
            $("#useremail-error").html("请正确输入邮箱号");
            $("#useremail").parent().css("border","2px solid #F13B35");
            $("#useremail-error").css("display","block");
            $("#useremail").nextAll(".register-icon-remove").css("display","inline");
            $("#useremail").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }
    }
    function verifyuserpwd1(){
        var userpwd1=$("#userpwd1").val();
        if(userpwd1==""){
            $("#userpwd1-error").html("密码不能为空");
            $("#userpwd1").parent().css("border","2px solid #F13B35");
            $("#userpwd1-error").css("display","block");
            $("#userpwd1").nextAll(".register-icon-remove").css("display","inline");
            $("#userpwd1").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }else if(!strCheck(userpwd1)){
            $("#userpwd1-error").html("密码必须包含数字和字符两种字符，并且是8个字符及以上");
            $("#userpwd1").parent().css("border","2px solid #F13B35");
            $("#userpwd1-error").css("display","block");
            $("#userpwd1").nextAll(".register-icon-remove").css("display","inline");
            $("#userpwd1").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }
    }
    function verifyuserpwd2(){
        var userpwd1=$("#userpwd1").val();
        var userpwd2=$("#userpwd2").val();
        if(userpwd2==""){
            $("#userpwd2-error").html("密码不能为空");
            $("#userpwd2").parent().css("border","2px solid #F13B35");
            $("#userpwd2-error").css("display","block");
            $("#userpwd2").nextAll(".register-icon-remove").css("display","inline");
            $("#userpwd2").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }else if(!strCheck(userpwd2)){
            $("#userpwd2-error").html("密码必须包含数字和字符两种字符，并且是8个字符及以上");
            $("#userpwd2").parent().css("border","2px solid #F13B35");
            $("#userpwd2-error").css("display","block");
            $("#userpwd2").nextAll(".register-icon-remove").css("display","inline");
            $("#userpwd2").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }
        if(userpwd1!=userpwd2){
            $("#userpwd2-error").html("两次密码不一致");
            $("#userpwd2").parent().css("border","2px solid #F13B35");
            $("#userpwd2-error").css("display","block");
            $("#userpwd2").nextAll(".register-icon-remove").css("display","inline");
            $("#userpwd2").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }
    }
    function verifyuservcode(){
        var uservcode=$("#uservcode").val();
        if(uservcode==""){
            $("#uservcode-error").html("验证码不能为空");
            $("#uservcode").parent().css("border","2px solid #F13B35");
            $("#uservcode-error").css("display","block");
            $("#uservcode").nextAll(".register-icon-remove").css("display","inline");
            $("#uservcode").nextAll(".register-icon-ok").css("display","none");
            isregister_flag=1;
        }else {
            $.post("/vcode.action", {vcode: uservcode}, function (result){
                if(result=="true"){
                    $("#uservcode").parent().css("border","2px solid #DDDDDD");
                    $("#uservcode").next().next().css("display","inline");
                }else {
                    $("#uservcode-error").html("验证码不正确");
                    $("#uservcode").parent().css("border","2px solid #F13B35");
                    $("#uservcode-error").css("display","block");
                    $("#uservcode").nextAll(".register-icon-remove").css("display","inline");
                    $("#uservcode").nextAll(".register-icon-ok").css("display","none");
                    isregister_flag=1;
                }
            });
        }
    }
    $("#register-btn").click(function () {
        var pwd=$("#userpwd2").val();
        var email=$("#useremail").val();
        var phone=$("#userphone").val();
        var name=$("#username").val();
        verifyusername();
        if(register_btn_change==0){
            verifyuserphone();
        }else {
            verifyuseremail();
        }
        verifyuserpwd1();
        verifyuserpwd2();
        verifyuservcode();
        if(isregister_flag==0){
            $.post("/register.action",{username:name,userphone:phone,useremail:email,userpwd:pwd},function f(result) {
                if(result=="true"){
                    $(location).attr("href", "/registersuccess");
                }else {
                    $(location).attr("href", "/registerfail");
                }
            })
        }
    })
});
function changeVerifyCode() {
    document.getElementById("login-vcode-img").src = "verifycode.action?t=" + Math.random();
}