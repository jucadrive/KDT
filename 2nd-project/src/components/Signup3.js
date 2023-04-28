import React from 'react'
import '../css/Signup3.css'
import { Link } from 'react-router-dom'

function Signup3() {
  return (
    <section className='s3'>
      <div className='signup-form3'>
        <div className='inner'>
          <h1>회원가입</h1>
          <ul className='process'>
            <li>1</li>
            <li>2</li>
            <li>3</li>
          </ul>

          <div className='container'>
            <div className='signup-complete'>
              <h2>🎉회원가입을 축하드립니다!🎉</h2>
              <p>이제 모든 서비스를 이용하실 수 있읍니다.</p>
              <div className='login'>
                <Link to="/"><button className='login-btn'>로그인</button></Link>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  )
}

export default Signup3