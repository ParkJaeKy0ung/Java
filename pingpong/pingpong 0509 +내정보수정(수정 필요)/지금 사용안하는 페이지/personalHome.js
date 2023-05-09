// 상단 프로필 오른쪽 소개 탭 구역
const profiletabList = document.querySelectorAll('.profiletab_menu .profilelist li');
const profilecontents = document.querySelectorAll('.profiletab_menu .cont_area .cont')
let profileactiveCont = ''; // 현재 활성화 된 컨텐츠 (기본:#tab1 활성화)

for(var i = 0; i < profiletabList.length; i++){
    profiletabList[i].querySelector('.btn').addEventListener('click', function(e){
        e.preventDefault();
        for(var j = 0; j < profiletabList.length; j++){
        // 나머지 버튼 클래스 제거
        profiletabList[j].classList.remove('is_on');

        // 나머지 컨텐츠 display:none 처리
        profilecontents[j].style.display = 'none';
        }

        // 버튼 관련 이벤트
        this.parentNode.classList.add('is_on');

        // 버튼 클릭시 컨텐츠 전환
        profileactiveCont = this.getAttribute('href');
        document.querySelector(profileactiveCont).style.display = 'block';
    });
}

// 개인 홈 게시글 하단 그리드 구역
const posttabList = document.querySelectorAll('.posttab_menu .postlist li');
const postcontents = document.querySelectorAll('.posttab_menu .postcont_area .postcont')
let postactiveCont = ''; // 현재 활성화 된 컨텐츠 (기본:#tab1 활성화)

for(var i = 0; i < posttabList.length; i++){
posttabList[i].querySelector('.btn').addEventListener('click', function(e){
    e.preventDefault();
    for(var j = 0; j < posttabList.length; j++){
        // 나머지 버튼 클래스 제거
        posttabList[j].classList.remove('is_on');

        // 나머지 컨텐츠 display:none 처리
        postcontents[j].style.display = 'none';
    }

    // 버튼 관련 이벤트
    this.parentNode.classList.add('is_on');

    // 버튼 클릭시 컨텐츠 전환
    postactiveCont = this.getAttribute('href');
    document.querySelector(postactiveCont).style.display = 'block';
});
}

// 홈 프로필 설정 할 때 자격증 아이콘 설정 할 수 있게 해주기
// 대표 자격 이미지로 추가해서 배열로 넣어주면 될듯 최대 6개
// const certificate = document.getElementById("certificate");
// 임시로 지식/기술 버튼 누르면 배열에 추가되게
// certificate.addEventListener("click",()=>{
//     let certList = ["PsCert.png", "AiCert.png", "PrCert.png", "XdCert.png"];
// });

