<?php

if($_SERVER["REQUEST_METHOD"]=="POST"){
        require 'connection.php';
        createStudent();
}


function createStudent()
{
        global $connect;

        $ider = $_POST["id"];


		system("gpio mode 29 out");
                exec ("gpio read 29", $status, $return );
                if ($status[0] == "0" ) { $status[0] = "1"; }
                else if ($status[0] == "1" ) { $status[0] = "0"; }
                system("gpio write 29  ".$status[0] );


        $query = " UPDATE slots SET avail='$status[0]' WHERE id = '$ider';";

        mysqli_query($connect, $query) or die (mysqli_error($connect));
        mysqli_close($connect);

}
?>

