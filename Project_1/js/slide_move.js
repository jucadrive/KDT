let slides = document.querySelector('.slides'),
    slide = document.querySelectorAll('.slides li'),
    currentIdx = 0;
    slideCount = slide.length,
    slidewidth = 1200,
    slideMargin = 30,
    prevBtn = document.querySelector('.prev'),
    nextBtn = document.querySelector('.next'),

    makeClone();

    function makeClone() {
        for(let i = 0; i<slideCount; i++) {
   /*   a.cloneNode() -> a의 요소를 그대로 복제
        만약 a.cloneNode(true)라고 작성한다면 a의 자식 요소까지 모두 복제할 수 있음 */
            let cloneSlide = slide[i].cloneNode(true);
            cloneSlide.classList.add('clone');
   /*   자바스크립트에서는 기존 내용 뒤에 요소를 추가하는 함수로 appand 
        a.appendChild(b)라고 작성하게 되면 a요소의 기존의 내용에다가 b를 추가하는 것*/
            
        }
    }