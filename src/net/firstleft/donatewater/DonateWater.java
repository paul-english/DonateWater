package net.firstleft.donatewater;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DonateWater extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Thank you! Your donation is greatly appreciated and will go a long way. If you would like to continue helping in any way feel free to contact paul@firstleft.net or visit http://firstleft.net/water")
               .setCancelable(false)
               .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                   }
               });
        AlertDialog alert = builder.create();
        
        alert.setTitle("Thank You!");
        alert.show();

    }
}