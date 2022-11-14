package Quiz;

public class Question {
    String qstn;
    String option1;
    String option2;
    String option3;
    String option4;
    String option5;
    String answer;

    public Question( String questn,
    String opt1,
    String opt2,
    String opt3,
    String opt4,
    String opt5,String ans ){


        this.qstn = questn;
        this.option1 = opt1;
        this.option2 = opt2;
        this.option3 = opt3;
        this.option4 = opt4;
        this.option5 = opt5;
        this.answer = ans;

    }
}
