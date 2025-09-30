package week2.week2_2.myEx;

public class Person {
    private Role role;


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
        role.work();
    }




}
