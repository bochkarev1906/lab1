

public class Client {
    private String fullName;
    private String address;
    private String numberOfPassport;
    private String mobilePhone;
    private Double salary;


    Client(String fullName, String address, String numberOfPassport, String mobilePhone, Double salary) {
        this.fullName = fullName;
        this.address = address;
        this.numberOfPassport = numberOfPassport;
        this.mobilePhone = mobilePhone;
        this.salary = salary;
        System.out.println("Client " + fullName + " with address: " + address + ", with Passport: " + numberOfPassport + " is created");
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getNumberOfPassport() {
        return numberOfPassport;
    }

    public String getMobilePhone() { return mobilePhone; }

    public Double getSalary() { return salary; }

    public boolean checkFormatName(){
        return fullName.charAt(0) >= 'A' && fullName.charAt(0) <= 'Z' ;
    }
}
