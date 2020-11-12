package cc.openhome;

import static java.lang.System.out;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.time.Period;
import java.lang.System;
public class MonthDemo {
    public static void main(String[] args) {
        for(Month month : Month.values()) {
            out.printf("original: %d\tvalue: %d\t%s%n", 
                    month.ordinal(), month.getValue(), month);
            
            
            
        }
        
        LocalDate ld = LocalDate.now();
        LocalDate ld1 =ld.plus(Period.ofDays(3));
        System.out.println(ld1);
        
        Month mm = ld.getMonth();
      //  out.println(mm.getDisplayName("MM", ));
        
    }
}
