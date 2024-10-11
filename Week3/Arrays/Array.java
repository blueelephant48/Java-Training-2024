package Week3.Arrays;

public class Array {
    public static void main(String[] args){
        String[] stuff = {"Software", "Tomiko Itooka", "Up-A-Creek Robotics", "Destination: Deep Space" };

        // System.out.println(stuff[3]);
        // System.out.println(stuff[2]);
        // System.out.println(stuff[1]);
        // System.out.println(stuff[0]);
        // The thing below this is better.
        
        for (int index = 0; index < stuff.length; index++) {
            System.out.println(stuff[stuff.length-index-1]);
        }
    }
}