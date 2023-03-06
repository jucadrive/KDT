let email_allow = document.querySelector('.email_allow');
let pw_allow = document.querySelector('.pw_allow');
let email_error = document.querySelector('.email_error');
let pw_error = document.querySelector('.pw_error');
let checkbox = document.querySelector('.cb')
let id_check = document.querySelector('.id_check')
const email = document.querySelector('#email');
const pw = document.querySelector('#pw');
const pw2 = document.querySelector('#pw2'); 

function createID(){
  if(email.value != "" && pw.value != "" && pw2.value != "") {
    if(pw.value != pw2.value){
      pw_error.style.display = 'block';
      pw_allow.style.display = 'none';
    }else {
      pw_allow.style.display = 'block';
      pw_error.style.display = 'none';
    }
  }else{
    alert('회원가입을 할 수 없습니다.')
    email_allow.style.display = 'none';
    email_error.style.display = 'none';ㅏ
    pw_allow.style.display = 'none';
    pw_error.style.display = 'none';
  }
  
  if(email.value == 'dhzlehzl01@naver.com' && pw.value == pw2.value && checkbox.checked == true){
    alert('회원가입을 축하드립니다.');
    location.href = 'login_page.html'
  }else {
    alert('이메일 또는 비밀번호를 확인하세요. / 체크사항을 확인하세요.')
  }
};

function checkID() {
  if(email.value != "dhzlehzl01@naver.com"){
    email_error.style.display = 'block';
    email_allow.style.display = 'none';
  }else {
    email_allow.style.display = 'block';
    email_error.style.display = 'none';
  }
}