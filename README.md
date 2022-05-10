# Test task "K-PAC in K-PAC sets"

## Subject description:
In the process of developing a control system you’ve received a task to display the main entities
of the system and their relationship.
## Entities description:
**K-PAC (Knowledge Package)** - an entity that stores the contents of any knowledge. It contains the next fields:

* ID - unique numeric field, the occurrence of K-PAC.
* Title - character string (up to 250 characters)
* Description - character string (up to 2000 characters), information about the contents of
* K-PAC. 
* Creation date - a string in the format DD-MM-YYYY, the date when K-PAC was created.

**K-PAC Set** is an entity that can contain multiple K-PAC entities. It contains the next fields:

* ID - unique numeric field, the occurrence of the K-PAC Set.
* Title - a character string (up to 250 characters).

**Entities relations:** Every K-PAC set can contain multiple K-PACs, every K-PAC can be included
in several K-PAC sets.

## Task:
Create a WEB application that allows you to perform operations (Create), read (Read) and
retrieve (Delete) with these entities.

**Functional requirements:**

_Need to develop 3 pages to work with K-PAC and K-PAC Set entities:

**URL /kpacs** - page where list of all K-PACs is displayed using DHTMLX7 grid structure. Grid columns:
* ID
* Title
* Description
* Creation Date
* Delete

_Need to provide abilities:_

* to add K-PAC using html form.
* to delete K-PAC using Delete icon in the grid
* to do filtering and sorting depending on the data types in the grid

` Note: all grid fields should be non-editable.`

**URL /sets** - page where list of all K-PAC Sets is displayed using DHTMLX7 grid structure. Grid columns:

* ID
* Title
* Delete

_Need to provide abilities:_
* to add K-PAC Set and provide an ability to select K-PACs using html form.
* to delete K-PAC Set using Delete icon in the grid
* to do filtering and sorting depending on the data types in the grid
* on row double click open a new window with attached K-PACs to the selected K-PAC set (URL /set/{id})

   `Note: all grid fields should be non-editable.`

**URL /set/{id}** - page where list of K-PACs attached to Set is displayed using DHTMLX7 grid structure. K-PAC Set Id should be provided through path variable.
Grid columns: K-PAC Id, title, description.

# Non functional requirements:
   Using Java Code Conventions
   (https://www.oracle.com/technetwork/java/codeconventions-150003.pdf) is required.

   **Technologies:**
   Java 8+
* Spring (JDBC, MVC). Don’t use Spring Boot, Spring JPA
* Maven (https://maven.apache.org/)
* Database - MySQL 5.7+ (https://www.mysql.com/)
* Server - Apache Tomcat (http://tomcat.apache.org/)
* IDE - Eclipse / IntelliJ IDEA
* JSP
* DHTMLX 7, component - DHTMLX grid (https://dhtmlx.com/docs/products/dhtmlxGrid/download.shtml)

As a result you should get the next files:
* schema.sql - SQL script to create DB schema.
* data.sql - SQL script to fill DB with test data.
* app.zip - application source code or link to GitHub.
* app.war - WAR-file to start application on the server.
