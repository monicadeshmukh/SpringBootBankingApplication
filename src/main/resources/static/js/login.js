var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
    //testing for login: monica password: monica123 using javascript.
    //need to validate against database.
var username = document.getElementById("username").value;
var password = document.getElementById("password").value;
if ( username == "monica" && password == "monica123"){
alert ("Login successful.");
window.location = "accountDetails.html"; // Redirecting to other page.
return false;
}
else{
attempt --;// Decrementing by one.
alert("Invalid username or password. Please try again.");
// Disabling fields after 3 attempts.
if( attempt == 0){
document.getElementById("username").disabled = true;
document.getElementById("password").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}
}