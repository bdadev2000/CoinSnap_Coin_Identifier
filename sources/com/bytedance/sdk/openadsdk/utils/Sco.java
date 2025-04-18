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
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.NjR.AlY;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import k5.c;
import org.json.JSONException;
import org.json.JSONObject;
import p5.a;
import vd.e;

/* loaded from: classes.dex */
public class Sco {
    private static String EH;
    private static final byte[] GA;
    public static Integer YFl;
    private static final byte[] YoT;
    private static final HashSet<String> eT;
    private static String pDU;
    private static final ExecutorService Sg = Executors.newSingleThreadExecutor();
    private static volatile boolean tN = false;
    private static final AtomicInteger AlY = new AtomicInteger(0);
    private static volatile String wN = "";

    /* renamed from: vc, reason: collision with root package name */
    private static final ReentrantLock f10831vc = new ReentrantLock();
    private static String DSW = null;
    private static String qsH = null;
    private static String NjR = null;

    /* renamed from: nc, reason: collision with root package name */
    private static final HashSet<String> f10830nc = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* renamed from: com.bytedance.sdk.openadsdk.utils.Sco$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(Sco.wN)) {
                    com.bytedance.sdk.component.NjR.AlY alY = new com.bytedance.sdk.component.NjR.AlY(com.bytedance.sdk.openadsdk.core.lG.YFl());
                    alY.setWebViewClient(new AlY.YFl());
                    String unused = Sco.wN = alY.getUserAgentString();
                }
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "", e2);
            } catch (NoClassDefFoundError e10) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Sg {
        public final int Sg;
        public final ComponentName YFl;

        public Sg(ComponentName componentName, int i10) {
            this.YFl = componentName;
            this.Sg = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class YFl implements Callable<String> {
        private final int YFl;

        public YFl(int i10) {
            this.YFl = i10;
        }

        private String Sg() {
            String str;
            Throwable th2;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                com.bytedance.sdk.openadsdk.core.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()).YFl("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.YoT.YFl("getUA", "e:" + th2.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th4) {
                str = "unKnow";
                th2 = th4;
            }
            return str;
        }

        private synchronized String tN() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.Sco.YFl.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = Sco.VOe();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", e2.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            int i10 = this.YFl;
            if (i10 == 1) {
                str = tN();
            } else if (i10 == 2) {
                str = Sg();
            }
            return str;
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        eT = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        YFl = null;
        YoT = new byte[]{108, 111, 97, 100, 105, 110, 103};
        GA = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static boolean AlY(int i10) {
        return i10 == 4;
    }

    public static int DSW(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static String EH() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", e2.toString());
            return "";
        }
    }

    public static String GA() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String NjR() {
        return tN("MemTotal");
    }

    public static String Sg(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 7 ? "unknow" : "rewarded_video_landingpage" : "fullscreen_interstitial_ad" : "splash_ad_landingpage" : "interaction_landingpage" : "banner_ad_landingpage" : "embeded_ad_landingpage";
    }

    private static String UZM() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.lG.YFl());
            webView.setWebViewClient(new AlY.YFl());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                    com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()).YFl("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    public static /* synthetic */ String VOe() {
        return UZM();
    }

    public static String Wwa() {
        int i10 = -lG();
        if (i10 >= 0) {
            return "Etc/GMT+".concat(String.valueOf(i10));
        }
        return "Etc/GMT".concat(String.valueOf(i10));
    }

    public static String YFl(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    private static boolean YI() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean YoT() {
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

    public static String aIu() {
        String str = pDU;
        if (TextUtils.isEmpty(str)) {
            String str2 = new String(YoT);
            pDU = str2;
            return str2;
        }
        return str;
    }

    public static int lG() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static long nc() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String pDU() {
        int rkt = rkt();
        return (rkt == 1 || rkt == 2) ? "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static boolean qO() {
        return AlY.get() == 1;
    }

    public static String qsH() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.lG.YFl().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j3 = memoryInfo.totalMem;
            if (j3 > 0) {
                return String.valueOf(j3 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int rkt() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (f10830nc.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 != null && id2.startsWith("America/")) {
                if (!eT.contains(id2)) {
                    return 5;
                }
            }
            return 3;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static String tN(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? "open_ad" : i10 != 7 ? i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static boolean vc(int i10) {
        return i10 == 6;
    }

    public static boolean wN(int i10) {
        return i10 == 5;
    }

    public static String wXo() {
        String str = EH;
        if (TextUtils.isEmpty(str)) {
            String str2 = new String(GA);
            EH = str2;
            return str2;
        }
        return str;
    }

    public static String AlY() {
        return Ne.YFl();
    }

    public static synchronized String DSW() {
        String str;
        synchronized (Sco.class) {
            if (TextUtils.isEmpty(NjR) && com.bytedance.sdk.openadsdk.core.lG.YFl() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.lG.YFl().getPackageManager().getPackageInfo(wN(), 0);
                    qsH = String.valueOf(packageInfo.versionCode);
                    NjR = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th2);
                }
            }
            str = NjR;
        }
        return str;
    }

    public static void GA(Context context) {
        try {
            AtomicInteger atomicInteger = AlY;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.pDU.tN.YFl().tN();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            AlY.set(2);
        }
    }

    public static boolean NjR(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean Sg(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void YFl(@NonNull com.bytedance.sdk.openadsdk.core.model.Wwa wwa, @NonNull View view) {
    }

    private static String YoT(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", vc()).toString();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", e2.getMessage());
            return str;
        }
    }

    public static long eT() {
        try {
            if (!YI()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static int pDU(Context context) {
        List<ResolveInfo> queryIntentActivities;
        Integer num = YFl;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(queryIntentActivities.size());
        YFl = valueOf;
        return valueOf.intValue();
    }

    public static int tN(Context context, Intent intent) {
        if (intent == null) {
            return 0;
        }
        try {
            return context.getPackageManager().queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE).size();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static synchronized String vc() {
        String str;
        synchronized (Sco.class) {
            if (TextUtils.isEmpty(qsH) && com.bytedance.sdk.openadsdk.core.lG.YFl() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.lG.YFl().getPackageManager().getPackageInfo(wN(), 0);
                    qsH = String.valueOf(packageInfo.versionCode);
                    NjR = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th2);
                }
            }
            str = qsH;
        }
        return str;
    }

    public static synchronized String wN() {
        String str;
        Context YFl2;
        synchronized (Sco.class) {
            if (TextUtils.isEmpty(DSW) && (YFl2 = com.bytedance.sdk.openadsdk.core.lG.YFl()) != null) {
                try {
                    DSW = YFl2.getPackageName();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th2);
                }
            }
            str = DSW;
        }
        return str;
    }

    public static long AlY(Context context) {
        return com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("free_internal_storage", 0L).longValue();
    }

    public static String AlY(String str) {
        return YFl(str, false);
    }

    public static boolean NjR(String str) {
        if (com.bytedance.sdk.openadsdk.core.pDU.wN()) {
            return true;
        }
        com.bytedance.sdk.component.utils.YoT.Sg("You must use method '" + str + "' after initialization, please check.");
        return false;
    }

    public static Intent YFl(Context context, String str) {
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

    public static boolean AlY(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        return wwa != null && wwa.ko() == 3 && wwa.iY() && (wwa.Bh() == 4 || wwa.Bh() == 5);
    }

    @NonNull
    public static Sg Sg(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
            if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                return new Sg(new ComponentName(activityInfo.packageName, activityInfo.name), queryIntentActivities.size());
            }
            return new Sg(null, queryIntentActivities.size());
        }
        return new Sg(null, 0);
    }

    public static int nc(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", th2.getMessage());
            return -1;
        }
    }

    public static boolean tN(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.Sg.YFl(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean qsH(Context context) {
        if (context != null) {
            return !(context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30);
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static long wN(Context context) {
        return com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("total_sdcard_storage", 0L).longValue();
    }

    public static int YoT(Context context) {
        return DSW(com.bytedance.sdk.component.utils.Ne.YFl(context, 0L));
    }

    public static long eT(Context context) {
        int i10;
        try {
            i10 = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", th2.getMessage());
            i10 = -1;
        }
        return i10;
    }

    public static void nc(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.YoT.Sg("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static String wN(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.lG.AlY().mn();
        }
        return TextUtils.isEmpty(str) ? rkt() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/" : !str.startsWith("http") ? "https://".concat(str) : str;
    }

    public static boolean YFl(Context context, Intent intent) {
        return tN(context, intent) > 0;
    }

    public static String DSW(@NonNull Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", e2.toString());
            return "";
        }
    }

    public static boolean YFl() {
        return (com.bytedance.sdk.openadsdk.core.EH.YFl() == null || com.bytedance.sdk.openadsdk.core.EH.YFl().AlY()) ? false : true;
    }

    public static void qsH(final String str) {
        com.bytedance.sdk.openadsdk.pDU.tN.YFl();
        com.bytedance.sdk.openadsdk.pDU.tN.YFl("reportMultiLog", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.utils.Sco.2
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                if (!Sco.tN && com.bytedance.sdk.openadsdk.core.lG.AlY().Ld()) {
                    boolean unused = Sco.tN = true;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("reportMultiLog").Sg(jSONObject.toString());
                }
                return null;
            }
        });
    }

    public static String tN() {
        if (!TextUtils.isEmpty(wN)) {
            return wN;
        }
        com.bytedance.sdk.openadsdk.multipro.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl());
        String YFl2 = com.bytedance.sdk.openadsdk.core.NjR.YFl("sdk_local_web_ua", j.TWENTY_FOUR_HOURS_MILLIS);
        wN = YFl2;
        if (TextUtils.isEmpty(YFl2)) {
            ReentrantLock reentrantLock = f10831vc;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(wN)) {
                            wN = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.lG.YFl());
                        }
                        com.bytedance.sdk.openadsdk.core.NjR.YFl("sdk_local_web_ua", wN);
                        reentrantLock.unlock();
                    } catch (Exception e2) {
                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "", e2);
                        return wN;
                    } catch (NoClassDefFoundError e10) {
                        com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "", e10);
                        return wN;
                    }
                }
            } finally {
                f10831vc.unlock();
            }
        }
        return wN;
    }

    public static int vc(Context context) {
        return com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("is_root", -1);
    }

    public static String YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa == null) {
            return null;
        }
        try {
            return tN(wwa.Uv());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean qsH(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static boolean vc(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String DSW(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static int Sg(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa == null) {
            return -1;
        }
        int Uv = wwa.Uv();
        int i10 = 1;
        if (Uv == 1) {
            return 2;
        }
        if (Uv == 3) {
            return 4;
        }
        if (Uv != 5) {
            i10 = 7;
            if (Uv != 7) {
                return Uv != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static int YFl(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c10 = 3;
                    break;
                }
                break;
            case 564365438:
                if (str.equals("cache_splash_ad")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
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

    public static String Sg() {
        String Sg2;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl());
        try {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                Sg2 = com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                Sg2 = com.bytedance.sdk.openadsdk.core.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()).Sg("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (Sg2 != null && !"unKnow".equals(Sg2)) {
            return Sg2;
        }
        FutureTask futureTask = new FutureTask(new YFl(2));
        Sg.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.YoT.YFl("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static String YFl(Context context) {
        String Sg2 = com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("total_memory", (String) null);
        if (Sg2 == null || Sg(Sg2) <= 0) {
            Sg2 = tN("MemTotal");
            if (Sg(Sg2) <= 0) {
                Sg2 = qsH();
            }
            com.bytedance.sdk.openadsdk.core.tN.YFl(context).YFl("total_memory", Sg2);
        }
        return Sg2;
    }

    public static String YFl(@NonNull String str, boolean z10) {
        String e2;
        String pq = com.bytedance.sdk.openadsdk.core.lG.AlY().pq();
        if (TextUtils.isEmpty(pq)) {
            int rkt = rkt();
            if (rkt == 1) {
                e2 = e.e("https://pangolin16.sgsnssdk.com", str);
            } else if (rkt == 2) {
                e2 = e.e("https://pangolin16.sgsnssdk.com", str);
            } else {
                e2 = e.e("https://pangolin16.isnssdk.com", str);
            }
            if (!z10) {
                return pq.YFl(e2);
            }
            return YoT(e2);
        }
        String f10 = com.applovin.impl.mediation.ads.e.f("https://", pq, str);
        if (pq.YFl() && !z10) {
            f10 = pq.YFl(f10);
        }
        return z10 ? YoT(f10) : f10;
    }

    public static long Sg(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String tN(String str) {
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
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", th.getMessage());
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
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static String Sg(Context context) {
        return com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("total_memory", "0");
    }

    public static long tN(Context context) {
        return com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("total_internal_storage", 0L).longValue();
    }

    public static boolean tN(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa == null) {
            return true;
        }
        int Sg2 = com.bytedance.sdk.openadsdk.core.lG.AlY().Sg(wwa.kU());
        int tN2 = com.bytedance.sdk.component.utils.EH.tN(com.bytedance.sdk.openadsdk.core.lG.YFl());
        if (Sg2 == 1) {
            return AlY(tN2);
        }
        if (Sg2 == 2) {
            return wN(tN2) || AlY(tN2) || vc(tN2);
        }
        if (Sg2 != 3) {
            return Sg2 != 5 || AlY(tN2) || vc(tN2);
        }
        return false;
    }

    public static JSONObject YFl(boolean z10, com.bytedance.sdk.openadsdk.core.model.Wwa wwa, long j3, long j10, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, wwa.zz());
            jSONObject.put("load_time", j3);
            a BPI = wwa.BPI();
            if (BPI != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, BPI.f23458c);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, BPI.f23460e);
            }
            if (!z10) {
                jSONObject.put("error_code", j10);
                if (TextUtils.isEmpty(str)) {
                    str = AppLovinMediationProvider.UNKNOWN;
                }
                jSONObject.put("error_message", str);
            }
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "getVideoDownload json error", e2);
        }
        return jSONObject;
    }

    public static JSONObject YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, long j3, c cVar) {
        if (wwa == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, wwa.zz());
            jSONObject.put("buffers_time", j3);
            a BPI = wwa.BPI();
            if (BPI != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, BPI.f23458c);
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, BPI.f23460e);
            }
            YFl(jSONObject, cVar);
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", "getVideoAction json error", e2);
        }
        return jSONObject;
    }

    private static void YFl(JSONObject jSONObject, c cVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || cVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(cVar.AlY()), Integer.valueOf(cVar.wN())));
        } catch (Throwable unused) {
        }
    }

    public static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str) {
        if (wwa != null) {
            try {
                String Cqy = wwa.Cqy();
                if (TextUtils.isEmpty(Cqy) && wwa.Bn() != null && wwa.Bn().tN() == 1 && !TextUtils.isEmpty(wwa.Bn().Sg())) {
                    Cqy = wwa.Bn().Sg();
                }
                String str2 = Cqy;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.mn.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), str2, wwa, YFl(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void YFl(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !NjR(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13, i12));
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13));
                return;
            }
        }
    }

    public static void YFl(StringBuilder sb2, String str, String str2) {
        int indexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (indexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(indexOf, str.length() + indexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.tN YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, com.bytedance.sdk.component.NjR.AlY alY, Context context, String str) {
        int Bh = wwa.Bh();
        if (!wwa.iY() || (Bh != 1 && Bh != 3)) {
            return null;
        }
        alY.YFl(true, (View) new com.bytedance.sdk.openadsdk.common.Sg(context));
        return new com.bytedance.sdk.openadsdk.common.tN(wwa, alY, str, false);
    }

    public static void YFl(JSONObject jSONObject) {
        int intValue;
        try {
            Pair<String, Long> AlY2 = com.bytedance.sdk.openadsdk.core.NjR.AlY("oem_store");
            int i10 = -1;
            if (AlY2 != null && ((intValue = Integer.valueOf((String) AlY2.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) AlY2.second).longValue() < com.bytedance.sdk.openadsdk.aIu.YFl.YFl("oem_store_state_time", 259200000))) {
                i10 = intValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, com.bytedance.sdk.component.NjR.AlY alY) {
        com.bytedance.sdk.openadsdk.core.model.wN nc2;
        if (wwa == null || alY == null) {
            return;
        }
        int Bh = wwa.Bh();
        if (wwa.iY()) {
            if ((Bh == 2 || Bh == 3 || Bh == 5) && (nc2 = wwa.nc()) != null) {
                alY.YFl(true, nc2.AlY(), nc2.wN(), nc2.vc(), nc2.DSW(), nc2.tN());
            }
        }
    }
}
