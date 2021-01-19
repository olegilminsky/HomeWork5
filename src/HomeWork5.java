public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Начальник отдела", "ivanovii@firm.com", "+79008000001", 50000, 45);
        employees[1] = new Employee("Петров Петр Петрович", "Ведущий инженер", "petrovpp@firm.com", "+79008000002", 40000, 41);
        employees[2] = new Employee("Сидоров Степан Степанович", "Инженер", "sidorovss@firm.com", "+79008000003", 35000, 35);
        employees[3] = new Employee("Александрова Александра Александровна", "Инженер-проектировщик", "aleksandrovaaa@firm.com", "+79008000004", 35000, 30);
        employees[4] = new Employee("Валентинова Валентина Валентиновна", "Инженер-конструктор", "valentinovavv@firm.com", "+79008000005", 35000, 50);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}
