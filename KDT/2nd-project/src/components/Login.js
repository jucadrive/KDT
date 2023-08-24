import React from 'react'
import '../css/Login.css'
import { Link } from 'react-router-dom'

function Login() {
  return (
    <form action="">
      <div className='middle-area'>
        <div className='inner'>
          <div className='login-form'>
            <h1>반갑읍니다.</h1>
            <ul className='userInfo'>
              <li>
                <p>ID</p>
                <input id='email' type="email" placeholder='이메일 주소' />
              </li>
              <li>
                <p>비밀번호</p>
                <input id='pw' type="password" placeholder='비밀번호 입력' />
              </li>
            </ul>
           <Link to='/'><button className='login-btn'>로그인</button></Link>

            <div className='seperator'>
              <p>OR</p>
            </div>

            <button className='login-btn-google'>Google 계정으로 로그인</button>

            <div className='sign-up-btn'>
              <p>아직 회원이 아니신가요? <Link to="/signup/1">회원가입</Link></p>
            </div>
            <div className='forget-id-pw'>
              <Link to='/'><p>아이디/비밀번호 찾기</p></Link>
            </div>
          </div>
        </div>
      </div>
    </form>

  )
}

export default Login