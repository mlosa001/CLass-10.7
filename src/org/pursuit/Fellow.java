package org.pursuit;

public class Fellow {
    private String name;//field of name
    private char grade;
    private double cohort;

    Fellow() {
    }//default needs to b instantiated

    Fellow(String name, char grade, double cohort) {//parametr
        this.name = name;//so java doesnt get confused this means that for instance of fellow will use these parameters to assign it a val.
        //references the field //pass the values from the parameter to the field on the right, on the left extending the parameters
        //setters allow to set after object is created
        this.grade = grade;//references the parametr
        this.cohort = cohort; //this references the fields in the class not the parameters


        //sets fields at moment of instantiation
        //
        //

    }
        //getters get info
        public String getName () {
            return this().name;
        }

        public char getGrade () {
            return this().grade;
        }
        public double getCohort () {
            return this().cohort;
        }

        //setterdont return

        public void setName (String name){
            this.name = name;
        }
        public void setGrade ( int grade){
            this.cohort = grade;
        }
        public void setCohort ( double cohort){
            this.cohort = cohort;
        }
    }
