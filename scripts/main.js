// 彈跳視窗出'跟著謙哥吃美食'
var myHeading = '跟著謙哥吃美食';
alert(myHeading);
//只要點擊視窗內任何地方都會彈跳視窗
//document.querySelector('html').onclick = function() {
//    alert('Ouch! Stop poking me!');
//}
// 圖片轉換 但只影響第一張圖
var myImage = document.querySelector('img');

myImage.onclick = function() {
    var mySrc = myImage.getAttribute('src');
    if(mySrc === 'images/IMG_2678.JPG') {
      myImage.setAttribute ('src','images/IMG_2677.JPG');
    } else {
      myImage.setAttribute ('src','images/IMG_2678.JPG');
    }
}

var myButton = document.querySelector('button');
var myHeading1 = document.querySelector('h1');
function setUserName() {
  var myName = prompt('Please enter your name.');
  localStorage.setItem('name', myName);
  myHeading1.textContent = '歡迎, ' + myName;
}
if(!localStorage.getItem('name')) {
  setUserName();
} else {
  var storedName = localStorage.getItem('name');
  myHeading1.textContent = '歡迎, ' + storedName;
}
myButton.onclick = function() {
  setUserName();
}
