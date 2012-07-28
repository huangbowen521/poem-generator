<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<table>
    <thead>
    <th>Index</th>
    <th>Content</th>
    </thead>
    <tbody>
 
    </tbody>
</table>

<form method="get" action="<c:url value="/generating" />">
    <div>
        <button type="submit" id="poem" name="_eventId_generate">Generate Poem</button>
    </div>
</form>

<form method="get" action="<c:url value="/poem/poemlist" />">
    <div>
        <button type="submit" id="sentence" >poemlist</button>
    </div>
</form>