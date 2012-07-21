<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<p>Well done! You create a chinese ancient poem.</p>
<p><c:out value="${poem.qi}" /></p>
<p><c:out value="${poem.cheng}" /></p>
<p><c:out value="${poem.zhuan}" /></p>
<p><c:out value="${poem.he}" /></p>
<form:form id="successful" modelAttribute="poem" action="${flowExecutionUrl}">
<p><button class="button positive" type="submit" id="next" name="_eventId_next">Index</button></p>
</form:form>