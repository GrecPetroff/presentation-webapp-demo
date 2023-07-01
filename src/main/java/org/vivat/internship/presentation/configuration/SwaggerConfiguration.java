package org.vivat.internship.presentation.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Swagger config.
 * To check it locally - run the application and go to {@see <a href="http://localhost:8088/swagger-ui.html">Swagger UI</a>
 */
@Configuration
public class SwaggerConfiguration {

  @Bean
  public OpenAPI presentationsOpenAPI () {

    return new OpenAPI()
        .info(new Info()
                  .title("Presentation Webapp API")
                  .version("1.0.0")
                  .description("Documentation Presentation Webapp API v1.0"));
  }
}
