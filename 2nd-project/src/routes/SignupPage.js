import React from 'react'
import { Route, Routes } from 'react-router-dom';
import SignupPage1 from '../pages/SignupPage/SignupPage1';
import SignupPage2 from '../pages/SignupPage/SignupPage2';
import SignupPage3 from '../pages/SignupPage/SignupPage3';
import Header from '../components/Header';
import Footer from '../components/Footer';

function SignupPage() {
  const pages = [
    {id: 1, title: 'signup1', description: '이용약관'},
    {id: 2, title: 'signup2', description: '개인정보 입력'},
    {id: 3, title: 'signup3', description: '회원가입 완료'}
  ];
  return (
    <>
    <Header />
    <Routes>
      <Route path='/1' element={<SignupPage1 />} />
      <Route path='/2' element={<SignupPage2 />} />
      <Route path='/3' element={<SignupPage3 />} />
    </Routes>
    <Footer />
   
    </>
  )
}

export default SignupPage