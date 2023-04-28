import React, { useRef, useState } from 'react'
import '../css/Signup1.css'
import { useNavigate } from 'react-router-dom'



function Signup1() {
  let navigate = useNavigate();
  const checkboxInput = useRef([]);
  console.log(checkboxInput.current)
  
 
  
  // 체크 아이템을 담을 배열
  const [checkItems, setCheckItems] = useState([]);

  // 화면에 출력할 내용
  const data = [
    {id: 0, title: '이용약관 (필수)'},
    {id: 1, title: '개인정보 . 수집 (필수)'},
    {id: 2, title: '개인정보 제3자 제공 안내 (선택)'},
    {id: 3, title: '광고성 정보 수신 (선택)'}
  ]

  // 체크 박스 전체 선택
  const handleAllCheck = (checked) => {
    if(checked){
      // 전체 선택 클릭 시 데이터의 모든 아이템(id)를 담은 배열로 checkItems 상태 업데이트
      const idArray = [];
      data.map((el) => idArray.push(el.id));
      setCheckItems(idArray);
      console.log(checkItems)
    }else {
      setCheckItems([])
    }
  }

  const handleSingleCheck = (checked, id) => {
    if(checked) {
      // 단일 선택 해제 시 체크된 아이템을 제외한 배열(필터)
      setCheckItems([...checkItems, id])
    }else {
      setCheckItems(checkItems.filter((el) => el !== id))
    }
  }

 

  const handleNextPage = () => {
    if(checkboxInput.current[0].checked == true && checkboxInput.current[1].checked == true) {
     navigate('/signup/2')
    }else {
      alert('다 체크해')
    }
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
              <input type='checkbox' 
              onChange={(e) => handleAllCheck(e.target.checked)}
              // 데이터 개수와 체크된 아이템의 개수가 다를 경우 선택 해제(하나라도 해제 시 선택 해제)
              checked={checkItems.length === data.length ? true : false}
              />
              <span>서비스 이용약관 및 개인정보 처리방침에 모두 동의</span>
            </div>

            <div className='TOS'>
              <ul>
                {data?.map((data, key) => (
                  <li key={key}>
                    <input type="checkbox" 
                    onChange={(e) => handleSingleCheck(e.target.checked, data.id)}
                    // 체크된 아이템 배열에 해당 아이템이 있을 경우 선택 활성화, 아닐 시 선택 해제 
                    checked={checkItems.includes(data.id) ? true : false}
                    ref={(el) => {
                      checkboxInput.current[key] = el
                    }}
                    />
                    
                    <p>{data.title}</p>
                  </li>
                ))}
              </ul>
            </div>
            <div className='next'>
           <button className='next-btn' onClick={handleNextPage}>동의 및 다음</button>
            </div>
          </div>
        </div>
      </div>
    </section>

    
  )
}

export default Signup1
