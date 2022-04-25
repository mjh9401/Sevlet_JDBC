<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>직원등록페이지</title>
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
        <form action="actionSevlet" method="get"> 
            <div class="name_space">
                <span>이름 : </span><input id="name" name = "name" type="text">
            </div>
            <div class="address_space">
                <span>주소 : </span><input id="address" name="address" type="text">
            </div>
            <div class="email_space">
                <span>이메일 : </span><input id="email" name = "email" type="email">
            </div>
            <div class="tel_space">
                <span>전화번호 : </span><input id="tel" name="tel" type="tel">
            </div>
            <input type="submit" value = "완료" onclick="check();"> 
        </form>
        <!-- 
        <script>
            let name = document.querySelector("#name").value;
            let address = document.querySelector("#address").value;
            let email = document.querySelector("#email").value;
            let tel = document.querySelector("#tel").value;

            function check(){
                if(name == ''){
                    alert('이름을 입력해주세요');
                    return;
                }
                else if(address=''){
                    alert('주소를 입력해주세요');
                    return;
                }
                else if(email == ''){
                    alert('이메일을 입력해주세요');
                    return;
                }
                else if(tel == ''){
                    alert('전화번호를 입력해주세요');
                    return;
                }
            }
        </script>
         -->
    </div>
</body>
</html>