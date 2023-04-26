import React, { useState } from 'react'
import '../css/Signup1.css'
import { Link } from 'react-router-dom'

function Signup1() {
  const [isClicked, setIsClicked] = useState(false);
  
  const handleClick = () => {  

    const allAllowBtn = document.querySelector('.allow-all > .material-icons');
    // const allowBtn = document.querySelectorAll('li > .material-icons');

    allAllowBtn.addEventListener('click', function() {
      if(!isClicked) {
       allAllowBtn.classList.add('select');
      }else{
       allAllowBtn.classList.remove('select') 
      }
      setIsClicked(!isClicked);
      console.log(isClicked)
    });
}
  return (
    <section className='s1'>
      <div className='signup-form1'>
        <div className='inner'>
          <h1>회원가입</h1>
          <ul className='process'>
            <li>1</li>
            <li>2</li>
            <li>3</li>
          </ul>

          <div className='allow-form'>
            <p>서비스 이용약관 및 개인정보 처리방침 동의</p>
            <div className='allow-all'>
              <div className='material-icons' onClick={handleClick}>done</div>
              <span>서비스 이용약관 및 개인정보 처리방침에 모두 동의</span>
            </div>

            <div className='TOS'>
              <ul>
                <li>
                    <div className='material-icons'>done</div>
                    <p>이용약관<span>(필수)</span></p>                              
                </li>
                <li>     
                    <div className='material-icons'>done</div>
                    <p>개인정보 수집 . 이용<span>(필수)</span></p>        
                </li>
                <li> 
                    <div className='material-icons'>done</div>
                    <p>개인정보 제3자 제공 안내<span>(선택)</span></p>   
                </li>
                <li>
                    <div className='material-icons'>done</div>
                    <p>광고성 정보 수신<span>(선택)</span></p>      
                </li>
              </ul>
            </div>
            <div className='next'>
            <Link to="/signup2"><button className='next-btn'>다음으로</button></Link>
            </div>
          </div>
        </div>
      </div>
    </section>
  )
}

export default Signup1