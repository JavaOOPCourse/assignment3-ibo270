public class Customer extends User{


    // TODO: constructor

    public Customer(String name , int id ){
        super(name , id);
    }

    // TODO:
    // print that customer cannot manage services
    @Override
    public void manageService(Service s ){
        System.out.println("Customer "+ name + "cannot manage services");
    }

    // TODO:
    // print customer using message
    // call performService()

    @Override
    public void useService(Service s ){
        System.out.println("Customer "+name +"using "+ s.getServiceName());
        s.performService();
    }
}
