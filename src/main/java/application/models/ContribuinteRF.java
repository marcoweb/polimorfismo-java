package application.models;

public abstract class ContribuinteRF {
    protected String registroRF;

    public abstract void setRegistroRF(String registroRF);
    
    public String getRegistroRF() {
        return this.registroRF;
    }
}
