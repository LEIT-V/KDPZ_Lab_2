import java.util.Date;

public final class HomeAddress  {

    private final Date date; //Дата передання данних
    private final String city;
    private final String street;
    private final String houseNumber;

    public HomeAddress(Date date, String city, String street, int houseNumber){
        this.date = date;
        this.city = city;
        this.street = street;
        this.houseNumber = Integer.toString(houseNumber);
    }
    //Гетери:
    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public Date getDate() {
        return (Date)date.clone(); /*При створюванні гетерів об`єктів в незмінюваному класі потрібно їх клонувати,
                                    бо інакше можна буде випадково змінити початковий об`єкт */
    }

    // Метод для порівняння об`єктів класу HomeAdress:
    public boolean equals(HomeAddress homeAddress) {
        return  ((this.date.compareTo(homeAddress.date) == 0
                && this.city.equals(homeAddress.city)
                &&  this.street.equals(homeAddress.street)
                &&  this.houseNumber.equals(homeAddress.houseNumber) ));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
