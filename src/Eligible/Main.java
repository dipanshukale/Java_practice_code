package Eligible;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int age; String name;

        try{
           Scanner scan = new Scanner(System.in);
            System.out.println("Enter Your age : ");
            age = scan.nextInt();
            if (age<=18 || age >80){

                throw new Invalid_age_exception();



            }else {
                System.out.println("Enter Your Name : ");
                name = scan.next();


                if (!(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')){
                    throw new Invalid_name_exception();
                }
                else {
                    for (int i = 0; i < name.length(); i++) {

                        if (!((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') ||
                                (name.charAt(i) >= 'a' && name.charAt(i) <= 'z'))){
                            throw new Invalid_name_exception();
                        }
                    }
                    System.out.println("your Valid Name is "+name+ " & Age is "+age);
                }

            }




        } catch (Invalid_age_exception e) {
            System.out.println(e.getMessage());
        }
        catch (Invalid_name_exception e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Please Enter Valid Age Number");
        }
        catch(Exception e){
            System.out.println("Invalid status");
        }








    }
}
