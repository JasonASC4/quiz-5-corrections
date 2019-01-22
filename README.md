# quiz-5-corrections

Question 2: Consider the following constructor method in the Person class.

public class Person {

    private int age;
    private String name;
    public Person(int age, String name) {
        // TODO
    }
}

Coorect answer: this.age = age; this.name = name; 

This is the correct answer as it sets the local variables equal to theere instance variables.

Question 3: From a classification perspective, a setter method is a(n)...?

Correct answer: mutator

This is the correct answer because a mutator is used to set a value of a private field based on what was received as the parameter; a static method is called without creating an object of a class and is shared among all objects created from the class.

Question 4: Consider the following partially implemented class.
public class Quiz {
    private static int id = 1;
    private int questionCount;
    public Quiz(int questionCount) {
        this.questionCount = questionCount;
    }
    public int getId() {
        return id;
    }
    public void incrementId() {
        id++;
    }
    public int getQuestionCount() {
        return questionCount;
    }
}
Now, consider the following usage of the aforementioned class.

Quiz q1 = new Quiz(10);
Quiz q2 = new Quiz(15);
q2.incrementId();

System.out.println(q1.getId());
System.out.println(q2.getId());
System.out.println(q1.getQuestionCount());
System.out.println(q2.getQuestionCount());
What will be printed to the console?

Correct answer: 2 2 10 15

This is the correct answer because 2 will be printed first instead of 1 because although q1 and q2 have different values initialized for questionCount, when q2 is incremented, q1 will be incremented as well because int id for both variables equals 1.

Question 5: Consider the following partial class definition.
public class Quiz {
    private int numberOfQuestions;
    private String instructionalUnit;
    public Quiz() {
    }
}
numberOfQuestions and instructionalUnit are examples of...?

Correct answer:  instance variables 

This is the correct answer because an instance variables are used by objects to store values.
