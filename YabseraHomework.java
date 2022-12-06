import java.util.Scanner;

public class YabseraHomework {
    public static void main(String[] args) {
        System.out.println("******************************************************************************");

        boolean criminal_record1 = false;
        boolean bank_saving1 = false;
        boolean good_salary1 = false;
        boolean social_score1 = false;

        System.out.println("Do you have criminal record? True/False");
        Scanner in = new Scanner(System.in);
        boolean criminal_rec_result = in.nextBoolean();
        System.out.println("Enter bank saving: (Number) ");
        int bank_saving_receive = in.nextInt();
        int perYearBank = bank_saving_receive * 12;
        System.out.println("Enter salary in a month. (number only): ");
        int good_salary_result = in.nextInt();
        int perYearSalary = good_salary_result * 12;
        System.out.println("Number of fault in Month: (number b/n 1-10)");
        int sociaScore = in.nextInt();
        int numberFalt = sociaScore * 12;

        String he = !criminal_rec_result && (perYearBank> 5_000_000 )&& (perYearSalary > 70_000) && (numberFalt<55)?"Congratulation! You are able to travel.":"You cann't be able to travel.";
        System.out.println("Your Result : " +he);
        System.out.println("Your inputs = \n - "+criminal_rec_result +" \n - " + bank_saving_receive +" \n - " + good_salary_result+" \n - " + sociaScore +" \n - ");

    }
}
