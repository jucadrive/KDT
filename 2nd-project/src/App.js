import { Reset } from 'styled-reset';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import LoginPage from './pages/LoginPage.js';
import SignupPage from './routes/SignupPage';

function App() {
  return (
    <div className="App">
      <Reset />
      <Routes>
        <Route  path='/' element={<LoginPage />}/>
        <Route path='/signup/*' element={<SignupPage />} />
      </Routes>
    </div>
  );
}

export default App;
