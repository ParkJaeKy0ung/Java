/* 로그인 확인 */
// 로그인 버튼 클릭 시 이벤트 핸들러 등록
const loginButton = document.querySelector('.loginButton');
loginButton.addEventListener('click', function() {
  // 입력된 이메일과 비밀번호 값 가져오기
  const emailInput = document.querySelector('.loginInputEmail input').value;
  const passwordInput = document.querySelector('.loginInputPassword input').value;

  // 이메일과 비밀번호가 일치하는 경우 "로그인 성공!" 출력
  if (emailInput === 'user01' && passwordInput === 'pass01') {
    alert('로그인 성공!');
  } else {
    document.querySelector('.loginInputEmail input').style.border="1px solid red"
    document.querySelector('.loginInputPassword input').style.border="1px solid red"
  }
});





/* 약관 확인하기 창 열기 */
/* document.getElementsByClassName("openTermsBtn")[0].addEventListener("click", () => {
    document.getElementsByClassName("termsbackground")[0].style.display="block";
}); */
function signupTermsCheck(){
    document.getElementsByClassName("termsbackground")[0].style.display="block";
}





/* 약관 확인하기 창 닫기 */
/* const closeBtn = document.getElementsByClassName('closeSignupTerms')[0];
closeBtn.addEventListener('click', () => {
  document.getElementsByClassName('termsbackground')[0].style.display = 'none';
}); */
const closeBtn = document.getElementsByClassName("closeSignupTerms")[0];
closeBtn.addEventListener("click", () => {
    document.getElementsByClassName("termsbackground")[0].style.display = 'none';
});
