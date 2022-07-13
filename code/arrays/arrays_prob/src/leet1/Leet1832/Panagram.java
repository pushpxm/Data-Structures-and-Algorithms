package leet1.Leet1832;

public class Panagram {
    public static <string> void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence){
        {
            for (char i = 'a'; i <= 'z'; i++) {
                if (!sentence.contains(String.valueOf(i))) {
                    return false;
                }
            }
            return true;
        }
    }

}


