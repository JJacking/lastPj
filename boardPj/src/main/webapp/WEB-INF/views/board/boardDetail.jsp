<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
<link type="text/css" rel="stylesheet" href="style/board.css">
<script type="text/javascript" src="script/board.js"> </script>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>`
<body>
    <div id="wrap">
      <h2>게시글 리스트</h2>
      <table>
        <tr>
          <th>제목</th>
          <td colspan="5">${board.title}</td>
        </tr>
        <tr>
          <th>닉네임</th>
          <td>${board.nickName}</td>
          <th>작성일</th>
          <td>${board.wirteDate}</td>
          <th>조회수</th>
          <td>${board.readCount}</td>
        </tr>
        <tr>
          <th>내용</th>
          <td colspan="5">${board.content}</td>
        </tr>
        <tr>
          	<td colspan="6" style="border: white; text-align:center">
		          <button type="button" onclick="location.href='boardUpdate?num=${board.num}'">
		         	 게시글 수정</button>
		          <button type="button" onclick="removeCheck()">
		         	게시글 삭제</button>
		          <button type="button" onclick="location.href='boardList'">목록 보기</button>
        	</td>
        </tr>
      </table>
     </div>
     <!-- 댓글 페이지 -->
     <div id="wrap">
     	<form action="commentUpdate" method="post" >
	     	<input type="hidden" name="comment" value="commentUpdate">
	     	<input type="hidden" name="cno" value="${board.num}">
      		<table>
      			<c:forEach items="${lists}" var="comment">
      				<tr>
      					<td>닉네임</td>
      					<td id="nick">${comment.userName}</td>		
  						<td>작성일</td>
  						<td>${comment.reWirteDate}</td>
      				</tr>
      				<tr>
      					<td>내용</td>
  						<td colspan="2" id="temp">${comment.reContent}</td>
  						<td>
  							<button type="button" onclick="updateCk()">수정</button>
  							<%-- <button type="button" onclick="location.href='commentUpdate?cno=${comment.cno}'">수정</button> --%>
      						<button type="button" id ="commentDelete" onclick="removeComment('${comment.cno}','${comment.num}')">삭제</button>
      					</td>
      				</tr>
      			</c:forEach>
      		</table>
      	</form>
      </div>
      <form action="commentWrite" method="POST">
      	<input type="hidden" name="num" value="${board.num}">
      	<div id="wrap">
      		<table>
      			<tr>
      				<td>닉네임</td>
      				<td><input type="text" name="userName"></td>
      				<td>비밀번호</td>
      				<td><input type="password" name="userPass"></td>
      			</tr>
      			<tr>
      				<td>내용</td>
      				<td colspan="2"><textarea rows="10" cols="40" name="reContent"></textarea></td>
          			<td>
			          	<button type="submit">댓글달기</button>
        			</td>
      			</tr>
      		</table>
		</div>
	</form>
  </body>
  </html>