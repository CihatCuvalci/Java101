public class J4Main {
    public static void main(String[] args) {
        J4Teacher t1 = new J4Teacher("Mahmut Hoca","000","TRH");
        J4Teacher t2 = new J4Teacher("Graham Bell","111","FZK");
        J4Teacher t3 = new J4Teacher("Külyutmaz","222","BIO");

        J4Course tarih = new J4Course("Tarih", "101","TRH");
        tarih.addTeacher(t1);

        J4Course fizik = new J4Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        J4Course biyo = new J4Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        J4Student s1 = new J4Student("İnek Şaban" , "123" , "4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,0,50);

        J4Student s2 = new J4Student("Güdük Necmi" , "124" , "4",tarih,fizik,biyo);
        s1.addBulkExamNote(50,30,70);
    }
}
-----------------------------------------------------------------------------------------------------------------------------
public class J4Student {
    J4Course c1;
    J4Course c2;
    J4Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    J4Student(String name, String stuNo, String classes, J4Course c1, J4Course c2, J4Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1,int note2,int note3){
        System.out.println("Öğrenci \t\t: " + this.name);
        if(note1 >= 0 && note1 <=100){
            this.c1.note = note1;
        } else {
            System.out.println(c1.note+" Hatalı bir değerdir !");
        }

        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        } else {
            System.out.println(note2 + " Hatalı bir değerdir !");
        }

        if(note3 >= 0 && note3 <=100){
            this.c3.note = note3;
        } else {
            System.out.println(c3.note + " Hatalı bir değerdir !");
        }

        printNote();
        isPass();
        System.out.println("=========================================================");
    }

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note)/3.0;
        if(this.avarage > 55){
            System.out.println("Hababam Sınıfı Uyanıyor !");
            this.isPass = true;
        } else {
            System.out.println("Hababam Sınıfı Sınıfta Kaldı !");
        }
    }

    void printNote(){
        System.out.println(this.c1.name + " Notu\t\t: "+ this.c1.note);
        System.out.println(this.c2.name + " Notu\t\t: "+ this.c2.note);
        System.out.println(this.c3.name + " Notu\t: "+ this.c3.note);
        System.out.println("Ortalamanız \t: " + this.avarage);
    }
}
-----------------------------------------------------------------------------------------------------------------------------
public class J4Course {
    J4Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    J4Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(J4Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else{
            System.out.println("Bu Öğretmen Bu Derse Atanamaz !");;
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
-----------------------------------------------------------------------------------------------------------------------------
public class J4Teacher {
    String name;
    String mpno;
    String branch;

    J4Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı \t\t: " + this.name);
        System.out.println("Telefonu \t: " + this.mpno);
        System.out.println("Bölümü \t\t: " + this.branch);
    }
}
