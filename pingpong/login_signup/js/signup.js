/* 약관 확인하기 창 열기 */
const openTermsBtn = document.getElementsByClassName("open-termsBtn");

openTermsBtn[0].addEventListener("click", () => {
  document.getElementsByClassName("termsbackground")[0].style.display="block";
});


/* 약관 확인하기 창 닫기 */
const closeSignupBtn = document.getElementsByClassName("close-signup-terms")[0];
closeSignupBtn.addEventListener("click", () => {
    document.getElementsByClassName("termsbackground")[0].style.display = 'none';
});
