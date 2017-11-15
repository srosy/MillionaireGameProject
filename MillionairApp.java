import java.util.ArrayList;

public class MillionairApp {

   public static void main(String[] args) {        
      ArrayList<Question> list = new ArrayList();
      Price priceWinner = new Price();
      
      Question q1 = new Question();
      q1.setQuestionContent("A popular expression goes “A bird in the hand is worth two in the” what?");
      q1.setOption1("Tree");
      q1.setOption2("Bush");
      q1.setOption3("Window");
      q1.setOption4("Pot");
      q1.setCorrectOption("B");
      list.add(q1);
      
      Question q2 = new Question();
      q2.setQuestionContent("The candy bar Twix PB adds what flavor to Twix?");
      q2.setOption1("Pancake Batter");
      q2.setOption2("Peach Brandy");
      q2.setOption3("Pickle Brine");
      q2.setOption4("Peanut Butter");
      q2.setCorrectOption("D");
      list.add(q2);
      
      Question q3 = new Question();
      q3.setQuestionContent("If you celebrate something bi-annually, how often do you celebrate it");
      q3.setOption1("Every two months");
      q3.setOption2("Every two years");
      q3.setOption3("Every three months");
      q3.setOption4("Every three years");
      q3.setCorrectOption("B");
      list.add(q3);
      
      Question q4 = new Question();
      q4.setQuestionContent("A sousaphone is also known as what?");
      q4.setOption1("Tuba");
      q4.setOption2("Trumpet");
      q4.setOption3("Banjo");
      q4.setOption4("Harmonica");
      q4.setCorrectOption("A");
      list.add(q4);
      
      Question q5 = new Question();
      q5.setQuestionContent("Which of the following is not a Roman numeral?");
      q5.setOption1("M");
      q5.setOption2("L");
      q5.setOption3("G");
      q5.setOption4("D");
      q5.setCorrectOption("G");
      list.add(q5);
      
      Question q6 = new Question();
      q6.setQuestionContent("What cookie's commercials feature a talking cookie who is grabbed and eaten by humans?");
      q6.setOption1("Mrs. Fields");
      q6.setOption2("Oreo");
      q6.setOption3("Chips Ahoy");
      q6.setOption4("Sandies");
      q6.setCorrectOption("C");
      list.add(q6);
      
      Question q7 = new Question();
      q7.setQuestionContent("The four fundamental forces in physics are strong, electromagnetic, gravitational, and what?");
      q7.setOption1("Weak");
      q7.setOption2("Frictional");
      q7.setOption3("Magnetic");
      q7.setOption4("Normal");
      q7.setCorrectOption("A");
      list.add(q7);
      
      Question q8 = new Question();
      q8.setQuestionContent("Also used as an antacid, what is the chemical name for chalk");
      q8.setOption1("Bismuth Subcarbonate");
      q8.setOption2("Calcium Carbonate");
      q8.setOption3("Magnesium Oxide");
      q8.setOption4("Aluminum Hydroxide");
      q8.setCorrectOption("B");
      list.add(q8);
      
      Question q9 = new Question();
      q9.setQuestionContent("In the 1984 movie "Gremlins" which of the following is not one of the three rules for taking care of Mogwai?");
      q9.setOption1("Don't get him wet");
      q9.setOption2("Don't let him sleep too much");
      q9.setOption3("Don't feed him after midnight");
      q9.setOption4("Keep him out of bright light");
      q9.setCorrectOption("B");
      list.add(q9);
      
      Question q10 = new Question();
      q10.setQuestionContent("What would you measure on the Beaufort scale?");
      q10.setOption1("Wind speed");
      q10.setOption2("Earthquake intensity");
      q10.setOption3("Precipitation");
      q10.setOption4("Atmospheric pressure");
      q10.setCorrectOption("A");
      list.add(q10);
      
      Question q11 = new Question();
      q11.setQuestionContent("Which of these African countries is located south of the equator?");
      q11.setOption1("Chad");
      q11.setOption2("Mali");
      q11.setOption3("Angola");
      q11.setOption4("Cameroon");
      q11.setCorrectOption("C");
      list.add(q11);
      
      Question q12 = new Question();
      q12.setQuestionContent("As a backup option, which US state is the only which currently allows firing squad as a method of execution?");
      q12.setOption1("Utah");
      q12.setOption2("Oklahoma");
      q12.setOption3("Texas");
      q12.setOption4("Montana");
      q12.setCorrectOption("B");
      list.add(q12);
      
      System.out.println("Begin");        
      
      for(Question q : list) {
         boolean result = q.startGame();
         if (result == true) {
            priceWinner.setPrice();
         }
      }
      System.out.println("Game over, Your score: " + priceWinner.getPrice());
   }
   
}
