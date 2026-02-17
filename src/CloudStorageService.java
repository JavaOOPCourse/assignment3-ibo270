public class CloudStorageService extends Service  implements PremiumFeature , Billable {
    private boolean premium;

    public CloudStorageService(String name , int id){
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService(){
        if(getIsActive()){
            System.out.println("Cloud access to storage is APPROVED");
        }else{
            System.out.println("Access was denied");
        }
    }

    @Override
    public void upgradeToPremium(){
        this.premium=true;
        System.out.println("Premium access was DECLARED CONGRATUALTIONS");
    }

    @Override
    public void generateBill(){

        System.out.println("Billing message for"+ getServiceName() + "service ");

    }
}