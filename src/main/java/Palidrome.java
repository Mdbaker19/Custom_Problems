public class Palidrome {

    public Palidrome (){}

    public boolean containsPalindrome(String input){
        for(int i = 0; i < input.length(); i++){
            StringBuilder compare = new StringBuilder();

            for(int j = i; j < input.length(); j++){
                compare.append(input.charAt(j));

                if(reverse(compare.toString()).equals(compare.toString()) && compare.toString().length() > 2){
                    System.out.println(compare.toString());
                    return true;
                }
            }
        }
        return false;
    }

    public String reverse(String input){
        StringBuilder r = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            r.append(input.charAt(i));
        }

        return r.toString();
    }

}
