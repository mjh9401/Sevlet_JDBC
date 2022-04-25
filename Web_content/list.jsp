<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>직원목록페이지</title>
</head>
<style>
    .wrap{
        width: 500px;
        margin: 0 auto;
    }
    .title{
        text-align: center;
    }
</style>
<body>
    <div class="wrap">
        <h1 class="title">직원등록</h1>
        <form action="actionSearch" method="get"> 
            <div class="search_space">
                <input id="search" name = "search" type="text">
                <input type="submit" value = "검색"> 
            </div>
        </form>
    </div>
</body>
</html>