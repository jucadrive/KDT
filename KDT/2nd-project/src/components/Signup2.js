import React from 'react'
import '../css/Signup2.css'
import { Link } from 'react-router-dom'

function Signup2() {
  return (
    <section className='s2'>
      <div className='signup-form2'>
        <div className='inner'>
          <h1>회원가입</h1>
          <ul className='process'>
            <li>1</li>
            <li>2</li>
            <li>3</li>
          </ul>

          <div className='input-info'>
            <ul>
              <li>회원정보 입력</li>
              <li> <span>*</span>필수 입력 항목입니다.</li>
            </ul>

            <div className='input-info-form'>
              <ul>
                <li>
                  <label><span>*</span>이름</label>
                </li>
                <li>
                  <input type="text" id='name' />
                </li>
                <li>
                  <label htmlFor="gender"><span>*</span>성별</label>
                </li>
                <li>
                  <input list="genders" id="gender" name="gender" />
                  <datalist id="genders">
                    <option value="남성"></option>
                    <option value="여성"></option>
                  </datalist>
                </li>
                <li>
                  <label> <span>*</span>ID</label>
                  <button className='idCheck'>중복확인</button>
                </li>
                <li>
                  <input type="email" id='email' />
                </li>
                <li>
                  <label htmlFor="pw"><span>*</span>비밀번호</label>
                </li>
                <li>
                  <input type="password" id='pw' />
                </li>
                <li>
                  <label htmlFor="pw2"><span>*</span>비밀번호 확인</label>
                </li>
                <li>
                  <input type="password" id='pw2' />
                </li>
                <li>
                  <label><span>*</span>전화번호</label>
                </li>
                <li>
                  <input type="text" id='name' />
                </li>
                <li>
                  <label><span>*</span>주소</label>
                </li>
                <li>
                  <input type="text" id="sample6_postcode" placeholder="우편번호" />            
                  <input type="button" id='sample6_execDaumPostcode' onclick="sample6_execDaumPostcode()" value="우편번호 찾기" />
                </li>
                <li>
                  <input type="text" id="sample6_address" placeholder="주소" />
                </li>
                <li>
                  <input type="text" id="sample6_detailAddress" placeholder="상세주소" />
                  <input type="text" id="sample6_extraAddress" placeholder="참고항목" />
                </li>
              </ul>
            </div>
          </div>
          <Link to="/signup/3"><button className='signup-done-btn'>회원가입</button></Link>
        </div>
      </div>
    </section>
  )
}

export default Signup2