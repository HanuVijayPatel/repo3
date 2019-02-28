-------------
How to Run 
-------------

1. Download Project From GitHub - 
GitHub - https://github.com/HanuVijayPatel/repo3.git ->  atos-vijay-customer

2. Import project in IDE as Maven Project 


3. Command Line Run
Executable JAR @  atos-vijay-customer\target\atos-vijay-customer-0.0.1-SNAPSHOT.jar

java -jar atos-vijay-customer-0.0.1-SNAPSHOT.jar

4. From IDE
- Maven Buil the project.
- Run As Java Application  - com.atos.customer.AtosVijayCustomerApplication

-----------------------------------------------
End Point URL for Spring Boot Web Application
-----------------------------------------------

---- For List

Method : GET 
http://localhost:8085/customers

---  For Creating New Customer

Method : POST
http://localhost:8085/customers

JSON Object -   {"id":105,"firstName":"Poonam","lastName":"Arora"}


---- For Delete

Method : DELETE
http://localhost:8085/customers/105


