package com.glority.utils.app;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.glority.utils.UtilsApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class IntentUtils {
    public static boolean isIntentAvailable(Intent intent) {
        return UtilsApp.getApp().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static List<AppInfo> getMatchAppInfos(Intent intent) {
        PackageManager packageManager = UtilsApp.getApp().getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ArrayList arrayList = new ArrayList(queryIntentActivities.size());
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            arrayList.add(new AppInfo(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name, resolveInfo.loadLabel(packageManager).toString(), resolveInfo.loadIcon(packageManager)));
        }
        return arrayList;
    }

    public static Intent getLaunchAppIntent(String str) {
        return getLaunchAppIntent(str, false);
    }

    public static Intent getLaunchAppIntent(String str, boolean z) {
        return getIntent(UtilsApp.getApp().getPackageManager().getLaunchIntentForPackage(str), z);
    }

    public static Intent getLaunchSettingIntent(String str) {
        return getLaunchSettingIntent(str, false);
    }

    public static Intent getLaunchSettingIntent(String str, boolean z) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return getIntent(intent, z);
    }

    public static Intent getShareTextIntent(String str) {
        return getShareTextIntent(str, false);
    }

    public static Intent getShareTextIntent(String str, boolean z) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        return getIntent(intent, z);
    }

    public static Intent getDialIntent(String str) {
        return getDialIntent(str, false);
    }

    public static Intent getDialIntent(String str, boolean z) {
        return getIntent(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)), z);
    }

    public static Intent getCallIntent(String str) {
        return getCallIntent(str, false);
    }

    public static Intent getCallIntent(String str, boolean z) {
        return getIntent(new Intent("android.intent.action.CALL", Uri.parse("tel:" + str)), z);
    }

    public static Intent getSendSmsIntent(String str, String str2) {
        return getSendSmsIntent(str, str2, false);
    }

    public static Intent getSendSmsIntent(String str, String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        return getIntent(intent, z);
    }

    public static Intent getSendEmailIntent(String str, String str2, String str3) {
        return getSendEmailIntent(str, str2, str3, false);
    }

    public static Intent getSendEmailIntent(String str, String str2, String str3, boolean z) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME + str));
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        intent.putExtra("android.intent.extra.EMAIL", str);
        return getIntent(intent, z);
    }

    public static Intent getOpenWebIntent(String str) {
        return getOpenWebIntent(str, false);
    }

    public static Intent getOpenWebIntent(String str, boolean z) {
        return getIntent(new Intent("android.intent.action.VIEW", Uri.parse(str)), z);
    }

    public static Intent getLaunchMarketIntent(String str) {
        return getLaunchMarketIntent(str, false);
    }

    public static Intent getLaunchMarketIntent(String str, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
        if (!isIntentAvailable(intent)) {
            intent = getOpenWebIntent("https://play.google.com/store/apps/details?id=" + str);
        }
        return getIntent(intent, z);
    }

    public static Intent getCaptureIntent(Uri uri) {
        return getCaptureIntent(uri, false);
    }

    public static Intent getCaptureIntent(Uri uri, boolean z) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", uri);
        intent.addFlags(1);
        return getIntent(intent, z);
    }

    /* loaded from: classes9.dex */
    public static class AppInfo {
        public final String appName;
        public final Drawable launcherIcon;
        public final String launcherName;
        public final String pkgName;

        public AppInfo(String str, String str2, String str3, Drawable drawable) {
            this.pkgName = str;
            this.launcherName = str2;
            this.appName = str3;
            this.launcherIcon = drawable;
        }

        public String toString() {
            return "AppInfo{pkgName='" + this.pkgName + "', launcherName='" + this.launcherName + "', appName='" + this.appName + "', launcherIcon=" + this.launcherIcon + '}';
        }
    }

    private static Intent getIntent(Intent intent, boolean z) {
        if (intent == null) {
            return null;
        }
        return z ? intent.addFlags(268435456) : intent;
    }

    private IntentUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
