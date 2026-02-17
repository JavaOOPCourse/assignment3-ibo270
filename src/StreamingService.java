public class StreamingService extends Service implements PremiumFeature {

    private boolean premium;

    public StreamingService(String name, int id) {
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService() {
        if (getIsActive()) {
            if (premium) {
                System.out.println("Premium Service " + getServiceName() + " is active!");
            } else {
                System.out.println("Normal Service " + getServiceName() + " is active.");
            }
        } else {
            System.out.println("Service " + getServiceName() + " is not active.");
        }
    }

    @Override
    public void upgradeToPremium(){
        premium = true;
        System.out.println("Premium is active");
    }
}