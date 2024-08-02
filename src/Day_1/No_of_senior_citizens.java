package Day_1;

public class No_of_senior_citizens {
    public static void main(String[] args) {
        String []details={"7868190130M7522","5303914400F9211","9273338290F3010"};
        int count =0;
        for(String s : details){
            int x=s.charAt(11);
            if(x>'6'){
                count++;
            }
            else if(x=='6'){
                if (s.charAt(12)>'0'){
                    count++;
                }
            }
        }
        System.out.println("No of Senior Citizen : "+count);
    }
}
