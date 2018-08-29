<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	onload = function() {
		document.getElementById("toright1").onclick = function() {
			var arr = document.getElementById("left").options;
			for (var i = 0; i < arr.length; i++) {
				if (arr[i].selected) {
					document.getElementById("right").appendChild(arr[i]);
					i--;

				}
			}
		}

		document.getElementById("toleft1").onclick = function() {
			var arr = document.getElementById("right").options;
			for (var i = 0; i < arr.length; i++) {
				if (arr[i].selected) {
					document.getElementById("left").appendChild(arr[i]);
					i--;

				}
			}
		}
	}
</script>
</head>
<body>

	<table>
		<tr>
			<td>
			上班人员
			<select id="left" multiple="true" style="width: 100px;"
				size="10">
					<c:forEach items="${zhiban}" var="mdl">
						<option value="${mdl.xtUserId}">${mdl.xtPerName}</option>
					</c:forEach>
			</select></td>
			<td>
			<input type="button" value=">>" id="toright1" /> 
			</td>
			<td>
			<input type="button" value="<<" id="toleft1" />
			</td>
			<td>
			没上班的
			<select id="right" multiple="true" style="width: 100px;"
				size="10">
				<c:forEach items="${weizhiban}" var="mdl">
						<option value="${mdl.xtUserId}">${mdl.xtPerName}</option>
					</c:forEach>
				</select>
				</td>
		</tr>

	</table>
     <button onclick="savePriel()">点击</button>
     <script type="text/javascript">
      
     function savePriel(){
         var prirelLeftId = document.getElementById("left");
         var prirelLeftValues = new Array();
         for (var i = 0; i < prirelLeftId.options.length; i++) {
             prirelLeftValues[i] = prirelLeftId.options[i].value;
         }

         //数组序列化成Json字符串
         var prirelLeftJson = JSON.stringify(prirelLeftValues);
         
         var prirelRightId = document.getElementById("right");
         var prirelRightValues = new Array();
         for (var i = 0; i < prirelRightId.options.length; i++) {
             prirelRightValues[i] = prirelRightId.options[i].value;
         }

         //数组序列化成Json字符串
         var prirelRightJson = JSON.stringify(prirelRightValues);
          
         var c = $.extend({}, prirelLeftJson,prirelRightJson);
         window.alert(c);
         $.ajax({
             type:'POST',
             data:{'prirelRightJson':prirelRightJson,'prirelLeftJson':prirelLeftJson},
             /* contentType: "application/json; charset=utf-8", */
             url:'<%=path%>/user/updateState.do',
            /*  dataType: "json",  */
             success:function(result){
            	 
                if(result=="success")
                	{
                	  location.reload();
                	}
             }
         });
    }
     
     </script>
</body>
</html>