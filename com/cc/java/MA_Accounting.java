package com.cc.java;

public class MA_Accounting extends Mitarbeiter {

    public MA_Accounting(String familyName, String firstName, int birthYear,
            String workID, String department, String role, int hiredYear) {
        super(familyName, firstName, birthYear, workID, department, role, hiredYear);

    }

    @Override
    protected String doYourJob() {
        return "Tax returns calculated by " + getFirstName() + ".";
    }
}
