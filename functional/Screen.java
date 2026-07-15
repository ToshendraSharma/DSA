package functional;

public class Screen {
         Display d= () -> System.out.println("bolu");
         public void show(){
            d.show();
         }
         add s=(int a,int b)->System.out.println(a+b);
         public void add(int a,int b){
             s.sum(a,b);
         }
}