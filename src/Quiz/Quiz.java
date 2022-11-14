package Quiz;
import java.util.*;

public class Quiz {
    static int scoreCount = 0;
    static ArrayList wrongAnswers = new ArrayList<>();

    public static void main(String[] args){
        ArrayList<Question> array = new ArrayList<Question>();

//        Creating the questions
        Question qstn1 = new Question( "What is the Name of a baby Dog?", "Kitty",
                "Puppy",
                "Kid",
                "Louvre",
                "Manny",
                "Puppy");

        Question qstn2 = new Question( "What is another name for a female bull?",
                "Cuppy",
                "Nopy",
                "Cow",
                "Kaddy",
                "Polos",
                "Cow");

        Question qstn3 = new Question("What is the synonym of angry?",
                "vexed",
                "sad",
                "happy",
                "Moody",
                "Owlen",
                "Vexed");

        Question qstn4 = new Question("What is a baby Goat called?",
                "Elver",
                "Kid",
                "Fry",
                "Doky",
                "Fowl",
                "Kid");

        Question qstn5 = new Question("What is a Male Donkey called?",
                "Jack",
                        "Manny",
                        "Ass",
                        "Homer",
                        "Foley",
                "Jack");

        Question qstn6 = new Question("What is a baby Snake called?",
                "Snakey",
                "Snakelet",
                "Tadpole",
                "Snakely",
                "Snake",
                "Snakelet");

        Question qstn7 = new Question("What is a New born Frog called?",
                "Minions",
                "Sissy",
                "Tadpoles",
                "Kilinmite",
                "Frog",
                "Tadpole");

        Question qstn8 = new Question("What is a Female Rabbit called?",
                "Elver",
                "Doky",
                "Doe",
                "Kid",
                "Moe",
                "Doe");

        Question qstn9 = new Question("What is an adult Male Chicken called?",
                "Cock",
                "Hen",
                "Cockerel",
                "Chicken",
                "Love",
                "Cock");

        Question qstn10 = new Question("What is a baby Pig called?",
                "Snow",
                "Maky",
                "Piglets",
                "Kid",
                "Gilts",
                "Piglets");

//      Adding questions to the arrayList;
        array.add(qstn1);
        array.add(qstn2);
        array.add(qstn3);
        array.add(qstn4);
        array.add(qstn5);
        array.add(qstn6);
        array.add(qstn7);
        array.add(qstn8);
        array.add(qstn9);
        array.add(qstn10);


        int arrayLength = array.size();

//        randomize call;
        randomize(array, arrayLength);

        askQuestions(array, arrayLength);

        System.out.println("Your score is: " + scoreCount + "/" + array.size() + "\n");

        if(wrongAnswers.size() > 0){
            System.out.println("CORRECT ANSWERS TO FAILED QUESTIONS: \n");

            for(int k = 0; k<wrongAnswers.size(); k++){
                System.out.println(wrongAnswers.get(k) + "\n");
            }
        }else{

        }

        Scanner retake = new Scanner(System.in);
        String retakeResponse = retake.next();
        System.out.println("Do you want to take the test again? Y/N");
         if(retakeResponse.toLowerCase() == "y"){
             Quiz newQuiz = new Quiz();
         }
    }

    public static void randomize(ArrayList<Question> arr, int n){
        Random randNum = new Random();

//        Swap positions
        for(int i = n - 1; i>0; i--){
            int newIndex = randNum.nextInt(n);
            Question temp = arr.get(i);
            arr.set(i, arr.get(newIndex));
            arr.set(newIndex, temp);
        }
    }

    public static void askQuestions(ArrayList<Question> arr, int n){
        int j = 0;
        while(j<n){
            Question qqq = arr.get(j);
            System.out.println( "Question" + (j+1) );
            System.out.println( qqq.qstn);
            System.out.println("(a) " + qqq.option1);
            System.out.println("(b) " + qqq.option2);
            System.out.println("(c) " + qqq.option3);
            System.out.println("(d) " + qqq.option4);
            System.out.println("(e) " + qqq.option5);

            Scanner input = new Scanner(System.in);
            System.out.println( "\n" + "Enter answer:");
            String response = input.next();

            if(response.toLowerCase().equals(qqq.answer.toLowerCase())){
                scoreCount++;
            }else{
                wrongAnswers.add(qqq.qstn + "\n" + qqq.answer);
            }

            System.out.println("\n");

            j++;


        }

    }

}
