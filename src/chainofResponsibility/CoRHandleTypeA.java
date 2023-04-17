package chainofResponsibility;

public class CoRHandleTypeA extends CoRHandler{
    public void handleType(CoRRequest coRRequest) {

        if(coRRequest.getType().equals("A")){
            System.out.println("Processing logic for A");
        }else{
            pass.handleType(coRRequest);
        }

    }
}
