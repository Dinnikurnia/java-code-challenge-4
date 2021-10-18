public class DinniJava4{

    // method atau function
    public static void main(String[] args){
        dataDiri ("Dinni, " , 20);
        jenjangPendidikan ("UII, " , "Manajemen, " , 5);
        cekUmur (20);
        cekNilai (91);
    }

    static void dataDiri(String Nama, int Umur){
        System.out.println("nama :" + Nama + "umur :" + Umur);
    }

    static void jenjangPendidikan(String Kampus, String Jurusan, int Semester){
        System.out.println("Kampus :" + Kampus + "Jurusan: " + Jurusan + "Semester :" + Semester);
    }

    // cek umur 
    static void cekUmur(int umur) {
        if (umur < 25) {
            System.out.println("Umur memenuhi syarat");
        } else {
            System.out.println("Umur tidak memenuhi syarat");
        }
    }

    // cek nilai
    // Keterangan: (E= 0-20) (D= 21-40) (C= 41-60) (B= 61-80) (A= 81-100)
    static void cekNilai(int score){
        if(score >= 0 && score <= 20){
            System.out.println("Kamu mendapat nilai E");
        }else if(score >= 21 && score <= 40){
            System.out.println("Kamu mendapat niali D");
        }else if (score >= 41 && score <= 60){
            System.out.println("Kamu mendapat niali C");
        }else if (score >= 61 && score <= 80){
            System.out.println("Kamu mendapat niali B");
        }else if (score >= 81 && score <= 100){
            System.out.println("Kamu mendapat niali A");
        }else if (score >=100){
            System.out.println("You enter the invalid score");
        }
    }
}