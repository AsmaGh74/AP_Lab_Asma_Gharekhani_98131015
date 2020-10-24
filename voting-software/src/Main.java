import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        VotingSystem votingSystem = new VotingSystem();

        System.out.println("Welcome");
        System.out.println("Valid commands list: \n" +
                "1. voting create \n" +
                "2. voting print \n" +
                "3. voting result \n" +
                "4. vote \n" +
                "5. exit");
        boolean exit = false;
        while (!exit){
            System.out.println("Please enter a valid command:");
            Scanner scanner = new Scanner(System.in);
            String[] inputCommand = scanner.nextLine().split(" ");
            if (inputCommand[0].equals("voting")){
                if (inputCommand[1].equals("print")){
                    System.out.println("Enter voting number or 'all' word to print all polls: ");
                    String votingNumber = scanner.nextLine();
                    if (votingNumber.equals("all")){
                        votingSystem.printListOfPolls();
                    } else {
                        int number = Integer.parseInt(votingNumber);
                        votingSystem.printVoting(number);
                    }
                }
                else if (inputCommand[1].equals("create")){
                    System.out.println("Please enter voting type: (0 or 1)");
                    int type = Integer.parseInt(scanner.nextLine());
                    if (type == 0 || type == 1){
                        System.out.println("Please enter your voting question: ");
                        String question = scanner.nextLine();
                        votingSystem.createVoting(type, question);
                        ArrayList<String> candidateAnswers = new ArrayList<>();
                        int i = 1;
                        do {
                            System.out.println("Please enter candidate answer number " + i + " or just enter to skip:");
                            candidateAnswers.add(scanner.nextLine());
                            i++;
                        } while (!candidateAnswers.get(i-2).isEmpty());
                        if (!candidateAnswers.isEmpty()){
                            int size  = votingSystem.getVotingList().size();
                            for (String ele:candidateAnswers) {
                                votingSystem.getVotingList().get(size-1).createAnswer(ele);
                            }
                        }
                    } else System.out.println("Wrong type (0 or 1).");

                } else if (inputCommand[1].equals("result")){
                    System.out.println("Please enter voting number:");
                    int votingNumber = Integer.parseInt(scanner.nextLine());
                    votingSystem.printResult(votingNumber);
                } else System.out.println("Invalid command!");
            }
            else if (inputCommand[0].equals("vote")){
                System.out.println("Please enter voting number: ");
                int votingNumber = Integer.parseInt(scanner.nextLine());
                votingSystem.printVoting(votingNumber);
                System.out.println("Please enter your first name:");
                String firstName = scanner.nextLine();
                System.out.println("Please enter your last name:");
                String lastName = scanner.nextLine();
                Person person = new Person(firstName, lastName);
                ArrayList<String> votes = new ArrayList<>();
                if (votingSystem.getVotingList().get(votingNumber-1).getType() == 0){
                    System.out.println("Enter your vote:");
                    votes.add(scanner.nextLine());
                    votingSystem.vote(votingNumber, person, votes);
                }
                else {
                    int i = 1;
                    do {
                        System.out.println("Please enter your vote or just enter to skip:");
                        votes.add(scanner.nextLine());
                        i++;
                    } while (!votes.get(i-2).isEmpty() && i < votingSystem.getVotingList().get(votingNumber-1).getCandidateAnswers().size());
                    votingSystem.vote(votingNumber, person, votes);
                }
            }
            else if (inputCommand[0].equals("exit")) exit = true;
            else System.out.println("Invalid command!");
        }
    }
}
