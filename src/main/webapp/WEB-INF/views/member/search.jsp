<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>memberSearch 입니다.</div>
<div>이름 <input type="text" id="name" name="name" value="${name}"></div>
<div>나이 <input type="text" id="age" name="age" value="${age}"></div>
<button id="btnClose">팝업 닫기</button>

<script>
  $(document).ready(function(){
    $('#btnClose').click(function(){
      let f = window.opener.frm;
      f.name.value = $('#name').val();
      f.age.value = $('#age').val();
      window.close();
    })
  });
</script>