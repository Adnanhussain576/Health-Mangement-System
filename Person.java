public abstract class Person{
    private String id;
    private String name;


    Person(String id, String name){
        this.id=id;
        this.name=name;
    }
    public abstract void displayInfo();

    public String getID(){return id;}
    public String getname(){return name;}

}