/*
package eduardo.apiweb.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
                "Eduardo",
                "http://localhost:8080/",
                "eduardocv.souza@gmail.com");
    }

    private ApiInfo infoApi() {
        ApiInfoBuilder apiInfo = new ApiInfoBuilder();

        apiInfo.title("API_RestFull");
        apiInfo.description("Criando uma API_RestFull");
        apiInfo.version("Versão: 1.0");
        apiInfo.termsOfServiceUrl("Lecença: Open soucer");
        apiInfo.contact(this.contato());
        return apiInfo.build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.infoApi())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));
    }
}

*/
