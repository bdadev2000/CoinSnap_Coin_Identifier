package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class DetectTouchUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29240a = "DetectTouchUtils";

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, u> f29241b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, u> f29242c = new HashMap<>();
    private static String d = null;
    private static boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    private static final Timer f29243f = new Timer("RedirectSimulationTimer");

    /* renamed from: g, reason: collision with root package name */
    private static TimerTask f29244g = null;

    /* renamed from: h, reason: collision with root package name */
    private static final ExecutorService f29245h = Executors.newSingleThreadExecutor();

    public static u a(String str) {
        Logger.d(f29240a, "getLastTouchEvent is latestTouchEventBySdkMap contains " + str + "? " + f29241b.containsKey(str) + ", map = " + f29241b);
        if (!f29241b.containsKey(str) || f29241b.get(str) == null) {
            return null;
        }
        Logger.d(f29240a, "getLastTouchEvent returns " + f29241b.get(str));
        return f29241b.get(str);
    }

    public static u a(String str, String str2) {
        return f29242c.get(str + "_" + str2);
    }

    public static void activityOnTouch(String sdkPackageName, MotionEvent me) {
        try {
            if (me.getAction() == 0) {
                Logger.d(f29240a, "activity on touch started, sdk: " + sdkPackageName + ", motion event: " + me + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                if ((0 != me.getEventTime()) && me.getActionMasked() != 2) {
                    b(null, sdkPackageName);
                }
            }
        } catch (Throwable th) {
            Logger.d(f29240a, "error in activity on touch", th);
        }
    }

    public static void viewOnTouch(String sdkPackage, View view, MotionEvent me) {
        try {
            if (me.getAction() == 0) {
                Logger.d(f29240a, "view on touch, started, sdkPackage = " + sdkPackage + ", View = " + view + ", MotionEvent = " + me);
                if (sdkPackage.equals(com.safedk.android.utils.g.f30048a) && (view instanceof MaxNativeAdView)) {
                    String sdkPackage2 = NativeFinder.b((MaxNativeAdView) view);
                    if (sdkPackage2 == null) {
                        sdkPackage2 = BannerFinder.a((MaxNativeAdView) view);
                    }
                    if (sdkPackage2 != null) {
                        try {
                            Logger.d(f29240a, "view on touch, translate Max native ad view to sdk: " + sdkPackage2 + ", view: " + view + ", isOnUiThread = " + com.safedk.android.utils.k.c());
                            sdkPackage = sdkPackage2;
                        } catch (Throwable th) {
                            th = th;
                            Logger.d(f29240a, "error in view on touch", th);
                            return;
                        }
                    } else {
                        Logger.d(f29240a, "view on touch, failed to translate Max native ad view to sdk, view: " + view);
                    }
                } else if (view instanceof WebView) {
                    Logger.d(f29240a, "web view on touch, sdk: " + sdkPackage + ", view: " + view + ", motion event: " + me);
                } else if (view instanceof ViewGroup) {
                    Logger.d(f29240a, "view group on touch, sdk: " + sdkPackage + ", view: " + view + ", motion event: " + me);
                } else {
                    Logger.d(f29240a, "view on touch, sdk: " + sdkPackage + ", view: " + view + ", motion event: " + me);
                }
                b(view != null ? BrandSafetyUtils.a(view) : null, sdkPackage);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(final String str, final String str2) {
        if (com.safedk.android.utils.k.c()) {
            f29245h.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.d(str, str2);
                }
            });
        } else {
            d(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2) {
        if (SafeDK.N() && (e || (d != null && str != null && d.contains(str)))) {
            Logger.d(f29240a, "ignore touch event, sdk: " + str2 + ", view address: " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            return;
        }
        u uVar = new u(Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(System.currentTimeMillis()), str);
        f29241b.put(str2, uVar);
        Logger.d(f29240a, "Set latest touch event, setting sdk: " + str2 + ", details: " + uVar + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        if (str != null) {
            String str3 = str2 + "_" + str;
            f29242c.put(str3, uVar);
            Logger.d(f29240a, "Set latest touch event, setting key: " + str3 + ", details: " + uVar);
        }
    }

    public static void b(final String str) {
        if (com.safedk.android.utils.k.c()) {
            f29245h.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.e(str);
                }
            });
        } else {
            e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        if (SafeDK.N()) {
            if (f29244g != null) {
                f29244g.cancel();
            }
            d = str;
            Logger.d(f29240a, "set ignore next touch event: " + d + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            long f2 = SafeDK.getInstance().f();
            f29244g = new TimerTask() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    String unused = DetectTouchUtils.d = null;
                    Logger.d(DetectTouchUtils.f29240a, "timeout ignore next touch event");
                }
            };
            f29243f.schedule(f29244g, f2);
        }
    }

    public static void a() {
        d = null;
        Logger.d(f29240a, "reset ignore next touch event");
    }

    public static boolean b() {
        e = !e;
        Logger.d(f29240a, "toggle ignore touch events: " + e);
        return e;
    }
}
