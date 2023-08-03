package class4;

public class E1NextedIf {
    public static void main(String[] args) {
        boolean winter=false;
        String jacketColor="blue";

        if(winter==true){
            System.out.println("Its very cold");

            if(jacketColor.equals("Red")){
                System.out.println("Lets go with Red Nike shoes");
            }
            else{
                System.out.println("Lets go with the blue ones");
            }

        } else{
            System.out.println("No need tot wear jackets");
        }
    }
}
