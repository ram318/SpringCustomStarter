package in.sysbytes.service;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceImpl implements HelloService{

    @Autowired
    private HelloServiceProperties greeterProperties;

    public void hello() {
        String userName = greeterProperties.getUserName() == null
            ? "'Default user'"
            : greeterProperties.getUserName();

        Integer numOfRetries = greeterProperties.getRetry().getNumOfRetries();
        System.out.println("Hello "+userName);
        System.out.println("Num of retries " +numOfRetries);
    }
}
