package OBS;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno){
        this.name=name;
        this.branch=branch;
        this.mpno=mpno;
    }

    void print(){
        System.out.println("Adi : "+ this.name);
        System.out.println("Bolumu : "+ this.branch);
        System.out.println("Tel NO: "+ this.mpno);
    }
}
