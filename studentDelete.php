
<?php
$connection = mysqli_connect("localhost", "root", "" ,"SchoolBus") or die('Could not connect to server.' );
//mysql_select_db("SchoolBus",$connection);// Establishing Connection with Server
 // Selecting Database



   $Student_id  = $_POST["Student_id"];
$qur = "DELETE FROM `student` WHERE Student_id = ' $Student_id ' ";
	if(mysqli_query($connection,$qur)){
echo "sucssessful";
}else
{
echo "Error: " . mysqli_error($connection);
	}
 echo    $Student_id ;

    mysqli_close($connection);

    // check if the username has been set
   




	

?>

