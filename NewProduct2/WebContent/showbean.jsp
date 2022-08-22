<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Detail</h2>
<jsp:useBean id="productBean" class="productdetail.ProductBean2" scope="session"></jsp:useBean>
       
       <h4> Product Id:<jsp:getProperty name="productBean" property="productId" /> </h4> 
       <h4> Product Name: <jsp:getProperty name="productBean" property="productName" /></h4>
        <h4>Product Price:<jsp:getProperty name="productBean" property="price" /> </h4>
       
</body>
</html>