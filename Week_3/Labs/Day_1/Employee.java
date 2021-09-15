package Week_3.Labs.Day_1;

/**
 * This class describes an object of type Employee, including a name, jobtitle,
 * salary and a unique employeeID.
 *
 *	@version 1.0 March 2016
 *
 * 	The comments at the top of the method are in a format known as JavaDocs. You can look up
 *	more details on how JavaDocs work and why you use them online if you interested
 *
 * This class uses the "this" keyword for more information on the "this" keyword
 * please look at https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html 
 * and ask your Demonstrator.
 * 
 *
 */
public class Employee
{
    // Attributes
    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;
    
    //Class Variables
    private static int lastEmployeeID = 1000;
    
    // Default Constructor
	/**
     * Creates an Employee with default values
	 */
    public Employee()
    {
        this.name = "Mary Jones";
        this.jobTitle = "Doctor";
        this.salary = 19000f;
        
        //update the uniquieID class variable so no two employees have the same ID 
        lastEmployeeID++;
        
        //set the unique ID
        this.employeeID = lastEmployeeID;
    }
    
    // General Constructor
	/**
	 * Creates a new Employee with the details provided and assigns it a uniqueID
	 * @param name The name this Employee has
	 * @param jobTitle The job title of this Employee
	 *
	 */
    public Employee(String name, String jobTitle, float salary)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

        //update the uniquieID class variable so no two employees have the same ID 
        lastEmployeeID++;
        
        //set the unique ID
        this.employeeID = lastEmployeeID;
    }
    
    // Accessors and Mutators
    /**
	 * Sets the name of the Employee to the new one provided.
	 * @param name: The new name of the Person.
	 */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
	 * Sets the job title of the Employee to the new one provided.
	 * @param jobTitle: The new job title of the Employee.
	 */
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    
    /**
	 * Sets the salary of the Employee to the new one provided.
	 * @param salary: The new salary of the Employee.
	 */
    public void setSalary(float sal)
    {
        if(sal>=19000f)
        {
            this.salary = sal;
        }
        else
        {
            System.out.println("Entered salary of " + sal + " is too low. Salary set at minimum wage of 19000.0");
            this.salary = 19000f;
        }
    }
    
    /**
	 * 	Gets the name of this Employee
	 *	@return name
	 */
    public String getName()
    {
        return this.name;
    }
    
    /**
	 * 	Gets the jobTitle of this Employee
	 *	@return jobTitle
	 */
    public String getJobTitle()
    {
        return this.jobTitle;
    }
    
    /**
	 * 	Gets the salary of this Employee
	 *	@return salary
	 */
    public float getSalary()
    {
        return this.salary;
    }
    
    /**
	 * 	Gets the employeeID of this Employee
	 *	@return employeeID
	 */
    public int getEmployeeID()
    {
        return this.employeeID;
    }
    
    /**
	 * Prints the details of this Employee to the screen
	 */
    public void showEmp()
    {
        System.out.println("EMPLOYEE RECORD");
        String details = "NAME: " + this.name;
        details += "\nJOB TITLE: " + this.jobTitle;
        details += "\nCURRENT SALARY: " + this.salary;
        details += "\nEMPLOYEE ID: " + this.employeeID;
        System.out.println(details);
    }
    
    /**
	 * Creates a toString method which returns the details 
	 * of the Employee as a String of this Employee to the screen
	 */
    public String toString()
    {
        String details = "NAME: " + getName();
        details += "\nJOB TITLE: " + getJobTitle();
        details += "\nCURRENT SALARY: " + getSalary();
        details += "\nEMPLOYEE ID: " + getEmployeeID();
        return details;
    }
}