package class4;

import java.sql.SQLOutput;

public class E2NestedIf {
    public static void main(String[] args) {
        double accountBalance=30000;

        if(accountBalance>28000){
            System.out.println("WE can afford a normal toyota");

            if(accountBalance>40000){
            System.out.println("We can afford Luxury car as well");}
        }

        else{
            System.out.println("We need to save more");
        }

    }
}
