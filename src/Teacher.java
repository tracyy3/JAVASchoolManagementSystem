import java.util.IntSummaryStatistics;

/**
 * This class is responsible for keeping the track of teacher's name, id, and salary.
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

/**
* Create a new Teacher object.
*/

    public Teacher(int id, String name, int salary){
        this.id= id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned=0;
    }

    public int getid(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString(){
        return "Name of the Teacher: " + name + " Total salary earned so far $" + salaryEarned;
    }

}