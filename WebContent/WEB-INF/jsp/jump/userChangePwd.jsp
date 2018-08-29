<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="../include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form >
 <select id="xtUserId">
    <c:forEach  items="${dicList}" var="mdl">
   <option value="${mdl.xtUserId}" >${mdl.xtUserName}</option>
    </c:forEach>
    </select>
  <input type="password" id="password" name="password" onblur="checkPassword()"/> 
   <input type="password" id="password1"/>
   <span id="warning" style="color: red"></span> 
    <input type="button" value="test" id="btn" onclick="updatePwd()"/>点击  
</form>
<script type="text/javascript">
function updatePwd(){
	$.ajax({
        type: 'GET',
        url: '<%=path%>/user/updatePwd.do',
        data: {
        	     xtUserId:$("#xtUserId").val(),
        	     password1:$("#password1").val(),
   
        },
          
          error: function(XMLHttpRequest, textStatus, errorThrown) {
             alert(XMLHttpRequest.status);
             alert(XMLHttpRequest.readyState);
             alert(textStatus);
               },
            
            success:function(data){  
            if(data=="success")
               {
            	window.alert("修改成功");
            	location.href='<%=basePath%>jumps/goLoginPage.do';
               }
            if(data=="fail")
               {
            	 
                      
               }
           
            }
          
        });


}
function checkPassword(){
	$.ajax({
        type: 'GET',
        url: '<%=path%>/user/checkPwd.do',
        data: {
        	     xtUserId:$("#xtUserId").val(),
        	     password:$("#password").val(),
   
        },
          
          error: function(XMLHttpRequest, textStatus, errorThrown) {
             alert(XMLHttpRequest.status);
             alert(XMLHttpRequest.readyState);
             alert(textStatus);
               },
            
            success:function(data){  
            if(data=="success")
               {
            	$("#warning").html('');
            	$("#btn").attr('disabled',false);
               }
            if(data=="fail")
               {
            	 $("#warning").html('密码输入不对');
            	 $("#btn").attr('disabled',true);
                      
               }
           
            }
          
        });

}

     </script>
</body>
</html>