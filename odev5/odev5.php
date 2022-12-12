<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title><h1>Registration Form</h1></title>
        
</head>
<body>
<form action="odev5-onizleme.php" method="post">
    <div class="main">
        <div class="register">
            <h2>Register Form</h2>
          
            <label>First Name:  
            
            <input type="text" name="fname"
            id="fname" placeholder="Enter Your First Name"></label>
            <br><br>

            <label>Last Name: &nbsp;       
            <input type="text" name="lname"
            id="lname" placeholder="Enter Your Last Name"></label>
            <br><br>

            <label>Username:&nbsp; &nbsp; 
           
            <input type="text" name="user"
            id="user" placeholder="Enter Your Username"> </label>
            <br><br>

            <label>Password:&nbsp; &nbsp;&nbsp;  
           
            <input type="text" name="pass"
            id="pass" placeholder="Enter Your Password"> </label>
            <br><br>

            <label>Address:&nbsp; &nbsp; &nbsp; &nbsp; 
                <input type="text" name="Add"
                id="Add" placeholder="Enter Your Address"></label>

            <p> Country :&nbsp; &nbsp;&nbsp; &nbsp;
        <select name="Sehir">
            <option value=" country-Germany"> Germany</option>
            <option value=" country-Turkey"> Turkey</option>
            <option value=" country-Kingdom"> Kingdom</option>
            <option value=" country-USA"> USA</option>
            </p>
        </select>
         <br><br>

         <label>ZIP Code:  &nbsp;&nbsp;  &nbsp;
           
            <input type="text" name="ZIP"
            id="ZIP" placeholder="Enter Your ZIP Code"></label>
            
            <br><br>

            <label> Your Age:  &nbsp;&nbsp; &nbsp;&nbsp;
           
            <input type = "number" name="age" 
            id="age" placeholder="How old are you"></label>
            <br><br>

            <label>Email: &nbsp; &nbsp;  &nbsp; &nbsp;&nbsp;  &nbsp;&nbsp; <input type = "email" name="email" 
            id="email" placeholder="Enter Your Valid Email"></label>
            <br><br>
          
            




            <tr>
                <td>Gender:</td>
                <td><input type="radio" name="gender" id="gender" value="Male">Male
                <input type="radio" name="gender" id="gender" value="Female">Female</td>
            </tr>
            <br><br>
            <tr>
                <td>Language:</td>
                <td>English<input type ="checkbox" name="lang" id="lang" value="English">
                    French<input type="checkbox" name="lang" id="lang" value="French">       
                    German<input type="checkbox" name="lang" id="lang" value="Germany">       
                </td>
            </tr>

           
            <br><br>
          

            <label> About: 
        
        <textarea rows="4" cols="50" name="About" 
        placeholder="Yorumlarinizi girebilirsiniz"maxlength="200"
         minlength="10"> </textarea></br></label>
       
         &nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;<input type="submit" value="Submit" 
            name="submit" id="submit">

    </form>


        </div>

</div>


</body>