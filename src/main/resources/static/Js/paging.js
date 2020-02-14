$(".paging-titles").on("click",function () {
    $(this).parent("span").siblings().children("span").removeClass("paging-titles-modify");
    $(this).addClass("paging-titles-modify");
    var classname=$(this).html();
    var e=$(this).parent().parent().children(".paging-content");
     $.post("/paging.action",{classname:classname},function (data) {
         e.html(data);
         console.log(data)
    });
});
$(".classify-text span").click(function () {
    $(".classify-text span").css("background","-webkit-linear-gradient(top,white, #d2f7ff,lightblue)");
    $(this).css("background","-webkit-linear-gradient(top,white,lightblue, #1fb0ff)");
    var m=$(this).html();
    $(".paging-titles").each(function () {
        if(m==$(this).html()){
            var t = $(this).parent("span").parent().offset().top;  //#test是需要跳转的div id位置
            $(window).scrollTop(t);
            $(this).parent("span").siblings().children("span").removeClass("paging-titles-modify");
            $(this).addClass("paging-titles-modify");
            var classname=$(this).html();
            var e=$(this).parent().parent().children(".paging-content");
            $.post("/paging.action",{classname:classname},function (data) {
                e.html(data);
                console.log(data)
            });
        }
    });
});