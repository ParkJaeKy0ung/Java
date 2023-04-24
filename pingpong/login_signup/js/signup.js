/* 약관 확인하기 창 열기 */
const openTermsBtn = document.getElementsByClassName("openTermsBtn");

openTermsBtn[0].addEventListener("click", () => {
  document.getElementsByClassName("termsbackground")[0].style.display="block";
});


/* 약관 확인하기 창 닫기 */
const closeSignupBtn = document.getElementsByClassName("closeSignupTerms")[0];
closeSignupBtn.addEventListener("click", () => {
    document.getElementsByClassName("termsbackground")[0].style.display = 'none';
});
