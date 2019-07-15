<%@ page import="java.util.ArrayList" %>
<%@ page import="clases.CanalRadio" %>
<%
    ArrayList<CanalRadio> lista = (ArrayList<CanalRadio>) request.getAttribute("lista");
%>
<html>
<head>
    <title>Respuesta</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
    <h1>Respuesta</h1>

    <table class="table table-striped my-5">
        <thead>
        <th>Nombre</th>
        <th>Tipo</th>
        </thead>
        <tbody>
        <%
            for(CanalRadio c: lista){
        %>
        <tr>
            <td><label><%=c.getNombre()%></label></td>
            <td><label><%=c.getTipo()%></label></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>

</div>

</body>
</html>
