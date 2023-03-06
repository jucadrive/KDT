function menuBarOn(obj,speed){
    
        $('#menu_window').stop();
        $('#menu_window').show();
        $('#menu_window').animate({width:30+'vw'},speed)
        
   
}
function menuBarOff(obj,speed){

        $('#menu_window').stop();
        $('#menu_window').animate({width:0},speed)
 
}
$(document).ready(function(){
    $('#menu_window').hide()

})