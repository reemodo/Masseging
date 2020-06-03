
<?php
$connection = mysqli_connect("localhost", "root", "" ,"SchoolBus") or die('Could not connect to server.' );
//mysql_select_db("SchoolBus",$connection);// Establishing Connection with Server
 // Selecting Database



   $Ride_id  = $_POST["Ride_id"];
$qur="Delete FROM `rides` where `Ride_id` = ' $Ride_id' ";


if(mysqli_query($connection,$qur)){
	
	
echo "sucssessful";
	 echo    $Ride_id ;
}else
{
echo "Error: " . mysqli_error($connection);
	}


    mysqli_close($connection);

    // check if the username has been set
   




	

?>

