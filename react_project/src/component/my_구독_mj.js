import style from '../css/my_구독_mj.module.css'



function Mypage_MJ() {
    return (
        <div className={style.mypage_container}>
            <h4>MY 구독</h4>
            <div className={style.both_mypage_container}>
                <div className={style.left_mypage_box}>
                    <div className={style.left_mypage_menu_box}>
                        <div className={style.left_mypage_menu_title}>
                            <div className={style.left_mypage_menu}>
                                <ul className={style.mypage_menu_list}>
                                    <li><a href="">구독 중인 상품</a></li>
                                    <li><a href="">쿠폰함</a></li>
                                    <li><a href="">월별 이용 내역</a></li>
                                    <li><a href="">구독료 결제 정보</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>

                <div className={style.rigth_mypage_box}>
                    <div className={style.right_mypage_content_box}>
                        <div className={style.right_mypage_item}>주*준님이 구독 중인 상품이에요</div>
                        <div className={style.right_mypage_item}>할인 쿠폰</div>
                        <div className={style.right_mypage_item}>선택한 상품 1</div>
                        <div className={style.right_mypage_item}>선택한 상품 2</div>
                        <div className={style.right_mypage_item}>선택한 상품 3</div>
                    </div>
                </div>
            </div>
        </div >
    );
}

export default Mypage_MJ;
