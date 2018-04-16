public class Main {

    public static void main(String[] args){
//
//        Car porsche = new Car();
//
//        porsche.setModel("Boxter");
//
//        System.out.println("Model is "+porsche.getModel());

       // BankAccount saving = new BankAccount("12332",500,"John","john@gmail.com",232212322);

//        BankAccount saving = new BankAccount();
//
//        System.out.println("Name is "+saving.getName());
//        System.out.println("Total Balance "+ saving.getBalance());
//
//        saving.depositFunds(50000);
//        saving.withdrawFunds(10000000);
//        saving.withdrawFunds(5000);

        VipCustomer bob = new VipCustomer();
        System.out.println("Bob Email : "+bob.getEmail());

        VipCustomer bo = new VipCustomer("Bo", 5000);
        System.out.println("Bo email: "+ bo.getEmail()+ " Credit Limit" + bo.getCreditLimit()+ " Name " + bo.getName());

        VipCustomer jo = new VipCustomer("Jo", 100, "jo@gmail.com");
        System.out.println("Jo email: "+ jo.getEmail()+ " Credit Limit" + jo.getCreditLimit()+ " Name " + jo.getName());

    }
}
