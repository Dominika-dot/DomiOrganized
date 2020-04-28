package com.dominikawebsite.pluralsight;

import javax.net.ssl.HostnameVerifier;

public class OverInitializedClass {
    private int theField = 1;

    public int getTheField() {
        return theField;
    }
    {
        theField = 2; // mimo iz zainicjalizowalismy the field z 1, to teraz jest 2, bo to sie odpala zawsze
        //przy tworzeniu nowego obiektu
    }
    public OverInitializedClass()
    {theField=3;
    } // a tutaj jednak bedzie juz 3 (nadpisuje 1 i 2)
}

