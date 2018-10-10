public class djquiz2
{
public static void main(String[] args){
        for(int x=1880; x<=2018; x++){
            if((x%4==0 && (x%100!=0 || x%400==0))||(x%4==0 && x%100!=0 && x%400!=0)){
                System.out.println(x);
            }
        }
    }
}
