package com.glority.utils.device;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.glority.utils.UtilsApp;
import com.glority.utils.device.ShellUtils;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class NetworkUtils {

    /* loaded from: classes9.dex */
    public enum NetworkType {
        NETWORK_ETHERNET,
        NETWORK_WIFI,
        NETWORK_5G,
        NETWORK_4G,
        NETWORK_3G,
        NETWORK_2G,
        NETWORK_UNKNOWN,
        NETWORK_NO
    }

    public static void openWirelessSettings() {
        Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
        intent.setFlags(268435456);
        UtilsApp.getApp().startActivity(intent);
    }

    public static boolean isConnected() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isAvailableByPing() {
        return isAvailableByPing(null);
    }

    public static boolean isAvailableByPing(String str) {
        if (str == null || str.length() <= 0) {
            str = "223.5.5.5";
        }
        ShellUtils.CommandResult execCmd = ShellUtils.execCmd(String.format("ping -c 1 %s", str), false);
        boolean z = execCmd.result == 0;
        if (execCmd.errorMsg != null) {
            Log.d("NetworkUtils", "isAvailableByPing() called" + execCmd.errorMsg);
        }
        if (execCmd.successMsg != null) {
            Log.d("NetworkUtils", "isAvailableByPing() called" + execCmd.successMsg);
        }
        return z;
    }

    public static boolean isMobileDataEnabled() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                return false;
            }
            return telephonyManager.isDataEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setMobileDataEnabled(boolean z) {
        Method declaredMethod;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null || (declaredMethod = telephonyManager.getClass().getDeclaredMethod("setDataEnabled", Boolean.TYPE)) == null) {
                return;
            }
            declaredMethod.invoke(telephonyManager, Boolean.valueOf(z));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isMobileData() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getType() == 0;
    }

    public static boolean is4G() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.getSubtype() == 13;
    }

    public static boolean isWifiEnabled() {
        WifiManager wifiManager = (WifiManager) UtilsApp.getApp().getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    public static void setWifiEnabled(boolean z) {
        WifiManager wifiManager = (WifiManager) UtilsApp.getApp().getSystemService("wifi");
        if (wifiManager == null || z == wifiManager.isWifiEnabled()) {
            return;
        }
        wifiManager.setWifiEnabled(z);
    }

    public static boolean isWifiConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) UtilsApp.getApp().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public static boolean isWifiAvailable() {
        return isWifiEnabled() && isAvailableByPing();
    }

    public static String getNetworkOperatorName() {
        TelephonyManager telephonyManager = (TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperatorName();
    }

    public static NetworkType getNetworkType() {
        NetworkType networkType = NetworkType.NETWORK_NO;
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return networkType;
        }
        if (activeNetworkInfo.getType() == 9) {
            return NetworkType.NETWORK_ETHERNET;
        }
        if (activeNetworkInfo.getType() == 1) {
            return NetworkType.NETWORK_WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkType.NETWORK_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkType.NETWORK_3G;
                case 13:
                case 18:
                    return NetworkType.NETWORK_4G;
                case 19:
                default:
                    String subtypeName = activeNetworkInfo.getSubtypeName();
                    if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                        return NetworkType.NETWORK_3G;
                    }
                    return NetworkType.NETWORK_UNKNOWN;
                case 20:
                    return NetworkType.NETWORK_5G;
            }
        }
        return NetworkType.NETWORK_UNKNOWN;
    }

    private static NetworkInfo getActiveNetworkInfo() {
        ConnectivityManager connectivityManager = (ConnectivityManager) UtilsApp.getApp().getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    private NetworkUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
