
<?php

$connection = mysqli_connect("localhost", "root", "" ,"SchoolBus") or die('Could not connect to server.' );
//mysql_select_db("SchoolBus",$connection);// Establishing Connection with Server
 // Selecting Database

   $Employee_id  = $_POST["Employee_id"];
//$qur ="SELECT FROM `employees_accounts` WHERE Employee_id"
$qur = "DELETE FROM `employees_accounts` WHERE `Employee_id` = ' $Employee_id '; ";
$qur.= "DELETE FROM `employees` WHERE `Employee_id` = ' $Employee_id ' ;";
//mysqli_query($connection,$qur2)

	if(mysqli_multi_query($connection,$qur)){
echo "sucssessful";
		 echo    $Employee_id ;
}else
{
echo "Error: " . mysqli_error($connection);
	}


    mysqli_close($connection);

    // check if the username has been set
   


?>

	

?>

