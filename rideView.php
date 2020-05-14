
<?php
$connection = new mysqli("localhost", "root", "","SchoolBus"); // Establishing Connection with Server
    if ($connection->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}// Selecting Database
//MySQL Query to read data
$heroes = array(); 
$qur = "SELECT * FROM `rides` ";
//creating an statment with the query
$stmt = $connection->prepare($qur);
 
//executing that statment
$stmt->execute();
 
//binding results for that statment 
$stmt->bind_result($Ride_id, $Driver_id, $Bus_id, $Shift_id, $Path, $in_or_out, $Time_to_start);
 
//looping through all the records
while($stmt->fetch()){
	
	//pushing fetched data in an array 
	$temp = [
		'id'=>$Ride_id,
		
	];
	
	//pushing the array inside the hero array 
	array_push($heroes, $temp);
}
 
//displaying the data in json format 
echo json_encode($heroes);
?>

