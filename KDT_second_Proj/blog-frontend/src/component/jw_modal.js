import { useState } from "react"
import { Link } from 'react-router-dom'
import style from '../css/jw_modal.module.css'

export default function ModalJW(props) {
    
    const [a, setA] = useState(props.visible)

    function closeFn(e) {
        setA(false)
    }
    console.log("modalData : ",props.visible)
    return (
        <>
       <div style={{ display: !a ? "none": 'flex' }} className={style.container}>
            <div className={style.modal}>
                <div className={style.xBtn} onClick={closeFn} ><i className="fa-solid fa-x"></i></div>
                <p style={{ fontSize: '20px' }}> 지금 로그인 하시겠어요?</p>
                <p style={{ marginTop: '20px', color: 'rgb(100,100,100)' }}> 구독 신청을 계속 하시려면 로그인이 필요해요.</p>
                <div style={{ width: '70%', display: 'flex', justifyContent: 'space-between', marginTop: '20px', }}>
                    <button onClick={closeFn} className={style.button1}>아니오</button>
                    <Link to='/login'><button  className={style.button2}>로그인 할게요</button></Link>
                </div>
            </div>
        </div>
        </>
    )

}

