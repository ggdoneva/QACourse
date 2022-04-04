package Lecture9D2403.Task1;

//Manager should have team that manages.

public class Manager extends Person{

    private String managesTeam;

    public Manager(String name, int age, String managesTeam) {
        super(name, age);
        this.managesTeam = managesTeam;
    }

    public String getManagesTeam() {
        return managesTeam;
    }

    public void setManagesTeam(String managesTeam) {
        this.managesTeam = managesTeam;
    }
}
