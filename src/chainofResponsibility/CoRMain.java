package chainofResponsibility;

public class CoRMain {

    public static void main(String a[]){

        CoRRequest coRRequest = new CoRRequest();
        coRRequest.setType("A");

        CoRHandleTypeA coRHandleTypeA = new CoRHandleTypeA();
        CoRHandleTypeB coRHandleTypeB = new CoRHandleTypeB();

        coRHandleTypeA.setPass(coRHandleTypeB);

        coRHandleTypeA.handleType(coRRequest);
    }

}
