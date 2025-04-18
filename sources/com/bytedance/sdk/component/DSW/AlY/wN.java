package com.bytedance.sdk.component.DSW.AlY;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* loaded from: classes.dex */
public class wN {
    public static boolean YFl(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
                for (NetworkInfo networkInfo : allNetworkInfo) {
                    if (networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        } catch (Throwable th2) {
            Log.e("ignored", th2.toString());
        }
        return false;
    }
}
