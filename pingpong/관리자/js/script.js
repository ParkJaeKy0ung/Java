/* HEADER 영역 */

const searchicon=document.querySelector(".search_icon");
const searchbox=document.querySelector(".seachbox");
const searchboxList = searchbox.parentElement.children;

// 검색 아이콘에 마우스가 올려졌을 때 검색 박스 커짐
// 검색 자리에 있던 아이콘은 사라짐 (알림, 검색, 로그인 버튼)
searchicon.addEventListener("mouseenter",()=>{
    for(let i=0; i<3; i++){ // 오른쪽 아이콘 들은 전부 사라지게
        searchboxList[i].style.display="none"; 
    }
    searchbox.style.display="flex"; // 검색 버튼 커지기
});

// 검색창이 켜진 상태에서 다른 곳을 클릭하면 요소 초기화
const temp = document.querySelectorAll(".seachbox, .seachbox *");
window.addEventListener("click", e => {

    let flag = true;
    temp.forEach(el => {
        if(el == e.target) flag = false; 
    });
    
    if(flag){
        searchbox.style.display="none";
        for(let i=0; i<3; i++){
            searchboxList[i].style.display="flex";
        }
    }
    
})

/* NAV 영역 */
const openHam = document.getElementById('openHam');
const closeHam = document.getElementById('closeHam');

// nav 요소
const nav = document.querySelector('nav');

// 열기 버튼을 누르면 nav의 display가 flex로 변경
openHam.addEventListener("click",() => {nav.style.display = "flex";})

// 닫기 버튼을 누르면 nav의 display가 none로 변경
closeHam.addEventListener("click", function(){nav.style.display = "none";});

// 네브 열고 더보기 버튼 누르면 더보기 창 활성화
const moreicon = document.querySelector(".mainnav-under-btn");
const navmore = document.querySelector(".navmore");

moreicon.addEventListener("click",()=>{
    if(navmore.style.display=="block") navmore.style.display="none"; 
    else navmore.style.display="block";
});

