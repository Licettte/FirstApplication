import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {}

    public  String reader(File file) throws FileNotFoundException {
      Scanner sc = new Scanner(new File("D:\\lp2\\NamesForBankAccounts\\MansNames.txt"));
      while (sc.hasNext()) {
        String s = sc.next();
        String firstName = s;
        String lastName = "";
        String patronymic;
        System.out.println(firstName);
        return firstName;
      }
      return null;
    }}
