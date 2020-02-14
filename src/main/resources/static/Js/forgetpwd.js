$("#forgetpwd-account").focus(function () {
    $("#forgetpwd-accounterror").addClass("hide");
    $(this).val("");
});
$("#forgetpwd-vcode").focus(function () {
    $("#forgetpwd-vcodeerror").addClass("hide");
    $(this).val("");
});
$("#forgetpwd-inputpwd1").focus(function () {
    $("#forgetpwd-pwd1error").addClass("hide");
    $(this).val("");
});
$("#forgetpwd-inputpwd2").focus(function () {
    $("#forgetpwd-pwd2error").addClass("hide");
    $(this).val("");
});

$("#forgetpwd-next-btn").click(function(){
    var userinfo=$("#forgetpwd-account").val();
    var verifycode=$("#forgetpwd-vcode").val();
    if(userinfo==null||userinfo==""){
        $("#forgetpwd-accounterror").html("请输入用户名");
        $("#forgetpwd-accounterror").removeClass("hide");
       changeVerifyCode();
    }else if(verifycode==null||verifycode==""){
        $("#forgetpwd-vcodeerror").html("请输入验证码");
        $("#forgetpwd-vcodeerror").removeClass("hide");
       changeVerifyCode();
    }else {
        $.post("/verifyuser.action", {userinfo: userinfo, verifycode: verifycode}, function (result) {
            if (result == "false2") {
                $("#forgetpwd-vcodeerror").html("验证码不正确");
                $("#forgetpwd-vcodeerror").removeClass("hide");
               changeVerifyCode();
            } else if (result == "false1") {
                $("#forgetpwd-accounterror").html("该用户不存在");
                $("#forgetpwd-accounterror").removeClass("hide");
               changeVerifyCode();
            } else {
                $(".forgetpwd-blankinfo").addClass("hide");
                $(".forgetpwd-account2").addClass("plan-activity");
                $(".forgetpwd-verifyidentity").removeClass("hide");
                $("#forgetpwd-verifyway-phone").val($.getAttribute("User"));
            }
        });
    }
});

function changeVerifyCode() {
    document.getElementById("verifycodeimg").src = "verifycode.action?t=" + Math.random();
}
var forgetpwdverify=0;
$("#forgetpwd-verifytext a").click(function () {
    if(forgetpwdverify==0){
        $(this).html("手机验证");
        $("#forgetpwd-verifyway-phone").addClass("hide");
        $("#forgetpwd-verifyway-email").removeClass("hide");
        $("#forgetpwd-textstyle").html("邮箱验证");
        forgetpwdverify=1;
    }else {
        $(this).html("邮箱验证");
        $("#forgetpwd-verifyway-phone").removeClass("hide");
        $("#forgetpwd-verifyway-email").addClass("hide");
        $("#forgetpwd-textstyle").html("手机验证");
        forgetpwdverify=0;
    }
});
$("#forgetpwd-next-btn2").click(function () {
    $(".forgetpwd-verifyidentity").addClass("hide");
    $(".forgetpwd-settingnewpwd").removeClass("hide");
    $(".forgetpwd-account3").addClass("plan-activity");
});
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
$("#forgetpwd-ok-btn").click(function () {
    var userpwd1=$("#forgetpwd-inputpwd1").val();
    var userpwd2=$("#forgetpwd-inputpwd2").val();
    if(userpwd1==null||userpwd1==""||!strCheck(userpwd1)){
        $("#forgetpwd-pwd1error").html("请正确输入密码");
        $("#forgetpwd-pwd1error").removeClass("hide");
    } else if(userpwd2==null||userpwd2==""||!strCheck(userpwd2)){
        $("#forgetpwd-pwd2error").html("请正确输入密码");
        $("#forgetpwd-pwd2error").removeClass("hide");
    }else if(userpwd1!=userpwd2){
        $("#forgetpwd-pwd2error").html("两次密码不一致");
        $("#forgetpwd-pwd2error").removeClass("hide");
    } else {
        $.post("/settingnewpwd.action", {userpwd: userpwd2}, function (result) {
            if(result=="true"){
                $(".forgetpwd-settingnewpwd").addClass("hide");
                $(".forgetpwd-finish").removeClass("hide");
                $(".forgetpwd-account4").addClass("plan-activity");
            }else {
                $("#forgetpwd-pwd2error").html("设置密码失败");
                $("#forgetpwd-pwd2error").removeClass("hide");
            }
        });
    }
});
