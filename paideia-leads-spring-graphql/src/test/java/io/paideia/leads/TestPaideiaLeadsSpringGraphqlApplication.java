package io.paideia.leads;

import org.springframework.boot.SpringApplication;

public class TestPaideiaLeadsSpringGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(PaideiaLeadsSpringGraphqlApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
