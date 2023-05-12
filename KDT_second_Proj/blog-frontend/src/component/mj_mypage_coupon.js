import style from '../css/mj_mypage.module.css'
import 'bootstrap/dist/css/bootstrap.css';
import Header_JW from '../components/common/Header';
import { Link } from 'react-router-dom'
import { useState } from 'react'
import { useSelector } from 'react-redux';



function Mj_mypage_coupon() {

    return (
        <>
            <Header_JW />
            <div className={style.jw}>
                <div className={style.mypage_container}>
                    <div className={style.both_mypage_container}>
                        <div className={style.left_mypage_container}>
                            <div className={style.left_mypage_menu} >
                                <div className={style.mypage_menu_list} >
                                    <h4>MY 구독</h4>
                                    <Link to='/main/myInfo/'>구독 중인 상품<div style={{ display: "inline-block" }}>▶</div></Link>
                                    <Link to='/main/myInfo/coupon/'>쿠폰함 ▶</Link>
                                    <Link to='/main/myInfo/month/'>월별 이용 내역▶</Link>
                                    <Link to='/main/myInfo/payment/'>구독료 결제 정보▶</Link>
                                </div>
                            </div>
                        </div>
                        <CouponPage />
                    </div>
                </div >
            </div>
        </>
    );
}




function CouponPage() {

    let submitDay = new Date();
    let [coupon, setCoupon] = useState(["Netflix", "요기요", "Disney+", "밀리의 서재", "지니뮤직 월정액"])

    return (
        <>
            <div className={style.right_mypage_menu}>
                <section className="py-5">
                    <div style={{ width: '250%' }} className="container px-5">
                        <h2 className="fw-bolder fs-5 mb-4">user님이 사용가능한 쿠폰입니다.</h2>
                        <div className="row gx-5">
                            <div className="col-lg-4 mb-5">
                                <div className="card h-100 shadow border-0">
                                    <img className="card-img-top" src="https://www.shutterstock.com/image-photo/funny-red-welsh-corgi-pembroke-260nw-2042038094.jpg" alt="..." />
                                    <div className="card-body p-4">
                                        <div className="badge bg-primary bg-gradient rounded-pill mb-2">사용 가능한 브랜드</div>
                                        <a className="text-decoration-none link-dark stretched-link"><div className="h5 card-title mb-3">{coupon[0]}</div></a>
                                        <p className="card-text mb-0">추천해드릴 만한 상품 설명</p>
                                    </div>
                                    <div className="card-footer p-4 pt-0 bg-transparent border-top-0">
                                        <div className="d-flex align-items-end justify-content-between">
                                            <div className="d-flex align-items-center">
                                                <div className="small">
                                                    <div className="fw-bold">추가로 신청하기</div>
                                                    <div className="text-muted">{`${submitDay.toLocaleDateString().slice(0, -1)} 까지 사용 가능합니다.`}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div className="col-lg-4 mb-5">
                                <div className="card h-100 shadow border-0">
                                    <img className="card-img-top" src="https://san.chosun.com/news/photo/202302/22412_82258_3814.jpg" alt="..." />
                                    <div className="card-body p-4">
                                        <div className="badge bg-primary bg-gradient rounded-pill mb-2">사용가능한 브랜드</div>
                                        <a className="text-decoration-none link-dark stretched-link"><div className="h5 card-title mb-3">{coupon[1]}</div></a>
                                        <p className="card-text mb-0">추천해드릴 만한 상품 설명</p>
                                    </div>
                                    <div className="card-footer p-4 pt-0 bg-transparent border-top-0">
                                        <div className="d-flex align-items-end justify-content-between">
                                            <div className="d-flex align-items-center">
                                                <div className="small">
                                                    <div className="fw-bold">추가로 신청하기</div>
                                                    <div className="text-muted">{`${submitDay.toLocaleDateString().slice(0, -1)} 까지 사용 가능합니다.`}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div className="col-lg-4 mb-5">
                                <div className="card h-100 shadow border-0">
                                    <img className="card-img-top" src="https://src.hidoc.co.kr/image/lib/2022/7/20/1658306424525_0.jpg" alt="..." />
                                    <div className="card-body p-4">
                                        <div className="badge bg-primary bg-gradient rounded-pill mb-2">사용가능한 브랜드</div>
                                        <a className="text-decoration-none link-dark stretched-link"><div className="h5 card-title mb-3">{coupon[2]}</div></a>
                                        <p className="card-text mb-0">추천해드릴 만한 상품 설명</p>
                                    </div>
                                    <div className="card-footer p-4 pt-0 bg-transparent border-top-0">
                                        <div className="d-flex align-items-end justify-content-between">
                                            <div className="d-flex align-items-center">
                                                <div className="small">
                                                    <div className="fw-bold">추가로 신청하기</div>
                                                    <div className="text-muted">{`${submitDay.toLocaleDateString().slice(0, -1)} 까지 사용 가능합니다.`}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </section>
                <section className="py-5">
                    <div style={{ width: '250%' }} className="container px-5">
                        <h2 className="fw-bolder fs-5 mb-4">만료된 쿠폰입니다.</h2>
                        <div className="row gx-5">
                            <div className="col-lg-4 mb-5">
                                <div className="card h-100 shadow border-0">
                                    <img className="card-img-top" src="https://www.shutterstock.com/image-photo/funny-red-welsh-corgi-pembroke-260nw-2042038094.jpg" alt="..." />
                                    <div className="card-body p-4">
                                        <div className="badge bg-primary bg-gradient rounded-pill mb-2">사용가능한 브랜드</div>
                                        <a className="text-decoration-none link-dark stretched-link"><div className="h5 card-title mb-3">{coupon[4]}</div></a>
                                        <p className="card-text mb-0">추천해드릴 만한 상품 설명</p>
                                    </div>
                                    <div className="card-footer p-4 pt-0 bg-transparent border-top-0">
                                        <div className="d-flex align-items-end justify-content-between">
                                            <div className="d-flex align-items-center">
                                                <div className="small">
                                                    <div className="fw-bold">추가로 신청하기</div>
                                                    <div className="text-muted">{`${submitDay.toLocaleDateString().slice(0, -1)} 까지 신청 시 추가할인 !`}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div className="col-lg-4 mb-5">
                                <div className="card h-100 shadow border-0">
                                    <img className="card-img-top" src="https://san.chosun.com/news/photo/202302/22412_82258_3814.jpg" alt="..." />
                                    <div className="card-body p-4">
                                        <div className="badge bg-primary bg-gradient rounded-pill mb-2">사용가능한 브랜드</div>
                                        <a className="text-decoration-none link-dark stretched-link"><div className="h5 card-title mb-3">{coupon[5]}</div></a>
                                        <p className="card-text mb-0">추천해드릴 만한 상품 설명</p>
                                    </div>
                                    <div className="card-footer p-4 pt-0 bg-transparent border-top-0">
                                        <div className="d-flex align-items-end justify-content-between">
                                            <div className="d-flex align-items-center">
                                                <div className="small">
                                                    <div className="fw-bold">추가로 신청하기</div>
                                                    <div className="text-muted">{`${submitDay.toLocaleDateString().slice(0, -1)} 까지 신청 시 추가할인 !`}</div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div >
        </>
    )

}


export default Mj_mypage_coupon;

