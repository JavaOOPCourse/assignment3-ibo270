public class Admin extends User {

    // TODO: constructor
    public Admin(String name , int id ){
        super(name, id);
    }

    // TODO:
    // print admin managing message

    @Override
    public void manageService(Service s ){
        System.out.println("Admin" + name + "  managing " + s.getServiceName());
    }

    // TODO:
    // print admin using message
    // call performService()

    @Override
    public void useService(Service s ){
        System.out.println("Admin " + name + "performing "+ s.getServiceName());
        s.performService();
    }
}
