package First_day_of_year;

import java.util.Scanner;

public class First_day {
    public static void main(String[] args) {
        int n, year,leap, non,days;
        int week;
        Scanner scan = new Scanner(System.in);
        int old = 2001;
        System.out.println("Enter Your Year : ");
        n = scan.nextInt();

        year = n-old;
        leap = year/4;
        non =year-leap;

        days = (leap*366+ non*365);
        week= (days) % 7;

        if (week==6){
            System.out.println("Your First day of year is Sunday");
        } else if (week==0) {
            System.out.println("Your First day of year is Monday");
        }else if (week==1) {
            System.out.println("Your First day of year is Tuesday");
        }else if (week==2) {
            System.out.println("Your First day of year is wednesday");
        }else if (week==3) {
            System.out.println("Your First day of year is Thursday");
        }else if (week==4) {
            System.out.println("Your First day of year is Friday");
        } else if (week==5 ) {
            System.out.println("Your First day of year is Saturday");
        }else {
            System.out.println("Please Enter proper Year");
        }





    }
}
