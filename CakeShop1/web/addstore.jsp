
<html>
  
<head>
<title>Cake Shop</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="styles1.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


</head>
 <body>  
     
     <%
     String user=request.getParameter("user");
     %>
       <div class="container">
  <div class="navbar">
	         <div class="navbar-inner">
	           
	             <ul class="nav">
                         <li class="active"><a href="admin.jsp"><b>Home</b></a></li>
                         <li class=""><a href="existing.html"><b>Add Customer Order</b></a></li>
                         <li class=""><a href="existing.html"><b>Delete Customer Order</b></a></li>
                         <li class=""><a href="existing.html"><b>Update Customer Order</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Back</b></a></li>
                          <li class=""><a href="logout.jsp"><b>Logout</b></a></li>
                          </ul>
                 </div>
      
      
  </div>

         <div class="span4">
	       		<ul class="nav nav-list">
    <li class="active"><a href="admin.jsp"><b>Home</b></a></li>
    <li class=""><a href="addstore.jsp"><b>Add products to Store</b></a></li>
                         <li class=""><a href="delstore.jsp"><b>Delete products from Store</b></a></li>
                         <li class=""><a href="updatestore.html"><b>Update products to Store</b></a></li>
                         <li class=""><a href="existing.html"><b>Add Customer Order</b></a></li>
                         <li class=""><a href="existing.html"><b>Delete Customer Order</b></a></li>
                         <li class=""><a href="existing.html"><b>Update Customer Order</b></a></li>
</ul>
	       	</div>
     
  <div class="span8">
      <section class="group6">
<form method="post" class="searchform" action="submitprodtodb.jsp">
<fieldset>
    <legend><h5>Add Products to Store!</h5></legend>
                        <table>

                            <tr>
                                <td> Cake Name: </td>
                                <td> <input type="text" name="cakename" /> </td>
                            </tr>
                             <tr>
                                <td> Cake Category: </td>
                                <td>  <select name="cakecategory">
                                            <option value="flavour" selected>Flavour Cakes</option>
                                            <option value="theme" selected>Theme Cakes</option>
                                            <option value="addon" selected>Add Ons</option>
                                            <option value="photo" selected>Photo Cakes</option>
                                    </select> </td>
                            </tr>
                             <tr>
                                <td> Cake Type </td>
                                <td>  <select name="caketype">
                                            <option value="cream" selected>Cream Cakes</option>
                                            <option value="eggless" selected>Eggless Cakes</option>
                                            <option value="special" selected>Special Cakes</option>
                                            <option value="premium" selected>Premium Cakes</option>
                                            <option value="mousse" selected>Mousse Cakes</option>
                                            <option value="cheese" selected>Cheese Cakes</option>
                                            <option value="two_tier" selected>Two Tier Cakes</option>
                                            <option value="three_tier" selected>Three Tier Cakes</option>
                                            <option value="cartoon" selected>Cartoon Cakes</option>
                                            <option value="heart" selected>Heart Cakes</option>
                                            <option value="wedding" selected>Wedding Cakes</option>
                                            <option value="birthday" selected>Birthday Cakes</option>
                                            <option value="offers" selected>Offers</option>
                                    </select> </td>
                            </tr>
                            
                            <tr>
                                <td>Image URL(Format: images/..) </td>
                              <td>  <input type="text" name="cakeimage" /> </td>
                            </tr>


                            <tr>
                                <td> Original Cake Price: </td>
                                <td>
                                    <input type="text" name="cakeprice" size=10 class="s" /> </td>
                            </tr>
                            
                            <tr>
                                <td> Discounted Cake Price: </td>
                                <td>
                                    <input type="text" name="cakeprice1" size=10 class="s" /> </td>
                            </tr>

                            <tr>
                                <td> Cake Unit: </td>
                                <td>
                                    <select name="cakeunit">
                                            <option value="Half Kg" selected>Half Kg</option>
                                            <option value="One Kg" selected>One Kg</option>
                                            <option value="One point 5 Kg" selected>One point 5 Kg</option>
                                            <option value="Two Kg" selected>Two Kg</option>
                                    </select> </td>
                               
                            </tr>
                            <tr>
                                <td> Number of Items: </td>
                                <td>
                                   <input type="number" min=1 name="numItems" size=10 class="s" /> </td>
                               
                            </tr>

<tr>
                                <td>
                                   
                                    <input type="submit" value="Add To Store" class="btn btn-info1 active" /> </td>
                                <td></td>
                            </tr>


                        </table></fieldset>
                    </form>
      </section>
	 </div>
      
     <footer>
	
        <div class="footer-content">
            <ul>
            	<li><h4>Cake Shop</h4></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">Delivery Policy</a></li>
                <li><a href="#">Terms & Conditions</a></li>
                
			</ul>
            
            <ul>
            <li><h4>Shop</h4></li>
            <li><a href="birthday.jsp">Birthday Cakes</a></li>
            <li><a href="wedding.jsp">Wedding Cakes</a></li>
        </ul>
            
            <ul>
            	<li><h4>Customer Service </h4></li>
                <li><a href="userdetails.jsp">About your Order</a></li>
                 <li><a href="#">Reviews/Complaints</a></li>
                
			</ul>
            <ul>
            	<li><h4>Connect with Us</h4></li>
                <li>
                <img src="images/fb.png" alt=""/>  </li>
                <li><img src="images/twitter.jpg" alt=""/> </li>
               
			</ul>
           
        
        </div>
		
        <div class="footer-bottom">
            <p> <span>&copy; 2015 All Rights Reserved </span>&nbsp;&nbsp;|&nbsp;&nbsp; CSP 595 Cake Website by Team 17</p>
        </div>
		
    </footer>
    </div>
 
     
        </body>
</html>

