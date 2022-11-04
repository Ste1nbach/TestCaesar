public class Test {



    public static int CaesarCipher(int x){
        char word[] = {'A', 'H', 'O', 'J'};
        System.out.println(word);
        for(int i = 0; i < word.length; i++) {
            word [i] = (char) (word[i] + x);
            System.out.print(word[i]);
        }
        return x;
    }

    public static void main(String[] args) {

        double rd = Math.floor(Math.random()*27);
        int x = (int)(345 + 13 * (rd - 1)) % 27;

       CaesarCipher(x);
        System.out.println();
        System.out.println("Číslo se posunolo o "+ x);

    }
}
