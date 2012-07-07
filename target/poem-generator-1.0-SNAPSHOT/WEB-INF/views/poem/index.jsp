<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<table>
    <thead>
    <th>Index</th>
    <th>Content</th>
    </thead>
    <tbody>
    <c:forEach items="${poem}" var="sentence">
        <tr>
            <td><c:out value="${poem.id}"/></td>
            <td><c:out value="${poem.content}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<form method="get" action="<c:url value="/generating" />">
    <div>
        <button type="submit" id="poem" name="_eventId_generate">Generate Poem</button>
    </div>
</form>

<form method="get" action="<c:url value="/famous-sentence" />">
    <div>
        <button type="submit" id="sentence" name="_eventId_sentence">Add famous sentence</button>
    </div>
</form>