const content = document.getElementById("content");
const size = document.getElementById("size");
const color = document.getElementById("color");
const apply = document.getElementById("apply");
const registration = document.getElementById("registration");
const result = document.getElementById("result");

// 적용(apply) 버튼 클릭 시 size, color에 작성된 값을 content의 css(style) 적용
apply.addEventListener("click", () => {
    content.style.color = color.value;
    content.style.fontSize = size.value + "px";
});

// 등록 버튼 클릭 시 요소를 생성하여 content에 작성된 내용, style 적용
// result에 추가
registration.addEventListener("click", () => {
    const div = document.createElement("div"); // div태그 요소 생성
    div.innerText = content.value; // content에 작성된 내용(값)을 div의 내용으로 대입

    const contentStyle = content.getAttribute("style"); // content 스타일 얻어오기

    div.setAttribute("style", contentStyle); // content 스타일을 div에 세팅

    result.append(div); // result에 추가
});
