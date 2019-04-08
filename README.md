# planb2

---
## Description
* Follow a professional meeting with Gerald Reynier, we define what he needs to handle his customers
* I want to create a web application from scratch, to allow Gerald to record his customers and use relational table to obtain efficient data.
* I suggest a QRCode API to gain time to search a customer folder // I am searching for a qrcode api
* this application is going to keep customers project during their treatment.
---
## Main fonctionnalities
* to handle users
* to record customer and project in database
* to record numbers of services
* 3 tables and 3 relational tables
* establish quotations and bills
---
## technologies
* Eclipse (IDE) with java language (back)
* framework : SPRING BOOT, Hibernate (implementation of JPA specifications)
* I added Glassfish : because to register hibernate in the pom.xml I obtained error message explaining that Glassfish is required  * I decided to use TOMCAT as application server (it is included with the installation of SPRING BOOT and DEVTOOLS)
* maven which is included in SPRING BOOT : as a package manager (as nmp for javascript or yarn, or gradle for android for instance)
* git and github to handle versions and commits 
* Visual Code (IDE) with Angular 1.3  (front)//(i tried to work with the last version, but it contains the pay codemix option)
* I am trying to use Workbench MySQL to handle databases

### Complementary technologies (that are not yet included at the 2019-03-30)
* ANGULAR : I want to manage front with this technologie.
* CORDOVA : library to manage the responsive aspect (i cannot use this technologie, because i am not going to have enough time to handle responsive question)
* webpack : to handle compilation with the front part (this is a part of this util tool)

### Content
* Forms to enter : users, customers, projects, quotations, bills
* databases and tables
---
##Bug
* The April 8th 2019 : I encontered a problem : yesterday, I used PIVOTAL to deploy my application, it works. But there is something strange : i lost my classes : Person, User, Contact, and the pom.xml
my application continue to work in PIVOTAL, so i think that i pushed it with this classes directly on pivotal platform. I am trying to retrieve my classes in Github, but annotations aren't recognized anymore, and my pom.xml isn't present in the application anymore. So I decided to make a new application ... :o( and to keep this one in that state.

---
## Contributors
* Laurence REYNIER
---

## Copyright
* Copyright © Laurence REYNIER 2019 
---
