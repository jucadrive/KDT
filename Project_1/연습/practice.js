


버튼2를 누르면 두번째 슬라이드가 이동

document.querySelector('.btn2').addEventListener('click', function() { //btn이라는 클래스를 찾은 후, 해당 클래스를 클릭하게 되면 { }안의 문장을 실행해주세요 하는 문장
    document.querySelector('.slide-wrapper').style.transform = 'translate(-100vw)';
});

document.querySelector('.btn3').addEventListener('click', function() {
    document.querySelector('.slide-wrapper').style.transform = 'translate(-200vw)';
})

document.querySelector('.btn1').addEventListener('click', function(){
    document.querySelector('.slide-wrapper').
})



1. 다음/이전 버튼 만들기 - 버튼 누른 횟수나 현재 보이고 있는 그림 번호같은 걸 자바스크립트 변수로 사용
   2. 이미지가 4개이고 버튼도 1개 더 생성되었을 때, 확장성 잡기 (그림이 몇개있든 잘 동작하게 하는 것) 반복문 사용해서 적용