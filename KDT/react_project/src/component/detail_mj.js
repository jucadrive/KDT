import style from '../css/detail_mj.module.css'
import { Table, SideRightBox, SideLeftBox, DetailInfoe } from "./detail_mj_component";



function Detail_MJ() {

    return (
        <>
            <div className={style.detail_box}>
                <SideLeftBox />
                <SideRightBox />
            </div>
        </>
    );
};

export default Detail_MJ;
