package ires.corso.partTwo.collections.corsi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class testCorso {

    private final static Map<Course, Map> data = new HashMap<>();

    public static void main(String[] args) {

        Course c1 = new Course("Mat", "Corso di Matematica di base", "Matematica");
        data.put(c1, new HashMap<Assignment, Map>());

        aggiungAssignment(c1, new Assignment("Esame 1", "Basi di Matematica"));
        aggiungAssignment(c1, new Assignment("Esame 2", "Trigonometria"));
        aggiungAssignment(c1, new Assignment("Esame finale", "Esame finale"));

        Course c2 = new Course("Java", "Corso di programmazione", "Informatica");
        data.put(c2, new HashMap<Assignment, Map>());
        aggiungAssignment(c2, new Assignment("Esame iniziale", "Basi del linguaggio"));
        aggiungAssignment(c2, new Assignment("Esame finale", "Esame pratico"));

        Course c3 = new Course("Basi", "Corso di basi di Dati", "Analisi dati");
        data.put(c3, new HashMap<Assignment, Map>());
        aggiungAssignment(c3, new Assignment("Esame generale", "Sql"));
        aggiungAssignment(c3, new Assignment("Esame specifico", "Entità-Relazione "));

        studentiConVoto();
        mediaCorso();
        mediaAssignment();


    }

    private static void aggiungAssignment(Course course, Assignment assignment) {
        Map<Assignment, Map> assignments = data.get(course);
        assignments.put(assignment, new HashMap<Student, Integer>());
    }

    private static void studentiConVoto() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alessandro", "Gondolo", "432"));
        students.add(new Student("Federico", "Chiesa", "110919"));
        students.add(new Student("Matteo", "Pessina", "5321"));

        for (Course course : data.keySet()) {
            Map<Assignment, Map> assignments = data.get(course);

            for (Assignment assignment : assignments.keySet()) {
                Map<Student, Integer> scores = assignments.get(assignment);

                for (Student student : students) {
                    int voto = randInt();
                    scores.put(student, voto);
                }
            }
        }
    }

    private static void mediaCorso() {
        for (Course course : data.keySet()) {
            Map<Assignment, Map> assignments = data.get(course);
            HashMap<Student, Double> votiStudenti = new HashMap<>();

            for (Map<Student, Integer> voti : assignments.values()) {
                for (Student student : voti.keySet()) {
                    double current_score;
                    if (votiStudenti.containsKey(student))
                        current_score = (votiStudenti.get(student) + voti.get(student)) / 2.0;
                    else
                        current_score = voti.get(student);
                    votiStudenti.put(student, current_score);
                }
            }

            for (Student student : votiStudenti.keySet())
                System.out.printf("Lo studente %s %s ha ottenuto una media di: %f nel corso %s.\n", student.getCognome(), student.getNome(), votiStudenti.get(student), course.getTitolo());
        }
        System.out.println();
    }

    private static void mediaAssignment() {
        for (Course course : data.keySet()) {
            Map<Assignment, Map> assignments = data.get(course);

            for (Assignment assignment : assignments.keySet()) {
                Map<Student, Integer> voti = assignments.get(assignment);
                double media = 0.0;
                for (Integer i : voti.values())
                    media += i;
                media /= voti.size();

                System.out.printf("La media dei voti nell'assignment %s del corso %s è stata di %f.\n", assignment.getTitolo(), course.getTitolo(), media);
            }
        }
    }

    public static int randInt() {

        Random rn = new Random();
        int voto = rn.nextInt(10) + 1;

        return voto;

    }
}


