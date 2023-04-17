package chainofResponsibility;

public abstract class CoRHandler {

    protected CoRHandler pass;

    public void setPass(CoRHandler coRHandler){
        pass = coRHandler;
    }

    public abstract void handleType(CoRRequest coRRequest);

}
