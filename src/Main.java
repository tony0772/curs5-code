public class Main {
    public static void main(String[] args) {

        System.out.println(countChar("testare", 't'));

        System.out.println(redact("word"));

        String[] names = {"George","Mihai","Ioana"};
        System.out.println(containsWord(names, "Mihai"));

        
    }


    private static boolean containsWord(String[] names, String toBeFound) {
        for (String name: names){
            if (name.equals(toBeFound)){
                return true;
            }
        }
        return false;
    }

    private static String redact(String request) {
        return request.replaceAll(".", "*");
    }

    private static int countChar(String entry, char foundChar) {
        int count = 0;
        for (int i=0; i< entry.length(); i++){
            if (entry.charAt(i) == foundChar){
                count++;
            }
        }
        return count;
    }
}