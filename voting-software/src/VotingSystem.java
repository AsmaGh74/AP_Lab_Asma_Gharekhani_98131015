import java.util.ArrayList;

/**
 * VotingSystem class stores a list of created polls.
 *
 * @author Asma
 */

public class VotingSystem {
    private ArrayList<Voting> votingList; // list of created polls

    public VotingSystem(){
        votingList = new ArrayList<Voting>();
    }

    /**
     * Create a voting with specified type and voting question.
     * @param type  voting type
     * @param question  voting question
     */
    public void createVoting(int type, String question){
        if (type == 0 || type == 1){
            Voting voting = new Voting(type, question);
            votingList.add(voting);
        } else System.out.println("Voting type must be 0 or 1.");
    }

    /**
     * Print list of voting questions.
     */
    public void printListOfPolls(){
        System.out.println("Polls list:");
//        for (Voting voting: votingList) {
//            System.out.println(voting.getQuestion());
//        }
        for (int i = 0; i < votingList.size(); i++){
            printVoting(i+1);
        }
    }

    /**
     * Print question and candidate answers for voting with specified number
     * @param number  voting number
     */
    public void printVoting(int number) {
        if (number <= votingList.size()) {
            System.out.println("Voting number " + number + ":");
            System.out.println("Question:  " + votingList.get(number-1).getQuestion());
            System.out.print("Candidate answers:");
            for (String ele : votingList.get(number-1).getCandidateAnswers()) {
                System.out.println(ele);
            }
            votingList.get(number-1).getVoters();
        } else System.out.println("Invalid voting number!");
    }

    /**
     * Record a vote for voting with specified number.
     * @param number  voting number
     * @param person  who wants to vote
     * @param votes  person's votes
     */
    public void vote (int number, Person person, ArrayList<String> votes){
        votingList.get(number-1).vote(person, votes);
    }

    /**
     * Print result for voting with specified number.
     * @param number  voting number
     */
    public void printResult(int number){
        if (number <= votingList.size()){
            System.out.print("Result for ");
            printVoting(number);
            System.out.print("Result:  ");
            votingList.get(number-1).printResult();
        } else System.out.println("Invalid voting number!");
    }

    /**
     * Get created polls.
     * @return  all created polls
     */
    public ArrayList<Voting> getVotingList(){
        return votingList;
    }
}
