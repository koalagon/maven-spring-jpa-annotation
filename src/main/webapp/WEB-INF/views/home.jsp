<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/css/style.css" />" >
</head>
<body>
<h1>Welcome to Spittr</h1>
<p>Path: <c:out value="${pageContext.servletContext.contextPath}" /></p>
<p>other: <%=request.getContextPath()%></p>
<a href="<c:url value="/spittles" />">Spittles</a> |
<a href="<c:url value="/spitter/register" />">Register</a>
<p>Hello</p>
<ul>
<c:forEach items="${categories}" var="category" >
    <li id="spittle_<c:out value="category.id"/>">
        <div class="spittleMessage">
            <c:out value="${category.name}" />
        </div>
    </li>
</c:forEach>
</ul>
World
</body>
</html>