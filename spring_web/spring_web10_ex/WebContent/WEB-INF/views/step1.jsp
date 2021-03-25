<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 
<script type="text/javascript">
   $(function(){
      $('#btn').click(function(){
         //console.log('click');
         
         // 페이지 이동       (상대 주소 쓰는 것 권장 X => jstl 써야 함)
         //location.href = "../register/step2.do";
         
         // jstl 처리
         //location.href = '<c:url value="/register/step2.do"></c:url>';
         
       /*  if($('#agree')[0].checked){
        	location.href = '<c:url value="/register/step2.do"></c:url>';
         } */
          
         // step2.do로 넘어감
         document.frm.action="step2.do";
         document.frm.submit();
      });
   });
</script>



<!-- jstl - 스크립트 밖에 써서 복붙 하는 게 좋음 -->
<%-- <c:url value="/register/step2.do"></c:url> --%>

</head>
<body>
   <h2>step1.jsp</h2>
   <h1>약관</h1>
   <textarea name="txtArea" id="txtArea" cols="30" rows="10">고객님의 소중한 정보를 잘 쓰겠습니다</textarea>
   <form action="#" name="frm">
      <input type="checkbox" name="ck" id="agree" />
      <span>약관동의</span>
      <input type="button" value="다음" id="btn" />
   </form>
</body>
</html>