package in.sysbytes;

import in.sysbytes.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class CustomStarterAppApplication implements CommandLineRunner {

        @Autowired
        HelloService service;

        public static void main(String[] args) {

            SpringApplication.run(CustomStarterAppApplication.class, args);
        }

        public void run(String... strings) throws Exception {
            service.hello();
        }
    }

