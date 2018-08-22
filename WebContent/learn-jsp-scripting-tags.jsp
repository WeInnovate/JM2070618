<!-- Scriptlet Tag  -->
<%
	String prefix = "Mr.";
	out.print(2 + 3); 
	out.print(sum(10, 20 + defaultValue));
%>

<!-- Expression tag -->
<%=50 + 50%>
<%="Prateek" + " Kumar"%>
<%=prefix + " Prateek" + " Kumar"%>
<%=50 + defaultValue + sum(40, 50)%>

<!-- Declaration Tag  -->
<%!int defaultValue = 10;

	public int sum(int a, int b) {
		return a + b;
	}%>
