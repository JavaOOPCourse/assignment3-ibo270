public abstract class Service{

    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive

    private String serviceName;
    private int serviceId;
    private boolean isActive;


    // TODO: constructor
    public Service(String sn , int si){
        this.serviceName = sn;
        this.serviceId = si;
        this.isActive = false;
    }


    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService(){
        isActive = true;
        System.out.println("Service " + serviceName + "is active " + isActive );
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message

    public void deactivateService(){
        isActive = false;
        System.out.println("Service " + serviceName + "is active " + isActive );
    }

    abstract void performService();


    public String getServiceName(){
        return serviceName;
    }

    public boolean getIsActive(){
        return isActive;
    }

// TODO: getter for serviceName


    // TODO: getter for isActive


    // TODO: abstract method performService()
}

