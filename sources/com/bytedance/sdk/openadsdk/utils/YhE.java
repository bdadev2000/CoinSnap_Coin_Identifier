package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.widget.SSWebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.signals.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class YhE {
    private static final HashSet<String> Bj;
    public static Integer zp;
    private static final ExecutorService lMd = Executors.newSingleThreadExecutor();
    private static volatile boolean KS = false;
    private static final AtomicInteger jU = new AtomicInteger(0);
    private static volatile String COT = "";
    private static final ReentrantLock HWF = new ReentrantLock();
    private static String QR = null;
    private static String ku = null;
    private static String YW = null;
    private static final HashSet<String> dT = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* renamed from: com.bytedance.sdk.openadsdk.utils.YhE$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(YhE.COT)) {
                    SSWebView sSWebView = new SSWebView(com.bytedance.sdk.openadsdk.core.KVG.zp());
                    sSWebView.setWebViewClient(new SSWebView.zp());
                    String unused = YhE.COT = sSWebView.getUserAgentString();
                }
            } catch (Exception e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "", e4);
            } catch (NoClassDefFoundError e9) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "", e9);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class lMd {
        public final int lMd;
        public final ComponentName zp;

        public lMd(ComponentName componentName, int i9) {
            this.zp = componentName;
            this.lMd = i9;
        }
    }

    /* loaded from: classes.dex */
    public static class zp implements Callable<String> {
        private final int zp;

        public zp(int i9) {
            this.zp = i9;
        }

        private synchronized String KS() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.YhE.zp.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = YhE.FP();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", e4.getMessage());
            }
            return strArr[0];
        }

        private String lMd() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                com.bytedance.sdk.openadsdk.core.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).zp("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.tG.zp("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                str = "unKnow";
                th = th3;
            }
            return str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String str;
            try {
                str = "unKnow";
                int i9 = this.zp;
                if (i9 == 1) {
                    str = KS();
                } else if (i9 == 2) {
                    str = lMd();
                }
            } catch (Throwable th) {
                throw th;
            }
            return str;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        Bj = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        zp = null;
    }

    public static boolean COT(int i9) {
        return i9 == 5;
    }

    public static /* synthetic */ String FP() {
        return yRU();
    }

    public static boolean HWF(int i9) {
        return i9 == 6;
    }

    public static int KS(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, 65536).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int KVG() {
        try {
            String id = TimeZone.getDefault().getID();
            if (dT.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id != null && id.startsWith("Europe/")) {
                return 4;
            }
            if (id != null && id.startsWith("America/")) {
                if (!Bj.contains(id)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", th.toString());
            return 0;
        }
    }

    public static int QR(int i9) {
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 4) {
            return 1;
        }
        if (i9 == 5) {
            return 4;
        }
        if (i9 != 6) {
            return i9;
        }
        return 5;
    }

    public static String YW() {
        return KS("MemTotal");
    }

    public static String dQp() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", e4.toString());
            return "";
        }
    }

    public static long dT() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean jU(int i9) {
        return i9 == 4;
    }

    public static String ku() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.KVG.zp().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j7 = memoryInfo.totalMem;
            if (j7 > 0) {
                return String.valueOf(j7 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean lMd(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean ox() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean pvr() {
        if (jU.get() == 1) {
            return true;
        }
        return false;
    }

    public static String rV() {
        int KVG = KVG();
        if (KVG == 1 || KVG == 2) {
            return "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json";
        }
        return "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String tG() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    public static boolean vDp() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String vwr() {
        int i9 = -woN();
        if (i9 >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i9));
        }
        return "Etc/GMT".concat(String.valueOf(i9));
    }

    public static int woN() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    private static String yRU() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.KVG.zp());
            webView.setWebViewClient(new SSWebView.zp());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                    com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).zp("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    public static void zp(@NonNull com.bytedance.sdk.openadsdk.core.model.woN won, @NonNull View view) {
    }

    public static long Bj() {
        try {
            if (!ox()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", th.getMessage());
            return 0L;
        }
    }

    public static synchronized String COT() {
        String str;
        Context zp2;
        synchronized (YhE.class) {
            try {
                if (TextUtils.isEmpty(QR) && (zp2 = com.bytedance.sdk.openadsdk.core.KVG.zp()) != null) {
                    try {
                        QR = zp2.getPackageName();
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th);
                    }
                }
                str = QR;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static synchronized String HWF() {
        String str;
        synchronized (YhE.class) {
            try {
                if (TextUtils.isEmpty(ku) && com.bytedance.sdk.openadsdk.core.KVG.zp() != null) {
                    try {
                        PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.KVG.zp().getPackageManager().getPackageInfo(COT(), 0);
                        ku = String.valueOf(packageInfo.versionCode);
                        YW = packageInfo.versionName;
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                    }
                }
                str = ku;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static synchronized String QR() {
        String str;
        synchronized (YhE.class) {
            try {
                if (TextUtils.isEmpty(YW) && com.bytedance.sdk.openadsdk.core.KVG.zp() != null) {
                    try {
                        PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.KVG.zp().getPackageManager().getPackageInfo(COT(), 0);
                        ku = String.valueOf(packageInfo.versionCode);
                        YW = packageInfo.versionName;
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th);
                    }
                }
                str = YW;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public static boolean YW(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String jU() {
        return FP.zp();
    }

    public static void tG(Context context) {
        try {
            AtomicInteger atomicInteger = jU;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.dT.KS.zp().lMd();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            jU.set(2);
        }
    }

    private static String vDp(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", HWF()).toString();
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", e4.getMessage());
            return str;
        }
    }

    public static long jU(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("free_internal_storage", 0L).longValue();
    }

    public static Intent zp(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean KS(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.lMd.zp(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean YW(String str) {
        if (com.bytedance.sdk.openadsdk.core.tG.COT()) {
            return true;
        }
        com.bytedance.sdk.component.utils.tG.lMd("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static String jU(String str) {
        return zp(str, false);
    }

    @NonNull
    public static lMd lMd(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
            if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                return new lMd(new ComponentName(activityInfo.packageName, activityInfo.name), queryIntentActivities.size());
            }
            return new lMd(null, queryIntentActivities.size());
        }
        return new lMd(null, 0);
    }

    public static int rV(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = zp;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = queryIntentActivities.size();
        zp = Integer.valueOf(size);
        return size;
    }

    public static long dT(Context context) {
        int i9;
        try {
            i9 = context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", th.getMessage());
            i9 = -1;
        }
        return i9;
    }

    public static long COT(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("total_sdcard_storage", 0L).longValue();
    }

    public static boolean ku(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30 && context.checkSelfPermission("android.permission.QUERY_ALL_PACKAGES") != 0);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static long Bj(Context context) {
        int i9;
        try {
            i9 = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", th.getMessage());
            i9 = -1;
        }
        return i9;
    }

    public static String COT(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.KVG.jU().fRl();
        }
        if (!TextUtils.isEmpty(str)) {
            return !str.startsWith("http") ? "https://".concat(str) : str;
        }
        if (KVG() == 2) {
            return "https://log.sgsnssdk.com/service/2/app_log/";
        }
        return "https://log-mva.isnssdk.com/service/2/app_log/";
    }

    public static void dT(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.tG.lMd("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static int vDp(Context context) {
        return QR(com.bytedance.sdk.component.utils.yRU.zp(context, 0L));
    }

    public static boolean zp(Context context, Intent intent) {
        return KS(context, intent) > 0;
    }

    public static String KS(int i9) {
        if (i9 == 1) {
            return "banner_ad";
        }
        if (i9 == 2) {
            return "interaction";
        }
        if (i9 == 3 || i9 == 4) {
            return "open_ad";
        }
        if (i9 == 7) {
            return "rewarded_video";
        }
        if (i9 != 8) {
            return "embeded_ad";
        }
        return "fullscreen_interstitial_ad";
    }

    public static boolean zp() {
        return (com.bytedance.sdk.openadsdk.core.rV.zp() == null || com.bytedance.sdk.openadsdk.core.rV.zp().jU()) ? false : true;
    }

    public static int HWF(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("is_root", -1);
    }

    public static String QR(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", e4.toString());
            return "";
        }
    }

    public static void ku(final String str) {
        com.bytedance.sdk.openadsdk.dT.KS.zp();
        com.bytedance.sdk.openadsdk.dT.KS.zp("reportMultiLog", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.utils.YhE.2
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                if (!YhE.KS && com.bytedance.sdk.openadsdk.core.KVG.jU().oB()) {
                    boolean unused = YhE.KS = true;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("reportMultiLog").lMd(jSONObject.toString());
                }
                return null;
            }
        });
    }

    public static String zp(int i9) {
        if (i9 == 1) {
            return "embeded_ad";
        }
        if (i9 == 2) {
            return "banner_ad";
        }
        if (i9 == 3) {
            return "interaction";
        }
        if (i9 == 4) {
            return "open_ad";
        }
        if (i9 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i9 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static boolean HWF(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean ku(int i9) {
        if (i9 <= 0) {
            return false;
        }
        return i9 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i9;
    }

    public static String lMd(int i9) {
        if (i9 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i9 == 2) {
            return "banner_ad_landingpage";
        }
        if (i9 == 3) {
            return "interaction_landingpage";
        }
        if (i9 == 4) {
            return "splash_ad_landingpage";
        }
        if (i9 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i9 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static String QR(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static String KS() {
        if (!TextUtils.isEmpty(COT)) {
            return COT;
        }
        com.bytedance.sdk.openadsdk.multipro.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp());
        String zp2 = com.bytedance.sdk.openadsdk.core.ku.zp("sdk_local_web_ua", j.TWENTY_FOUR_HOURS_MILLIS);
        COT = zp2;
        if (TextUtils.isEmpty(zp2)) {
            ReentrantLock reentrantLock = HWF;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(COT)) {
                            COT = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.KVG.zp());
                        }
                        com.bytedance.sdk.openadsdk.core.ku.zp("sdk_local_web_ua", COT);
                        reentrantLock.unlock();
                    } catch (Exception e4) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "", e4);
                        HWF.unlock();
                        return COT;
                    } catch (NoClassDefFoundError e9) {
                        com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "", e9);
                        HWF.unlock();
                        return COT;
                    }
                }
            } catch (Throwable th) {
                HWF.unlock();
                throw th;
            }
        }
        return COT;
    }

    public static String zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won == null) {
            return null;
        }
        try {
            return KS(won.Dp());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zp(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c9 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c9 = 3;
                    break;
                }
                break;
            case 564365438:
                if (str.equals("cache_splash_ad")) {
                    c9 = 4;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c9 = 5;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return 2;
            case 1:
                return 7;
            case 2:
            case 4:
                return 4;
            case 3:
                return 5;
            case 5:
                return 3;
            default:
                return 1;
        }
    }

    public static String lMd() {
        String lMd2;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp());
        try {
            lMd2 = com.bytedance.sdk.openadsdk.multipro.lMd.KS() ? com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).lMd("android_system_ua", "unKnow");
        } catch (Exception unused) {
        }
        if (lMd2 != null && !"unKnow".equals(lMd2)) {
            return lMd2;
        }
        FutureTask futureTask = new FutureTask(new zp(2));
        lMd.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.tG.zp("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String zp(Context context) {
        String lMd2 = com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("total_memory", (String) null);
        if (lMd2 == null || lMd(lMd2) <= 0) {
            lMd2 = KS("MemTotal");
            if (lMd(lMd2) <= 0) {
                lMd2 = ku();
            }
            com.bytedance.sdk.openadsdk.core.KS.zp(context).zp("total_memory", lMd2);
        }
        return lMd2;
    }

    public static String zp(@NonNull String str, boolean z8) {
        String d2;
        String UPs = com.bytedance.sdk.openadsdk.core.KVG.jU().UPs();
        if (TextUtils.isEmpty(UPs)) {
            int KVG = KVG();
            if (KVG == 1) {
                d2 = AbstractC2914a.d("https://pangolin16.sgsnssdk.com", str);
            } else if (KVG == 2) {
                d2 = AbstractC2914a.d("https://pangolin16.sgsnssdk.com", str);
            } else {
                d2 = AbstractC2914a.d("https://pangolin16.isnssdk.com", str);
            }
            if (!z8) {
                return irS.zp(d2);
            }
            return vDp(d2);
        }
        String e4 = AbstractC2914a.e("https://", UPs, str);
        if (irS.zp() && !z8) {
            e4 = irS.zp(e4);
        }
        return z8 ? vDp(e4) : e4;
    }

    public static long lMd(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String KS(String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!readLine.contains(str));
                if (readLine == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = readLine.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static String lMd(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("total_memory", "0");
    }

    public static boolean lMd(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won == null) {
            return true;
        }
        int lMd2 = com.bytedance.sdk.openadsdk.core.KVG.jU().lMd(won.FGx());
        int KS2 = com.bytedance.sdk.component.utils.KVG.KS(com.bytedance.sdk.openadsdk.core.KVG.zp());
        if (lMd2 == 1) {
            return jU(KS2);
        }
        if (lMd2 == 2) {
            return COT(KS2) || jU(KS2) || HWF(KS2);
        }
        if (lMd2 != 3) {
            return lMd2 != 5 || jU(KS2) || HWF(KS2);
        }
        return false;
    }

    public static long KS(Context context) {
        return com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("total_internal_storage", 0L).longValue();
    }

    public static JSONObject zp(boolean z8, com.bytedance.sdk.openadsdk.core.model.woN won, long j7, long j9, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, won.fgJ());
            jSONObject.put("load_time", j7);
            com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
            if (eWG != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, eWG.COT());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, eWG.YW());
            }
            if (!z8) {
                jSONObject.put("error_code", j9);
                if (TextUtils.isEmpty(str)) {
                    str = AppLovinMediationProvider.UNKNOWN;
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "getVideoDownload json error", e4);
        }
        return jSONObject;
    }

    public static JSONObject zp(com.bytedance.sdk.openadsdk.core.model.woN won, long j7, com.bykv.vk.openvk.component.video.api.zp zpVar) {
        if (won == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, won.fgJ());
            jSONObject.put("buffers_time", j7);
            com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
            if (eWG != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, eWG.COT());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, eWG.YW());
            }
            zp(jSONObject, zpVar);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.ToolUtils", "getVideoAction json error", e4);
        }
        return jSONObject;
    }

    private static void zp(JSONObject jSONObject, com.bykv.vk.openvk.component.video.api.zp zpVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || zpVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(zpVar.jU()), Integer.valueOf(zpVar.COT())));
        } catch (Throwable unused) {
        }
    }

    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won, String str) {
        if (won != null) {
            try {
                String aax = won.aax();
                if (TextUtils.isEmpty(aax) && won.fs() != null && won.fs().KS() == 1 && !TextUtils.isEmpty(won.fs().lMd())) {
                    aax = won.fs().lMd();
                }
                String str2 = aax;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.Gzh.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), str2, won, zp(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void zp(String str, String str2, Context context) {
        int i9;
        if (TextUtils.isEmpty(str2) || !YW(context)) {
            return;
        }
        int length = str2.length();
        int i10 = 1;
        if (length % 3572 == 0) {
            i9 = length / 3572;
        } else {
            i9 = (length / 3572) + 1;
        }
        int i11 = 3572;
        int i12 = 0;
        while (i10 <= i9) {
            if (i11 < length) {
                Log.d(str, i9 + "-" + i10 + ":" + str2.substring(i12, i11));
                i10++;
                i12 = i11;
                i11 += 3572;
            } else {
                Log.d(str, i9 + "-" + i10 + ":" + str2.substring(i12));
                return;
            }
        }
    }

    public static void zp(StringBuilder sb, String str, String str2) {
        int indexOf;
        if (sb == null || TextUtils.isEmpty(str) || (indexOf = sb.indexOf(str)) <= 0) {
            return;
        }
        sb.replace(indexOf, str.length() + indexOf, str2);
    }
}
