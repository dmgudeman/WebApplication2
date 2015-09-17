<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>APPOINTMENTS</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    <h1>Thanks</h1>

    <p>Here is the information that you entered:</p>

    <label>Date:</label>
    <span>${user.date}</span><br>
    <label>Appointment:</label>
    <span>${user.appointment}</span><br>
    <label>Location:</label>
    <span>${user.location}</span><br>

    <p>To enter another appointment, click on the Back 
    button in your browser or the Return button shown 
    below.</p>

    <form action="" method="post">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>