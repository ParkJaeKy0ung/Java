/* 로그인 확인 */
const loginButton = document.querySelector(".loginButton");

loginButton.addEventListener("click", () => {

  const emailInput = document.querySelector('.loginInputEmail input').value;
  const passwordInput = document.querySelector('.loginInputPassword input').value;

  if (emailInput === 'user01' && passwordInput === 'pass01') {
    alert('로그인 성공');

  } else {
    document.querySelector('.loginInputEmail input').style.border="1px solid red"
    document.querySelector('.loginInputPassword input').style.border="1px solid red"
  }
});

