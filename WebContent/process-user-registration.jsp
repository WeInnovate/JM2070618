<%-- <%@ page import="com.jm2070618.learn.model.*" %> --%>
<jsp:useBean id="user" class="com.jm2070618.learn.model.User" />
<jsp:setProperty property="*" name="user"/>
<jsp:setProperty property="userType" name="user" value="Admin" />
<jsp:getProperty property="userType" name="user"/><br />
<%= user %>