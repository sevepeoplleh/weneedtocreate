package class4;

public class T4NestedIf {
    public static void main(String[] args) {
        int age=18;
        int weight=120;

        if(age>=18){
            System.out.println("You are age eligibility");
            if(weight>110){
                System.out.println("You are able to donate");
                }
            else if(weight<110){
                System.out.println("You arent have enough weight");
            }
        }
        else{
            System.out.println("You arent able to donate");
        }

    }
}
