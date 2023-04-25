import React from 'react'
import './Header.css'

function Header() {

  return (
    <header>
      <div className='inner'>
        <a href="/" className='logo'>
          <img src="./images/starbucks_logo.png" alt="Logo" />
        </a>

        <ul className='main-menu'>
          <li className='item'>
            <div className='item__name'>구독신청</div>
          </li>
          <li className='item'>
            <div className='item__name'>MY구독</div>
          </li>
          <li className='item'>
            <div className='item__name'>이벤트</div>
          </li>
          <li className='item'>
            <div className='item__name'>고객센터</div>
          </li>
        </ul>
      </div>
    </header>
  )
}

export default Header