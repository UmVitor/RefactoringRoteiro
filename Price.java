public abstract class Price {
  public abstract int getPriceCode();
  public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented){
    int frequentRenterPoints = 1; 
      //Adicionar o trecho de código extraído.
     if ((this.getPriceCode() == Movie.NEW_RELEASE) &&
         daysRented > 1) frequentRenterPoints ++;
     
     return frequentRenterPoints;
  }
}