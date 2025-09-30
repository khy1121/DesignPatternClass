package week2.week2_2;

public class Person {
    private Role role;

    public void setRole(Role role){
        this.role=role;
    }

    public Role getRole(){
        return this.role;
    }

    public void doIt(){
        role.doing();
    }
}
