<%@page import="com.mongodb.WriteResult"%>
<%@page import="com.mongodb.WriteResult"%>
<%@page import="com.mongodb.DBCursor"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.MongoClient"%>
<html>
  
<head>
<title>Cake Shop</title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="styles1.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


</head>
 <body>    
       <div class="container">
  <div class="navbar">
	         <div class="navbar-inner">
	           
	             <ul class="nav">
                         <li class="active"><a href="admin.jsp"><b>Home</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Add Customer Order</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Delete Customer Order</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Update Customer Order</b></a></li>
                         <li class=""><a href="addstore.jsp"><b>Back</b></a></li>
                          <li class=""><a href="logout.jsp"><b>Logout</b></a></li>
                          </ul>
                 </div>
      
      
  </div>

         <div class="span4">
	       		<ul class="nav nav-list">
    <li class="active"><a href="admin.jsp"><b>Home</b></a></li>
    <li class=""><a href="addstore.jsp"><b>Add products to Store</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Delete products from Store</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Update products to Store</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Add Customer Order</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Delete Customer Order</b></a></li>
                         <li class=""><a href="admin.jsp"><b>Update Customer Order</b></a></li>
</ul>
	       	</div>
            <div class="span8">
                <section class="group6">
                    
                    
                    
               
	
<%
MongoClient mongo = new MongoClient("localhost", 27017);
			//Get the values from the form
int orderid = Integer.parseInt(request.getParameter("orderid"));
    String cardtype = request.getParameter("cardtype");
      String cardno = request.getParameter("cardno");
      		
     String searchField = "orderid";
     String update = "cardtype";
     String update1 = "cardno";
   
    	DB db = mongo.getDB("Cake");
			
	DBCollection store1 = db.getCollection("order");
    
  BasicDBObject doc1 = new BasicDBObject();
  BasicDBObject doc2 = new BasicDBObject();
  
        
			BasicDBObject searchQuery = new BasicDBObject().append(searchField, orderid);
                        DBCursor cursor = store1.find(searchQuery);
                       DBCursor cursor1 = store1.find(searchQuery);
                        while (cursor.hasNext()) {
					
					BasicDBObject obj = (BasicDBObject) cursor.next();	

doc1.append("$set",new BasicDBObject().append(update, cardtype));
doc2.append("$set",new BasicDBObject().append(update1, cardno));
}

WriteResult res = store1.update(searchQuery, doc1);
WriteResult res1 = store1.update(searchQuery, doc2);
if(res.getN() == 0 && res1.getN() == 0 )
{
BasicDBObject doc = new BasicDBObject("title", "store1").				
append("cardname", orderid).
        append("cardtype", cardtype).
        append("cardno", cardno);

store1.insert(doc);
}

while (cursor1.hasNext()) {
					
					BasicDBObject obj = (BasicDBObject) cursor1.next();

 %>
<h1>Product Updated in the Store!</h1>
<table border="1"><TR>    
        <TD colspan="3"><b><font size="5">Card Type</td> <td colspan="3"><b><font size="5"> <%=cardtype%></b></TD></tr>
                   <TR>    
        <TD colspan="3"><b><font size="5">Card Number</td> <td colspan="3"> <b><font size="5"><%=cardno%></b></TD></tr>
                  </table>
         </section>
            </div>
<%}%>
		
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
                <li><a href="#">Birthday Cakes</a></li>
                <li><a href="#">Christmas Cakes</a></li>
                <li><a href="#">Wedding Cakes</a></li>
			</ul>
            
            <ul>
            	<li><h4>Customer Service </h4></li>
                <li><a href="#">About your Order</a></li>
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