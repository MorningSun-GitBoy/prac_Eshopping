# project Note
## 环境搭建（Environemnet Build）
* java : jdk_1.8_U221
* IDE : eclipse
* project : maven project
* framework : SSM(SpringMVC+Springframework+Mybatis)
* dependencies : 详见pom.xml
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
* maven是一个Java的包管理工具，可以通过它快速、准确的搭建项目开发环境
* maven的安装
```
从官网下载bin的.zip文件，然后在本地解压。
如果是Linux，应下载.tar.gz文件
```
* 配置
```
创建系统变量，变量值为解压后的bin目录
在cmd或Powershell中输入“mvn -version”即可确定是否安装成功
```
* Maven项目的配置
* * pom.xml