package chainofResponsibility;

public class CoRHandleTypeB extends CoRHandler{

    public void handleType(CoRRequest coRRequest) {

        if(coRRequest.getType().equals("B")){
            System.out.println("Processing logic for B");
        }
    }
}
