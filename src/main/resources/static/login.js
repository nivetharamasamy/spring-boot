var app=new function () {


    this.login = function () {
    

        var username1=document.getElementById("username").value;
        var password1=document.getElementById("password").value;
        
        


        var jsondata = JSON.stringify({
            username: username1,
            password:password1,
           
        });


    
        $.ajax({
            
            url: 'http://localhost:8080/user/login',
            type: 'POST',
            data: jsondata,
            contentType: "application/json; charset=utf-8",
            success: function(data){
                alert(data);
if(data==1){
 
    alert("welcome")
    location.href = "http://localhost:8080/";
}
else{
    alert("invalid username or password")
    location.reload(true);
}

                
              },
              error: function(errMsg) {
                 alert("failer");
              }
          
    
        });
         // page refresh
        // location.reload(true);
    
    
    }

    this.create = function () {
    

        var username1=document.getElementById("username1").value;
        var password1=document.getElementById("password1").value;
        var useremail=document.getElementById("useremail").value;
        
        
        


        var jsondata = JSON.stringify({
            username: username1,
            usermailid:useremail,
            password:password1,
           
           
        });

alert (jsondata);
    
        $.ajax({
            
            url: 'http://localhost:8080/user/',
            type: 'POST',
            data: jsondata,
            contentType: "application/json; charset=utf-8",
            success: function(data){
                alert("ready to sign in");
                location.href = "file:///E:/java%20script/task/src/main/resources/static/newuser.html";

              },
              error: function(errMsg) {
                 alert("failer");
              }
     
         });
          // page refresh
        //  location.reload(true);
     
     
    }
}
