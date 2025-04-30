package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class tr {

    /* renamed from: a, reason: collision with root package name */
    private static WebView f11509a;
    private static String b;

    /* renamed from: e, reason: collision with root package name */
    private static int f11512e;

    /* renamed from: f, reason: collision with root package name */
    private static String f11513f;

    /* renamed from: g, reason: collision with root package name */
    private static String f11514g;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f11510c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f11511d = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicBoolean f11515h = new AtomicBoolean();

    static {
        if (e()) {
            b = (String) sj.a(qj.f10362K, "", com.applovin.impl.sdk.k.k());
            return;
        }
        b = "";
        sj.b(qj.f10362K, (Object) null, com.applovin.impl.sdk.k.k());
        sj.b(qj.f10363L, (Object) null, com.applovin.impl.sdk.k.k());
    }

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (e() || f11511d.getAndSet(true)) {
            return;
        }
        if (x3.d()) {
            final int i9 = 0;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.K2
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            tr.d(kVar);
                            return;
                        default:
                            tr.e(kVar);
                            return;
                    }
                }
            });
        } else {
            final int i10 = 1;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.K2
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            tr.d(kVar);
                            return;
                        default:
                            tr.e(kVar);
                            return;
                    }
                }
            });
        }
    }

    public static String b() {
        return f11514g;
    }

    public static String c() {
        return f11513f;
    }

    public static int d() {
        return f11512e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.k kVar) {
        try {
            f(kVar);
            synchronized (f11510c) {
                b = f11509a.getSettings().getUserAgentString();
                sj.b(qj.f10362K, b, com.applovin.impl.sdk.k.k());
                sj.b(qj.f10363L, Build.VERSION.RELEASE, com.applovin.impl.sdk.k.k());
            }
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static void f(com.applovin.impl.sdk.k kVar) {
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f11515h.getAndSet(true)) {
            return;
        }
        PackageInfo c9 = c(kVar);
        if (c9 == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("WebViewDataCollector", "Failed to get WebView package info");
                return;
            }
            return;
        }
        f11512e = c9.versionCode;
        f11513f = c9.versionName;
        f11514g = c9.packageName;
    }

    private static PackageInfo c(com.applovin.impl.sdk.k kVar) {
        PackageInfo currentWebViewPackage;
        PackageManager packageManager = com.applovin.impl.sdk.k.k().getPackageManager();
        if (x3.i()) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            return currentWebViewPackage;
        }
        Iterator it = kVar.c(oj.y4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.k kVar) {
        try {
            synchronized (f11510c) {
                b = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.k());
                sj.b(qj.f10362K, b, com.applovin.impl.sdk.k.k());
                sj.b(qj.f10363L, Build.VERSION.RELEASE, com.applovin.impl.sdk.k.k());
            }
        } catch (Throwable th) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static String a() {
        String str;
        synchronized (f11510c) {
            str = b;
        }
        return str;
    }

    public static boolean e() {
        boolean equals;
        synchronized (f11510c) {
            equals = Build.VERSION.RELEASE.equals((String) sj.a(qj.f10363L, "", com.applovin.impl.sdk.k.k()));
        }
        return equals;
    }
}
