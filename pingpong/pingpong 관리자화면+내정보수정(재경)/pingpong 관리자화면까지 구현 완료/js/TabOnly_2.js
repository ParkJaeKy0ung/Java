/* 탭 메뉴 */
const tabListA = document.querySelectorAll('.admin-left-side-menu>ul>li>a');

for(let i=0;i<tabListA.length;i++){
  console.log(i);
  tabListA[i].parentNode.classList.remove("admin_is_on");
  tabListA[i].addEventListener("click", e=>{
    console.log(123);
    // e.target.parentNode.classList.add("admin_is_on");
  });
}