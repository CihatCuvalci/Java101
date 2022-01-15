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
