console.log("Welcome to Community Event Portal");

window.onload=function(){
alert("Welcome to Community Event Portal");
}

function showMessage(){
alert("Explore exciting community events!");
}

function registerEvent(eventName){
alert("Registered for " + eventName);
}

function countChars(){

let text=
document.getElementById("message").value;

document.getElementById("count").innerHTML=
text.length;

}

document.getElementById("registrationForm")
.addEventListener("submit",function(e){

e.preventDefault();

alert("Registration Successful!");

});

function getLocation(){

if(navigator.geolocation){

navigator.geolocation.getCurrentPosition(

function(position){

document.getElementById("location").innerHTML=
"Latitude: " +
position.coords.latitude +
"<br>Longitude: " +
position.coords.longitude;

}

);

}

}