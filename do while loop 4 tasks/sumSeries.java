public class sumSeries {
        public static void main(String[] args) { 
         double item = 1;
         double sum = 0;

          do {

                sum = sum+item ;
                 item = item-0.1;

                }  while(item>=0.1) ;
              
       System.out.println("Sum of the series ( 1+0.9+0.8+....+0.1) : "+sum);
        }
}