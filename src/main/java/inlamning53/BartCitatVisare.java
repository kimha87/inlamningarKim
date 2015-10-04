package inlamning53;

public class BartCitatVisare {
  private String quote ="";
  BartCitatVisare(){}
  
  BartCitatVisare(int howManytimes, String writeWhat) {
    setQuote(writeWhat);
    for (int i = 0; i < howManytimes; i++) {
      getQuote();
    }
  }
  
  public void setQuote(String writeWhat){
    quote = writeWhat;    
  }
  public void getQuote(){
    System.out.println(quote);
  }
  

}
