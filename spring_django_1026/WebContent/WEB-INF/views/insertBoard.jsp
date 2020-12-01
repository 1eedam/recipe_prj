<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글등록</title>
</head>
<body>
		<h1>글 등록</h1>		
		<hr>
				
		<form action="saveBoard" method='post' enctype="multipart/form-data"> 
			<table border="1" cellpadding="0" cellspacing="0">
				<!-- 2. 각 항목에  name 맞추기 -->
				<tr>
					<td bgcolor="orange" width="70">번호</td>
					<td align="left"><input type="text" name="no"/></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="subject"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><input type="text" size="10" name="writer"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea cols="40" rows="10" name="content"></textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td align="left"><input type="text" name="pwd"/>
					
					</td>
				</tr>			
				<tr>
				<!--   submit : 무조건 서버로 날아가기  /  유효성 검사하고 싶으면 buttom (onclick을 걸었을시...) -->
					<td colspan="2" align="center"><input type="submit"	value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList">글 목록 가기</a>
</body>
</html>