import axios from '../../api/axios';
import React from 'react';
import { useParams } from 'react-router-dom';
import { useState, useEffect } from 'react';

const DetailPage = () => {
  let {movieId} = useParams();
  const [movie, setMovie] = useState({});

  useEffect(() => {
    async function fetchData() {
      const response = await axios.get(
        `/movie/${movieId}`
      )
      setMovie(response.data);
    }
    fetchData();
  }, [movieId])

  if(!movie) {
    return null;
  }
  
  return (
    <section>
      <img 
      className='modal__poster-img'
      src={`https://image.tmdb.org/t/p/original/${movie.backdrop_path}`} 
      alt="img" />
    </section>
  )
}

export default DetailPage