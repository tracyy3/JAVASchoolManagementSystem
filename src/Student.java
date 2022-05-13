public class Student {

    /* This class is responsible for keeping the track of students fee, id, name, grade, and fees paid*/

    private  int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*To create a new Student by initializing
    * Fees for every student is $30,000.
    *Fees paid initially is 0.
    */

    public Student (int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's name and id.

    /*
     * Use to update student's grade.
     * 
     */

    public void  setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the fees to the feesPaid Field. 
     * Add the gees to the fees paid.
     * The school is going to receive the funds. 
     * 
     */

    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFee(){
        return feesTotal-feesPaid;
    }
    @Override
    public String toString(){
        return "Student's name : " + name+ "Total fees paid so far $" + feesPaid; 
    }


    }