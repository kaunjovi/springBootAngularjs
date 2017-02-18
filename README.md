# [Spring Boot and AngularJS](https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-and-angularjs-integration-tutorial/)


  - Add maven. Create pom.xml. 
  - @Configuration tags the class as a source of bean definitions. 
  - @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans and various property settings.
  - @ComponentScan tells Spring to look for other components, configurations and services.
  - By default Spring Boot will serve static content from a directory called /static /public or /resources or /META-INF/resources) in the classpath or from the root of the ServletContext. 

```
mvn clean install

mvn spring-boot:run

```
