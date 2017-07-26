package com.batchmates.android.databinding;

import android.util.Log;
import android.view.View;

/**
 * Created by Android on 7/25/2017.
 */

public class ViewModel {

    private static final String TAG = "ViewModel";

    public void herpDerp(View view)
    {
        Log.d(TAG, "herpDerp: DerpaHerp");
    }


    public void personSOmething(View view,Person person)
    {
        Log.d(TAG, "personSOmething: "+person.getFirstName()+" "+person.getLastName());
    }



    public void updatePerson(View view, Person person)
    {
        Log.d(TAG, "updatePerson: "+person.getFname().get()+" "+person.getLname().get());
    }
}
