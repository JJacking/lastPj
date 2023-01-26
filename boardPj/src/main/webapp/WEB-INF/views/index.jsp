<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <nav class="navbar" style="background-color: #e3f2fd;">
    <nav class="navbar navbar-expand-lg background-color: #e3f2fd;">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">중고거래사이트</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0" >
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">내정보</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">경매참여</a>
              </li>
              <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"></a>
                <ul class="dropdown-menu">
                  <li><a class="dropdown-item" href="#">신상품</a></li>
                  <li><a class="dropdown-item" href="#">중고상품</a></li>
                  <li><hr class="dropdown-divider"></li>
                </ul>
              </li>
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">경매등록</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="/board/boardList">게시판</a>
              </li>
            </ul>
          </div>
      </div>
    </nav>
  </nav>
<p><a href="/board/boardList">이동용 jsp파일입니다</a></p>
</body>
</html>