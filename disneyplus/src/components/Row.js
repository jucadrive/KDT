import React, { useCallback, useEffect, useState } from 'react'
import axios from '../api/axios';
import './Row.css';
import MovieModal from './MovieModal';

import { Navigation, Pagination, Scrollbar } from 'swiper';
import { Swiper, SwiperSlide } from 'swiper/react';

// import swiper style
import "swiper/css";
import "swiper/css/navigation";
import "swiper/css/scrollbar";
import "swiper/css/pagination";
import styled from 'styled-components';



const Row = ({ title, id, fetchUrl }) => {
  const [movies, setMovies] = useState([]); // 여러 가지 영화 정보들이 들어가므로 빈 배열로 초기화
  const [modalOpen, setModalOpen] = useState(false);
  const [movieSelected, setmovieSelected] = useState({})  // 하나의 영화 정보만 들어가면 되므로 빈 객체로 초기화

  const fetchMovieData = useCallback(async () => {
    const response = await axios.get(fetchUrl);
    console.log(response);
    setMovies(response.data.results);
  }, [fetchUrl])

  useEffect(() => {
    fetchMovieData();
  }, [fetchMovieData])  // 컴포넌트가 생성되면 함수도 재생성됨
  // useCallback 사용

  const handleClick = (movie) => {
    setModalOpen(true);
    setmovieSelected(movie);
  }
  return (
    <Container>
      <h2>{title}</h2>
      <Swiper
        // install Swiper modules
        modules={[Navigation, Pagination, Scrollbar]}
        loop={true} // loog 기능 사용할 것인지
        navigation  // arrow 버튼 사용 유무
        pagination={{ clickable: true }}  // 페이지 버튼 보이게 할지
        breakpoints={{
          1378: {
            slidesPerView: 6, // 한 번에 보이는 슬라이드 개수
            slidesPerGroup: 6
          },
          998: {
            slidesPerView: 5, // 한 번에 보이는 슬라이드 개수
            slidesPerGroup: 5
          },
          625: {
            slidesPerView: 4, // 한 번에 보이는 슬라이드 개수
            slidesPerGroup: 4
          },
          0: {
            slidesPerView: 3, // 한 번에 보이는 슬라이드 개수
            slidesPerGroup: 3
          }
        }}
      >

        <Content id={id}>
          {movies.map((movie) => (
            <SwiperSlide>
              <Wrap>
              <img
                key={movie.id}
                src={`https://image.tmdb.org/t/p/original/${movie.backdrop_path}`}
                alt={movie.name}
                onClick={() => handleClick(movie)}
              />
              </Wrap>
            </SwiperSlide>
          ))}
        </Content>
      </Swiper>

      {modalOpen &&
        <MovieModal
          {...movieSelected}
          setModalOpen={setModalOpen}
        />
      }
    </Container>
  )
}

export default Row

const Container = styled.div`
  padding: 0 0 26px;
`;

const Content = styled.div`
  
`;

const Wrap = styled.div`
width: 95%;
height: 95%;
padding-top: 56.25%;
border-radius: 10px;
box-shadow: rgb(0 0 0 / 69%) 0px 26px 30px -10px,
  rgb(0 0 0 / 73%) 0px 16px 10px -10px;
cursor: pointer;
overflow: hidden;
position: relative;
transition: all 250ms cubic-bezier(0.25, 0.46, 0.45, 0.94) 0s;
border: 3px solid rgba(249, 249, 249, 0.1);

img {
  inset: 0px;
  display: block;
  height: 100%;
  object-fit: cover;
  opacity: 1;
  position: absolute;
  transition: opacity 500ms ease-in-out 0s;
  width: 100%;
  z-index: 1;
  top: 0
}
&:hover {
  box-shadow: rgb(0 0 0 / 80%) 0px 40px 58px -16px,
    rgb(0 0 0 / 72%) 0x 30px 22px -10px;
  transform: scale(0.98);
  border-color: rgba(249, 249, 249, 0.8);
}
`;