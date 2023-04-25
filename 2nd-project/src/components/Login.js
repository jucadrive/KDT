import React from 'react'
import './Login.css'

function Login() {
  return (
    
      <div className='middle-area'>
        <div className='inner'>
          <h1>반갑읍니다.</h1>
          <ul className='userInfo'>
            <li>
              <p>ID</p>
              <input id='email' type="email" placeholder='이메일 주소'/>
            </li>
            <li>
              <p>비밀번호</p>
              <input id='pw' type="password" placeholder='비밀번호 입력'/>
            </li>
          </ul>
          <button className='login-btn'>로그인</button>
        </div>
      </div>
   
  )
}

export default Login