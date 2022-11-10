package day25.obs;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public int[] grades;

    public void showInfo(){
        System.out.printf("%s %s [ %5.2f ]",firstName,lastName,getGPA());
    }

    public double getGPA(){
        double sum=0;
        for (int i = 0; i < grades.length; i++) {
            sum+=grades[i];
        }
        double avg=sum/ grades.length;

        return avg;
    }


    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();

        st1.firstName="Ahmet";
        st1.lastName="Memiş";
        st1.age=17;
        st1.grades=new int[]{70,80};

        st2.firstName="Şengül";
        st2.lastName="Derin";
        st2.age=15;
        st2.grades=new int[]{82,76};


        if(st1.getGPA()> st2.getGPA()){
            st1.showInfo();
        }else {
            st2.showInfo();
        }
    }



}
