package in.sysbytes.service;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceImpl implements HelloService{

    @Autowired
    private HelloServiceProperties greeterProperties;

    public void hello() {
        String userName = greeterProperties.getUserName() == null
            ? "'Default user'"
            : greeterProperties.getUserName();
        System.out.println("Hello "+userName);
    }
}
