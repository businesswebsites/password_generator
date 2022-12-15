import java.util.Random;

public class MyMain {
    public static void main(String[] args){
        String new_password = "";
        String[] password = new String[8];
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz!§$%&/()=?_ßäöü+#-,.;:".toCharArray();
        char[]alphabet_uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(int i = 0; i < password.length; i++){
            Random randomNum = new Random();
            int showMe = randomNum.nextInt(2);
            int alphabet_number = randomNum.nextInt(alphabet.length);
            int alphabet_number_uppercase = randomNum.nextInt(alphabet_uppercase.length);
            double random_number = Math.random()*10;
            float random_numbers = Math.round(random_number);
            Integer number = (int)random_numbers;
            int new_random = randomNum.nextInt(2);
            if(showMe==1){
                if(new_random==1){
                    password[i] = Character.toString(alphabet_uppercase[alphabet_number_uppercase]);
                }else{
                    password[i] = Character.toString(alphabet[alphabet_number]);
                }
                
            }else{
                password[i] = number.toString();
            }
        }
        for(int j = 0; j < password.length; j++){
            new_password = new_password + password[j];
        }
        System.out.print(new_password);
    }
}
