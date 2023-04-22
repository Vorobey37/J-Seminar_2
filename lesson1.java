import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * lesson1
 */
public class lesson1 {

    public static void main(String[] args) {

       Scanner iScanner = new Scanner(System.in);
       //System.out.println("Введите длину строки: ");
       //Integer N = iScanner.nextInt();
       //String c1 = "Oleg";
       //String c2 = "Kamila";
       //System.out.println(Text(N, c1, c2));
       //iScanner.close();
       //String stockText = "aaaabbbcddad";
       //System.out.println(ZipText(stockText));
       //System.out.println("Введите слово: ");
       //StringBuilder name = new StringBuilder(iScanner.nextLine());
       //StringBuilder namePalindrom = new StringBuilder(name);
       //namePalindrom.reverse();
       //System.out.println(name.toString());
       //System.out.println(namePalindrom.toString());
       //System.out.println(name.toString().equals(namePalindrom.toString()));
       try (FileWriter fw = new FileWriter("1.txt")){
        for (int i = 0; i < 100; i++) {
            
            fw.write("Test");
            fw.append('\n');
        }
        fw.close();
       } catch (IOException ex) {
        System.out.println(ex.getMessage());
        // TODO: handle exception
       } 







        
    }

    /*
     * Дано целое число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
N=5
c1=”Oleg”
c2=”Vasya”
res = “OlegVasyaOlegVasyaOleg”
     */
    public static String Text(int N, String text1, String text2) {

        String text = "";
        for (int i=0; i<N; i++)
        {
            if (i%2 == 0)
            {
                text += text1;
            }
            else
            {
                text += text2;
            }
            // text += i%2 == 0 ? text1 : text2;
        }
        return text;
    }

    /*
     * Напишите метод, который сжимает строку.
Пример: вход aaaabbbcddad.
Выход abcd
charAt(i) и indexOf(s) => не найден -1
     */

     public static String ZipText (String text) {
        String zipText = "";
        for (int index = 0; index < text.length(); index++) {
            char simbol = text.charAt(index);
            if (zipText.indexOf(simbol) == -1)
            {
                zipText+=simbol;
            }
        }
        return zipText;
     }

     /*
      * Напишите метод, который принимает на вход строку
(StringBulder) и определяет является ли строка палиндромом
(возвращает boolean значение).
equals и StringBulder для revers
      */

     /*public static boolean IsRevers (String text1, String text2) {
        if (text1 == text2) return true;
        else return false;

     }*/
}