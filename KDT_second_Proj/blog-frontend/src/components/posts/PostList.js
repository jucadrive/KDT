import styled from "styled-components";
import Responsive from "../common/Responsive";
import Button from "../common/Button";
import palette from "../../lib/styles/palette";
import SubInfo from "../common/SubInfo";
import Tags from "../common/Tags";
import { Link } from 'react-router-dom'


const PostListBlock = styled(Responsive)`
margin-top: 3rem;
ul li{
    list-style-type: none;
    display : inline;
    padding-right: 30px;
}
ul {
    margin-top : 20px;
}
table{
    margin-bottom: 30px;
}
table thead {
    font-size: 18px;
    font-weight: bold;
    
}

table thead td {
    padding-right : 45px;
}

`;

const WritePostButtonWrapper = styled.div`
display: flex;
justify-content: flex-end;
margin-bottom: 3rem;
`;

const PostItemBlock = styled.div`
padding-top: 10px;
padding-bottom : 10px;
&:first-child{
    padding-top:0;
}
& + &{
    border-top : 1px solid ${palette.gray[2]};
}

h2{
    font-size: 2rem;
    margin-bottom: 0;
    margin-top: 0;
    &:hover {
        color: ${palette.gray[6]};
    }
}
p{
    margin-top: 2rem;
}
ul li{
    list-style-type: none;
}
tr td { 
    padding-right: 55px;
}
`;


const PostItem = ({post}) => {
    const { publishedDate, user, tags, title, _id, postCount} = post;
    return (
        <PostItemBlock>
          <tr>
          <td>{postCount}</td>
          <td>상품정보</td>
          <td style={{width:'320px'}}><Link to={`/:${user.username}/${_id}`}>{title}</Link></td>
          <td style={{width:'150px'}}><Tags tags={tags} /></td>
          <td style={{width:'150px'}}>{user.username}</td>
          <td style={{width:'150px'}}><SubInfo publishedDate={new Date(publishedDate)} /></td>
          
         </tr>
        </PostItemBlock>
        
    );
};

const PostList = ({posts, loading, error, showWriteButton}) => {
    if(error) {
        return <PostListBlock>에러가 발생했습니다.</PostListBlock>
    }
    return (
        <PostListBlock>
            <h2>문의 게시판</h2>
      <ul>
        <li>구독 및 해지 관련 문의</li>
        <li>구독 서비스 관련 문의</li>
        <li>입금 및 결제 문의</li>
        <li>기타 문의</li>
      </ul>
            <WritePostButtonWrapper>
                {showWriteButton && (
                 <Button cyan to="/write">
                    새 글 작성하기
                </Button>
                )}   
            </WritePostButtonWrapper>
        <table>
        <thead>
          <td>번호</td>
          <td>카테고리</td>
          <td style={{width:'320px'}}>제목</td>
          <td style={{width:'150px'}}>태그</td>
          <td style={{width:'150px'}}>작성자</td>
          <td style={{width:'150px'}}>작성일</td>
         </thead>
          </table>
            {/* 로딩 중이 아니고 포스트 배열이 존재할 때만 보여 줌 */}
            {!loading && posts && (
                 <div>
                {posts.map(post => (
                    <PostItem post={post} key={post._id} />
                ))}
            </div>
            )} 
          
        </PostListBlock>
    );
}

export default PostList;