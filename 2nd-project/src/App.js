import { Reset } from 'styled-reset';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import LoginPage from './pages/LoginPage.js';
import SignupPage1 from './pages/SignupPage/SignupPage1';
import SignupPage2 from './pages/SignupPage/SignupPage2';
import SignupPage3 from './pages/SignupPage/SignupPage3';

function App() {
  return (
    <div className="App">
      <Reset />
      <Routes>
        <Route index path='/' element={<LoginPage />}/>
        <Route path='/signup1' element={<SignupPage1 />} />
        <Route path='/signup2' element={<SignupPage2 />} />
        <Route path='/signup3' element={<SignupPage3 />} />
      </Routes>
    </div>
  );
}

export default App;
