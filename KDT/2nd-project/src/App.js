import { Reset } from 'styled-reset';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import LoginPage from './pages/LoginPage.js';
import SignupPage from './routes/SignupPage';
import { ThemeProvider } from 'styled-components';

function App() {
  return (
    <ThemeProvider
    theme={{
      palette: {
        blue: 'royalblue',
        gray: '#495057',
        pink: '#E6007E'
      }
    }}
    >
      <div className="App">
        <Reset />
        <Routes>
          <Route  path='/' element={<LoginPage />}/>
          <Route path='/signup/*' element={<SignupPage />} />
        </Routes>
      </div>
    </ThemeProvider>
  );
}

export default App;
