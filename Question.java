import java.util.Scanner;

public class Question {
    private String questionContent;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOption;

    /**
     * @return the questionContent
     */
    public String getQuestionContent() {
        return questionContent;
    }

    /**
     * @param questionContent the questionContent to set
     */
    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    /**
     * @return the optionA
     */
    public String getOption1() {
        return optionA;
    }

    /**
     * @param optionA the optionA to set
     */
    public void setOption1(String optionA) {
        this.optionA = optionA;
    }

    /**
     * @return the optionB
     */
    public String getOption2() {
        return optionB;
    }

    /**
     * @param optionB the optionB to set
     */
    public void setOption2(String optionB) {
        this.optionB = optionB;
    }

    /**
     * @return the optionC
     */
    public String getOption3() {
        return optionC;
    }

    /**
     * @param optionC the optionC to set
     */
    public void setOption3(String optionC) {
        this.optionC = optionC;
    }

    /**
     * @return the optionD
     */
    public String getOption4() {
        return optionD;
    }

    /**
     * @param optionD the optionD to set
     */
    public void setOption4(String optionD) {
        this.optionD = optionD;
    }

    /**
     * @return the correctOption
     */
    public String getCorrectOption() {
        return correctOption;
    }

    /**
     * @param correctOption the correctOption to set
     */
    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }
    
    public boolean startGame() {
        System.out.println(this.getQuestionContent());
        System.out.println("A. " + this.getOption1());
        System.out.println("B. " + this.getOption2());
        System.out.println("C. " + this.getOption3());
        System.out.println("D. " + this.getOption4());
        
        System.out.print("Your answer: ");
        // Yeu cau nguoi choi nhap tu ban phim de tra loi
        Scanner input = new Scanner(System.in);
        
        String userOption = input.nextLine();
        
        if (userOption.equals(this.getCorrectOption())){
            System.out.println("Congratulation, You're correct!");
            return true;
        }
        else {
            System.out.println("Sorry, You're wrong!");
            return false;
        }
        
    }
}
