# Demo REST service - Spring Boot for task №3
#internship 2023

### Задача №3 - "Presentation API"
На базе представленного spring boot проекта сделать REST-сервис с следующим функционалом:
* CRUD операции для Presentation
  * В случае удаления Presentations - удалить все связанные с ней Slide
* СRUD операции для Slide
* POST import/presentation/slides - импорт слайдов из XLSX файла
  * Пример: в папке `samples` файла `slide-import-data.xlsx`
  * Каждый раз при импорте создаётся новая презентация
  * Если слайд уже существует с таким именем - выдавать ошибку и останавливать работу сервиса


# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.2-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.2-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.2-SNAPSHOT/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.2-SNAPSHOT/reference/htmlsingle/#web)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/3.1.2-SNAPSHOT/reference/htmlsingle/#howto.batch)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.1.2-SNAPSHOT/reference/htmlsingle/#howto.data-initialization.migration-tool.flyway)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Flyway Migration](https://flywaydb.org/documentation/usage/plugins/springboot)
* [Springdoc OpenAPI](https://springdoc.org/)
* [Model Mapper Info](https://modelmapper.org/user-manual/)
* [Spring Configuration Properties](https://www.baeldung.com/configuration-properties-in-spring-boot)

