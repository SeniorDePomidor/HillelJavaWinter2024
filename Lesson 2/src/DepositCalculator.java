/*Calculation of deposit. Compound interest.
Capitalization on the end of every month.
Disbursement is being payed on the day of the month when deposit has been started. */

import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;

public class DepositCalculator {
    public static void main(String[] args) {
        double deposit = Double.parseDouble(args[0]);
        double percent = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
        LocalDate depositDate = LocalDate.now();
        LocalDate endDate = depositDate.plusYears(years);
        for (LocalDate currentDate = depositDate; !currentDate.isAfter(endDate); currentDate = currentDate.plusMonths(1)) {
            LocalDate nextDate = currentDate.plusMonths(1);
            double period = DAYS.between(currentDate, nextDate);
            deposit += deposit * ((percent / 100.0) * (period / getDevider(currentDate)));
            if (nextDate.isAfter(endDate)) {
                System.out.print("Deposit for\t" + currentDate + "\t");
                System.out.printf("%.2f", deposit);
                System.out.println();
            } else {
                if ((nextDate.getMonth() == Month.JANUARY)) {
                    System.out.print("Deposit for\t" + nextDate + "\t");
                    System.out.printf("%.2f", deposit);
                    System.out.println();
                }
            }
        }
    }
        static int getDevider(LocalDate date){
        if(date.isLeapYear()){
            return 366;
            }
            else{
                return 355;
            }
        }
}

