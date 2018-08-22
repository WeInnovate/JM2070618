<!-- Scriptlet Tag  -->
<%
	String prefix = "Mr.";
	out.print(2 + 3);
%><br />
<%
	out.print(sum(10, 20 + defaultValue));
%><br />

<!-- Expression tag -->
<%=50 + 50%><br />
<%="Prateek" + " Kumar"%><br />
<h1><%=prefix + " Prateek" + " Kumar"%></h1><br />
<%=50 + defaultValue + sum(40, 50)%><br />

<!-- Declaration Tag  -->
<%!int defaultValue = 10;

	public int sum(int a, int b) {
		return a + b;
	}%>
