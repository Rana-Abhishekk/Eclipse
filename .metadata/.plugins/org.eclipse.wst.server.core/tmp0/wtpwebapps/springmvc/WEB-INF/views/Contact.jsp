<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>User Registration</title>
  </head>
  <body>
  <h1 style="display: flex;

justify-content: center; margin:50px;"> USER REGISTRATION</h1>
   <div class="container mt-1">
  <form action="/springmvc/processform" method="post">
 
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputName" name="name" aria-describedby="emailHelp">
    
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
 
  <div class="form-group">
    <label for="exampleInput">City</label>
    <input type="text" class="form-control" id="exampleInputCity" name="city" aria-describedby="city">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form >

<div class="fetch">
<h1> Email to be Fetched </h1>
<form action = "/springmvc/fetch" method="get">
<label for="exampleInputEmail1">Email address</label>
<input type = "email" name="email">
<button type="submit" class="btn btn-primary">Submit</button>

</form>

</div>

<div class="delete">
<h1> Email to be Deleted </h1>
<form action = "/springmvc/delete" method="delete">
<label for="exampleInputEmail1">Email address</label>
<input type = "email" name="email">
<button type="submit" class="btn btn-primary">Submit</button>

</form>

</div>

 <h1 style="display: flex;

justify-content: center; margin:50px;"> USER Updation</h1>
   <div class="container mt-1">
  <form action="/springmvc/update" method="post">
  <h2>Enter your email to change your details</h2>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter your Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
 
  <div class="form-group">
    <label for="exampleInputEmail1">New Name</label>
    <input type="text" class="form-control" id="exampleInputName" name="name" aria-describedby="emailHelp">
    
  </div>
  
 
  <div class="form-group">
    <label for="exampleInput"> New City</label>
    <input type="text" class="form-control" id="exampleInputCity" name="city" aria-describedby="city">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">New Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="password">
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</form >

  </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    -->
  </body>