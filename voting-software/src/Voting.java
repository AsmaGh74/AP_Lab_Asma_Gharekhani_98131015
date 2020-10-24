import ir.huri.jcal.JalaliCalendar;

import java.util.*;

/**
 * Voting class creates a new voting and stores voting's information like voting question.
 * @author Asma
 */

public class Voting {
    private int type;  // type of voting. If type = 0:  anyone can have just one vote,
                       // if note they can have more than one vote.
    private String question;  // voting question
    private ArrayList<Person> voters;  // voters list
    private HashMap<String, HashSet<Vote>> choices;  // for every answer we have a set of votes
    private HashSet<String> candidateAnswers;  // answers for voting question

    /**
     * Create a new voting.
     * @param type  voting type. 0 if anyone can have just one vote, 1 otherwise.
     * @param question  voting question
     */
    public Voting(int type, String question){
        this.type = type;
        this.question = question;
        voters = new ArrayList<Person>();
        candidateAnswers = new HashSet<String>();
        choices = new HashMap<String, HashSet<Vote>>();
    }

    /**
     * Get the voting question.
     * @return  voting question
     */
    public String getQuestion(){
        return question;
    }

    /**
     * Get voting type.
     * @return voting type
     */
    public int getType(){
        return type;
    }

    /**
     * Add a new candidate answer to voting question.
     * @param answer  new answer for voting question
     */
    public void createAnswer(String answer){
        candidateAnswers.add(answer);  // add new answer to candidate answers for voting question
        HashSet<Vote> votes = new HashSet<Vote>();  // create a new empty HashSet of Vote for new added question
        choices.put(answer, votes);  // put new answer with empty HashSet of votes to choices
    }

    /**
     * Get a Person and her/his votes and record the vote.
     * @param person  who wants to vote
     * @param votes  person's votes
     */
    public void vote(Person person, ArrayList<String> votes){
        boolean existence = false;
        for (Person ele:voters) {
            if (ele.equals(person)){
                existence = true;
            }
        }
        if (!existence){
            boolean validVote = false;  // if at least one vote is valid this variable will be true
            for (String vote :votes) {
                if (candidateAnswers.contains(vote)){
                    validVote = true;
                    JalaliCalendar date = new JalaliCalendar(new GregorianCalendar());
                    Vote newVote = new Vote(person, date.toString());
                    choices.get(vote).add(newVote);
                }
            }
            if (validVote) {
                voters.add(person);  // if the person votes list is a valid list, add him/her to voters list
                System.out.println("Vote recorded successfully.");
            }
        } else System.out.println("You already have voted!");
    }

    /**
     * Print information of anyone who voted this question.
     */
    public void getVoters(){
        System.out.println("Voters list:");
        for (Person person: voters) {
            person.print();
        }
    }

    /**
     * Print voting result.
     */
    public void printResult(){
        int max = 0;
        String result= "";
        for (String ele:choices.keySet()) {
            if (choices.get(ele).size() > max){
                max = choices.get(ele).size();
                result = ele;
            }
        }
        System.out.println(result);
    }

    /**
     * Get candidate answers for voting.
     * @return voting candidate answers
     */
    public HashSet<String> getCandidateAnswers(){
        return candidateAnswers;
    }

}
