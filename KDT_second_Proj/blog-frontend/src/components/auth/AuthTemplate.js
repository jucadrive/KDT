import styled from 'styled-components';
import palette from '../../lib/styles/palette';
import { Link } from 'react-router-dom'
import HeaderContainer from '../common/HeaderContainer';

// 회원가입/로그인 페이지의 레이아웃 담당하는 컴포넌트입니다. 


const AuthTemplateBlock = styled.div`
//  background: ${palette.gray[2]};
/*flex로 내부 내용 중앙 정렬*/
height:810px;
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;

 `;

 const WhiteBox = styled.div`
 .logo-area{
    display: block;
    padding-bottom: 2rem;
    text-align: center;
    font-weight: bold;
    letter-spacing: 2px;
 }
    box-shadow: 0 0 8px rgba(0, 0, 0, 0.025);
    width: 360px;
    padding: 2rem;
    background: white;
    border-radius: 2px`;


const AuthTemplate = ({children}) => {
    return(
    <>
    <HeaderContainer/>
    <AuthTemplateBlock>
        <WhiteBox>
            <div className='logo-area'>
                <Link to="/">REACTERS</Link>
            </div>
            {children}
        </WhiteBox>
    </AuthTemplateBlock>
    </>
    )
}

export default AuthTemplate;
