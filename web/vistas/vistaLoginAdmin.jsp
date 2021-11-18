<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- BootStrap CSS-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Font Awesome-->
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <!-- Styles -->
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <!-- Navbar begins-->

            <div class="header-background">
                <div id="nav" class="sticky-nav">

                    <nav class="navbar navbar-expand-lg">
                        <div class="container-fluid">
                            <a class="navbar-brand" href="index.html">AquaLabs</a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                                <span></span>
                                <span></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-auto">
                                    <li class="nav-item">
                                        <a class="nav-link" aria-current="page" href="index.html">Inicio</a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button"
                                            data-bs-toggle="dropdown" aria-expanded="false">
                                            Productos
                                        </a>
                                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                            <li><a class="dropdown-item " href="gabinetes.html">Gabinetes</a></li>
                                            <li><a class="dropdown-item" href="componentes.html">Componentes</a></li>
                                            <li><a class="dropdown-item " href="herramientas.html">Herramientas</a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-item">
                                        <a class="nav-link" href="contactanos.html">Contáctanos</a>
                                    </li>
                                </ul>
                                <a href="agregarProducto.jsp">Agregar producto</a>
                            </div>
                        </div>
                    </nav>
                </div>

  <!-- Navbar ends-->  
                <div class="container mt-5">
                   <div class="row">

                       <div class=" ">

                           <h2 class="fw-bold text-center pt-5 mb-5" style="color: red">${ resp }</h2>

                           
                       </div>    

                   </div>
               </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
   
    </body>
</html>
