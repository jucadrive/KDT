import React from 'react';
import { Route, Routes, Outlet } from 'react-router-dom';
import PostListPage from './pages/PostListPage';
import LoginPage from './pages/LoginPage';
import RegisterPage from './pages/RegisterPage';
import WritePage from './pages/WritePage';
import PostPage from './pages/PostPage';
import Main from './pages/jw_main'
import Asdfsadf from '../src/component/asdfasdf';
import ApplySubscribeJW from "./pages/jw_applySubscribe";


const App = () => {
  return (
   
     <Routes>
      <Route path="/" element={<Main />} />
      <Route path="/" element={<Outlet />}>
          <Route path="main/" element={<ApplySubscribeJW />} />
          <Route path="main/" element={<Outlet />}>
            <Route path="category=/:contentsId" Component={Asdfsadf}></Route>
            <Route path="myInfo" Component={Asdfsadf}></Route>
          </Route>
      </Route>
      <Route path="/postlist" element={<PostListPage />}  />
      <Route path="/login" element={<LoginPage />}  />
      <Route path="/register" element={<RegisterPage />}  />
      <Route path="/write" element={<WritePage />}  />
      <Route path="/post" element={<PostPage />}  />
      <Route path="/:username">
        <Route index element={<PostListPage  />} />
        <Route path=":postId" element={<PostPage />}  />
      </Route>
    </Routes>
    
    
    
  );
};
export default App;
