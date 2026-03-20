<%@ page import="java.util.*, com.scheme.model.Scheme" %>

<h2>Eligible Schemes</h2>

<%
List<Scheme> schemes = (List<Scheme>) request.getAttribute("schemes");

if (schemes == null || schemes.isEmpty()) {
%>
    <p>No schemes found.</p>
<%
} else {
    for (Scheme s : schemes) {
%>
    <p><b><%= s.name %></b></p>
    <a href="<%= s.link %>" target="_blank">Apply Here</a><br><br>
<%
    }
}
%>