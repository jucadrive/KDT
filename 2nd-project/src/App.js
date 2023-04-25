import { Reset } from 'styled-reset';
import './App.css';
import Header from './components/Header';
import Login from './components/Login';
import Footer from './components/Footer';

function App() {
  return (
    <div className="App">
      <Reset />
      <Header />
      <Login />
      <Footer />
    </div>
  );
}

export default App;
