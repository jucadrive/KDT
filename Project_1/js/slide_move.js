





makeClone();


function makeClone() {
        for(var i = 0; i < slideCount; i++) {
            /*   a.cloneNode() -> a의 요소를 그대로 복제
             만약 a.cloneNode(true)라고 작성한다면 a의 자식 요소까지 모두 복제할 수 있음 */
            var cloneSlide = slide[i].cloneNode(true);
            cloneSlide.classList.add('clone');
            /* 자바스크립트에서는 기존 내용 뒤에 요소를 추가하는 함수로 appand 
            a.appendChild(b)라고 작성하게 되면 a요소의 기존의 내용에다가 b를 추가하는 것*/
            slides.appendChild(cloneSlide);
        }
        for(var i = slideCount -1; i>=0; i--) {
            var cloneSlide = slide[i].cloneNode(true);
            cloneSlide.classList.add('clone');
            /* a.prepend(b) */    
            slides.prepend(cloneSlide);
        }

        updatewidth();
        setInitialPos();
    }
    function updatewidth() { //전체갯수를 구하고 슬라이드 하나하나의 마진을 구함 사진이 담겨있는 ul의 너비를 지정해주는 함수를 생성하는 명령어
        var currentSlides = document.querySelectorAll('.slides li');
        var newSlideCount = currentSlides.length;
        //새로운 ul의 전체너비를 구하는 공식
        var newwidth = (slideWidth + slideMargin) * newSlideCount - slideMargin + 'px';
        slides.style.width = newwidth;
    }
    function setInitialPos() {
        var initialTranslateValue = - (slideWidth + slideMargin) * slideCount; //
        //slides ( transform을 사용해 양수 or 음수 값을 설정하여 이동을 시켜줘야함)
        slides.style.transform = 'translateX(' + initialTranslateValue + 'px)';
    }
