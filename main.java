public class Main {
    public static void main(String[] args) {

        String str = "CONGRATULATIONS UPON WRITING A GOOD PROGRAM ";
        String[] strArray = str.split(" ");
        for (String temp: strArray){
            System.out.println(temp);
        }
        for(int K=0; K<4; K++){
            char[] D1 = strArray[K].toCharArray();
            for (int N = D1.length-1; N>=0; N--)
        {
            System.out.print(D1[N]);
        }
            System.out.print(" ");
        }
    }    }


