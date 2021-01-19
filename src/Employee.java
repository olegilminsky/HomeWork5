public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ФИО сотрудника: " + fullName + ", Должность: " + position + ", email: " + email + ", телефон:" + phoneNumber + ", зарплата: " + salary + ", возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
