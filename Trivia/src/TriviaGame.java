import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Question[] questions = {
                new Question("Who is the 49rs quarterback", new String[]{"Joe", "Brock B", "Tim S", "Sam S"}, 1),
                new Question("Which planet is closest to the sun?", new String[]{"Earth", "Venus", "Mercury", "Mars"}, 2),
        };

        play(questions);
    }

    public static void play(Question[] questions) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            System.out.println("Question " + (i + 1) + ": " + question.getQuestion());
            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + i) + ". " + options[j]);
            }

            System.out.println("Enter your answer (1-" + options.length + "): ");
            int answer = scanner.nextInt() -1;

            if (question.isCorrectAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("You Final Score is: " + score + " out of " + questions.length);
    }
}
