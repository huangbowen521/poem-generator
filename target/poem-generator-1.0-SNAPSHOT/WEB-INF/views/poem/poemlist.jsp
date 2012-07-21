<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<table>
    <thead>
    <th>Index</th>
    <th>Content</th>
    </thead>
    <tbody>
    <c:forEach items="${poems}" var="poem">
        <tr>
            <td><c:out value="${poem.id}"/></td>
            <td><c:out value="${poem.qi}"/></td>
            <td><c:out value="${poem.cheng}"/></td>
            <td><c:out value="${poem.zhuan}"/></td>
            <td><c:out value="${poem.he}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>