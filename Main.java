public class Main {
    public static void main(String[] args) {

        String str = "CONGRATULATIONS UPON WRITING A GOOD PROGRAM ";
        String[] strArray = str.split(" ");
        for (String temp: strArray){
            System.out.println(temp);
        }
        for(int i=0; i<4; i++){
            char[] D1 = strArray[i].toCharArray();
            for (int m = D1.length-1; m>=0; m--)
        {
         
            System.out.println(D1[m]);
        }
            System.out.println(" ");
        }
    }    }


