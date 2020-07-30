# project Note
## Environemnet Build
* java : jdk_1.8_U221
* IDE : eclipse
* project : maven project
* framework : SSM(SpringMVC+Springframework+Mybatis)
* dependencies : detail in pom.xml
```
<dependencies>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>4.3.14.RELEASE</version>
</dependency>

<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>

<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.4.1</version>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.39</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>4.3.14.RELEASE</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-test</artifactId>
    <version>4.3.14.RELEASE</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.16.20</version>
    <scope>provided</scope>
</dependency>

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>

<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis-spring</artifactId>
    <version>1.3.1</version>
</dependency>

<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid</artifactId>
    <version>1.0.18</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>4.3.14.RELEASE</version>
</dependency>

</dependencies>
```
* Database : Mysql 5.0.75
## Maven
* maven is a java project package manage tool,using it can build Environment quikly and exactly.
* insallment
```
download the bin zip from authority website
if you are in Linux OS ,you'd better download the tar.gz one
```
* configure
```
unzip your zip file ,then create a system variable whose value is the catalog of the unzip one's bin catalog
type "mvn -version" in cmd or Powershell to ensure if it is installed
```
* Maven Project Configure
* * pom.xml
```
    write label <project> on the first line,configure condition and constraint,usually include xsi and xsi:schemaLocation
    pronounce the version of maven
```
* * then configure other configuration file the project needs
## SSM frameworke
* component：SpringMVC + Spring + Mybatis
* project deliver：
* * Controller
* * Service
* * Dao
```
    Controller as a substitute of servlet,controle the interactive in web and the whole back-end running.
    Service as a middelware to decoupl, controle Dao to complete the relative data operations.
    Dao as the data level to keep the data,finish to operate data and database
```