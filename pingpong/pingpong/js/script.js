/* HEADER 영역 */
const searchicon=document.querySelector(".search_icon");
const searchbox=document.querySelector(".seachbox");
const searchboxList = searchbox.parentElement.children;

const temp = document.querySelectorAll(".seachbox, .seachbox *");

// 검색 아이콘에 마우스가 올려졌을 때 검색 박스 커짐
// 검색 자리에 있던 아이콘은 사라짐 (알림, 검색, 로그인 버튼)
searchicon.addEventListener("mouseenter",()=>{
    for(let i=0; i<3; i++){ // 오른쪽 아이콘 들은 전부 사라지게
        searchboxList[i].style.display="none"; 
    }
    searchbox.style.display="flex"; // 검색 버튼 커지기
    
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
});


/* NAV 영역 */
const openHam = document.getElementById('openHam');
const closeHam = document.getElementById('closeHam');

// nav 요소
// const nav = document.querySelector('nav');
const mainnav = document.querySelector('.mainnav');
const grayBackground = document.querySelector(".grayBackground");

// 열기 버튼을 누르면 nav의 display가 flex로 변경
openHam.addEventListener("click",() => {
    mainnav.style.display = "block";
    if(mainnav.style.display === "block"){
        // 네브 오른쪽 회색 배경을 누르면  nav의 display가 none로 변경
        document.addEventListener("click", e=>{
            if(e.target===grayBackground){
                mainnav.style.display = "none";
                navmore.style.display="none"; 
                logModContainer.style.display = "none";
            }
        })
    }
})

// 닫기 버튼을 누르면 nav의 display가 none로 변경
closeHam.addEventListener("click", function(){mainnav.style.display = "none";});

// 네브 열고 더보기 버튼 누르면 더보기 창 활성화
const moreicon = document.querySelector(".mainnav-under-btn"); /* 더보기 버튼 */
const navmore = document.querySelector(".navmore"); /* 더보기 창 */

const navlist = document.querySelector('.navlist');

// moreicon 버튼을 누르면 navmore의 display가 block으로 변경
moreicon.addEventListener("click",()=>{
    if(navmore.style.display=="block") navmore.style.display="none"; 
    else navmore.style.display="block";
    if(navmore.style.display=="block"){
        // 네브 흰색 배경을 누르면 navmore의 display가 none 변경
        document.addEventListener("click", e=>{
            if(e.target===navlist){
                navmore.style.display="none"; 
            }
        })
    }
});

/* 더 많은 기능을 보실려면 로그인해주세요. */
const navloginBtn = document.querySelector(".navlogin");
const logModContainer = document.querySelector("#logModContainer");
navloginBtn.addEventListener("click", ()=>{
    logModContainer.style.display = "block";
});
const navloginclBtn = document.getElementById("navloginclBtn");
navloginclBtn.addEventListener("click", () => {
    logModContainer.style.display = "none";
});