var imgArray=new Array();
imgArray[0]="container5_1.jpeg";
imgArray[1]="container5_2.jpeg";
imgArray[2]="container5_3.jpeg";
imgArray[3]="container5_4.jpeg";
imgArray[4]="container5_5.jpeg";
imgArray[5]="container5_6.jpeg";
imgArray[6]="container5_7.jpeg";

function showImage(){
 var imgNum=Math.round(Math.random()*6);
 var objImg=document.getElementById("introimg");
 objImg.src=imgArray[imgNum];
 setTimeout(showImage,2000);
}