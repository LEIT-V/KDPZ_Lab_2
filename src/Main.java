import java.util.Date;

public class Main {
    public static void main(String[] args) {
        HomeAddress address1 = new HomeAddress(new Date(),"Kyiv", "Ivan Mazepa", 14);
        HomeAddress address3 = new HomeAddress(new Date(),"Kyiv", "Ivan Mazepa", 14);
        HomeAddress address2 = new HomeAddress(new Date(),"Nikopol", "Pershotravneva", 8);

        System.out.println(address1.getCity() + " " + address1.getStreet() + " " + address1.getHouseNumber() + " // " + address1.getDate());
        System.out.println(address2.getCity() + " " + address2.getStreet() + " " + address2.getHouseNumber() + " // " + address2.getDate());

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

        System.out.println(address1.equals(address2));
        System.out.println(address1.equals(address3));
    }
}