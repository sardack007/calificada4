<html>
<head>
    <title>Inicio</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
</head>
<body>
<h2 class="text-center">Busqueda de Canales de Radio por Tipo</h2>

<div class="container">
    <form action="controlador" method="post">
        <div class="form-group">
            <label class="tipo">Elija el tipo de radio</label>
            <select id="tipo" name="tipo" class="form-control">
                <option value="Ingles">Ingl&eacute;s</option>
                <option value="Espanol">Espa&ntilde;ol</option>
                <option value="Frances">Franc&eacute;s</option>
                <option value="Italiano">Italiano</option>

            </select>
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</div>
</body>
</html>
