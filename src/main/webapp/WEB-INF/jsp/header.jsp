<html>
<head>
<script type="text/javascript">
function noBack()
 {
     window.history.forward()
 }
noBack();
window.onload = noBack;
window.onpageshow = function(evt) { if (evt.persisted) noBack() }
window.onunload = function() { void (0) }
</script>
<link rel="stylesheet" type="text/css" href="css/pms.css" />
</head>
<body id="navigation">
 <h1 align="center">Product Management System</h1>
 <div id="maindiv">
 
  <ul>
        <li><a href="home.htm">Home</a></li>
       <li> <a href="admin.htm">Admin</a></li>
                <li><a href="searchcustomer.htm">Customer</a>
                
                </li> 
                <li><a href="viewProduct.htm">Stack</a></li> 
     
        <li><a href="addProduct.htm">Add Product</a></li>
        <li><a href="billing.htm">Billing</a></li>
        <li><a href="aboutUs.htm">About As</a></li>
        
        <li>  welcome to:<%=session.getAttribute("user")%></li>
    <li> <a href="reporting.htm">ProductReport</a></li>
    <li> <a href="logout.htm" onclick="noBack()">Logout</a></li>
   </ul>   
   
   
  </div>
 
 <div id="logout">

 </div>


</body>
</html>
