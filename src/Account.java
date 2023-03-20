 import java.util.*;

    public class Account {
        int id;
        String owerName;
        double balance;

        @Override
        public String toString() {
            return "AccountDemo{" +
                    "id=" + id +
                    ", owerName='" + owerName + '\'' +
                    ", balance=" + balance +
                    '}';
        }

        public static void main(String[] args) {
            int option;
            List<Account> accountList = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("-------------------------------!");
                System.out.println("1: Add Acount ");
                System.out.println("2: Remove Acount ");
                System.out.println("3: Edit Acount");
                System.out.println("4: Show information ");
                System.out.print("5: Chose Number 1 - 5 : ");
                option = input.nextInt();
                switch (option){
                    case 1:
                        Account account = new Account();
                        System.out.print("Enter Your ID : ");
                        account.id = input.nextInt();
                        System.out.print("Enter Your Name : ");
                        input.nextLine();
                        account.owerName = input.nextLine();
                        System.out.print("Enter Your Balance : ");
                        account.balance = input.nextDouble();
                        accountList.add(account);
                        break;
                    case 2:
                        System.out.println("Remove ID : ");
                        int rmID = input.nextInt();
                        accountList.removeIf(account1 -> account1.id == rmID);
                        System.out.println("ID have revomed");
                        break;
                    case 3:
                        System.out.println("Update Account by ID ");
                        System.out.print("Update ID : ");
                        int upID = input.nextInt();
                        for (int i = 0 ; i<accountList.size(); i++){
                            if (accountList.get(i).id == upID){
                                Account acc = new Account();
                                acc.id = accountList.get(i).id;

                                System.out.print("Update Name : ");
                                input.nextLine();
                                acc.owerName = input.nextLine();
                                System.out.print("Undate Balance ");
                                acc.balance= input.nextDouble();

                                accountList.set(i,acc);
                            }
                        }
                        break;
                    case 4:
                        int showOption;
                        System.out.println("----- Show Account information -----");
                        System.out.println("1. Other by ID  ");
                        System.out.println("2. Other By Balance  ");
                        System.out.println("3. Out the Program ");
                        System.out.print("Chose Number 1 - 3 :   ");
                        showOption = input.nextInt();
                        switch (showOption){
                            case 1:
                                for (Account acc : accountList) {
                                    System.out.println(acc);
                                }
                            case 2:
                                break;
                            case 3:
                            default:
                        }
                        break;
                    case 5:
                        System.out.println("Exit Program.....!");
                        break;
                }
            }while (option<5);
        }
    }
