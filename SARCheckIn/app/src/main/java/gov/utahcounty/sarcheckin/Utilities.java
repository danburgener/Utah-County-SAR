package gov.utahcounty.sarcheckin;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dan on 12/17/2017.
 */

public class Utilities {
    private static final String PREFERENCES_FILE  = "preferences";
    public enum Preference{
        GOTENNA_SET
    }
    public static String readSharedSetting(Context ctx, Preference preference, String defaultValue){
        SharedPreferences sharedPref = ctx.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
        return  sharedPref.getString(preference.toString(), defaultValue);
    }
    public static void saveSharedSetting(Context ctx, Preference preference, String settingValue){
        SharedPreferences sharedPref = ctx.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(preference.toString(), settingValue);
        editor.apply();
    }
}
