<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process EL registration data</title>
</head>
<body>
${param.name}<br />
${param.email}<br />
${param.mobile}<br />
${param.gender}<br />
${paramValues.courses[0]} ${paramValues.courses[1]} ${paramValues.courses[2]}<br />
${param.country}<br />

<hr />
${header.host}<br />
${header.referer}<br />
${headrValues.accept-language[0]}<br />
${headrValues.accept-language[1]}<br />

<hr />
${initParam.institute}<br />


<hr />
${pageContext.session.id}<br />
<%-- ${pageContext.session.length}<br />
${pageContext.request.removeAddr}<br /> --%>
${pageContext.request.method}<br />
${pageContext.request.requestURL}<br />
${pageContext.request.contentType}<br />

<hr />
${applicationScope.abc }
</body>
</html>