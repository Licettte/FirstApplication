import java.util.Arrays;

public class Main {

  public Main(String[] str) {
  }

  public static void main(String args[]){
    String str [] = {"Добро пожаловать на ProgLang.su"};
    Main main = new Main(str);
    System.out.println( main.q(3));
  }
public String q(int start ){
//  Arrays.copyOf();
//  String[] q = new String[start];
//  String str1 = Arrays.toString(q);
// String str2= str1.substring(start);
//  return str2 ;
  return new  Arrays.toString(start);
}}