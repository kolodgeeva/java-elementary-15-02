package com.company.lesson8;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaDate {

    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();
        System.out.println(date);

        Thread.sleep(2000);

        Date date1 = new Date();
        System.out.println(date1);

        System.out.println(date.before(date1));

        Calendar calendar = new GregorianCalendar(2019, 11 , 07);

        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, -2);//чтобы отнять значение - в метод нужно передать отрицательное число
        System.out.println(calendar.getTime());

        calendar.roll(Calendar.MONTH, 4);
        System.out.println(calendar.getTime());



    }


}
