package com.glority.utils.device;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import com.glority.utils.UtilsApp;
import com.glority.utils.device.ShellUtils;
import java.io.File;
import java.io.FileFilter;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class DeviceUtils {
    public static boolean isPhone() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getPhoneType() != 0;
    }

    public static String getDeviceId() {
        TelephonyManager telephonyManager = (TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        String imei = telephonyManager.getImei();
        if (!TextUtils.isEmpty(imei)) {
            return imei;
        }
        String meid = telephonyManager.getMeid();
        return TextUtils.isEmpty(meid) ? "" : meid;
    }

    public static String getSerial() {
        return Build.getSerial();
    }

    public static String getIMEI() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getImei();
    }

    public static String getMEID() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getMeid();
    }

    public static String getIMSI() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSubscriberId();
    }

    public static int getPhoneType() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getPhoneType();
    }

    public static boolean isSimCardReady() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimState() == 5;
    }

    public static String getSimOperatorName() {
        return ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperatorName();
    }

    public static String getSimOperatorByMnc() {
        String simOperator = ((TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
        if (simOperator == null) {
            return "";
        }
        simOperator.hashCode();
        char c = 65535;
        switch (simOperator.hashCode()) {
            case 49679470:
                if (simOperator.equals("46000")) {
                    c = 0;
                    break;
                }
                break;
            case 49679471:
                if (simOperator.equals("46001")) {
                    c = 1;
                    break;
                }
                break;
            case 49679472:
                if (simOperator.equals("46002")) {
                    c = 2;
                    break;
                }
                break;
            case 49679473:
                if (simOperator.equals("46003")) {
                    c = 3;
                    break;
                }
                break;
            case 49679475:
                if (simOperator.equals("46005")) {
                    c = 4;
                    break;
                }
                break;
            case 49679476:
                if (simOperator.equals("46006")) {
                    c = 5;
                    break;
                }
                break;
            case 49679477:
                if (simOperator.equals("46007")) {
                    c = 6;
                    break;
                }
                break;
            case 49679479:
                if (simOperator.equals("46009")) {
                    c = 7;
                    break;
                }
                break;
            case 49679502:
                if (simOperator.equals("46011")) {
                    c = '\b';
                    break;
                }
                break;
            case 49679532:
                if (simOperator.equals("46020")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 6:
            case '\t':
                return "中国移动";
            case 1:
            case 5:
            case 7:
                return "中国联通";
            case 3:
            case 4:
            case '\b':
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static String getPhoneStatus() {
        TelephonyManager telephonyManager = (TelephonyManager) UtilsApp.getApp().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        return (((((((((((((("DeviceId(IMEI) = " + telephonyManager.getDeviceId() + "\n") + "DeviceSoftwareVersion = " + telephonyManager.getDeviceSoftwareVersion() + "\n") + "Line1Number = " + telephonyManager.getLine1Number() + "\n") + "NetworkCountryIso = " + telephonyManager.getNetworkCountryIso() + "\n") + "NetworkOperator = " + telephonyManager.getNetworkOperator() + "\n") + "NetworkOperatorName = " + telephonyManager.getNetworkOperatorName() + "\n") + "NetworkType = " + telephonyManager.getNetworkType() + "\n") + "PhoneType = " + telephonyManager.getPhoneType() + "\n") + "SimCountryIso = " + telephonyManager.getSimCountryIso() + "\n") + "SimOperator = " + telephonyManager.getSimOperator() + "\n") + "SimOperatorName = " + telephonyManager.getSimOperatorName() + "\n") + "SimSerialNumber = " + telephonyManager.getSimSerialNumber() + "\n") + "SimState = " + telephonyManager.getSimState() + "\n") + "SubscriberId(IMSI) = " + telephonyManager.getSubscriberId() + "\n") + "VoiceMailNumber = " + telephonyManager.getVoiceMailNumber();
    }

    public static boolean isDeviceRooted() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            if (new File(strArr[i] + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAdbEnabled() {
        return Settings.Secure.getInt(UtilsApp.getApp().getContentResolver(), "adb_enabled", 0) > 0;
    }

    public static String getSDKVersionName() {
        return Build.VERSION.RELEASE;
    }

    public static int getSDKVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static Locale[] getAvailableLanguages() {
        return Locale.getAvailableLocales();
    }

    public static String getAndroidID() {
        String string = Settings.Secure.getString(UtilsApp.getApp().getContentResolver(), "android_id");
        return string == null ? "" : string;
    }

    public static String getMacAddress() {
        return getMacAddress(null);
    }

    public static String getMacAddress(String... strArr) {
        String macAddressByWifiInfo = getMacAddressByWifiInfo();
        if (isAddressNotInExcepts(macAddressByWifiInfo, strArr)) {
            return macAddressByWifiInfo;
        }
        String macAddressByNetworkInterface = getMacAddressByNetworkInterface();
        if (isAddressNotInExcepts(macAddressByNetworkInterface, strArr)) {
            return macAddressByNetworkInterface;
        }
        String macAddressByInetAddress = getMacAddressByInetAddress();
        if (isAddressNotInExcepts(macAddressByInetAddress, strArr)) {
            return macAddressByInetAddress;
        }
        String macAddressByFile = getMacAddressByFile();
        return isAddressNotInExcepts(macAddressByFile, strArr) ? macAddressByFile : "";
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        String str = Build.MODEL;
        return str != null ? str.trim().replaceAll("\\s*", "") : "";
    }

    public static String getRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getDisplay() {
        return Build.DISPLAY;
    }

    public static String getHardware() {
        return Build.HARDWARE;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getRadioVersion() {
        return Build.getRadioVersion();
    }

    public static String[] getABIs() {
        return Build.SUPPORTED_ABIS;
    }

    public static int getCpuNumber() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: com.glority.utils.device.DeviceUtils.1
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            }).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static int getPhoneWidth() {
        return ((WindowManager) UtilsApp.getApp().getSystemService("window")).getDefaultDisplay().getWidth();
    }

    public static int getPhoneHeight() {
        return ((WindowManager) UtilsApp.getApp().getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public static List<PackageInfo> getInstalledApp() {
        return UtilsApp.getApp().getPackageManager().getInstalledPackages(0);
    }

    public static List<PackageInfo> getUserInstalledApp() {
        List<PackageInfo> installedApp = getInstalledApp();
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : installedApp) {
            if ((packageInfo.applicationInfo.flags & 1) <= 0) {
                arrayList.add(packageInfo);
            }
        }
        installedApp.clear();
        return arrayList;
    }

    public static void shutdown() {
        ShellUtils.execCmd("reboot -p", true);
        Intent intent = new Intent("android.intent.action.ACTION_REQUEST_SHUTDOWN");
        intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
        UtilsApp.getApp().startActivity(intent.addFlags(268435456));
    }

    public static void reboot() {
        ShellUtils.execCmd("reboot", true);
        Intent intent = new Intent("android.intent.action.REBOOT");
        intent.putExtra("nowait", 1);
        intent.putExtra("interval", 1);
        intent.putExtra("window", 0);
        UtilsApp.getApp().sendBroadcast(intent);
    }

    public static void reboot(String str) {
        ((PowerManager) UtilsApp.getApp().getSystemService("power")).reboot(str);
    }

    public static void reboot2Recovery() {
        ShellUtils.execCmd("reboot recovery", true);
    }

    public static void reboot2Bootloader() {
        ShellUtils.execCmd("reboot bootloader", true);
    }

    private static boolean isAddressNotInExcepts(String str, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return !"02:00:00:00:00:00".equals(str);
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    private static String getMacAddressByWifiInfo() {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) UtilsApp.getApp().getSystemService("wifi");
            if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                return connectionInfo.getMacAddress();
            }
            return "02:00:00:00:00:00";
        } catch (Exception e) {
            e.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String getMacAddressByNetworkInterface() {
        byte[] hardwareAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null && nextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = nextElement.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b : hardwareAddress) {
                        sb.append(String.format("%02x:", Byte.valueOf(b)));
                    }
                    return sb.substring(0, sb.length() - 1);
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e) {
            e.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String getMacAddressByInetAddress() {
        NetworkInterface byInetAddress;
        byte[] hardwareAddress;
        try {
            InetAddress inetAddress = getInetAddress();
            if (inetAddress != null && (byInetAddress = NetworkInterface.getByInetAddress(inetAddress)) != null && (hardwareAddress = byInetAddress.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (byte b : hardwareAddress) {
                    sb.append(String.format("%02x:", Byte.valueOf(b)));
                }
                return sb.substring(0, sb.length() - 1);
            }
            return "02:00:00:00:00:00";
        } catch (Exception e) {
            e.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static InetAddress getInetAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && nextElement2.getHostAddress().indexOf(58) < 0) {
                            return nextElement2;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String getMacAddressByFile() {
        String str;
        String str2;
        ShellUtils.CommandResult execCmd = ShellUtils.execCmd("getprop wifi.interface", false);
        if (execCmd.result == 0 && (str = execCmd.successMsg) != null) {
            ShellUtils.CommandResult execCmd2 = ShellUtils.execCmd("cat /sys/class/net/" + str + "/address", false);
            return (execCmd2.result != 0 || (str2 = execCmd2.successMsg) == null || str2.length() <= 0) ? "02:00:00:00:00:00" : str2;
        }
        return "02:00:00:00:00:00";
    }

    private DeviceUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
