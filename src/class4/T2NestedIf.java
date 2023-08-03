package class4;

public class T2NestedIf {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpa=3.5;
        if(diploma==true){
            System.out.println("Congratulation!");
            if(gpa>=3.5){
                System.out.println("You are eligible for scholarship");
            } else if (gpa<3.5) {
                System.out.println("You should have studied harder");

            }
        }
        else{
            System.out.println("You should get a degree");
        }
    }
}
