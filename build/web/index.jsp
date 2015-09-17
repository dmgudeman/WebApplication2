<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Appointments</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>INPUT APPOINTMENT</h1>
    <p>Please fill in the boxes.</p>
    <p><i>${message}</i></p>
    <form action="emailList" method="post">
        <input type="hidden" name="action" value="add">        
        <label class="pad_top">Date:</label>
        <input type="text" name="date" value="${user.date}" 
               required><br>
        <label class="pad_top">Appointment:</label>
        <input type="text" name="appointment" value="${user.appointment}" 
               required><br>
        <label class="pad_top">Location:</label>
        <input type="text" name="location" value="${user.location}"  
               required><br>        
        <label>&nbsp;</label>
        <input type="submit" value="Join Now" class="margin_left">
    </form>
</body>
</html>