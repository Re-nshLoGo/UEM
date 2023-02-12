# UEM
## University Event Management
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Database name: tododb
 * H2 Database
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run User Management System 
 * Go to localhost:8080/
 * For Database - h2-console
 * Type endpoints in url
 
## Student model will have-
 * StudentId
 * first name
 * last name
 * age
 * department
 #### Student model End points -
 * Add Student -
   * api/uem/add-student
* Get all Student -
   * api/uem/get-all
* Get Student by id-
   * api/uem/get-by/id/{id}
* Update Student -
   * api/uem/update-st?id=id
* Delete Student -
   * api/uem/delete-st-by-id/{id}
## Event Model will have
 * eventId
 * eventName
 * locationOfEvent
 * date
 * startTime
 * endTime
 * imageurl
#### Event model End points -
 * Add Event -
   * uem/even/save-event
* Get all Events -
   * uem/even/get-all-event-info
* Get Event by id-
   * uem/even/getevent-by-id/{id} 
* Update Event -
   * uem/even/update-event/id/{id}
* Delete Event -
   * uem/even/delete/id/{id}
 
## Data flow will be like -
 * Controller
 * Service
 * Repository
 * Database
 
## Application properties for database configuration-
 * spring.datasource.url=jdbc:h2:mem:tododb
 * spring.datasource.driverClassName=org.h2.Driver
 * spring.datasource.username=sa
 * spring.datasource.password=
 * spring.jpa.database-platform=org.hibernate.dialect.H2Dialect


