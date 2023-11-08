package L06DefiningClasses.Lab.P03BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<BankAccount> clients = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] data = command.split(" ");

            switch (data[0]){
                case "Create":
                    clients.add(new BankAccount());
                    System.out.printf("Account ID%d created%n", clients.get(clients.size() - 1).getId());
                    break;
                case "Deposit":
                    int index = Integer.parseInt(data[1]);

                    if (isIndexValid(index,clients)){
                        clients.get(index - 1).deposit(Double.parseDouble(data[2]));
                        System.out.printf("Deposited %.0f to ID%d%n", Double.parseDouble(data[2]), index);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterest(Double.parseDouble(data[1]));
                    break;
                case "GetInterest":
                    int indexInterest = Integer.parseInt(data[1]);

                    if (isIndexValid(indexInterest, clients)){
                        System.out.printf("%.2f%n", clients.get(indexInterest - 1).getInterest(Integer.parseInt(data[2])));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
    }

    private static boolean isIndexValid(int index, ArrayList<BankAccount> clients) {
        return index > 0 && index <= clients.size();
    }


}
