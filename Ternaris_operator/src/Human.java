public class Human {
    private  String name;
    private int age;

    public static void writeMyName(){
        String name = "John Doe";
        System.out.println("My name is " + name);
    }
    public String getName(){
        return this.name;
    }
    public void setName (String incoming){
        this.name= incoming;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}