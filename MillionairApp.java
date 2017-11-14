import java.util.ArrayList;

public class MillionairApp {

   public static void main(String[] args) {        
      ArrayList<Question> list = new ArrayList();
      Price priceWinner = new Price();
      
      Question q1 = new Question();
      q1.setQuestionContent("Giai phong mien Nam vao nam nao?");
      q1.setOption1("1945");
      q1.setOption2("1954");
      q1.setOption3("1968");
      q1.setOption4("1975");
      q1.setCorrectOption("D");
     
      list.add(q1);
      
      Question q2 = new Question();
      q2.setQuestionContent("Chien thang Dien Bien Phu vao nam nao?");
      q2.setOption1("1945");
      q2.setOption2("1954");
      q2.setOption3("1968");
      q2.setOption4("1975");
      q2.setCorrectOption("B");
      list.add(q2);
      
      Question q3 = new Question();
      q3.setQuestionContent("Giai phong Da Nang vao ngay nao?");
      q3.setOption1("2-9");
      q3.setOption2("1-5");
      q3.setOption3("29-3");
      q3.setOption4("30-4");
      q3.setCorrectOption("C");
      list.add(q3);
      
      Question q4 = new Question();
      q4.setQuestionContent("Nam sinh cua Ho Chu Tich?");
      q4.setOption1("1890");
      q4.setOption2("1880");
      q4.setOption3("1900");
      q4.setOption4("1910");
      q4.setCorrectOption("A");
      list.add(q4);
      
      Question q5 = new Question();
      q5.setQuestionContent("Bac Ho doc ban tuyen ngon doc lap vao nam nao?");
      q5.setOption1("1945");
      q5.setOption2("1954");
      q5.setOption3("1968");
      q5.setOption4("1975");
      q5.setCorrectOption("A");
      list.add(q5);
      
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
