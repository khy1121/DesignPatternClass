package week1.week1_1;

/*public class Person {
    private String phoneObj;

    public void usePhone() {
        System.out.println("Phone obj is " + phoneObj);
    }

    public Person(String phoneObj){
        this.phoneObj = phoneObj;
    }

    Person phone1 = new Person("homePhones");
    Person phone2 = new Person("officePhones");


}*/

/*public class Person {
    private Phone officePhone;
    private Phone homePhone;
    private Person name;

    public Phone getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Phone homePhone) {
        this.homePhone = homePhone;
    }

    public Phone getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(Phone officePhone) {
        this.officePhone = officePhone;
    }



    public Person(Phone officePhone,Phone homePhone, Person name) {
        this.officePhone = officePhone;
        this.homePhone = homePhone;
        this.name = name;
    }
}*/

public class Person {
    private String name;
    private Phone officePhone;
    private Phone homePhone;

    private void addOfficePhone(Phone phone){
        officePhone=phone;
    }
    private void addHomePhone(Phone phone){
        homePhone=phone;
    }
    public Person(String name){
        this.name=name;
        addHomePhone(homePhone);
        addOfficePhone(officePhone);
    }

}
