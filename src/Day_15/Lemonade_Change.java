package Day_15;

public class Lemonade_Change {
    public static void main(String[] args) {
        Lemonade_Change change=new Lemonade_Change();
        int [] bills={5,5,5,10,20};
        System.out.println(change.lemonadeChange(bills));
    }
    public boolean lemonadeChange(int[] bills) {
        int a,b,c;
        a=0;
        b=0;
        c=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                a++;
            }
            if(bills[i]==10){
                b++;
                if(a>0){
                    a--;
                }
                else{
                    return false;
                }
            }
            if(bills[i]==20){
                c++;
                if(a<=0){
                    return false;
                }
                if(b<=0){
                    if(a>=3){
                        a=a-3;
                    }
                    else{
                        return false;
                    }
                }
                if(b>0){
                    a--;
                    b--;
                }
            }
        }
        return true;
    }
}
