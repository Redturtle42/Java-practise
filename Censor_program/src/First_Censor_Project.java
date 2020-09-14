public class First_Censor_Project {
    public static void main(String[] args){
        String result = censor ( "The dog is a cute animal.", "dog", "hedgehog");
        System.out.println(result);
    }
    static String censor(String text, String toChange, String newWord){
        if(text.contains(toChange)) {
            text = text.replaceAll(toChange, newWord);
        }
        return text;
    }
}