function list_box_active(ID){
// attr 속성으로 value값을 불러오면 기본적으로 문자형이기 때문에
// number함수로 숫자로 바꿔준다.
    var count = Number($(`#${ID}`).attr("value"));
    count+=1;

    if(count % 2 ==1){ 
        $(`#${ID}_box`).show().animate({height:500},300)}
       else{
        $(`#${ID}_box`).animate({height:0},300).hide()} 
    $(`#${ID}`).attr("value",count)
}
function total_price(){
    let total_val=document.getElementById("total_val");
    total_val.innerText=base_price() + equip_price();
    return Number(total_val.innerText);
}
function base_price(){
    let base_val=document.getElementById("base_val");
    base_val.innerText=170000000;
    return Number(base_val.innerText);
}
function equip_price(){
    let equip_val=document.getElementById("equip_val");
    equip_val.innerText=1576567511;
    return Number(equip_val.innerText);
}

$(document).ready(function(){
total_price();
})
// *=은 패턴 매칭 속성을 지닌 속성 선택자
// $=은 텍스트 끝 매칭 속성을 지닌 속성 선택자
// ^=은 텍스트 시작 매칭 속성을 지닌 속성 선택자
