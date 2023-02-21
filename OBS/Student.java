package OBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            c1.note=note1;
        }
        if(note2>=0 && note2<=100){
            c2.note=note2;
        }
        if(note3>=0 && note3<=100){
            c3.note=note3;
        }
    }
    void addSNote(int sNote1,int sNote2, int sNote3){
        if(sNote1>=0 && sNote1<=100){
            c1.sNote=sNote1;
        }
        if(sNote2>=0 && sNote2<=100){
            c2.sNote=sNote2;
        }
        if(sNote3>=0 && sNote3<=100){
            c3.sNote=sNote3;
        }
    }

    void setAvarage(){
        c1.result=(c1.note*c1.notePer)/100.0+(c1.sNote* c1.sNotePer)/100.0;
        c2.result=(c2.note*c2.notePer)/100.0+(c2.sNote* c2.sNotePer)/100.0;
        c3.result=(c3.note*c3.notePer)/100.0+(c3.sNote* c3.sNotePer)/100.0;
        this.avarage=(c1.result+ c2.result+c3.result)/3.00;
    }

    void isPass(){
        setAvarage();
        if(this.avarage>=55){
            System.out.println(avarage);
            System.out.println("Sinifi Gectiniz");
            this.isPass=true;
        }else{
            System.out.println(avarage);
            System.out.println("Sinifi Gecemediniz");
            this.isPass=false;
        }
    }

    void printNote(){
        setAvarage();
        System.out.println(c1.result);
        System.out.println(c2.result);
        System.out.println(c3.result);
    }
}
