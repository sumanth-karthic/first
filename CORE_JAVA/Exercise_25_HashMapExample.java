import java.util.HashMap;
import java.util.Scanner;

public class Exercise_25_HashMapExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer,String> map =
                new HashMap<>();

        System.out.print(
                "Number of Entries: ");

        int n = sc.nextInt();

        sc.nextLine();

        for(int i=0;i<n;i++) {

            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name =
                    sc.nextLine();

            map.put(id,name);
        }

        System.out.print(
                "Enter ID to Search: ");

        int search =
                sc.nextInt();

        System.out.println(
                map.get(search));

        sc.close();
    }
}