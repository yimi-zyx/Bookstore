$("#header-search-input").focus(function(){
    $(this).parent().css("border","2px solid #3385FF")
}).blur(function(){
    $(this).parent().css("border","2px solid #B9C2D0")
});
$(".operate").mouseover(function () {
    $(".operate").css("display","block");
}).mouseout(function () {
    $(".operate").css("display","none");
});
$("#header-user").mouseover(function () {
    $(".operate").css("display", "block");
}).mouseout(function () {
    $(".operate").css("display","none");
});
$(".navigationul li>a").on("click",function () {
    // $(".navigation-content a").css(" background-color","38AAEC");
    $(this).addClass("addcolor");
});
$("#header-search-btn").click(function () {
   var text=$("#header-search-input").val();
   if (text=='') {
       alert("请输入内容！");
   }else {
       $.post("/search.action",{text:text},function f(data) {
            $(location).attr('href', '/books?text='+text);
       });
   }

});