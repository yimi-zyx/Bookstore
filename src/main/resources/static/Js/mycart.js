
$(".goodsnumdes").click(function () {
    var num=$(this).next().val();
    var index=$(".goodsnumdes").index(this);
    var goodssaleprice=$(".goodssaleprice").eq(index).html();
    var goodscutprice=$(".goodscutprice").eq(index).html();
    var bool=$('input[name="checkbox"]').eq(index).is(':checked');
    goodssaleprice=parseFloat(goodssaleprice);
    goodscutprice=parseFloat(goodscutprice);
    num=parseInt(num).toFixed(2);
    if(num==1){
        alert("商品已经为1件，不能再减少了！");
    }else {
        num=num-1;
    }
    if(bool){
        var totalsprice=$("#totalsprice").html();
        totalsprice=parseFloat(totalsprice);
        var reduceprice=$("#reduceprice").html();
        reduceprice=parseFloat(reduceprice);
        totalsprice=totalsprice-goodssaleprice;
        reduceprice=reduceprice-goodscutprice
        $("#totalsprice").html((totalsprice).toFixed(2));
        $("#reduceprice").html((reduceprice).toFixed(2));
        $(".totals").html((totalsprice-reduceprice).toFixed(2));
    }
    $(this).next().val(num);
    $(".realprice").eq(index).html((num*(goodssaleprice-goodscutprice)).toFixed(2));
});
$(".goodsnuminc").click(function () {
    var num=$(this).prev().val();
    var index=$(".goodsnuminc").index(this);
    var goodssaleprice=$(".goodssaleprice").eq(index).html();
    var goodscutprice=$(".goodscutprice").eq(index).html();
    var bool=$('input[name="checkbox"]').eq(index).is(':checked');
    goodssaleprice=parseFloat(goodssaleprice);
    goodscutprice=parseFloat(goodscutprice);
    num=parseInt(num);
    num=num+1;
    if(bool){
        var totalsprice=$("#totalsprice").html();
        totalsprice=parseFloat(totalsprice);
        var reduceprice=$("#reduceprice").html();
        reduceprice=parseFloat(reduceprice);
        totalsprice=totalsprice+goodssaleprice;
        reduceprice=reduceprice+goodscutprice
        $("#totalsprice").html((totalsprice).toFixed(2));
        $("#reduceprice").html((reduceprice).toFixed(2));
        $(".totals").html((totalsprice-reduceprice).toFixed(2));
    }
    $(".realprice").eq(index).html((num*(goodssaleprice-goodscutprice)).toFixed(2));
    $(this).prev().val(num);
});


function allcheckbox(c) {
    var clildcheck=document.getElementsByName("checkbox");
    var price=0,cutprice=0;
    for (var i=0;i<clildcheck.length;i++){
        clildcheck[i].checked=c;
        if(c==false){
            price=0;
            cutprice=0;
        }else {
            price+=parseFloat($(".goodssaleprice").eq(i).html())*parseFloat($(".goodsnum").eq(i).val());
            cutprice+=parseFloat($(".goodscutprice").eq(i).html())*parseFloat($(".goodsnum").eq(i).val());
        }
    }
    $("#totalsprice").html(price.toFixed(2));
    $("#reduceprice").html(cutprice.toFixed(2));
    $(".totals").html((price-cutprice).toFixed(2));
    $(".goodstotalnumber").html($("input[name='checkbox']:checked").length);


}
$('input[name="checkbox"]').click(function () {
    var bool=$(this).is(':checked');
    var index=$('input[name="checkbox"]').index(this);
    var num=$(".goodsnum").eq(index).val();
    var price=$(".goodssaleprice").eq(index).html();
    var cutprice=$(".goodscutprice").eq(index).html();
    var totalsprice=$("#totalsprice").html();
    totalsprice=parseFloat(totalsprice)
    var reduceprice=$("#reduceprice").html();
    reduceprice=parseFloat(reduceprice)
    var totals=$(".totals").html();
    if(bool==false){
        $("#allcheckbox").prop('checked',false)
        totalsprice-=num*price;
        reduceprice-=num*cutprice;
    }else {
        totalsprice+=num*price;
        reduceprice+=num*cutprice;
    }
    $(".goodstotalnumber").html($("input[name='checkbox']:checked").length);
    $("#totalsprice").html(totalsprice);
    $("#reduceprice").html(reduceprice);
    $(".totals").html(totalsprice-reduceprice);
});
$(document).ready(function () {
    allcheckbox(true);
});
$(".singledelete").click(function () {
    var bool=confirm("是否删除该商品？");
    var index=$(".singledelete").index(this);
    var  cartbookid=$(".cartbookid").eq(index).html();
    if(bool==true){
        $.post("/singledelete.action",{cartbookid:cartbookid},function (data) {
            if(data=="true"){
                window.location.reload();
            }
        })
    }
});
$("#deleteselectgoods").click(function () {
    var bool=confirm("是否删除所选该商品？");
    var cartbookid="";
    var index=0;
    if(bool==true){
        var clildcheck=document.getElementsByName("checkbox");
        for (var i=0;i<clildcheck.length;i++){
            if (clildcheck[i].checked){
               cartbookid=cartbookid+$(".cartbookid").eq(i).html()+",";
               index=1;
            }
        }
        if(index==1){
            $.post("/deleteselect.action",{cartbookid:cartbookid},function (data) {
                if(data=="true"){
                    window.location.reload();
                }
            })
        }else {
            alert("请勾选要删除的商品！")
        }

    }
});
$("#favoriteselectgoods").click(function () {
    var bool=confirm("是否收藏所选该商品？");
    var cartbookid="";
    var index=0;
    if(bool==true){
        var clildcheck=document.getElementsByName("checkbox");
        for (var i=0;i<clildcheck.length;i++){
            if (clildcheck[i].checked){
                cartbookid=cartbookid+$(".cartbookid").eq(i).html()+",";
                index=1;
            }
        }
        if(index==1){
            $.post("/favoriteselect.action",{cartbookid:cartbookid},function (data) {
                if(data=="true"){
                    // window.location.reload();
                    alert("已经成功添加！");
                }
            })
        }else {
            alert("请勾选需要收藏的商品！")
        }

    }
});
// 结算
$("#closeaccounts").click(function () {
    var cartbookid="";
    var index=0;
    var clildcheck=document.getElementsByName("checkbox");
    var number="";
    for (var i=0;i<clildcheck.length;i++){
        if (clildcheck[i].checked){
            cartbookid=cartbookid+$(".cartbookid").eq(i).html()+",";
            number=number+$(".goodsnum").eq(i).val()+",";
            index=1;
        }
    }
    if(index===1){
        $.post("/closeaccounts.action",{cartbookid:cartbookid,bookcount:number},function (data) {
            console.log(data);
                $("#cartgoodsdisplay").html(data);
                $(".mycart").css("display","none");
                $(".editinfo").css("display","block");
        })
    }else {
        alert("请先勾选需要收藏的商品！")
    }
});
$("#province").change(function () {
    var valuename=$("#province").find("option:selected").text();
    $.post("/getcity",{value:valuename,arg:4},function (data) {
        $("#city1").html(data);
    });
});
$("#city1").change(function () {
    var valuename=$("#city1").find("option:selected").text();
    $.post("/getcity",{value:valuename,arg:6},function (data) {
        $("#city2").html(data);
    });
});
$("#city2").change(function () {
    var valuename=$("#city2").find("option:selected").text();
    $.post("/getcity",{value:valuename,arg:12},function (data) {
        $("#city3").html(data);
    });
});
function isPhoneNo(phone) {
    if(!(/^((13[0-9])|(15[^4,\\D])|(18[0-9])|(17[0-9])|(14[0-9])|(19[9]))\d{8}$/.test(phone))){
        return false;
    }
    return true;
}
$("#info-submitbtn").click(function () {
    var receiver=$("input[name='receiver']").val();
    var phone=$("input[name='receiverphone']").val();
    var address=$(".details-address").val();
    var str=$("#province").find("option:selected").text()+$("#city1").find("option:selected").text()+$("#city2").find("option:selected").text()+$("#city3").find("option:selected").text()+address;
    if(receiver==""||receiver==null){
        alert("请填写完信息！");
    }else if(phone==""||phone==null){
        alert("请填写完信息！");
    }else if(!isPhoneNo(phone)){
        alert("请正确填写手机！");
    }else if(address==""||address==null){
        alert("请填写完信息！");
    }else {
        $.post("/consigneeinfo",{receiver:receiver,phone:phone,address:str},function () {
            $(".mycart-title1").removeClass("color-change1");
            $(".mycart-title2").addClass("color-change2");
            $(".receiver").html(receiver);
            $(".receiverphone").html(phone);
            $(".detail-direction").html(str);
            $(".editinfo").css("display","none");
            $(".confirmorder").css("display","block");
        })

    }
});
$("#submitinfobtn").click(function () {
    var totals=$(".totals").html();
    $.post("/submitinfo",{totals:totals},function (data) {
        $(".confirmorder").css("display","none");
        $(".successcommit").css("display","block");
        $(".ordercode").html(data);
        $(".mycart-title2").removeClass("color-change2");
        $(".mycart-title3").addClass("color-change3");
    })
});

