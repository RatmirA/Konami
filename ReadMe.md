# Getting Started

* This simple web application was created with Spring Boot and Maven. 
* The main function is provide response in xml format:
(Request) 
http://127.0.0.1:5000/?<Request command="Print"><ticketid>12345</ticketid></Request>

(Response) 
<Response status=”Successful”>
<ticketid>1234567890</ticketid>
<datetime>13-Oct-2011 21:56:03</Datetime> </Response>

* 2 classes Request and Response provide information in XML.
* This application also is a multithreaded, Tomcat controls that logic and provide multi requests for multi users.
* You also can change server and port in application.properties.
* As a Spring application you can add a different separate modules, scale and migrate.