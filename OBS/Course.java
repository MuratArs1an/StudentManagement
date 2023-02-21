package OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sNote;
    int sNotePer;
    int notePer;
    double result;
    Course(String name, String code, String prefix, int notePer, int sNotePer){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.sNote=0;
        this.notePer=notePer;
        this.sNotePer=sNotePer;
        this.result=0;
    }

    void printTeacherInfo(){
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("Girilen Ogretmen Bu Derse Uygun Degil");
        }


    }

}
