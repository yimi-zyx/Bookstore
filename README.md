 #书城网站主要页面展示及说明

1、用户注册
>>1.1用户注册分为手机注册和邮箱注册<br>
![ss](https://github.com/yimi-zyx/Bookstore/blob/master/src/main/resources/static/image/defaultheadportrait.png)
1.2用户名、手机号、邮箱号必须是唯一的<br>
1.3验证用户输入的信息后，当输入框失去焦点将进行输入信息是否符合要求检测<br>
1.4用户输入完信息后点击注册，先进行前端判断字符串是否符合要求<br>
1.5前端检测符合要求，在进行后端检测，通过Ajax.post请求将输入的信息传到后台进行判断再返回结果，
  若返回结果为ture则进入注册成功页面；若返回结果false，则转入到注册失败页面，同时也会将返回错误原因显示在页面上
  
2、用户登录
  >>2.1用户可以使用昵称、手机号、邮箱号进行登录<br>
  2.2用户密码采用两次MD5加密<br>
  2.3采用图片验证码进行用户验证<br>
  2.4采用Ajax.post请求传输数据进行后台验证，再将结果返回进行判断，
  若返回状态为true，则进入主页面；若返回状态为false，则转入到登录失败页面，同时也会将返回错误原因显示在页面上
 
3、找回密码
  >>3.1找回密码分为四个步骤：<br>
      第一步填写账号：填写账号，以及验证码，实时检测该账户是否存在<br>
       第二步进行身份验证：得到第一步中的用户的手机号，进行短信验证（未测试）<br>
       第三步设置新密码：验证通过后填写新密码，使用MD5两次加密<br>
       第四步判断完成设置：完成密码重置，用户选择是否回到登录页面<br>
 
4、我的购物车
   >>4.1通过ajax传数据实现商品的删除与收藏以及数量的修改功能<br>
   4.2编辑收货地址，若用户点击结算后，收货人信息未设置，将显示填写收货人页面，
   此页面通过Ajax传数据实现了城市联动下拉菜单功能，其中城市数据是通过在网站上爬取的<br>
   4.3确认订单信息，点击提交信息后，展示订单提交成功页面<br>
   
5、个人中心
  >>5.1用户可重置手机号、邮箱号、密码<br>
  5.2用户可查看交易记录<br>
  5.3用户可查看交易流程（暂未实现后台功能）<br>
  5.4用户可充值书币（用于购买书）<br>
  
6、主页面
  >>6.1主页面头部是logo图和搜索框，输入要是搜索内容如：“小说”点击搜索，进入结果页面<br>
  其中搜索结果页面显示搜索结果条数，以及图书信息<br>
  6.2导航栏为图书分类，分类数据是再页面加载之前通过Ajax获得数据库中的分类信息。点击导航将跳转到对应类型页面，
  例如点击“科学科技”，跳转到具体页面：此页面上半部分是将该类型再细分的分类导航，下半部分分别列出了各类图籍<br>
  6.3以轮播图展示精品书籍<br>
  6.4展示了热销书籍、特别推出、热销作家、新书上架等板块类型书籍<br>
  
7、书籍详情页面
  >>7.1此页面展示了书籍的详细情况以及添加购物车，（由于未在网上找到各书籍的目录及内容，页面下半部分暂未实现内容替换）<br>
   
 
 

