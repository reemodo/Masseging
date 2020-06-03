
<?php
$connection = mysqli_connect("localhost", "root", "" ,"SchoolBus") or die('Could not connect to server.' );
//mysql_select_db("SchoolBus",$connection);// Establishing Connection with Server
 // Selecting Database

 $Parent_id  = $_POST["Parent_id"];
$qur = "DELETE FROM `parents_accounts` WHERE `Parent_id` = ' $Parent_id '; ";
$qur.= "DELETE FROM `parents` WHERE `Parent_id` = ' $Parent_id ' ;";


	if(mysqli_multi_query($connection,$qur)){
echo "sucssessful";
}else
{
echo "Error: " . mysqli_error($connection);
	}
 echo    $Parent_id ;

    mysqli_close($connection);

    // check if the username has been set
   




	

?>

