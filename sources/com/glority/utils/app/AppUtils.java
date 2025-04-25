package com.glority.utils.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.glority.utils.UtilsApp;
import com.glority.utils.data.EncryptUtils;
import com.glority.utils.data.StringUtils;
import com.glority.utils.device.ShellUtils;
import java.io.File;

/* loaded from: classes9.dex */
public final class AppUtils {
    public static boolean isJellyBeanMR1() {
        return true;
    }

    public static boolean isJellyBeanMR2() {
        return true;
    }

    public static boolean isKitKat() {
        return true;
    }

    public static boolean isLollipop() {
        return true;
    }

    public static boolean isMarshmallow() {
        return true;
    }

    public static boolean isInstall(String str) {
        try {
            UtilsApp.getApp().getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isAppRoot() {
        ShellUtils.CommandResult execCmd = ShellUtils.execCmd("echo root", true);
        if (execCmd.result == 0) {
            return true;
        }
        if (execCmd.errorMsg == null) {
            return false;
        }
        Log.d("AppUtils", "isAppRoot() called" + execCmd.errorMsg);
        return false;
    }

    public static boolean isAppDebug() {
        return isAppDebug(UtilsApp.getApp().getPackageName());
    }

    public static boolean isAppDebug(String str) {
        if (StringUtils.isSpace(str)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return (applicationInfo.flags & 2) != 0;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isAppSystem() {
        return isAppSystem(UtilsApp.getApp().getPackageName());
    }

    public static boolean isAppSystem(String str) {
        if (StringUtils.isSpace(str)) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return (applicationInfo.flags & 1) != 0;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Drawable getAppIcon() {
        return getAppIcon(UtilsApp.getApp().getPackageName());
    }

    public static Drawable getAppIcon(String str) {
        if (StringUtils.isSpace(str)) {
            return null;
        }
        try {
            PackageManager packageManager = UtilsApp.getApp().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getPackageName() {
        return UtilsApp.getApp().getPackageName();
    }

    public static String getAppName() {
        return getAppName(UtilsApp.getApp().getPackageName());
    }

    public static String getAppName(String str) {
        if (StringUtils.isSpace(str)) {
            return "";
        }
        try {
            PackageManager packageManager = UtilsApp.getApp().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int getAppUid() {
        return getAppUid(UtilsApp.getApp().getPackageName());
    }

    public static int getAppUid(String str) {
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null || packageInfo.applicationInfo == null) {
                return 0;
            }
            return packageInfo.applicationInfo.uid;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getAppVersionName() {
        return getAppVersionName(UtilsApp.getApp().getPackageName());
    }

    public static String getAppVersionName(String str) {
        if (StringUtils.isSpace(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int getAppVersionCode() {
        return getAppVersionCode(UtilsApp.getApp().getPackageName());
    }

    public static int getAppVersionCode(String str) {
        if (StringUtils.isSpace(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getAppTargetSdkVersion() {
        return getAppTargetSdkVersion(UtilsApp.getApp().getPackageName());
    }

    public static int getAppTargetSdkVersion(String str) {
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return 0;
            }
            return applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getAppMinSdkVersion() {
        return getAppMinSdkVersion(UtilsApp.getApp().getPackageName());
    }

    public static int getAppMinSdkVersion(String str) {
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return 0;
            }
            return applicationInfo.minSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getMetaData(String str) {
        return getMetaData(UtilsApp.getApp().getPackageName(), str);
    }

    public static String getMetaData(String str, String str2) {
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return null;
            }
            return applicationInfo.metaData.getString(str2);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Signature[] getAppSignature() {
        return getAppSignature(UtilsApp.getApp().getPackageName());
    }

    public static Signature[] getAppSignature(String str) {
        if (StringUtils.isSpace(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getAppSignatureSHA1() {
        return getAppSignatureSHA1(UtilsApp.getApp().getPackageName());
    }

    public static String getAppSignatureSHA1(String str) {
        return getAppSignatureHash(str, "SHA1");
    }

    public static String getAppSignatureSHA256() {
        return getAppSignatureSHA256(UtilsApp.getApp().getPackageName());
    }

    public static String getAppSignatureSHA256(String str) {
        return getAppSignatureHash(str, "SHA256");
    }

    public static String getAppSignatureMD5() {
        return getAppSignatureMD5(UtilsApp.getApp().getPackageName());
    }

    public static String getAppSignatureMD5(String str) {
        return getAppSignatureHash(str, "MD5");
    }

    private static String getAppSignatureHash(String str, String str2) {
        Signature[] appSignature;
        return (StringUtils.isSpace(str) || (appSignature = getAppSignature(str)) == null || appSignature.length <= 0) ? "" : StringUtils.bytes2HexString(EncryptUtils.hashTemplate(appSignature[0].toByteArray(), str2)).replaceAll("(?<=[0-9A-F]{2})[0-9A-F]{2}", ":$0");
    }

    public static long getAppFirstInstallTime() {
        return getAppFirstInstallTime(UtilsApp.getApp().getPackageName());
    }

    public static long getAppFirstInstallTime(String str) {
        if (StringUtils.isSpace(str)) {
            return -1L;
        }
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1L;
            }
            return packageInfo.firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static long getAppLastUpdateTime() {
        return getAppLastUpdateTime(UtilsApp.getApp().getPackageName());
    }

    public static long getAppLastUpdateTime(String str) {
        if (StringUtils.isSpace(str)) {
            return -1L;
        }
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1L;
            }
            return packageInfo.lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static long getAppSize() {
        return getAppSize(UtilsApp.getApp().getPackageName());
    }

    public static long getAppSize(String str) {
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return 0L;
            }
            return new File(applicationInfo.sourceDir).length();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    public static String getAppSourceDir() {
        return getAppSourceDir(UtilsApp.getApp().getPackageName());
    }

    public static String getAppSourceDir(String str) {
        try {
            ApplicationInfo applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void launchApp(String str) {
        if (StringUtils.isSpace(str)) {
            return;
        }
        UtilsApp.getApp().startActivity(IntentUtils.getLaunchAppIntent(str, true));
    }

    public static void launchApp(Activity activity, String str, int i) {
        if (StringUtils.isSpace(str)) {
            return;
        }
        activity.startActivityForResult(IntentUtils.getLaunchAppIntent(str, false), i);
    }

    public static void relaunchApp() {
        Intent launchAppIntent = IntentUtils.getLaunchAppIntent(UtilsApp.getApp().getPackageName(), false);
        if (launchAppIntent == null) {
            return;
        }
        UtilsApp.getApp().startActivity(Intent.makeRestartActivityTask(launchAppIntent.getComponent()));
        System.exit(0);
    }

    public static void launchAppSettings() {
        launchAppSettings(UtilsApp.getApp().getPackageName());
    }

    public static void launchAppSettings(String str) {
        if (StringUtils.isSpace(str)) {
            return;
        }
        UtilsApp.getApp().startActivity(IntentUtils.getLaunchSettingIntent(str, true));
    }

    private AppUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
