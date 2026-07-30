<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<h2>회원 정보 입력</h2>

<form action="" method="post" id="frm" name="frm">

  <!-- 이름 -->
  <label for="name">이름</label>
  <input type="text" id="name" name="name"><br><br>

  <!-- 나이 -->
  <label for="age">나이</label>
  <input type="text" id="age" name="age"><br><br>


  <!-- 제출 -->
  <input type="submit" value="전송">
  <button id="btnPopup" type="button">팝업</button>
</form>

<script>
  function fnPopup() {
    window.open('/member/searchPopup', 'memberPopup', 'width=480, height=812, top=100, fullscreen=no, menubar=no, status=no,  titlebar=yes,location=no,toolbar=no,  scrollbar=no');
  }

  $(function () {

    // 페이지가 로드되면 실행
    console.log("jQuery 로드 완료");

    // 버튼 클릭 이벤트
    $("#btnPopup").click(function () {
      fnPopup();
    });


  });
</script>