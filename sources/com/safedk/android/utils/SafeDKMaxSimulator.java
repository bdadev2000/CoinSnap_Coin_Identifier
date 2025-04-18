package com.safedk.android.utils;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public class SafeDKMaxSimulator {

    /* renamed from: a, reason: collision with root package name */
    private static final String f30016a = "SafeDKMaxSimulator";

    public static void setRedirectSimulationMode(String targetUrl, String webviewString) {
        Logger.d(f30016a, "set redirect simulation mode, ignore next touch event and intent, targetUrl: " + targetUrl + ", webview: " + webviewString);
        DetectTouchUtils.b(webviewString);
        BrandSafetyUtils.q(targetUrl);
    }

    public static void resetRedirectSimulationMode() {
        Logger.d(f30016a, "reset redirect simulation mode");
        DetectTouchUtils.a();
        BrandSafetyUtils.i();
    }

    public static boolean toggleIgnoreTouchEvents() {
        Logger.d(f30016a, "toggle ignore touch events");
        return DetectTouchUtils.b();
    }
}
