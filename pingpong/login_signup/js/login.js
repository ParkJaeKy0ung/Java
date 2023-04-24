/* 로그인 확인 */
const loginButton = document.querySelector(".loginButton");

loginButton.addEventListener("click", () => {

  const emailInput = document.querySelector('.login-input-email input').value;
  const passwordInput = document.querySelector('.login-input-password input').value;

  if (emailInput === 'user01' && passwordInput === 'pass01') {
    alert('로그인 성공');

  } else {
    document.querySelector('.login-input-email input').style.border="1px solid red"
    document.querySelector('.login-input-password input').style.border="1px solid red"
  }
});

