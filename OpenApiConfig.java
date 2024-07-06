//package swaggercustomisation;
//
//import org.apache.catalina.Server;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import io.swagger.v3.oas.annotations.info.Contact;
//import io.swagger.v3.oas.annotations.info.Info;
//import io.swagger.v3.oas.models.OpenAPI;
//import jakarta.validation.constraints.Email.List;
//
//@Configuration
//public class OpenApiConfig {
//	@Bean
//	OpenAPI defineOpenApi() {
//		Server server = new Server();
//		server.setUrl("http://localhost:8087");
//		server.setDescription("demopurpose");
//
//		Contact contact = new Contact();
//		contact.setName("AnushaReddy");
//		contact.setEmail("anusha.com");
//
//		Info information = new Info()
//				.title("Event management api")
//				.version("1.0")
//				.description("expose endpoints to manage event")
//				.contact(contact);
//
//		return new OpenAPI().info(information).servers(List.of(server));
//}
//}