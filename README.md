# SpringBoot AngularJS CRUD [![Build Status](https://travis-ci.org/VMAproject/SpringBoot_AngularJS_CRUD.svg?branch=master)](https://travis-ci.org/VMAproject/SpringBoot_AngularJS_CRUD)

- Spring Boot 1.5.1.RELEASE
- Spring 4.3.5.RELEASE [transitively]
- Spring data JPA 1.10.6.RELEASE [transitively]
- Hibernate 5.0.11.Final [transitively]
- MySQL 5.1.40 [transitively]
- H2 1.4.192
- Hikari CP 2.4.7 [transitively]
- AngularJS 1.5.8
- Lombok 1.16.10
- Maven 3.1
- JDK 1.8

#Front-end
Let’s add a view to our MVC app. We would be using Freemarker templates in our app. Spring Boot WebMvcAutoConfiguration adds FreeMarkerViewResolver with id ‘freeMarkerViewResolver’ if freemarker jar is in classpath, which is the case since we are using spring-boot-starter-freemarker. It looks for resources in a loader path (externalized to spring.freemarker.templateLoaderPath, default ‘classpath:/templates/’) by surrounding the view name with a prefix and suffix (externalized to spring.freemarker.prefix and spring.freemarker.suffix, with empty and ‘.ftl’ defaults respectively). It can be overridden by providing a bean of the same name.

#Run the application
Finally, Let’s run the application, firstly with ‘local’ profile [H2]. Next shot will be with ‘prod’ profile [MySQL].

#Via IDEA
Run it directly, in that case default profile will be used. In case you want a different profile to be used, create a Run configuration for you main class, specifying the profile. To do that from toolbar, select Run->Run Configurations->Arguments->VM Arguments. Add -Dspring.profiles.active=local or -Dspring.profiles.active=prod]
