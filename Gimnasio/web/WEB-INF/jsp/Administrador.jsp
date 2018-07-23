<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"  ng-app="myApp">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Administrador</title>
  <script src="https://d3js.org/d3.v4.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
  <!-- Bootstrap core CSS-->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  <style>
#caja {
  width: 70%;
  height: 150px;
  border: 5px dashed gray;
  border-radius: 8px;
  background: rgb(230,230,230);
  background-repeat: no-repeat;
  background-size: 100%;
}
</style>
  
  

</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top" ng-controller="tables">
    <!-- Navigation-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="index.html">Nombre</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        <li ng-click="mostrarGatos()"  class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
          <a class="nav-link">
              <i  class="fa fa-fw fa-dashboard"></i>
            <span class="nav-link-text">Gatos</span>
          </a>
        </li>
        <li ng-click="mostrarOrdenes()" class="nav-item" data-toggle="tooltip" data-placement="right" title="Charts">
          <a class="nav-link">
            <i class="fa fa-fw fa-dollar"></i>
            <span class="nav-link-text">Ordenes</span>
          </a>
        </li>
        <li ng-click="mostrarPersonas()" class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables">
          <a class="nav-link">
            <i class="fa fa-fw fa-user"></i>
            <span class="nav-link-text">Usuarios</span>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          <a class="nav-link text-center" id="sidenavToggler">
            <i class="fa fa-fw fa-angle-left"></i>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle mr-lg-2" id="messagesDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-fw fa-envelope"></i>
            <span class="d-lg-none">Messages
              <span class="badge badge-pill badge-primary">12 New</span>
            </span>
            <span class="indicator text-primary d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
          </a>
          <div class="dropdown-menu" aria-labelledby="messagesDropdown">
            <h6 class="dropdown-header">New Messages:</h6>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <strong>David Miller</strong>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">Hey there! This new version of SB Admin is pretty awesome! These messages clip off when they reach the end of the box so they don't overflow over to the sides!</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <strong>Jane Smith</strong>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">I was wondering if you could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <strong>John Doe</strong>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">I've sent the final files over to you for review. When you're able to sign off of them let me know and we can discuss distribution.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item small" href="#">View all messages</a>
          </div>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-fw fa-bell"></i>
            <span class="d-lg-none">Alerts
              <span class="badge badge-pill badge-warning">6 New</span>
            </span>
            <span class="indicator text-warning d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
          </a>
          <div class="dropdown-menu" aria-labelledby="alertsDropdown">
            <h6 class="dropdown-header">New Alerts:</h6>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-danger">
                <strong>
                  <i class="fa fa-long-arrow-down fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item small" href="#">View all alerts</a>
          </div>
        </li>
        <li class="nav-item">
          <form class="form-inline my-2 my-lg-0 mr-lg-2">
            <div class="input-group">
              <input class="form-control" type="text" placeholder="Search for...">
              <span class="input-group-btn">
                <button class="btn btn-primary" type="button">
                  <i class="fa fa-search"></i>
                </button>
              </span>
            </div>
          </form>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
            <i class="fa fa-fw fa-sign-out"></i>Salir</a>
        </li>
      </ul>
    </div>
  </nav>
<div class="content-wrapper">
    <div class="container-fluid">
     
      <!-- Example DataTables Card-->
      <div class="card mb-3" ng-hide="personasHide">
        <div class="card-header w3-center">
          <i class="fa fa-user"></i> Lista de Usuarios</div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                  <th>ID</th>
                  <th>Usuario</th>
                  <th>Correo</th>
                  <th>Nacimiento</th>
                  <th>Tipo</th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <th>ID</th>
                  <th>Usuario</th>
                  <th>Correo</th>
                  <th>Nacimiento</th>
                  <th>Tipo</th>
                </tr>
              </tfoot>
              <tbody>
                  <tr ng-repeat="p in persons">
			<td>{{p.idPersona}}</td>
			<td>{{p.usuario}}</td>
			<td>{{p.correo}}</td>
                  	<td>{{p.nacimiento}}</td>
                  	<td>{{p.tipo}}</td>
		</tr>
                
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
      <!-- Example DataTables Card-->
      <div class="card mb-3" ng-hide="ordenesHide">
        <div class="card-header w3-center">
          <i class="fa fa-user"></i> Lista de Ordenes</div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataOrden" width="100%" cellspacing="0">
              <thead>
                  <th>ID</th>
                  <th>Usuario</th>
                  <th>Fecha</th>
                  <th>Proucto</th>
                  <th>Cantidad</th>
                  <th>Total</th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <<th>ID</th>
                  <th>Usuario</th>
                  <th>Fecha</th>
                  <th>Proucto</th>
                  <th>Cantidad</th>
                  <th>Total</th>
                </tr>
              </tfoot>
              <tbody>
                  <tr ng-repeat="o in ordenes">
			<td>{{o.idOrden}}</td>
			<td>{{o.idPersona.usuario}}</td>
			<td>{{o.fecha}}</td>
                  	<td>{{o.producto}}</td>
                  	<td>{{o.cantidad}}</td>
                        <td>{{o.total}}</td>
		</tr>
                
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
      <!-- Example DataTables Card-->
      <div class="card mb-3" ng-hide="gatosHide">
        <div class="card-header w3-center">
          <i class="fa fa-github-alt"></i> Lista de Gatos</div>
        <div class="card-body">
            <div class="col-md-12 w3-padding-16 w3-right">
                <button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModalGato"><i class="fa fa-github-alt"></i> Agregar</button>
            </div>
          <div class="table-responsive">
            <table class="table table-bordered" id="dataGatos" width="100%" cellspacing="0">
                
                <thead>
                  <th>ID</th>
                  <th>Foto</th>
                  <th>Raza</th>
                  <th>Nacimiento</th>
                  <th>Genero</th>
                  <th>Precio</th>
                  <th>Pedigree</th>
                  <th>Esterilizado</th>
                  <th>Stock</th>
                  <th></th>
                  <th></th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <th>ID</th>
                  <th>Foto</th>
                  <th>Raza</th>
                  <th>Nacimiento</th>
                  <th>Genero</th>
                  <th>Precio</th>
                  <th>Pedigree</th>
                  <th>Esterilizado</th>
                  <th>Stock</th>
                  <th></th>
                  <th></th>
                </tr>
              </tfoot>
              <tbody>
                  <tr ng-repeat="g in gatos">
			<td>{{g.idGato}}</td>
			<td></td>
			<td>{{g.raza}}</td>
                  	<td>{{g.nacimiento}}</td>
                  	<td>{{g.genero}}</td>
                        <td>{{g.precio}}</td>
                        <td>{{g.pedigree}}</td>
                        <td>{{g.esterilizado}}</td>
                        <td>{{g.stock}}</td>
                        <td><button ng-click="editarGato(g.idGato)" class="btn btn-warning" type="button" data-toggle="modal" data-target="#myModalEditar"><i class="fa fa-pencil"></i></button></td>
                        <td><button ng-click="deleteGato(g.idGato)" class="btn btn-danger" type="button""><i class="fa  fa-trash"></i></button></td>
		</tr>
                
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>    
         
         
         
          
        
    
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © Cats Shop</small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Cerrar Sesion Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-md" role="document">
        <div class="modal-content">
          <div class="modal-header w3-green">
            
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body w3-center">
              <h5>¿Desea cerrar sesion?</h5>
      
          </div>
          <div class="modal-footer">
              <button class="btn btn-primary" type="button" data-dismiss="modal">Salir</button>
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cerrar</button>
          </div>
        </div>
      </div>
    </div>
    
    <!--Editar Gato Modal -->
  <div class="modal fade" id="myModalEditar" role="dialog">
    <div class="modal-dialog modal-md">
      <div class="modal-content">
        <div class="modal-header w3-green">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
        </div>
        <div class="modal-body">
          
            <div class="container">
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="input-group">
                            <label >Raza:</label><br>
                            <span class="input-group-addon"><i class="fa fa-github-alt"></i></span>
                            <input  type="text" class="form-control" placeholder="Raza" ng-model="razaE">
                        </div>
                    </div>
                    <div class="col-md-6 w3-padding-16">
                        <div class="input-group">
                            <label >Precio:</label><br>
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                            <input  type="number" class="form-control" placeholder="Precio" ng-model="precioE">
                        </div>
                    </div>
                </div>
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >Genero:</label>
                            <select class="form-control" ng-model="generoE">
                                <option value="{{opc5}}">{{opc5}}</option>
                              <option value="{{opc6}}">{{opc6}}</option>
                            </select>
                          </div>
                    </div>
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >Pedigree</label>
                            <select class="form-control" ng-model="pedigreeE">
                              <option value="{{opc}}">{{opc}}</option>
                              <option value="{{opc2}}">{{opc2}}</option>
                            </select>
                          </div>
                    </div>
                </div>
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >Nacimiento:</label>
                    <div class='input-group date' id='datetimepicker1'>
                        <input type="date" class="form-control" ng-model="nacimientoE"/>
                        <span class="input-group-addon">
                            <span class="fa fa-calendar"></span>
                        </span>
                    </div>
            </div>
                    </div>
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >Esterelizado</label>
                            <select class="form-control" ng-model="esterilizadoE">
                              <option value="{{opc3}}">{{opc3}}</option>
                              <option value="{{opc4}}">{{opc4}}</option>
                            </select>
                          </div>
                    </div>
                </div>
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="input-group">
                            <label >Stock:</label><br>
                            <span class="input-group-addon"><i class=""> #</i></span>
                            <input  type="number" class="form-control" placeholder="Stock" ng-model="stockE">
                        </div>
                    </div>
                    <div class="col-md-6 w3-padding-16 w3-center">
                        <div id="caja">
                    </div>
                </div>
            </div>
            
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-primary" ng-click="enviarEditar()">Editar</button>
            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
        </div>
      </div>
    </div>
  </div>
      <!--Agregar Gato Modal -->
  <div class="modal fade" id="myModalGato" role="dialog">
    <div class="modal-dialog modal-md">
      <div class="modal-content">
        <div class="modal-header w3-green">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          
        </div>
        <div class="modal-body">
          
            <div class="container">
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-github-alt"></i></span>
                            <input  type="text" class="form-control" placeholder="Raza" ng-model="razaA">
                        </div>
                    </div>
                    <div class="col-md-6 w3-padding-16">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                            <input  type="number" class="form-control" placeholder="Precio" ng-model="precioA">
                        </div>
                    </div>
                </div>
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >Genero:</label>
                            <select class="form-control" ng-model="generoA">
                              <option>Macho</option>
                              <option>Hembra</option>
                            </select>
                          </div>
                    </div>
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >¿Tiene Pedigree?</label>
                            <select class="form-control" ng-model="pedigreeA">
                              <option>Si</option>
                              <option>No</option>
                            </select>
                          </div>
                    </div>
                </div>
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >Nacimiento:</label>
                    <div class='input-group date' id='datetimepicker1'>
                        <input type="date" class="form-control" ng-model="nacimientoA"/>
                        <span class="input-group-addon">
                            <span class="fa fa-calendar"></span>
                        </span>
                    </div>
            </div>
                    </div>
                    <div class="col-md-6 w3-padding-16">
                        <div class="form-group">
                            <label >¿Esta Esterelizado?</label>
                            <select class="form-control" ng-model="esterilizadoA">
                              <option>Si</option>
                              <option>No</option>
                            </select>
                          </div>
                    </div>
                </div>
                <div class = "row">
                    <div class="col-md-6 w3-padding-16">
                        <div class="input-group">
                            <span class="input-group-addon"><i class=""> #</i></span>
                            <input  type="number" class="form-control" placeholder="Stock" ng-model="stockA">
                        </div>
                    </div>
                    <div class="col-md-6 w3-padding-16 w3-center">
                        <div id="caja">
                    </div>
                </div>
            </div>
            
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-primary" data-dismiss="modal">Agregar</button>
            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="vendor/chart.js/Chart.min.js"></script>
    <script src="vendor/datatables/jquery.dataTables.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages
    <script src="js/sb-admin.min.js"></script>
    <script src="js/sb-admin-datatables.min.js"></script>-->
    <script src="js/sb-admin-charts.min.js"></script>
  
</body>

</html>
<script>
    window.addEventListener('load', inicio, false);

    function inicio() {
        document.getElementById('caja').addEventListener('dragover', permitirDrop, false);    
        document.getElementById('caja').addEventListener('drop', drop, false);
    }
    
    function drop(ev)
    {
        ev.preventDefault();
        var arch=new FileReader();
        arch.addEventListener('load',leer,false);
        arch.readAsDataURL(ev.dataTransfer.files[0]);        
    }      
    
    function permitirDrop(ev)
    {
        ev.preventDefault();
    }    
    
    function leer(ev) {
        document.getElementById('caja').style.backgroundImage="url('" + ev.target.result + "')";
    }
</script>
<script>
	
	var app = angular.module('myApp',[]);
	
        
        
	app.controller('tables', function($scope, $http){
                $scope.gatos = [];
            
                getGatos();
                    $scope.personasHide = true;
                    $scope.ordenesHide = true;
                    $scope.gatosHide = false;
                
                $scope.mostrarPersonas = function(){
                    getPersonas();
                    $scope.personasHide = false;
                    $scope.ordenesHide = true;
                    $scope.gatosHide = true;
                };
                
                $scope.mostrarGatos = function(){
                    getGatos();
                    $scope.personasHide = true;
                    $scope.ordenesHide = true;
                    $scope.gatosHide = false;
                };
                
                $scope.mostrarOrdenes = function(){
                    getOrdenes();
                    $scope.personasHide = true;
                    $scope.ordenesHide = false;
                    $scope.gatosHide = true;
                };
                
                
                
                function getPersonas(){
                    $http.get("rest/personas.htm").then(function(response) {
                        $scope.persons = response.data.personas;
                        console.log($scope.persons);

                        $(document).ready(function() {
                          $('#dataTable').DataTable();
                        });
                    });
                }
                
                function getOrdenes(){
                    $http.get("rest/ordenes.htm").then(function(response) {
                        $scope.ordenes = response.data.ordenes;
                        console.log($scope.ordenes);
                        $(document).ready(function() {
                        $('#dataOrden').DataTable();
                        });
                    });
                }
                
                function getGatos(){
                    $http.get("rest/gatos.htm").then(function(response) {
                        
                        $scope.gatos = response.data.gatos;
                        console.log($scope.gatos);
                                                
                        //table.state.clear();                        
                        $(document).ready(function() {
                          $('#dataGatos').DataTable();
                        });
                    });
                }
                
                $scope.deleteGato = function(idG){
                    $http.get("rest/eliminarGato.htm",{
                            params :{
				id: idG
                            }
                        }
                    ).then(function(response) {
                        $scope.eliminado = response.data.eliminado;
                        console.log($scope.eliminado);
                        if($scope.eliminado == true)
                            getGatos();
                    });
                };
                
                $scope.editarGato = function(idG){
                    console.log(idG);
                    console.log($scope.gatos);
                    console.log($scope.gatos[idG-1].raza);
                    $scope.razaE = $scope.gatos[idG-1].raza;
                    $scope.precioE = $scope.gatos[idG-1].precio;
                    $scope.stockE = $scope.gatos[idG-1].stock;
                    $scope.opc = $scope.gatos[idG-1].pedigree;
                    if($scope.opc == "Si")
                        $scope.opc2 = "No";
                    if($scope.opc == "No")
                        $scope.opc2 = "Si";
                    
                    $scope.opc3 = $scope.gatos[idG-1].esterilizado;
                    if($scope.opc3 == "Si")
                        $scope.opc4 = "No";
                    if($scope.opc3 == "No")
                        $scope.opc4 = "Si";
                    
                    $scope.opc5 = $scope.gatos[idG-1].genero;
                    if($scope.opc5 == "Hembra")
                        $scope.opc6 = "Macho";
                    if($scope.opc5 == "Macho")
                        $scope.opc6 = "Hembra";
                };
		
                $scope.enviarEditar = function(){
                    
                    $http.get("rest/editar.htm",{
                        params: {
                            raza : $scope.razaE,
                            nacimiento: $scope.nacimientoE,
                            genero: $scope.generoE,
                            precio: $scope.precioE,
                            pedigree: $scope.pedigreeE,
                            esterilizado: $scope.esterilizadoE,
                            stock: $scope.stockE
                        }
                    }
                    ).then(function(response){
                        $scope.gatos = response.data.gatos;
                    
                        $(document).ready(function() {
                          $('#dataGatos').DataTable();
                        });
                    });
                };
                
                $scope.enviarAgregar = function(){
                    
                    $http.get("rest/editar.htm",{
                        params: {
                            raza : $scope.razaA,
                            nacimiento: $scope.nacimientoA,
                            genero: $scope.generoA,
                            precio: $scope.precioA,
                            pedigree: $scope.pedigreeA,
                            esterilizado: $scope.esterilizadoA,
                            stock: $scope.stockA
                        }
                    }
                    ).then(function(response){
                        $scope.gatos = response.data.gatos;
                    
                        $(document).ready(function() {
                          $('#dataGatos').DataTable();
                        });
                    });
                };
	});
	
	
</script>
