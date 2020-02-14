$(".hot-recomend-ul a img").mouseover(function (e) {
    e.stopPropagation()//阻止冒泡事件
});
$(".hot-recomend-ul a").mouseover(function () {
 $(this).css({"color":"rgb(49, 86, 165)","text-decoration":"underline"});
}).mouseout(function(){
    $(this).css({"color":"#000","text-decoration":" none"});
});


$(".axxdal .morehot-display1").on("mouseover",function(){
    $(this).css("display","none");
    $(this).next().css("display","block");
    $(".axx1").css("display","block");
    $(".axx2").css("display","none");
});

 $(".axxdal .morehot-display2").on("mouseout",function(){
    $(this).css("display","none");
        $(this).prev().css("display","block");
        $(".axx1").css("display","none");
        $(".axx2").css("display","block");
});
$(".feature-nav li>a").on("mouseover",function () {
    $(".feature-nav li>a").css("color","#000");
    $(".feature-nav-line").css("display","none");
    $(this).css("color","#e4393c");
    $(this).next().css("display","block");
    var string=$(this).html();
    $(".feature-righttitle").html(string+"热销榜");
    $.post("/featuretype.action",{type:string},function (data) {
        $(".feature-left").html(data.leftstr);
        $(".feature-rightcontent").html(data.rightstr);
    });
});
$(".author-nav li>a").on("mouseover",function () {
    $(".author-nav li>a").css("color","#000");
    $(".author-nav-line").css("display","none");
    $(this).css("color","#e4393c");
    $(this).next().css("display","block");
    var string=$(this).html();
    $.post("/authortype.action",{atype:string},function (data) {
        $(".author-detailin").html(data.leftstr);
        $(".relation-tr").html(data.rightstr);
    });
    // console.log($(".author-detailin").html());
    // console.log($(".relation-tr").html())
});
$(".newbooktable td").on("mouseover",function () {
    var j=$(this).parent().prevAll().length;
    var i=$(this).prevAll().length;
    var index=(4*j+i);
   // alert(index)
    $.get("/changnewbook.action",{num:index},function (data) {

        $(".newbookputaway-content-left-link a").attr("title",data.bookname);
        $(".newbookputaway-content-left-link a>img").attr("src",data.bookimg);
        $(".newbookputaway-content-left-bookname a").html(data.bookname).attr("title",data.bookname);
        $(".newbookputaway-content-left-detail-inner").html(data.bookbrief);
        $("#newbooknewprice").html('￥'+data.booknewprice);
        $("#newbookoldprice").html('￥'+data.bookoldprice);
        console.log(data.booknewprice)
    });
});