<?php

if($_SERVER["REQUEST_METHOD"]=="POST"){
	require 'connection.php';
	createStudent();
}


function createStudent()
{
	global $connect;
	
	$firstname = $_POST["avail"];	
	$lastname = $_POST["reserve"];
	$ider = $_POST["id"];

	$query = " UPDATE slots SET avail='$firstname',reserve='$lastname' WHERE id = '$ider';";
	
	mysqli_query($connect, $query) or die (mysqli_error($connect));
	mysqli_close($connect);
	
}





	


?>
