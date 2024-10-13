public class Main {
    public static void main(String[] args) {

        // A for loop that is generating objects until 5 have been made.
        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("234512" + i,
                            switch (i) {
                        case 1 -> "Luke";
                        case 2 -> "Rachel";
                        case 3 -> "Mike";
                        case 4 -> "Alex";
                        case 5 -> "Sarah";
                        default -> "Roger";
                    },

                    "9/07/1999",
                     "Java Masterclass");
            System.out.println(s);
        }

        // Creating a new instance with a POJO/ java bean
        Student pojoStudent = new Student("R39585", "Chris",
                "9/07/1999", "Java Masterclass");

        // Creating a new instance with the record
        LPAStudent recordStudent = new LPAStudent("R39586", "Tony",
                "09/07/1999", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        // Setting data on both the POJO & record. The POJO's data is mutable while the
        // records data is IMMUTABLE
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        // recordStudent.setClassList(recordStudent.classList() + ", Java COP Exam 829");
        // The record does not have a setter at all! There's no way to set any information
        // to a record other than passing the value in on the record header or through
        // the use of constructors.


        // using accessor methods to get information from the POJO (java bean) & the record.
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());


    }

}
