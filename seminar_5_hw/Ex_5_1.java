import java.util.*;

public class Ex_5_1 {
    public static void main(String[] args) {

        Map<String, List> phoneBook = new HashMap<>();
        List<String> numbers = new ArrayList<>();
        numbers.add("708456543");
        numbers.add("745678353");
        phoneBook.put("Иванов Иван", numbers);
        setContact((HashMap) phoneBook);
        System.out.println(phoneBook);
    }
        public static HashMap setContact(HashMap phoneBook) {
            Scanner in = new Scanner(System.in);
            System.out.println("Пожалуйста, введите Фамилию");
            String surname = in.nextLine();
            System.out.println("Пожалуйста, введите Имя");
            String name = in.nextLine();
            System.out.println("Пожалуйста, введите основной номер телефона");
            String number1 = in.nextLine();
            System.out.println("Пожалуйста, введите дополнительный номер телефона");
            String number2 = in.nextLine();
            String fullname = surname + " " + name;
            List<String> numbers = new ArrayList<>();
            numbers.add(number1);
            numbers.add(number2);
            phoneBook.put(fullname, numbers);
            in.close();
            return (HashMap) phoneBook;
        }

}
