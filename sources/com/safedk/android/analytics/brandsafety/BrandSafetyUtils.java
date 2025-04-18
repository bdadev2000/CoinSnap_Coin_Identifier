package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BrandSafetyUtils {
    private static final float A = 0.2f;
    private static final float B = 0.2f;
    private static int H = 0;
    private static int I = 0;

    /* renamed from: a, reason: collision with root package name */
    static final String f29180a = ".jpg";

    /* renamed from: b, reason: collision with root package name */
    static final String f29181b = ".txt";

    /* renamed from: c, reason: collision with root package name */
    static final String f29182c = "unknown";
    static final String d = "com.appsaholic";
    static final int e = 1000;

    /* renamed from: f, reason: collision with root package name */
    static final int f29183f = 500;

    /* renamed from: g, reason: collision with root package name */
    public static final int f29184g = 86400000;

    /* renamed from: h, reason: collision with root package name */
    public static final int f29185h = 20000;

    /* renamed from: i, reason: collision with root package name */
    public static final int f29186i = 5000;

    /* renamed from: j, reason: collision with root package name */
    public static final String f29187j = "INTER";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29188k = "REWARDED";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29189l = "APPOPEN";

    /* renamed from: m, reason: collision with root package name */
    public static final String f29190m = "BANNER";

    /* renamed from: n, reason: collision with root package name */
    public static final String f29191n = "LEADER";

    /* renamed from: o, reason: collision with root package name */
    public static final String f29192o = "MREC";

    /* renamed from: p, reason: collision with root package name */
    public static final String f29193p = "NATIVE";

    /* renamed from: q, reason: collision with root package name */
    private static final String f29194q = "BrandSafetyUtils";

    /* renamed from: s, reason: collision with root package name */
    private static final Set<String> f29196s;

    /* renamed from: t, reason: collision with root package name */
    private static final Set<String> f29197t;

    /* renamed from: v, reason: collision with root package name */
    private static final int f29199v = 100;
    private static final int w = 0;
    private static final int x = 8947848;

    /* renamed from: y, reason: collision with root package name */
    private static final float f29200y = 0.2f;

    /* renamed from: z, reason: collision with root package name */
    private static final float f29201z = 0.2f;

    /* renamed from: u, reason: collision with root package name */
    private static final List<Integer> f29198u = new LinkedList();
    private static m C = null;
    private static RedirectDetails D = null;
    private static String E = null;
    private static String F = null;
    private static final ExecutorService G = Executors.newSingleThreadExecutor();
    private static final String INTERSTITIAL_ACTIVITIES = "Y29tLnZ1bmdsZS5wdWJsaXNoZXIuRmxleFZpZXdBZEFjdGl2aXR5fGNvbS5pbm1vYmkuYWRzLnJlbmRlcmluZy5Jbk1vYmlBZEFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLlZpZGVvRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRURnVsbFNjcmVlblZpZGVvQWN0aXZpdHl8Y29tLmdvb2dsZS5hZHMuQWRBY3Rpdml0eXxjb20uc21hYXRvLnNkay5pbnRlcnN0aXRpYWwudmlldy5JbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0QWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsucmV3YXJkLnBsYXllci5NQlJld2FyZFZpZGVvQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYW5kcm9pZC52aWV3LlVuaXR5QWRzRnVsbHNjcmVlbkFjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuaW50ZXJhY3RpdmVhZHMuYWN0aXZpdHkuSW50ZXJhY3RpdmVTaG93QWN0aXZpdHl8Y29tLnNtYWF0by5zZGsucmV3YXJkZWQudmlldy5SZXdhcmRlZEludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnZ1bmdsZS53YXJyZW4udWkuVnVuZ2xlQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLm5ld3Jld2FyZC5wbGF5ZXIuTVRHUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20udW5pdHkzZC5zZXJ2aWNlcy5hZHMuYWR1bml0LkFkVW5pdFNvZnR3YXJlQWN0aXZpdHl8Y29tLnZ1bmdsZS5wdWJsaXNoZXIuTXJhaWRGdWxsU2NyZWVuQWRBY3Rpdml0eXxjb20uZ29vZ2xlLmFuZHJvaWQuZ21zLmFkcy5BZEFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLm1yYWlkLk1yYWlkQWN0aXZpdHl8Y29tLnNtYWF0by5zZGsuaW50ZXJzdGl0aWFsLkludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnVuaXR5M2Quc2VydmljZXMuYWRzLmFkdW5pdC5BZFVuaXRBY3Rpdml0eXxjb20uYXBwbG92aW4uaW1wbC5hZHZpZXcuQXBwTG92aW5PcmllbnRhdGlvbkF3YXJlSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLnJld2FyZC5wbGF5ZXIuTVRHUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRBcHBPcGVuQWRBY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRGdWxsU2NyZWVuRXhwcmVzc1ZpZGVvQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkZ1bGxzY3JlZW5UaGVtZWRBY3Rpdml0eXxjb20ubW9sb2NvLnNkay54ZW5vc3Muc2RrZGV2a2l0LmFuZHJvaWQuYWRyZW5kZXJlci5pbnRlcm5hbC5zdGF0aWNyZW5kZXJlci5TdGF0aWNBZEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20uaXJvbnNvdXJjZS5zZGsuY29udHJvbGxlci5JbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLm5ld3Jld2FyZC5wbGF5ZXIuTUJSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5hZGNvbG9ueS5zZGsuQWRDb2xvbnlBZFZpZXdBY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsuaW50ZXJzdGl0aWFsLnZpZXcuTVRHSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1icmlkZ2UubXNkay5pbnRlcnN0aXRpYWwudmlldy5NQkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5pbnRlcmFjdGl2ZWFkcy5hY3Rpdml0eS5JbnRlcmFjdGl2ZVNob3dBY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRSZXdhcmRFeHByZXNzVmlkZW9BY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5GdWxsU2NyZWVuQWRBY3Rpdml0eXxjb20uc3VwZXJzb25pY2Fkcy5zZGsuY29udHJvbGxlci5JbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20uc21hYXRvLnNkay5yZXdhcmRlZC53aWRnZXQuUmV3YXJkZWRJbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS5hcHBsb3Zpbi5hZHZpZXcuQXBwTG92aW5GdWxsc2NyZWVuQWN0aXZpdHl8Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlRnVsbHNjcmVlbkFkQWN0aXZpdHl8Y29tLnZ1bmdsZS53YXJyZW4udWkuVnVuZ2xlRmxleFZpZXdBY3Rpdml0eXxjb20uc3VwZXJzb25pY2Fkcy5zZGsuY29udHJvbGxlci5Db250cm9sbGVyQWN0aXZpdHl8Y29tLnZ1bmdsZS5hZHMuaW50ZXJuYWwudWkuVnVuZ2xlQWN0aXZpdHl8Y29tLmlyb25zb3VyY2Uuc2RrLmNvbnRyb2xsZXIuQ29udHJvbGxlckFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLnZhc3QuVmFzdEFjdGl2aXR5fGNvbS5hZGNvbG9ueS5zZGsuQWRDb2xvbnlJbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20uZml2ZV9jb3JwLmFkLkFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LkFkQWN0aXZpdHk=";

    /* renamed from: r, reason: collision with root package name */
    private static final Set<String> f29195r = new HashSet(Arrays.asList(new String(Base64.decode(INTERSTITIAL_ACTIVITIES, 0)).split("\\|")));

    /* loaded from: classes.dex */
    public enum AdType {
        INTERSTITIAL,
        MREC,
        BANNER,
        NATIVE
    }

    /* loaded from: classes.dex */
    public enum ScreenShotOrientation {
        NOT_INITIALIZED,
        PORTRAIT,
        LANDSCAPE
    }

    /* loaded from: classes.dex */
    public enum ScreenshotValidity {
        VALID,
        UNIFORMITY_BLACK,
        UNIFORMITY_VERY_HIGH,
        UNIFORMITY_HIGH,
        UNIFORMITY_GRAY,
        NOT_SUITABLE_FOR_DASHBOARD
    }

    static {
        Logger.d(f29194q, "BrandSafetyUtils initialized with " + f29195r + ",  INTERSTITIAL_ACTIVITIES=" + INTERSTITIAL_ACTIVITIES);
        f29196s = new HashSet(Arrays.asList(new String(Base64.decode("", 0)).split("\\|")));
        Logger.d(f29194q, "BrandSafetyUtils initialized with " + f29196s + ",  INTERNAL_BROWSER_ACTIVITIES=" + INTERSTITIAL_ACTIVITIES);
        f29197t = new HashSet();
        H = 0;
        I = 0;
    }

    public static void a(String str) {
        f29196s.add(str);
    }

    public static BrandSafetyEvent.AdFormatType a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("ad_format");
            if (f29190m.equals(string) || f29191n.equals(string)) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (f29192o.equals(string)) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (f29188k.equals(string)) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (f29187j.equals(string)) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (f29189l.equals(string)) {
                return BrandSafetyEvent.AdFormatType.APPOPEN;
            }
            if ("NATIVE".equals(string)) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    public static BrandSafetyEvent.AdFormatType a(AdType adType) {
        if (adType != null) {
            switch (adType) {
                case INTERSTITIAL:
                    return BrandSafetyEvent.AdFormatType.INTER;
                case BANNER:
                    return BrandSafetyEvent.AdFormatType.BANNER;
                case MREC:
                    return BrandSafetyEvent.AdFormatType.MREC;
                case NATIVE:
                    return BrandSafetyEvent.AdFormatType.NATIVE;
            }
        }
        return null;
    }

    public static AdType b(String str) {
        if (str != null) {
            return a(BrandSafetyEvent.AdFormatType.valueOf(str));
        }
        return null;
    }

    public static AdType a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType != null) {
            switch (adFormatType) {
                case INTER:
                case REWARD:
                case APPOPEN:
                    return AdType.INTERSTITIAL;
                case BANNER:
                case LEADER:
                    return AdType.BANNER;
                case MREC:
                    return AdType.MREC;
                case NATIVE:
                    return AdType.NATIVE;
            }
        }
        return null;
    }

    /* loaded from: classes.dex */
    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.endsWith(BrandSafetyUtils.f29180a);
        }
    }

    /* loaded from: classes.dex */
    static class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        private String f29232a;

        public b(String str) {
            this.f29232a = null;
            this.f29232a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.contains(this.f29232a);
        }
    }

    public static void detectAdClick(Intent intent, String sdkPackageName) {
        a(intent, sdkPackageName, false);
    }

    public static void a(final Intent intent, final String str, final boolean z2) {
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d(f29194q, "detect ad click invoked, sdk=" + str);
            if (com.safedk.android.utils.k.c()) {
                G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.1
                    @Override // java.lang.Runnable
                    public void run() {
                        BrandSafetyUtils.c(intent, str, z2);
                    }
                });
            } else {
                c(intent, str, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Intent intent, String str, boolean z2) {
        Uri uri;
        String str2;
        String url;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.d(f29194q, "detect ad click started, current timestamp (elapsed)=" + elapsedRealtime + ", sdk=" + mainSdkPackage + ", intent=" + com.safedk.android.utils.k.a(intent) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (SafeDK.getInstance().r()) {
                Logger.d(f29194q, "detect ad click - should monitor");
                if (intent != null) {
                    Intent intent2 = (Intent) intent.clone();
                    Logger.d(f29194q, "detect ad click - intent cloned");
                    int f2 = SafeDK.getInstance().f();
                    Logger.d(f29194q, "detect ad click - redirect click timeout is " + f2);
                    Uri data = intent2.getData();
                    String a2 = a(mainSdkPackage, intent2);
                    if (a2 != null) {
                        Logger.d(f29194q, "detect ad click - uri extracted from intent extras");
                        uri = Uri.parse(a2);
                    } else {
                        uri = data;
                    }
                    String str3 = null;
                    if (uri == null) {
                        str2 = null;
                    } else {
                        String uri2 = uri.toString();
                        try {
                            if (com.safedk.android.utils.k.w(uri.toString())) {
                                Logger.d(f29194q, "detect ad click - Uri is a store url: " + uri);
                                url = uri.toString();
                            } else {
                                URL url2 = new URL(uri.toString());
                                Logger.d(f29194q, "detect ad click - Uri is a standard url: " + url2);
                                url = url2.toString();
                            }
                            str3 = url;
                            str2 = uri2;
                        } catch (MalformedURLException e2) {
                            Logger.d(f29194q, "detect ad click - Uri is not a valid url: " + uri);
                            str2 = uri2;
                        }
                    }
                    String b2 = b(mainSdkPackage, intent2);
                    u a3 = DetectTouchUtils.a(mainSdkPackage);
                    long longValue = a3 == null ? 0L : a3.f29770a.longValue();
                    long longValue2 = a3 == null ? 0L : a3.f29771b.longValue();
                    String str4 = a3 == null ? null : a3.f29772c;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (("android.intent.action.VIEW".equals(intent2.getAction()) || intent2.getAction() == null) && str3 != null) {
                        Logger.d(f29194q, "detect ad click - has URL, intentUrl: " + str3);
                        AdNetworkDiscovery h2 = CreativeInfoManager.h(mainSdkPackage);
                        if (h2 != null && h2.e(str3)) {
                            Logger.d(f29194q, "detect ad click - url should be ignored (by discovery class), skipping");
                            return;
                        }
                        if (!a(intent)) {
                            Logger.d(f29194q, "detect ad click - not handled (yet)");
                            Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                            StatsCollector c2 = StatsCollector.c();
                            if (foregroundActivity != null && c2 != null) {
                                Logger.d(f29194q, "detect ad click - has foreground");
                                InterstitialFinder y2 = SafeDK.getInstance().y();
                                n d2 = y2 != null ? y2.d(foregroundActivity) : null;
                                boolean z3 = false;
                                if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().i(str4)) {
                                    z3 = true;
                                }
                                if (y2 != null && d2 != null && !z3) {
                                    Logger.d(f29194q, "detect ad click - has interstitial");
                                    boolean d3 = d2.d();
                                    Logger.d(f29194q, "detect ad click - clicked " + d3);
                                    Logger.d(f29194q, "detect ad click - last touch event(elapsed): " + longValue + " last touch event(current time millis): " + longValue2 + ", activityAddress=" + a(foregroundActivity.getClass().getName(), true));
                                    if (elapsedRealtime2 - longValue < 20000 && y2.a(str3, mainSdkPackage, str4)) {
                                        if (str4 != null) {
                                            ImpressionLog.a[] aVarArr = new ImpressionLog.a[2];
                                            aVarArr[0] = new ImpressionLog.a("url", str3);
                                            aVarArr[1] = new ImpressionLog.a(ImpressionLog.E, z2 ? RedirectEvent.f29830j : RedirectEvent.f29828h);
                                            com.safedk.android.analytics.brandsafety.b.a(str4, ImpressionLog.f29262n, aVarArr);
                                        } else {
                                            n d4 = y2.d(foregroundActivity);
                                            ImpressionLog.a[] aVarArr2 = new ImpressionLog.a[2];
                                            aVarArr2[0] = new ImpressionLog.a("url", str3);
                                            aVarArr2[1] = new ImpressionLog.a(ImpressionLog.E, z2 ? RedirectEvent.f29830j : RedirectEvent.f29828h);
                                            d4.a(ImpressionLog.f29262n, aVarArr2);
                                        }
                                    }
                                    String a4 = t.a(mainSdkPackage, longValue);
                                    boolean z4 = true;
                                    if (SafeDK.b() && c2.a(mainSdkPackage, a4)) {
                                        z4 = false;
                                    } else {
                                        Logger.d(f29194q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    }
                                    Logger.d(f29194q, "detect ad click - should handle click " + z4);
                                    if (z4) {
                                        Logger.d(f29194q, "detect ad click - current elapsed realtime: " + elapsedRealtime2 + ", activity last touched: " + longValue + ", diff: " + (elapsedRealtime2 - longValue) + ", isClicked: " + d3);
                                        if ((longValue == 0 || elapsedRealtime2 - longValue > f2) && !d3) {
                                            Logger.d(f29194q, "detect ad click - redirect");
                                            a(mainSdkPackage, elapsedRealtime, longValue2, o(mainSdkPackage) ? RedirectEvent.f29831k : RedirectEvent.f29828h, str3, foregroundActivity.getClass().getName());
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Logger.d(f29194q, "detect ad click - no interstitial");
                                a(mainSdkPackage, str2, b2, z2 ? RedirectEvent.f29830j : null);
                                if (elapsedRealtime2 - longValue < 20000) {
                                    Logger.d(f29194q, "detect ad click - updating click URL. address : " + str4);
                                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().z(), SafeDK.getInstance().B())) {
                                        if (aVar != null && aVar.a(str3, mainSdkPackage, str4) && str4 != null) {
                                            ImpressionLog.a[] aVarArr3 = new ImpressionLog.a[2];
                                            aVarArr3[0] = new ImpressionLog.a("url", str3);
                                            aVarArr3[1] = new ImpressionLog.a(ImpressionLog.E, z2 ? RedirectEvent.f29830j : "normal");
                                            com.safedk.android.analytics.brandsafety.b.a(str4, ImpressionLog.f29262n, aVarArr3);
                                        }
                                    }
                                }
                                String a5 = t.a(mainSdkPackage, longValue);
                                Logger.d(f29194q, "detect ad click - last touch event(elapsed): " + longValue + ", last touch event(current time millis): " + longValue2 + ", redirectInfoKey: " + a5);
                                Logger.d(f29194q, "detect ad click - current elapsed realtime: " + elapsedRealtime2 + ", last touch event(elapsed): " + longValue + ", diff: " + (elapsedRealtime2 - longValue));
                                if (SafeDK.b() && !c2.a(mainSdkPackage, a5) && (longValue == 0 || elapsedRealtime2 - longValue > f2)) {
                                    a(mainSdkPackage, elapsedRealtime, longValue2, o(mainSdkPackage) ? RedirectEvent.f29831k : RedirectEvent.f29828h, str3, foregroundActivity.getClass().getName());
                                    return;
                                } else {
                                    Logger.d(f29194q, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    Logger.d(f29194q, "detect ad click - Intent doesn't have url");
                    Activity foregroundActivity2 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                    if (foregroundActivity2 != null) {
                        if (!a(intent)) {
                            a(mainSdkPackage, str2, b2, z2 ? RedirectEvent.f29830j : null);
                            if (g(foregroundActivity2.getClass().getName())) {
                                Logger.d(f29194q, "detect ad click - current elapsed realtime: " + elapsedRealtime2 + ", webview last touched: " + longValue + ", diff: " + (elapsedRealtime2 - longValue));
                                if (longValue == 0 || elapsedRealtime2 - longValue > f2) {
                                    Logger.d(f29194q, "detect ad click - Redirecting through ad");
                                    a(mainSdkPackage, elapsedRealtime, longValue2, o(mainSdkPackage) ? RedirectEvent.f29831k : RedirectEvent.f29829i, str3, foregroundActivity2.getClass().getName());
                                    return;
                                }
                                return;
                            }
                            Logger.d(f29194q, "detect ad click - activity " + foregroundActivity2.getClass().getName() + " is not in the redirect tracked activities, ignoring");
                            return;
                        }
                        return;
                    }
                    Logger.d(f29194q, "detect ad click - current foreground activity is null");
                }
            }
        } catch (Throwable th) {
            Logger.d(f29194q, "error in detect ad click", th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    private static String a(String str, Intent intent) {
        AdNetworkDiscovery h2;
        Logger.d(f29194q, "Attempting to extract url from intent extra, sdkPackageName is " + str + ", intent : " + com.safedk.android.utils.k.a(intent));
        String str2 = null;
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (h2 = CreativeInfoManager.h(str)) == null) {
                return null;
            }
            ?? g2 = h2.g();
            Iterator it = g2.iterator();
            String str3 = g2;
            while (true) {
                try {
                    str3 = str2;
                    if (!it.hasNext()) {
                        return str3;
                    }
                    String str4 = (String) it.next();
                    Logger.d(f29194q, "looking for url in intent extra with name : " + str4);
                    str2 = intent.getExtras().getString(str4);
                    if (str2 != null) {
                        Logger.d(f29194q, "found url in intent : " + str2);
                        return str2;
                    }
                    str3 = str3;
                } catch (Throwable th) {
                    str2 = str3;
                    Logger.e(f29194q, "Exception when attempting to extract url from intent extra");
                    return str2;
                }
            }
        } catch (Throwable th2) {
        }
    }

    private static String b(String str, Intent intent) {
        AdNetworkDiscovery h2;
        Logger.d(f29194q, "Attempting to extract expanded ad webview address from intent extra, sdkPackageName is " + str + ", intent: " + com.safedk.android.utils.k.a(intent));
        if (intent == null) {
            return null;
        }
        try {
            if (intent.getExtras() == null || (h2 = CreativeInfoManager.h(str)) == null) {
                return null;
            }
            return h2.a(intent.getExtras());
        } catch (Throwable th) {
            Logger.e(f29194q, "Exception when attempting to extract expanded ad webview address from intent extra");
            return null;
        }
    }

    public static void detectAdClick(final Uri uri, final String sdkPackageName) {
        if (com.safedk.android.utils.k.c()) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.b(uri, sdkPackageName);
                }
            });
        } else {
            b(uri, sdkPackageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Uri uri, String str) {
        RedirectDetails h2;
        Logger.d(f29194q, "detect ad click Uri invoked, sdk=" + str + ", url = " + uri.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        if (com.safedk.android.utils.g.f30054i.equals(str) && SafeDK.N()) {
            u a2 = DetectTouchUtils.a(str);
            long longValue = a2 == null ? 0L : a2.f29770a.longValue();
            if ((longValue == 0 || SystemClock.elapsedRealtime() - longValue > ((long) SafeDK.getInstance().f())) && ((h2 = h()) == null || h2.f29341g == null || !h2.f29341g.equals(uri.toString()))) {
                try {
                    throw new Exception("redirect potential source");
                } catch (Exception e2) {
                    Logger.d(f29194q, "detect ad click, redirect potential source", e2);
                }
            }
        }
        a(intent, str, true);
    }

    private static boolean a(Intent intent) {
        int identityHashCode = System.identityHashCode(intent);
        if (f29198u.contains(Integer.valueOf(identityHashCode))) {
            Logger.d(f29194q, "mark intent as handled found " + identityHashCode);
            return true;
        }
        if (f29198u.size() >= 100) {
            Logger.d(f29194q, "mark intent as handled > MAX events");
            f29198u.remove(0);
        }
        Logger.d(f29194q, "mark intent as handled add " + identityHashCode);
        f29198u.add(Integer.valueOf(identityHashCode));
        return false;
    }

    public static void a(String str, String str2, WebView webView) {
        InterstitialFinder y2;
        try {
            Logger.d(f29194q, "attach loaded url to detected click started, sdk=" + str + ", url=" + str2 + ", webview=" + webView.toString() + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            SafeDK safeDK = SafeDK.getInstance();
            if (!SafeDK.W() || safeDK == null || str2 == null) {
                Logger.d(f29194q, "attach loaded url to detected click loaded url is empty or app not initialized yet, skipping.");
                return;
            }
            if (str2.equals("about:blank") || str2.equals("About:blank")) {
                Logger.d(f29194q, "url is blank, skipping");
                return;
            }
            AdNetworkDiscovery h2 = CreativeInfoManager.h(str);
            if (h2 != null && h2.e(str2)) {
                Logger.d(f29194q, "url should be ignored (by discovery class), skipping");
                return;
            }
            if ((str2.startsWith("http://") || str2.startsWith("https://")) && (y2 = SafeDK.getInstance().y()) != null) {
                y2.b(str2, str, a(webView));
            }
            if (SafeDK.b() && StatsCollector.c() != null) {
                ConcurrentHashMap<String, StatsEvent> a2 = StatsCollector.c().a(StatsCollector.EventType.redirect);
                Iterator<String> it = a2.keySet().iterator();
                while (it.hasNext()) {
                    RedirectEvent redirectEvent = (RedirectEvent) a2.get(it.next());
                    if (redirectEvent.i().equals(str) && redirectEvent.d() == null) {
                        Logger.d(f29194q, "Attaching url to url-less redirect event. event = " + redirectEvent.toString() + ", url = " + str2);
                        redirectEvent.a(str2);
                    }
                }
                return;
            }
            Logger.d(f29194q, "Reporter thread not initialized or stats collector instance is null, skipping");
        } catch (Throwable th) {
            Logger.e(f29194q, "failed to attach url to detected click (internal browser)", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byteArray, 0, byteArray.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            Logger.e(f29194q, "Failed to get hash value for bitmap", e2);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.graphics.Bitmap r5, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.ScreenShotOrientation r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(android.graphics.Bitmap, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType, java.lang.String, java.lang.String, java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$ScreenShotOrientation):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r4, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.AdType r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, com.safedk.android.analytics.brandsafety.BrandSafetyUtils.ScreenShotOrientation r9) {
        /*
            if (r4 != 0) goto L3
        L2:
            return
        L3:
            java.lang.String r0 = a(r5, r6, r7, r8, r9)
            java.lang.String r1 = ".jpg"
            java.lang.String r2 = ".txt"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "BrandSafetyUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Saving ad text to file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.safedk.android.utils.Logger.d(r1, r2)
            r2 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L50
            byte[] r0 = r4.getBytes()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5c
            r1.write(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5c
            r1.close()     // Catch: java.lang.Throwable -> L5a java.lang.Throwable -> L5c
            if (r1 == 0) goto L2
            r1.close()     // Catch: java.io.IOException -> L3d
            goto L2
        L3d:
            r0 = move-exception
            goto L2
        L3f:
            r0 = move-exception
            r1 = r2
        L41:
            java.lang.String r2 = "BrandSafetyUtils"
            java.lang.String r3 = "Failed to save ad text to file"
            com.safedk.android.utils.Logger.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L2
            r1.close()     // Catch: java.io.IOException -> L4e
            goto L2
        L4e:
            r0 = move-exception
            goto L2
        L50:
            r0 = move-exception
            r1 = r2
        L52:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L58
        L57:
            throw r0
        L58:
            r1 = move-exception
            goto L57
        L5a:
            r0 = move-exception
            goto L52
        L5c:
            r0 = move-exception
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$AdType, java.lang.String, java.lang.String, java.lang.String, com.safedk.android.analytics.brandsafety.BrandSafetyUtils$ScreenShotOrientation):void");
    }

    public static String a(String str, boolean z2) {
        String str2;
        try {
            if (str == null) {
                Logger.d(f29194q, "Parameter name 'activityName' cannot be null");
                str2 = null;
            } else {
                String[] split = str.split("@");
                str2 = split.length > 1 ? split[z2 ? (char) 1 : (char) 0] : "";
            }
            return str2;
        } catch (Throwable th) {
            Logger.e(f29194q, "Failed to get activity address for " + str, th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long c(String str) {
        try {
            return new File(str).length();
        } catch (Throwable th) {
            Logger.e(f29194q, "Failed to create new file for screenshot", th);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d(String str) {
        synchronized (BrandSafetyUtils.class) {
            if (str != null) {
                Logger.d(f29194q, "remove ad files started, filepath " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if (new File(str).exists()) {
                    if (!new File(str).delete()) {
                        Logger.d(f29194q, "remove ad files failed to delete file " + str);
                    } else {
                        Logger.d(f29194q, "remove ad files deleted file " + str);
                    }
                } else {
                    Logger.d(f29194q, "remove ad files filePath does not exist. file=" + str);
                }
                File file = new File(str.replace(f29180a, f29181b));
                if (file.exists()) {
                    Logger.d(f29194q, "remove ad files deleting file " + file.getAbsolutePath());
                    if (!file.delete()) {
                        Logger.d(f29194q, "remove ad files failed to delete file " + file.getAbsolutePath());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(AdType adType, String str) {
        synchronized (BrandSafetyUtils.class) {
            Logger.d(f29194q, "remove all ad files started, adType = " + adType.name() + " , impression = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (str.contains("_")) {
                String str2 = str.split("_")[1];
                File dir = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0);
                Logger.d(f29194q, "remove all ad files impressionId = " + str2);
                File[] listFiles = dir.listFiles(new b(str2));
                if (listFiles != null && listFiles.length > 0) {
                    for (File file : listFiles) {
                        Logger.d(f29194q, "remove all ad files deleting file for impression " + str2 + " : " + file.getAbsolutePath());
                        d(file.getAbsolutePath());
                    }
                }
            }
        }
    }

    public static String a(Class cls) {
        return e(cls.getName());
    }

    public static String e(String str) {
        if (str != null) {
            return r(str) ? com.safedk.android.utils.g.f30053h : SdksMapping.getSdkPackageByClass(str);
        }
        return null;
    }

    public static String b(Class cls) {
        String name = cls.getName();
        String e2 = e(name);
        if (e2 == null) {
            e2 = name;
        }
        Logger.v(f29194q, "SDK package for class " + name + " is " + e2);
        return e2 == null ? "unknown" : e2;
    }

    public static boolean f(String str) {
        return r(str) || SdksMapping.getSdkPackageByClass(str) != null;
    }

    private static boolean r(String str) {
        return str.startsWith("maps.bi.f") || str.startsWith("avu") || str.startsWith(MobileAds.ERROR_DOMAIN);
    }

    public static a a(String str, Bitmap bitmap) {
        return a(str, bitmap, 1000, AdType.INTERSTITIAL);
    }

    public static a b(String str, Bitmap bitmap) {
        return a(str, bitmap, 500, AdType.BANNER);
    }

    private static a a(String str, Bitmap bitmap, int i2, AdType adType) {
        int i3;
        a aVar = new a();
        Random random = new Random();
        HashMap hashMap = new HashMap();
        Logger.d(f29194q, "scanBitmap started, sdkPackage = " + str + ", adType = " + adType.name() + " bitmap scan : margins are : top " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.2f) + " , right " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.2f) + ", left " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.2f) + ", right " + CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.2f) + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        int width = bitmap.getWidth();
        int i4 = (int) (r5 * width);
        int i5 = (int) (width - (r1 * width));
        int height = bitmap.getHeight();
        int i6 = (int) (r0 * height);
        int i7 = (int) (height - (height * r6));
        for (int i8 = 0; i8 < i2; i8++) {
            int pixel = 16777215 & bitmap.getPixel(random.nextInt(i5 - i4) + i4, random.nextInt(i7 - i6) + i6);
            Integer num = (Integer) hashMap.get(Integer.valueOf(pixel));
            if (num == null) {
                hashMap.put(Integer.valueOf(pixel), 1);
            } else {
                hashMap.put(Integer.valueOf(pixel), Integer.valueOf(num.intValue() + 1));
            }
        }
        int i9 = 0;
        Iterator it = hashMap.values().iterator();
        while (true) {
            i3 = i9;
            if (!it.hasNext()) {
                break;
            }
            i9 = ((Integer) it.next()).intValue();
            if (i9 > i3) {
                aVar.a(i9);
            } else {
                i9 = i3;
            }
        }
        if (hashMap.get(0) != null && ((Integer) hashMap.get(0)) != null) {
            int intValue = (((Integer) hashMap.get(0)).intValue() * 100) / i2;
            Logger.d(f29194q, "bitmap scan : Black Pixel Percentage is " + intValue + " (" + hashMap.get(0) + RemoteSettings.FORWARD_SLASH_STRING + i2 + ")");
            aVar.b(intValue);
        }
        if (hashMap.get(Integer.valueOf(x)) != null && ((Integer) hashMap.get(Integer.valueOf(x))) != null) {
            int intValue2 = (((Integer) hashMap.get(Integer.valueOf(x))).intValue() * 100) / i2;
            Logger.d(f29194q, "bitmap scan : Grey Pixel Percentage is " + intValue2 + " (" + hashMap.get(Integer.valueOf(x)) + RemoteSettings.FORWARD_SLASH_STRING + i2 + ")");
            aVar.c(intValue2);
        }
        Logger.v(f29194q, "bitmap scan : maxPixelValue = " + i3);
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            aVar.a(a((Map<Integer, Integer>) hashMap));
        }
        return aVar;
    }

    private static boolean a(Map<Integer, Integer> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (Color.red(intValue) != Color.blue(intValue) || Color.blue(intValue) != Color.green(intValue)) {
                Logger.d(f29194q, "Image is not Greyscale");
                return false;
            }
        }
        Logger.d(f29194q, "Image is Greyscale");
        return true;
    }

    public static boolean a(int i2) {
        return a(i2, 1000, SafeDK.getInstance().E());
    }

    public static boolean b(int i2) {
        return a(i2, 500, SafeDK.getInstance().R());
    }

    public static boolean c(int i2) {
        return a(i2, 500, SafeDK.getInstance().R());
    }

    private static boolean a(int i2, int i3, float f2) {
        Logger.d(f29194q, "isScreenshotEnough Max Uniform Pixel Percentage to Stop Sampling is " + f2);
        return ((float) i2) < (f2 / 100.0f) * ((float) i3);
    }

    public static ScreenshotValidity a(String str, a aVar) {
        return a(str, aVar, 1000, CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().F()));
    }

    public static ScreenshotValidity b(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().S());
    }

    public static ScreenshotValidity c(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().S());
    }

    public static ScreenshotValidity a(String str, a aVar, int i2, float f2) {
        Logger.d(f29194q, "screenshot validity check started, number of samples: " + i2 + ", BitmapScanResult: " + aVar);
        if (aVar.b() > 98) {
            Logger.d(f29194q, "screenshot validity check, black pixel percentage is above threshold, image is black (not valid)");
            return ScreenshotValidity.UNIFORMITY_BLACK;
        }
        int a2 = (aVar.a() * 100) / i2;
        if (a2 > 98) {
            Logger.d(f29194q, "screenshot validity check, uniform pixel count is " + a2 + "% => above threshold, image is uniform (not valid)");
            return ScreenshotValidity.UNIFORMITY_VERY_HIGH;
        }
        if (a2 > f2) {
            Logger.d(f29194q, "screenshot validity check, uniformity check : Screenshot max color pixel count is above uniformity threshold, image is not valid (result = " + a2 + "%)");
            return ScreenshotValidity.UNIFORMITY_HIGH;
        }
        if (aVar.b() > 10 && aVar.c() > 10) {
            Logger.d(f29194q, "screenshot validity check, black pixel percentage is " + aVar.b() + "% , grey pixel percentage is " + aVar.c() + "%, => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (aVar.c() > 50) {
            Logger.d(f29194q, "screenshot validity check, black pixel percentage is " + aVar.b() + "%  => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            if (aVar.d()) {
                Logger.d(f29194q, "screenshot validity check, Screenshot is NSFD");
                return ScreenshotValidity.NOT_SUITABLE_FOR_DASHBOARD;
            }
            Logger.d(f29194q, "screenshot validity check, Screenshot is NOT NSFD");
        }
        return ScreenshotValidity.VALID;
    }

    public static String a(AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
        Logger.d(f29194q, "getFileName Sdk UUID is " + sdkUUIDByPackage + " for sdk " + str2);
        return SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0) + File.separator + str + "_" + sdkUUIDByPackage + "_" + str3 + "_" + screenShotOrientation.name().toLowerCase() + f29180a;
    }

    public static boolean c(Class cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        Logger.d(f29194q, "Redirect detection interstitial activity check started, Activity name : " + str + ", result : " + f29196s.contains(str) + ", redirectDetectionInterstitialActivities= " + f29196s);
        return f29196s.contains(str);
    }

    public static boolean d(Class cls) {
        return h(cls.getName());
    }

    public static boolean h(String str) {
        Logger.d(f29194q, "Interstitial activity check started, Activity name : " + str + ", result : " + f29195r.contains(str) + ", interstitialActivities= " + f29195r);
        return f29195r.contains(str);
    }

    public static String i(String str) {
        for (String str2 : f29195r) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static void j(String str) {
        Logger.d(f29194q, "addInterstitialActivity started name=" + str);
        f29195r.add(str);
    }

    public static void k(String str) {
        Logger.d(f29194q, "removeInterstitialActivity started name=" + str);
        f29195r.remove(str);
    }

    public static int b(AdType adType) {
        try {
            Logger.d(f29194q, "get image count by ad type started, adType = " + adType.name() + " : " + adType);
            File dir = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0);
            File[] listFiles = dir.listFiles();
            String str = "";
            for (File file : listFiles) {
                str = str + ", " + file.getName();
            }
            Logger.d(f29194q, "get image count by ad type all files in " + dir.getName() + " : " + str);
            Logger.d(f29194q, "get image count by ad type returned " + listFiles.length + " for adType " + adType.name());
            return listFiles.length;
        } catch (Throwable th) {
            Logger.d(f29194q, "get image count by ad type  error :  " + th.getMessage(), th);
            return -1;
        }
    }

    public static List<d> c(AdType adType) {
        ScreenShotOrientation screenShotOrientation;
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(f29194q, "Restoring " + adType + " images for upload, isOnUiThread = " + com.safedk.android.utils.k.c());
            File[] listFiles = SafeDK.getInstance().l().getDir("SafeDK_" + adType, 0).listFiles(new c());
            if (listFiles != null) {
                Logger.d(f29194q, "Found " + listFiles.length + " candidate images for upload");
                for (File file : listFiles) {
                    String name = file.getName();
                    Logger.d(f29194q, "Checking file " + name);
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath.replace(f29180a, f29181b));
                    Logger.d(f29194q, "Deleting file " + file.getAbsolutePath());
                    file.delete();
                    if (file2.exists()) {
                        file2.delete();
                    }
                    String[] split = name.replace(f29180a, "").split("_");
                    if (split.length == 4) {
                        String str = split[0];
                        String str2 = split[1];
                        Logger.d(f29194q, "sdk = " + split[1]);
                        if (SdksMapping.getSdkPackageByPackageUUID(split[1]) != null) {
                            str2 = SdksMapping.getSdkPackageByPackageUUID(split[1]);
                            Logger.d(f29194q, "sdk value replaced : " + str2);
                        }
                        String str3 = split[2];
                        try {
                            screenShotOrientation = ScreenShotOrientation.valueOf(split[3].toUpperCase());
                        } catch (IllegalArgumentException e2) {
                            screenShotOrientation = ScreenShotOrientation.NOT_INITIALIZED;
                        }
                        Logger.d(f29194q, "Restore image for upload: " + absolutePath);
                        arrayList.add(new d(str, str2, str3, screenShotOrientation, absolutePath, null));
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(f29194q, "Error while restoring ads for upload", th);
            new CrashReporter().caughtException(th);
        }
        return arrayList;
    }

    private static void j() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().l().getResources().getDisplayMetrics();
        I = displayMetrics.heightPixels;
        H = displayMetrics.widthPixels;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        if (H == 0) {
            j();
        }
        return H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b() {
        if (I == 0) {
            j();
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScreenShotOrientation c() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().l().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels > displayMetrics.widthPixels ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScreenShotOrientation b(Bitmap bitmap) {
        if (bitmap == null) {
            return ScreenShotOrientation.NOT_INITIALIZED;
        }
        return bitmap.getHeight() > bitmap.getWidth() ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static String l(String str) {
        if (str != null) {
            String[] split = str.split("@");
            if (split.length > 1) {
                return split[1];
            }
        }
        return "";
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Integer.toHexString(obj.hashCode());
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        String f29233a;

        /* renamed from: b, reason: collision with root package name */
        String f29234b;

        /* renamed from: c, reason: collision with root package name */
        String f29235c;
        ScreenShotOrientation d;
        String e;

        /* renamed from: f, reason: collision with root package name */
        String f29236f;

        public d(String str, String str2, String str3, ScreenShotOrientation screenShotOrientation, String str4, String str5) {
            this.f29233a = str;
            this.f29234b = str2;
            this.f29235c = str3;
            this.d = screenShotOrientation;
            this.e = str4;
            this.f29236f = str5;
        }

        public String a() {
            return this.f29233a;
        }

        public String b() {
            return this.f29234b;
        }

        public String c() {
            return this.f29235c;
        }

        public ScreenShotOrientation d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public String f() {
            return this.f29236f;
        }
    }

    private static void a(String str, long j2, long j3, String str2, String str3, String str4) {
        try {
            Logger.d(f29194q, "Report click url with no impression to server starting, sdkPackageName=" + str + ", url=" + str3 + ", currentForegroundActivityName=" + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            if (!SafeDK.W()) {
                Logger.d(f29194q, "Max not initialized, this is not a Max mediated App.");
            }
            if (!e.a(str)) {
                Logger.d(f29194q, "Redirect reporting not supported for Sdk " + str + ", report will not be sent");
                return;
            }
            if (str3 != null) {
                Uri parse = Uri.parse(str3);
                if (parse.getScheme() != null && parse.getHost() != null) {
                    if (e.a(str, str3)) {
                        Logger.d(f29194q, "Ignoring this intent as it was already reported , sdkPackageName=" + str + " ,intentUrl=" + str);
                        return;
                    }
                    RedirectEvent redirectEvent = new RedirectEvent(str, str3, str2, str4, j2, j3);
                    redirectEvent.a(p.a().b());
                    if (SafeDK.b()) {
                        StatsCollector.c().a(redirectEvent);
                    } else {
                        Logger.d(f29194q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    }
                }
            }
        } catch (Throwable th) {
            Logger.e(f29194q, "Exception during attempt to create redirect event", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final String f29237a = "SdkUrlRedirectManager";

        /* renamed from: b, reason: collision with root package name */
        private static Map<String, Long> f29238b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private static int f29239c = 1000;

        private e() {
        }

        private static String b(String str, String str2) {
            return str + "_" + str2;
        }

        private static boolean c(String str, String str2) {
            Logger.d(f29237a, "Check : does timestamp exist for Sdk and url ?  sdkPackageName=" + str + ", url=" + str2 + " , result = " + f29238b.containsKey(b(str, str2)));
            return f29238b.containsKey(b(str, str2));
        }

        private static long d(String str, String str2) {
            Logger.d(f29237a, "getting latest timestamp for Sdk and url started. sdkPackageName=" + str + ", url=" + str2);
            if (c(str, str2)) {
                return f29238b.get(b(str, str2)).longValue();
            }
            return 0L;
        }

        public static boolean a(String str, String str2) {
            long currentTimeMillis = System.currentTimeMillis();
            a();
            long d = d(str, str2);
            Logger.d(f29237a, "Checking if we should ignore the redirect instance sdkPackageName=" + str + ", url=" + str2 + ", timestamp=" + currentTimeMillis + ",System.currentTimeMillis()=" + System.currentTimeMillis() + ", latestTimestamp=" + d + ", diff=" + (System.currentTimeMillis() - d));
            if (d != 0 && System.currentTimeMillis() - d < f29239c) {
                Logger.d(f29237a, "should ignore this redirect.");
                return true;
            }
            a(str, str2, currentTimeMillis);
            return false;
        }

        private static void a(String str, String str2, long j2) {
            Logger.d(f29237a, "Update latest timestamp for Sdk and url started. sdkPackageName=" + str + ", url=" + str2);
            f29238b.put(b(str, str2), Long.valueOf(j2));
            Logger.d(f29237a, "timestamps : " + f29238b.toString());
        }

        private static void a() {
            Logger.d(f29237a, "Clear data started, (" + f29238b.size() + ") : " + f29238b.toString());
            ArrayList<String> arrayList = new ArrayList();
            for (String str : f29238b.keySet()) {
                Logger.d(f29237a, "Clear System.currentTimeMillis()-sdkAndUrlToTimestamp.get(key)=" + (System.currentTimeMillis() - f29238b.get(str).longValue()));
                if (System.currentTimeMillis() - f29238b.get(str).longValue() > f29239c) {
                    Logger.d(f29237a, "Added key for removal : " + str);
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                for (String str2 : arrayList) {
                    Logger.d(f29237a, "Removing key " + str2);
                    f29238b.remove(str2);
                }
            }
            Logger.d(f29237a, "Clear data finished, Items (" + f29238b.size() + ") : " + f29238b.toString());
        }

        public static boolean a(String str) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
            if (sdkUUIDByPackage != null && sdkUUIDByPackage.length() > 0 && SdksMapping.getRedirectSupportedSdks() != null) {
                Logger.d(f29237a, "sdk=" + str + ", sdkUid=" + sdkUUIDByPackage + ", supported ? " + SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage));
                return SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage);
            }
            Logger.d(f29237a, "Cannot determine if sdk is redirect detection supported, sdk=" + str);
            return false;
        }
    }

    public static void m(String str) {
        Logger.d(f29194q, "adding to redirect current open fullscreen ad collection. sdk = " + str + ", redirectDetectionCurrentInterstitialBySdk = " + f29197t.toString());
        f29197t.add(str);
    }

    public static void n(String str) {
        Logger.d(f29194q, "removing from redirect current open fullscreen ad collection. sdk = " + str + ", redirectDetectionCurrentInterstitialBySdk = " + f29197t.toString());
        f29197t.remove(str);
    }

    public static boolean o(String str) {
        Logger.d(f29194q, "checking if there is a redirect current open fullscreen ad in collection. sdk = " + str + ", result is " + f29197t.contains(str) + ", redirectDetectionCurrentInterstitialBySdk = " + f29197t.toString());
        return f29197t.contains(str);
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final String f29229a = "BitmapScanResult";

        /* renamed from: b, reason: collision with root package name */
        private int f29230b;

        /* renamed from: c, reason: collision with root package name */
        private int f29231c;
        private int d;
        private boolean e = false;

        public int a() {
            return this.f29230b;
        }

        public void a(int i2) {
            this.f29230b = i2;
        }

        public int b() {
            return this.f29231c;
        }

        public void b(int i2) {
            Logger.d(f29229a, "setBlackPixelPercentage : " + i2);
            this.f29231c = i2;
        }

        public int c() {
            return this.d;
        }

        public void c(int i2) {
            Logger.d(f29229a, "setGreyPixelPercentage : " + i2);
            this.d = i2;
        }

        public boolean d() {
            return this.f29231c > 50 && this.e;
        }

        public void a(boolean z2) {
            this.e = z2;
        }

        public String toString() {
            return "{MaxPixelCount = " + this.f29230b + ", BlackPixelPercentage = " + this.f29231c + "%, GreyPixelPercentage = " + this.d + "%}";
        }
    }

    public static String p(String str) {
        byte[] bArr = new byte[0];
        if (new File(str).exists()) {
            byte[] bArr2 = new byte[0];
            try {
                return new BigInteger(1, MessageDigest.getInstance("MD5").digest(a(new File(str)))).toString(16);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
        return "";
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(bArr)).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            return "";
        }
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[100];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e2) {
            Logger.d(f29194q, "Exception reading file : " + e2.getMessage(), e2);
            return null;
        }
    }

    public static void onMraidOpen(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String str;
        Logger.d(f29194q, "on mraid open, sdk: " + sdkPackageName + ", urlJsonString: " + urlJsonString + ", object: " + obj + ", originated method: " + originatedMethod);
        if (obj != null && urlJsonString != null) {
            try {
                str = new JSONObject(urlJsonString).optString("url");
            } catch (JSONException e2) {
                Logger.d(f29194q, "on mraid open, failed to get url from: " + urlJsonString);
                str = null;
            }
            for (Field field : obj.getClass().getFields()) {
                try {
                    if (field.get(obj) instanceof WebView) {
                        onMraidOpen(sdkPackageName, null, str, (WebView) field.get(obj), originatedMethod);
                    }
                } catch (IllegalAccessException e3) {
                    Logger.d(f29194q, "on mraid open, failed to get webview from: " + obj);
                }
            }
        }
    }

    public static void onMraidExpand(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String str;
        Logger.d(f29194q, "on mraid expand, sdk: " + sdkPackageName + ", urlJsonString: " + urlJsonString + ", object: " + obj + ", originated method: " + originatedMethod);
        if (obj != null && urlJsonString != null) {
            try {
                str = new JSONObject(urlJsonString).optString("url");
            } catch (JSONException e2) {
                Logger.d(f29194q, "on mraid expand, failed to get url from: " + urlJsonString);
                str = null;
            }
            for (Field field : obj.getClass().getFields()) {
                try {
                    if (field.get(obj) instanceof WebView) {
                        onMraidExpand(sdkPackageName, null, str, (WebView) field.get(obj), originatedMethod);
                    }
                } catch (IllegalAccessException e3) {
                    Logger.d(f29194q, "on mraid expand, failed to get webview from: " + obj);
                }
            }
        }
    }

    public static void onMraidOpen(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        Logger.d(f29194q, "on mraid open, sdk: " + sdkPackageName + ", str: " + str + ", url: " + url + ", webview: " + view + ", originated method: " + originatedMethod);
        if (sdkPackageName != null && url != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.REDIRECT, originatedMethod);
                    } catch (Throwable th) {
                        Logger.e(BrandSafetyUtils.f29194q, "exception while handling mraid open", th);
                    }
                }
            });
        }
    }

    public static void onMraidExpand(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        Logger.d(f29194q, "on mraid expand, sdk: " + sdkPackageName + ", str: " + str + ", url: " + url + ", webview: " + view + ", originated method: " + originatedMethod);
        if (sdkPackageName != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.EXPAND, originatedMethod);
                    } catch (Throwable th) {
                        Logger.e(BrandSafetyUtils.f29194q, "exception while handling mraid expand", th);
                    }
                }
            });
        }
    }

    public static boolean a(String str, WebView webView) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a2 = a(webView);
        u a3 = DetectTouchUtils.a(str, a2);
        long longValue = a3 == null ? 0L : a3.f29770a.longValue();
        boolean z2 = elapsedRealtime - longValue < 20000;
        Logger.d(f29194q, "is ad clicked recently - for package: " + str + " and view address: " + a2 + " returned: " + z2 + "last touch event: " + longValue + " vs current: " + elapsedRealtime);
        return z2;
    }

    public static void onShouldOverrideUrlLoading(final String sdkPackageName, final WebView view, final String url, boolean ret) {
        Logger.d(f29194q, "on should override url loading, sdk: " + sdkPackageName + ", webview: " + view + ", url: " + url + ", ret: " + ret);
        CreativeInfoManager.a(sdkPackageName, view, url);
        final String a2 = a(view);
        if (CreativeInfoManager.a(sdkPackageName, AdNetworkConfiguration.IGNORE_SHOULD_OVERRIDE_URL_CALLS, false)) {
            Logger.d(f29194q, "on should override url loading - ignoring the call because there is another way to handle this calls");
            return;
        }
        if (ret && sdkPackageName != null && view != null && url != null) {
            G.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdNetworkDiscovery h2 = CreativeInfoManager.h(sdkPackageName);
                        if (h2 != null) {
                            RedirectDetails.RedirectType f2 = h2.f(url);
                            String g2 = h2.g(url);
                            Logger.d(BrandSafetyUtils.f29194q, "on should override url loading: target url is: " + g2 + " redirect type is: " + f2);
                            if (f2 != null) {
                                Logger.d(BrandSafetyUtils.f29194q, "on should override url loading: webView's ancestors are: " + com.safedk.android.analytics.brandsafety.b.a((View) view));
                                BrandSafetyUtils.a(sdkPackageName, view, g2, f2, "shouldOverrideUrlLoading");
                                if (BrandSafetyUtils.a(sdkPackageName, view)) {
                                    Logger.d(BrandSafetyUtils.f29194q, "on should override url loading, updating click URL. address : " + a2);
                                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().z(), SafeDK.getInstance().B())) {
                                        if (aVar != null && aVar.a(g2, sdkPackageName, a2)) {
                                            com.safedk.android.analytics.brandsafety.b.a(a2, ImpressionLog.f29262n, new ImpressionLog.a("url", g2), new ImpressionLog.a(ImpressionLog.E, RedirectEvent.f29829i));
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            Logger.d(BrandSafetyUtils.f29194q, "on should override url loading, ignore redirect, sdk: " + sdkPackageName + ", webview: " + view + ", url: " + url);
                        }
                    } catch (Throwable th) {
                        Logger.e(BrandSafetyUtils.f29194q, "exception while handling should override url loading", th);
                    }
                }
            });
        } else if (!ret) {
            com.safedk.android.analytics.brandsafety.b.a(a2, ImpressionLog.f29270v, new ImpressionLog.a(ImpressionLog.J, "so"), new ImpressionLog.a("url", url), new ImpressionLog.a(ImpressionLog.L, "allow"));
        }
    }

    public static void onShouldOverrideUrlLoadingWithHeaders(String sdkPackageName, WebView view, WebResourceRequest webResourceRequest, boolean ret) {
        Logger.d(f29194q, "onShouldOverrideUrlLoadingWithHeaders started with: " + sdkPackageName + " and view: " + view + " request: " + webResourceRequest + " and ret: " + ret);
        if (Build.VERSION.SDK_INT >= 21) {
            onShouldOverrideUrlLoading(sdkPackageName, view, webResourceRequest.getUrl().toString(), ret);
        }
    }

    public static synchronized void a(String str, WebView webView, String str2, RedirectDetails.RedirectType redirectType, String str3) {
        synchronized (BrandSafetyUtils.class) {
            SafeDK safeDK = SafeDK.getInstance();
            if (SafeDK.W() && safeDK != null) {
                String replaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
                if (SafeDK.N() && E != null && str2 != null && !E.equals(str2) && !E.equals(replaceAll)) {
                    Logger.d(f29194q, "ignore redirect indication, sdk: " + str + ", url: " + str2);
                    E = null;
                } else {
                    AdType a2 = com.safedk.android.analytics.brandsafety.b.a(str, webView);
                    if (a2 != AdType.INTERSTITIAL) {
                        l();
                        D = new RedirectDetails(str, a2, redirectType, webView != null ? a(webView) : null, str2, str3, D != null ? D : null);
                        Logger.d(f29194q, "handle redirect: last redirect - " + D);
                        e();
                    } else {
                        Logger.d(f29194q, "handle redirect, ignore interstitial redirect, sdk: " + str + ", url: " + str2);
                    }
                }
            } else {
                Logger.d(f29194q, "handle redirect, Max/SafeDK not initialized, skipping. ");
            }
        }
    }

    public static synchronized void a(String str, String str2, String str3, String str4) {
        String str5;
        synchronized (BrandSafetyUtils.class) {
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            if (SafeDK.N() && F != null) {
                AdNetworkDiscovery h2 = CreativeInfoManager.h(mainSdkPackage);
                if (h2 != null) {
                    String g2 = h2.g(str2);
                    Logger.d(f29194q, "handle redirect, sdk: " + mainSdkPackage + ", extracted url: " + str2);
                    str5 = g2;
                } else {
                    str5 = str2;
                }
                String replaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
                if (str5 != null && !F.equals(str5) && !F.equals(replaceAll)) {
                    Logger.d(f29194q, "ignore intent, sdk: " + mainSdkPackage + ", url: " + str5);
                    F = null;
                }
            }
            k();
            C = new m(mainSdkPackage, str2, str3, str4, C != null ? C : null);
            Logger.d(f29194q, "handle redirect: last intent details - " + C);
            e();
        }
    }

    public static synchronized String d() {
        String str;
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (D != null && C != null && C.f29755c != null && C.f29755c.equals(D.f29339c)) {
                boolean a2 = CreativeInfoManager.a(D.f29339c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
                if (D.e == RedirectDetails.RedirectType.REDIRECT && a2) {
                    u a3 = DetectTouchUtils.a(C.f29755c, D.f29340f);
                    long longValue = a3 == null ? 0L : a3.f29770a.longValue();
                    if (longValue == 0 || SystemClock.elapsedRealtime() - longValue > ((long) SafeDK.getInstance().f())) {
                        Logger.d(f29194q, "check for potential auto redirect, identified for " + C.f29755c + ", view address: " + D.f29340f + ", webviewReqURL: " + D.f29341g + ", landingPageURL: " + C.d);
                        str = C.d;
                    }
                }
            }
            str = null;
        }
        return str;
    }

    public static synchronized void e() {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (D != null && C != null && C.f29755c != null && C.f29755c.equals(D.f29339c)) {
                a(C.f29755c, true, false);
            }
        }
    }

    public static synchronized void f() {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (D != null && C != null && D.e == RedirectDetails.RedirectType.EXPAND && C.f29755c != null && C.f29755c.equals(D.f29339c) && CreativeInfoManager.a(D.f29339c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false)) {
                a(C.f29755c, false, true);
            }
        }
    }

    public static synchronized void g() {
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            if (D != null && C != null && C.f29755c != null && C.f29755c.equals(D.f29339c)) {
                a(C.f29755c, true, true);
            }
        }
    }

    public static synchronized com.safedk.android.analytics.brandsafety.e a(Activity activity) {
        com.safedk.android.analytics.brandsafety.e a2;
        synchronized (BrandSafetyUtils.class) {
            l();
            k();
            Logger.d(f29194q, "handle Redirect If Needed with activity: " + activity + " last redirect: " + D + "\nlast intent: " + C);
            if (D != null && C != null) {
                String sdkPackageByClass = SdksMapping.getSdkPackageByClass(activity.toString());
                Logger.d(f29194q, "handle Redirect If Needed with activity: activity sdk: " + sdkPackageByClass);
                a2 = (sdkPackageByClass != null && sdkPackageByClass.equals(C.f29755c) && sdkPackageByClass.equals(D.f29339c)) ? a(sdkPackageByClass, false, true) : null;
            }
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0125 A[Catch: all -> 0x017f, TryCatch #0 {, blocks: (B:4:0x0004, B:7:0x006a, B:11:0x0060, B:14:0x009e, B:16:0x00a4, B:18:0x0118, B:20:0x0125, B:21:0x012b, B:23:0x0130, B:25:0x013a, B:27:0x0144, B:29:0x014a, B:30:0x0182, B:32:0x018c), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized com.safedk.android.analytics.brandsafety.e a(java.lang.String r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.a(java.lang.String, boolean, boolean):com.safedk.android.analytics.brandsafety.e");
    }

    private static void k() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int g2 = SafeDK.getInstance().g();
        if (C != null && elapsedRealtime - C.f29754b.longValue() > g2) {
            Logger.d(f29194q, "remove old intent: " + C);
            C = null;
        }
    }

    private static void l() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int g2 = SafeDK.getInstance().g();
        if (D != null && elapsedRealtime - D.f29338b.longValue() > g2) {
            Logger.d(f29194q, "remove old redirect: " + D);
            D = null;
        }
    }

    public static RedirectDetails h() {
        l();
        return D;
    }

    public static void q(String str) {
        if (SafeDK.N()) {
            E = str;
            F = str;
        }
    }

    public static void i() {
        E = null;
        F = null;
    }

    public static AdType a(long j2, long j3) {
        if (com.safedk.android.utils.k.a((float) j2, (float) j3)) {
            Logger.d(f29194q, "generate info View check. banner identified");
            return AdType.BANNER;
        }
        if (com.safedk.android.utils.k.b((float) j2, (float) j3)) {
            Logger.d(f29194q, "generate info View check. mrec identified");
            return AdType.MREC;
        }
        Logger.d(f29194q, "generate info View check. inter identified");
        return AdType.INTERSTITIAL;
    }
}
