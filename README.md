# SpringBoot

An sample application in spring boot for beginners.

Steps to Run:

Install Maven dependencies
 -> Mvn clean install package.

To Start the application click on Run button in Springboot Application start (/RestApplication/src/main/java/com/springboot/RestApplication/RestApplication.java)

Please find the attached Postman collection to test the application.

### Application Details

This application will the help beginners to start. 

It was developed using RestApi (Get, Post, Put, Delete). 

Model contains the details of Id, Name, Age.

Data are store using the Array List.

Get Call : It will return array of person details.

Get Call By ID : Have to pass the ID as param while making request and return object of person details.

Post Call : It accept the valid payload and returns the id.
  ####### payload
{
	"name": "Alex",
	"age":23
}
 Put Call : Have to pass the ID as param while making request and return the number
 ###### result
 0 - Failed while updated
 
 1 - Successfully updated


 Delete Call : Have to pass the ID as param while making request and return the number.
 ###### result
 0 - Failed while Deleted
 
 1 - Successfully Deleted