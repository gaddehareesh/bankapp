<!DOCTYPE html>
<html>
<head>
    <title>Krishna Bank - Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #1e3c72, #2a5298);
            margin: 0;
            padding: 0;
        }

        .container {
            width: 350px;
            margin: 100px auto;
            background: white;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0px 4px 12px rgba(0,0,0,0.2);
            text-align: center;
        }

        h1 {
            color: #2a5298;
            margin-bottom: 20px;
        }

        input {
            width: 90%;
            padding: 10px;
            margin: 8px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        button {
            width: 95%;
            padding: 10px;
            background-color: #2a5298;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        button:hover {
            background-color: #1e3c72;
        }

        .footer {
            margin-top: 15px;
            font-size: 12px;
            color: gray;
        }
    </style>
</head>

<body>

<div class="container">
    <h1>Krishna Bank</h1>

    <form action="login" method="post">
        <input type="text" name="customerId" placeholder="Customer ID" required/>
        <input type="text" name="customerName" placeholder="Customer Name" required/>
        <button type="submit">Login</button>
    </form>

    <div class="footer">
        Secure Banking Portal © 2026
    </div>
</div>

</body>
</html>
