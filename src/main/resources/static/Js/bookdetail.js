var isdisplay=0;

if($(".textcontent1").outerHeight()<150){
    $(".textcontent1").next().css("display","none");
    $(".textcontent1").removeClass("hide-more");
}
if($(".textcontent2").outerHeight()<150){
    $(".textcontent2").next().css("display","none");
    $(".textcontent2").removeClass("hide-more");
}
if($(".textcontent3").outerHeight()<150){
    $(".textcontent3").next().css("display","none");
    $(".textcontent3").removeClass("hide-more");
}
if($(".textcontent4").outerHeight()<150){
    $(".textcontent4").next().css("display","none");
    $(".textcontent4").removeClass("hide-more");
}
if($(".textcontent5").outerHeight()<150){
    $(".textcontent5").next().css("display","none");
    $(".textcontent5").removeClass("hide-more");
}
if($(".textcontent6").outerHeight()<150){
    $(".textcontent6").next().css("display","none");
    $(".textcontent6").removeClass("hide-more");
}
$(".isdisplay").click(function(){
    if(isdisplay==0){
        $(this).prev(".text-words").removeClass("hide-more");
        $(this).html("收起全部内容&gt;&gt;");
        isdisplay=1;
    }else{
        $(this).prev(".text-words").addClass("hide-more");
        $(this).html("显示全部内容&gt;&gt;");
        isdisplay=0;
    }
    
});
$(".decrease").click(function () {
    var num=$("#number").val();
    if(num==1){
        alert("数量已经为1不能再减！");
    }else {
        num=num-1;
    }
    $("#number").val(num);
});
$(".increase").click(function () {
    var num=$("#number").val();
    num=parseInt(num);
    num+=1;
    $("#number").val(num);
});
$(".addcart a").click(function () {
    var booknumber=$("#number").val();
    $.post("/addcart.action",{booknumber:booknumber},function (data) {
        if(data=="true"){
            alert("添加成功！")
        }
    })
});