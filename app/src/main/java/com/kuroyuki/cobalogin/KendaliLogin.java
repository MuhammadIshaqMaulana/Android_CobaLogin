package com.kuroyuki.cobalogin;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class KendaliLogin {
    private SharedPreferences SP;
    private SharedPreferences.Editor SPE;

    public void setPref(Context ctx, String key, String value){
        SP = PreferenceManager.getDefaultSharedPreferences(ctx);
        SPE = SP.edit();
        SPE.putString(key, value);
        SPE.commit();
    }

    public String getPref(Context ctx, String key){
        SP = PreferenceManager.getDefaultSharedPreferences(ctx);
        return SP.getString(key, null);
    }

    public boolean isLogin(Context ctx, String key){
        if(this.getPref(ctx,key)!= null){
            return true;
        }
        else {
            return false;
        }
    }
}
