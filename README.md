# nearshore
Spring-boot WebServer

This is a Service, that connects with a mySql Server, inserts data with in a relational Model Database.

1.- mvn clean install
2.- mvn spring-boot:run

an example of JSON can be:

curl -H "Content-Type: application/json" -X POST -d '{"soeid": "MASTER", "activo": "9","apellidoMaterno":"infante","apellidoPaterno":"vargas","clave":"pinfvar4","email": "pedroinf@gmail.com","primerNombre":"pedro","segundoNombre":"josue","catProveedor":{"descripcion":"televisa"},"catPerfil":{"descripcion": "artista"},"catPlataforma":{"descripcion": "televisiva","comentarios":"ninguno"},"catPais":{"descripcion":"Mexico"}}' http://localhost:28080/usuarios

check results in

http://localhost:28080/usuarios

jose Luis Narvaez
