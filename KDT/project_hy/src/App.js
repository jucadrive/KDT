import { Card } from 'react-bootstrap';

import './App.css';

function Header () {
  return (
    <ul className='headerBox'>
      <li>구독신청</li>
      <li>My 구독</li>
      <li>이벤트</li>
      <li>고객센터</li>
    </ul>
  )
}

function LeftMenu () {
  return(
    <div>
    <h2 className='MenuBox'>고객센터</h2>
    <div className='LeftMenuBox'>자주하는 질문</div>
    <div className='LeftMenuBox'>공지사항</div>
    <div className='LeftMenuBox'>문의게시판</div>
    <div className='LeftMenuBox'>후기게시판</div>
  </div>
  )
}




function RegularQuestion () {



}


function Notice () {
  return(
    <div>
      <h2 className='noticetitle'>공지사항</h2>
      <div className='noticebox'><span>중요</span>GS칼텍스 주유세차권&차량정비서비스 가격 인하 안내</div>
      <div className='noticebox'>쏘카 구독 상품 제휴 종료 안내</div>
      <div></div>
    </div>
  )
}


function Questionbulletin() {
  return (
    <div className='questionbulletin'>
      <h2 style={{marginLeft:"30px"}}>문의게시판</h2>
      <ul className='submenu'>
        <li>구독 및 해지 관련 문의</li>
        <li>구독 서비스 관련 문의</li>
        <li>입금 및 결제 문의</li>
        <li>기타 문의</li>
      </ul>
      <table className='bulletintable'>
         <tr>
          <td>번호</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>1</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>2</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>3</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>4</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>5</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>6</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>7</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
         <tr>
          <td>8</td>
          <td>상품정보</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
         </tr>
      </table>
    <pagenation></pagenation>
    <button className='writebtn'>글쓰기</button>
    <div className='searchbox'>검색어<input type="text" placeholder='검색어를 입력하세요'></input><button>검색</button></div>
    </div>
    
  )
}


function Reviewbulletin () {
  return (
    <div>
      <Card></Card>
      <Card></Card>
      <Card></Card>
    </div>
  )

}






function App() {
  return (
   <div>
   <Header></Header>
   <div style={{display:"flex",marginLeft: "10%"}}> 
   <div><LeftMenu></LeftMenu></div>
   <div><RegularQuestion></RegularQuestion>
        <Notice></Notice>
        <Questionbulletin></Questionbulletin>
        <Reviewbulletin></Reviewbulletin></div>
   </div>
    
   </div>
  );
}

export default App;
