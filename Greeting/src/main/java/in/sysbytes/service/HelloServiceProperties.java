package in.sysbytes.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="greeting")
public class HelloServiceProperties {
    private String userName;
    private String morningMessage;
    private String afternoonMessage;
    private String eveningMessage;
    private String nightMessage;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMorningMessage() {
        return morningMessage;
    }

    public void setMorningMessage(String morningMessage) {
        this.morningMessage = morningMessage;
    }

    public String getAfternoonMessage() {
        return afternoonMessage;
    }

    public void setAfternoonMessage(String afternoonMessage) {
        this.afternoonMessage = afternoonMessage;
    }

    public String getEveningMessage() {
        return eveningMessage;
    }

    public void setEveningMessage(String eveningMessage) {
        this.eveningMessage = eveningMessage;
    }

    public String getNightMessage() {
        return nightMessage;
    }

    public void setNightMessage(String nightMessage) {
        this.nightMessage = nightMessage;
    }

    private Retry retry = new Retry();

    public Retry getRetry(){
        return retry;
    }

    protected static class Retry{
        private Integer numOfRetries = 3;
        private Integer multiplyfactor = 1;
        public Integer getNumOfRetries(){
            return numOfRetries;
        }
        public Integer getMultiplyfactor(){
            return multiplyfactor;
        }

        public void setNumOfRetries(Integer numOfRetries){
            this.numOfRetries = numOfRetries;
        }

        public void setMultiplyfactor(Integer multiplyfactor){
            this.multiplyfactor = multiplyfactor;
        }
    }
}
