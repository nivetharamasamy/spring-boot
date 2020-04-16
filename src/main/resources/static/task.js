// function apicall(){
//     var result=[];
//     var xhttp = new XMLHttpRequest();
// xhttp.onreadystatechange = function() {
// if (this.readyState == 4 && this.status == 200) {
// // Typical action to be performed when the document is ready:
// document.getElementById("demo").innerHTML = xhttp.responseText;
// console.log("xhttp.responseText"+xhttp.responseText);
// result=xhttp.responseText;
// document.getElementById("demo").innerHTML = result;

// document.getElementById("logindetails").innerHTML = result;

// }
// };
// xhttp.open("GET", "http://localhost:8080/user/", true);
// xhttp.send();
// }
var app=new function () {
var globe=0;
    // getall
 this.apicall = function () {
$.ajax({
    url: 'http://localhost:8080/user/',
    type: 'GET',

    success: function (response) {
        var trHTML = '';
        $.each(response, function (i, item) {
            trHTML += '<tr><td>' + item.userid + '</td><td>' + item.username + '</td><td>' + item.usermailid + '</td><td><button onclick="app.edit('+item.userid+')">edit</td><td><button onclick="app.delete('+item.userid+')">delete</td></tr>';
        });
        $('#records_table').append(trHTML);
    }
});
}

// edit
this.edit = function (id) {
     alert(id);
    document.getElementById('save').innerHTML = "update";
    globe=id;
}

this.update = function () {
alert(globe);
    var username1=document.getElementById("username").value;
    var usermailid1=document.getElementById("usermailid").value;
console.log("username1username1"+username1+"happy");
console.log("usermailid1usermailid1"+usermailid1+"happy");

 

    var jsondata = JSON.stringify({
        username: username1,
        usermailid:usermailid1,
       
    });
   
    alert(username1);
    alert(usermailid1);
    $.ajax({
        
        url: 'http://localhost:8080/user/'+globe,
        type: 'PUT',
        data: jsondata,
        contentType: "application/json; charset=utf-8",
    
    });


   // page refresh
   location.reload(true);
   
}



this.saveAndUpdate = function () {
     alert();
    ((document.getElementById('save').innerHTML == "Save") ? this.add() : this.update());
}





//  post
this.add = function () {

    var username1=document.getElementById("username").value;
    var usermailid1=document.getElementById("usermailid").value;
  
    var jsondata = JSON.stringify({
        username: username1,
        usermailid:usermailid1,
       
    });

    $.ajax({
        
        url: 'http://localhost:8080/user/',
        type: 'POST',
        data: jsondata,
        contentType: "application/json; charset=utf-8",
        success: function(data){
           alert("success");
         },
         error: function(errMsg) {
            alert("failer");
         }

    });
     // page refresh
    location.reload(true);


}

// delete
this.delete = function (id) {
    alert(id);
    
        $.ajax({
            url: 'http://localhost:8080/user/'+id,
            type: 'DELETE',
    
        });
    // page refresh
        location.reload(true);
}


}


