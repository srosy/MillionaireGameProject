/*********************************
* Author: Spencer Rosenvall
* Setters and getters to deliver
* info from Phi's output to the Gui
**********************************/

public class GuiGetterSetter{

   private String currentQuestion;
   private int currentRound;
   private int moneyWon;
   private int correctAnswer;
   

   
   // get variable with saved string question from program
   public String getQuestion(){
      return MillionaireApp.getcurrentQuestion;
   }
   
   // get variable with saved int round number from program
   public int getRound(){
      return currentRound;
   }
   
   // get variable with saved int correct answer from program
   public int getAnswer(){
      return correctAnswer;
   }
   
   // get variable with saved int moneyWon from program
   public int getMoneyWon(){
      return moneyWon;
   }

   // get variable with saved array output from program
   public int[] getArray(){
      return false;
   }
   
   
   
   
   // save variable as current String from output for GUI
   public void setQuestion(String s){
      currentQuestion = s;
   }
   
   
   // save variable as current MoneyWon from output for GUI
   public void setMoneyWon(int n){
      moneyWon = n;
   }
   
    // save variable as current Answer from output for GUI
   public void setAnswer(int n){
   
   //I'm not sure if you have it aas a char, string, int, array, etc...
      correctAnswer = n;
   
   }



   // save variable as current String from output for GUI
   public void setQuestionRound(int n){
      currentRound = n;  
   }
}