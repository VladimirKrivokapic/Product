import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//    U programskom jeziku Java.
//    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
//- Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
//            - Ocene treba da budu 5,6,7 i 9.
//            - Kreirati dve liste.
//- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
//            - Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
//- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
//            - Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.

public class Main {

    public static void main(String[] args) {

        List<Student> allstudents = new ArrayList<>();
        List<Student> passedStudents = new ArrayList<>();

        while (true) {

            System.out.println("Unesite ime studenta ili quit da izadjete");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Unesite prezime studenta");
            Scanner scanner1 = new Scanner(System.in);
            String lastname = scanner1.nextLine();
            if (lastname.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("Unesite ocenu studenta : ");
            Scanner scanner2 = new Scanner(System.in);
            int grade = scanner.nextInt();
            while (grade < 5 || grade > 10){
                System.out.println("Nevalidan unos ocene, molim vas unesite ocene izmedju 5 i 10");
                grade = scanner.nextInt();
            }

            Student student = new Student(name, lastname, grade);
            allstudents.add(student);

            if (grade > 5) {
                passedStudents.add(student);
            }
        }
        System.out.println("\nAll students");
        for (Student student : allstudents) {
            System.out.println("Svi studenti su:"+ student);
        }
        System.out.println("\n Passed students: ");
        for (Student student : passedStudents) {
            System.out.println("Studenti koji su polozili su : " + student);
        }
    }
}
