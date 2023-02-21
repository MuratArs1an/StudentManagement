package OBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Murat Hoca", "TRH", "123141423");
        Teacher t2=new Teacher("Busra Hoca","FZK","98676");
        Teacher t3=new Teacher("Ahmet Hoca","BIYO","324234" );


        Course tarih=new Course("Tarih","101","TRH",70,30);
        Course fizik=new Course("Fizik","102","FZK",80,20);
        Course biyo=new Course("Biyoloji","103", "BIYO",60,40);

        Student s1=new Student("Mert","01","10/A",tarih,fizik,biyo);
        s1.addBulkExamNote(80,70,65);
        s1.addSNote(70,60,45);
        s1.printNote();
        s1.isPass();


        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);
    }
}
