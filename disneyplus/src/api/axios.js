import axios from "axios";

// axios 인스턴스를  생생해서 URL에서 공통(반복)되는 부분을 객체로 대신하기 위해
const instance = axios.create({
  baseURL: "https://api.themoviedb.org/3",
  params: {
    api_key: "9a27cb7ca5eb3675d9a79179a5edd818",
    language: "ko-KR"
  }

});

export default instance;