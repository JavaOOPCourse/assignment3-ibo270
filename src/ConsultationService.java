public class ConsultationService extends Service implements Billable{
    public ConsultationService(String name , int id ){
        super(name ,id );
    }

    @Override
    public void performService(){
        if(getIsActive()){
            System.out.println("Can take quick rewire due to active status");
        }else{
            System.out.println("Status is not active please come later ");
        }
    }

    @Override
    public void generateBill(){
        System.out.println("Biling message for" + getServiceName());
    }
}

