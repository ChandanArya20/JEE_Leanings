<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Create Account</title> 
        <link rel="stylesheet" href="style.css"></link>
                
    </head>
    <body>
        <h1>iNeuron Intelligence Private Ltd</h1>
        <div class="user_input">
            <form  method="post" action="reg" >
                <div class="input_heading">Fill Your details</div>
                <div>
                    Id<br/>
                    <input type="text" name="id" placeholder="Enter id"/>      
                    <div class="error-text">${requestScope.idErrorMsg }</div>        
                </div>
                <div>
                    Name<br/>
                    <input type="text" name="name" placeholder="Enter Name"/>
                    <div class="error-text">${requestScope.nameErrorMsg }</div>         

                </div>
                <div>
                    Age<br/>
                    <input type="text" name="age" placeholder="Enter age"/>
                     <div class="error-text">${requestScope.ageErrorMsg }</div>           

                </div>
                <div>
                    Email<br/>
                    <input type="text" name="email" placeholder="Enter email"/>
                    <div class="error-text">${requestScope.emailErrorMsg }</div>          

                </div>
                <div>
                    Mobile No.<br/>
                    <input type="text" name="mob" placeholder="Enter mob."/>
                     <div class="error-text">${requestScope.mobErrorMsg }</div>        

                </div>
                <div class="sub-btn-container">                 
                    <input type="submit" value="Submit"/>
                </div>
               
            </form>
        </div>
    </body>
</html>