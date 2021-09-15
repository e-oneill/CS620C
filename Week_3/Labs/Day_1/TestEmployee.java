package Week_3.Labs.Day_1;

public class TestEmployee {
    public static void main(String[] args) {
        Employee [] staff = new Employee[3];

        for (int i =0; i < staff.length; i++)
        {
            switch (i)
            {
                case 0: staff[i] = new Employee("Tom Daly", "Teacher", 45000); break;
                case 1: staff[i] = new Employee("Mary Murphy", "Developer", 30000); break;
                case 2: staff[i] = new Employee();
            }
        }

        String name = staff[1].getName();
        String job = staff[1].getJobTitle();
        float salary = staff[1].getSalary();
        int id = staff[1].getEmployeeID();

        System.out.println("Employee 2 is called " + name);
        System.out.println("They are a " + job);
        System.out.println("Their salary is " + salary);
        System.out.println("Their Employee ID number is " + id);

        staff[2].setName("Michael Higgins");
        staff[2].setJobTitle("President");
        staff[2].setSalary(1000f);

        for (Employee emp : staff)
        {
            emp.showEmp();
        }

        System.out.println(staff[0].toString());


    }
}
