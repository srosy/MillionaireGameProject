public class Price {
   private int priceIndex;
   public String[] winnerPrice = {"$0", "$100", "$200", "$300", "$500", "$1000", "$2000",
                                  "$4000", "$8000", "$16000", "$32000", "$64000",
                                  "$125000", "$250000", "$500000", "$1_Million"};
                                  
   public void setPrice() {
      priceIndex++;
   }
   
   public String getPrice() {
      return winnerPrice[priceIndex];
   }
   
}