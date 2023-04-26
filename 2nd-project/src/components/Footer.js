import React from 'react'
import '../css/Footer.css'

function Footer() {
  return (
    <footer>
      <div className='outro'>
        <div className='inner'>
          <ul className='intro'>
            <li>회사소개</li>
            <li>이용약관</li>
            <li>개인정보처리방침</li>
            <li>통신자료제공사실열람</li>
            <li>청소년보호정책</li>
            <li>이용자피해예방가이드</li>
            <li>미환급금조회</li>
            <li>명의도용방지서비스</li>
            <li>장애현황</li>
          </ul>

          <div className='adress'>
            (주)엘지유플러스 서울특별시 용산구 한강대로 32 대표이사 황현식 사업자 등록번호 220-81-39938 통신판매신고 제 2015-서울용산-00481호 사업자정보확인 &gt; 
          </div>

          <ul className='tel'>
            <li>고객센터 휴대폰 114(무료) 1544-0010(유료)</li>
            <li>인터넷/IPTV/전화 101(무료)</li>
            <li>가입문의 휴대폰 1644-7009(유료)</li>
            <li>인터넷/IPTV/전화 1644-7070(유료)</li>
            <li>스마트홈 1544-0107(유료)</li>
            <li>소상공인 인터넷/IPTV/전화 1800-8000(유료)</li>
          </ul>
        </div>
      </div>
    </footer>
  )
}

export default Footer