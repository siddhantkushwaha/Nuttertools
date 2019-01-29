package com.siddhantkushwaha.nuttertools;

import java.util.Date;

/*
    This class was created to test/verify the functionality of other classes created.
*/

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println(JodaTimeUtil.getJodaDateTime(date));
    }
}
