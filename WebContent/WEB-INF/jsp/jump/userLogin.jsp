<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.main {
	text-align: center; /*让div内部文字居中*/
	background-color: #D0D0D0;
	border-radius: 20px;
	width: 400px;
	height: 350px;
	margin: auto;
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
}
</style>
</head>
<body style="background-color: #D0D0D0;">
	<img src="<%=path%>/resource/img/copy_logo.jpg" class="img-circle" />
	<div class="container">
		<div class="main">
			<form class="form-horizontal">
				<div class="form-group">
					<div class="page-header">
						<h1>
							History Infomation System <small>信息科值班软件</small>
						</h1>
					</div>
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label"><span
						class="glyphicon glyphicon-user" aria-hidden="true"></span></label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="xtUserName" id="xtUserName"
							placeholder="账户">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">
						<span class="glyphicon glyphicon-lock" aria-hidden="true"></span>
					</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" name="password" id="password"
							placeholder="密码">
					</div>
				</div>
				
				<div class="form-group">
					
					
						验证码 :<img alt="验证" src="<%=path%>/jumps/goCode.do" style="margin-bottom:15px" onclick="changeImg()" id="imgVcode">
				
						<span id="login_faile" style="color: red"></span><br/>
					   请输入验证码:<input type="text" id="codeValue"/>
				
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
					
						
							<label>  Remember me
							<input type="checkbox" class="ace" id="rePwd" name="saveUsers" value="ok" />
							</label>
						
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-9">
						<input type="button" id="login" value="登 录" class="   btn btn-default" onclick="loginPage()"/>
						<a href="<%=path%>/jumps/goChangePwd.do">忘记密码?</a><a>注册账户</a>
					</div>
				</div>
			</form>
		</div>
	</div>
	
	<!--验证码修改  -->
     <script type="text/javascript">
     function changeImg(){
      var img = document.getElementById("imgVcode");
      var time = new Date().getTime();//拿到当前时间 
       	 	img.src = img.src +'?' + time;    	
    } 
     </script>

     <!--登录  -->
     <script type="text/javascript">
     function loginPage() {
    	 if(($('#codeValue').val().trim()==null)||($('#codeValue').val().trim()=="")){
    		 $("#login_faile").html('验证码不为空');
    		 return;
    	 }
    	 
    	 $.ajax({
              type: "GET",
              url: "<%=path%>/user/goSuccess.do",
              data:{xtUserName:$("#xtUserName").val(),password:$("#password").val(),codeValue:$("#codeValue").val()},
        	    dataType:"text",  
              error:function(data){ 
                  alert("登录出错！！:"); 
              }, 
              success:function(data){ 
              
                if(data=="fail2")
            	{
                	$("#login_faile").html('验证码不正确');
                	
            	  
            	  
            	}
                if(data=="success")
                	{
        
                	 
                     window.alert(data);
                	   location.href='<%=path%>/jumps/goShowZhiBan.do';
                	}
                if(data=="fail3")
                	{
                	$("#login_faile").html('密码不正确');

               	    
                	}
              }
            
          });

	}
     </script>
</body>
</html>