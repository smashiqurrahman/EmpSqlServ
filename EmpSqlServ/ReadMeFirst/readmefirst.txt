		SQL For Database:::
-------------------------------------------------------
Create table Ashiq_employee_table(
 id varchar(255),
 name varchar(255),
 age varchar(255),
 salary varchar(255),
 email varchar(255),
 address varchar(255),
 primary key(id)
 );

 select * from Ashiq_employee_table;
 insert into Ashiq_employee_table(id,name,age,salary,email,address) 
VALUES ('1000', 'Kim','25','500','khilan@gmail.com','Mumbai');
drop table Ashiq_employee_table

		Naztech Server::
--------------------------------------------------------
Server Name: vNTDACWSSQLD002
DB Port : 1433
DB Name : DEV_TEST
Login : dev_test_dbo
password : dev_test_dbo123

	IF DB change then::
--------------------------------------------------------
DbConnection class -> String connectionUrl will be change
Services class -> String connectionUrl will be change

		DataBase If SQL Server::
---------------------------------------------------------
then EmpSqlServ -> properties -> Add External JAR -> sqljdbc42.jar(In ReadMeFirst Folder)

		POM.xml
----------------------------------------------------------
jdbc driver for sql server dependency added
XML::
 <!-- https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc -->
<dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>mssql-jdbc</artifactId>
    <version>7.3.0.jre11-preview</version>
    <scope>test</scope>
</dependency>

