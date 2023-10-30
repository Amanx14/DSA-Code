public class Substring {
    public static void generate(String word, int idx) {
        if (idx > word.length()) {
            System.out.println(word);
            return;
        }

        System.out.println(word);

        generate(word.substring(0, word.length()-1), idx+1); 
        generate(word.substring(1, word.length()), idx+1); 
    }
    public static void main(String[] args) {
        generate("abcd" , 0);
    }

    

}