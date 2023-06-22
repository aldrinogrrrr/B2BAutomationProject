package utility;

public class TestLog {

    private String Step;
    private String Status;

    public TestLog(String step,String status) {
        this.Step = step;
        this.Status = status;
    }

    public String getStep(){
        return  this.Step;
    }

    public String getStatus(){
        return  this.Status;
    }

}
