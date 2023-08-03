package class3;

public class E11Elseif {
    public static void main(String[] args) {

        String fruit="Orange";

        if(fruit.equals("Apple")){ /// .equals for variables String
            System.out.println("The price is 12$");
        }
        else if(fruit.equals("Mango")){
            System.out.println("The price is 2$");
        } else if(fruit.equals("Orange")){
            System.out.println("The price is 26$");
        } else if(fruit.equals("Banana")){
            System.out.println("The price is 3$");
        } else if(fruit.equals("Watermelon")){
            System.out.println("The price is 8$");

        }
        else{
            System.out.println("This Fruit  is not available right now");
        }
    }
}
