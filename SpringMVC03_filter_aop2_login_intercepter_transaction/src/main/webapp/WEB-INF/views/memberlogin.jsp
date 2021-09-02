<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#loginChk").hide();
	});
	
	function login(){
		var memberid = $("#memberid").val().trim();
		var memberpw = $("#memberpw").val().trim();
		
		//id랑 pw를 가지고 와서 자바스크립트 객체에 담음
		var loginVal = {
				"memberid":memberid,
				"memberpw":memberpw
		}
		
		if(memberid == null || memberid ==""||memberpw == null || memberpw == "" ){
			alert("id와 pw를 다시 확인하세요")
		}else{
			$.ajax({
				type: "post",
				url: "ajaxlogin.do",
				//컨트롤러로 전달하는 값 : json형태의 문자열로 만들어서 보냄
				data: JSON.stringify(loginVal),
				//리퀘스트 헤더에 저장될 것 : application을 통해 넘어가는데 원래 얜 json이야(서버한텐 json이라고 알려줌)
				contentType: "application/json",
				dataType: "json",
				success: function(msg){
					if(msg.check == true){
						location.href="list.do"
					}else{
						$("#loginChk").show();
						$("#loginChk").html("id혹은 pw를 확인해주세요")
					}
					
				},
				error: function(){
					alert("통신실패");
				}
			});
		}
		
	}
	

</script>
</head>
<body>

	<table border="1">
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberid"/></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="text" id="memberpw"/></td>
		</tr>
		<tr>			
			<td colspan="2"><input type="button" value="login" onclick="login();" /></td>
		</tr>
		<tr>	
			<td colspan="2" align="center" id="loginChk"></td>
		</tr>
		
	</table>

</body>
</html>