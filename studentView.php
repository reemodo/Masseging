
<?php
$connection = new mysqli("localhost", "root", "","SchoolBus"); // Establishing Connection with Server
    if ($connection->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}// Selecting Database
//MySQL Query to read data
$heroes = array(); 
$qur = "SELECT Student_id,Student_name FROM `student` ";
//creating an statment with the query
$stmt = $connection->prepare($qur);
 
//executing that statment
$stmt->execute();
 
//binding results for that statment 
$stmt->bind_result($Student_id, $Student_name);
 
//looping through all the records
while($stmt->fetch()){
	
	//pushing fetched data in an array 
	$temp = [
		'id'=>$Student_id,
		'name'=>$Student_name
	];
	
	//pushing the array inside the hero array 
	array_push($heroes, $temp);
}
 
//displaying the data in json format 
echo json_encode($heroes);
?>

