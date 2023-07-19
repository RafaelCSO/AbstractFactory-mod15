public class Demo {
    public static void main(String[] args) {
        Customer customerOne = new Customer("B",true);
        Factory factory = getFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest());
        carOne.startEngine();
    }

    private static Factory getFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}