public class GradingSystem {

    public static void main(String[] args) {

        String studentName = "Arun";
        int maths = 85;
        int physics = 78;
        int computerScience = 92;

        int total = maths + physics + computerScience;
        double average = total / 3.0;

        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("===== STUDENT GRADING SYSTEM CI TEST =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Maths: " + maths);
        System.out.println("Physics: " + physics);
        System.out.println("Computer Science: " + computerScience);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
