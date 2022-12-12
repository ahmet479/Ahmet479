<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title> odev5 </title>
    </head>
    <body>
        <p>
            <?php
                if(empty($_POST['fname'])==false)
                {
                    echo $_POST['fname'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>

        <p>
            <?php
                if(empty($_POST['lname'])==false)
                {
                    echo $_POST['lname'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>

        <p>
            <?php
                if(empty($_POST['user'])==false)
                {
                    echo $_POST['user'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['pass'])==false)
                {
                    echo $_POST['pass'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['Add'])==false)
                {
                    echo $_POST['Add'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['Sehir'])==false)
                {
                    echo $_POST['Sehir'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['ZIP'])==false)
                {
                    echo $_POST['ZIP'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>

        <p>
            <?php
                if(empty($_POST['age'])==false)
                {
                    echo $_POST['age'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>

        <p>
            <?php
                if(empty($_POST['email'])==false)
                {
                    echo $_POST['email'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['gender'])==false)
                {
                    echo $_POST['gender'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['lang'])==false)
                {
                    echo $_POST['lang'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
        <p>
            <?php
                if(empty($_POST['About'])==false)
                {
                    echo $_POST['About'];
                }
                else
                {
                    echo "Not provided";
                }
            ?>
        </p>
      
    </body>
</html>