import java.util.*;

public class Week4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array (Ex: 1,2,3,...): ");
        List<Integer> firstList = input(sc);
        System.out.print("Enter second array (Ex: 1,2,3,...): ");
        List<Integer> secondList = input(sc);
        sc.close();

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.addAll(firstList);
        integerSet.addAll(secondList);

        System.out.print("Result: ");
        System.out.println(integerSet);
    }



    public static List<Integer> input(Scanner sc){
        List<Integer> list = new ArrayList<>();
        boolean check = true;
        while (check) {
            String s = sc.nextLine().replaceAll("\\s", "").trim();
            String[] input = s.split(",");
            try {
                for (String string : input) {
                    list.add(Integer.parseInt(string));
                }
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input format!");
                System.out.print("Enter array again (Ex: 1,2,3,...): ");
            }
        }
        return list;
    }
}
