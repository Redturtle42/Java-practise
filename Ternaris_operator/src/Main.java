public class Main {
    public static void main(String[] args) {
        Human first = new Human();
        Human.writeMyName();

        first.setName("Jane");
        System.out.print("The age is: ");
        first.setAge(18);
        System.out.println(first.getAge());

        System.out.println(first.getName() == null ? "Empty" : "Not empty, the name is " + first.getName());

    }
}
