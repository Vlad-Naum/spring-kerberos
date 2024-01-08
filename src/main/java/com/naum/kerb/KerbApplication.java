package com.naum.kerb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Paths;

@SpringBootApplication
public class KerbApplication {

	public static void main(String[] args) {
		System.setProperty("java.security.krb5.conf",
				Paths.get("../krb5.conf")
						.normalize().toAbsolutePath().toString());
		System.setProperty("sun.security.krb5.debug", "true");
		System.setProperty("javax.security.auth.useSubjectCredsOnly", "true");
		System.setProperty("java.security.auth.login.config", "../jaas.conf");
		SpringApplication.run(KerbApplication.class, args);
	}

}
