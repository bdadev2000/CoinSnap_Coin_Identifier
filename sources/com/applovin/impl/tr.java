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
    private static WebView a;

    /* renamed from: b, reason: collision with root package name */
    private static String f8291b;

    /* renamed from: e, reason: collision with root package name */
    private static int f8294e;

    /* renamed from: f, reason: collision with root package name */
    private static String f8295f;

    /* renamed from: g, reason: collision with root package name */
    private static String f8296g;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8292c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f8293d = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicBoolean f8297h = new AtomicBoolean();

    static {
        if (e()) {
            f8291b = (String) sj.a(qj.K, "", com.applovin.impl.sdk.k.k());
            return;
        }
        f8291b = "";
        sj.b(qj.K, (Object) null, com.applovin.impl.sdk.k.k());
        sj.b(qj.L, (Object) null, com.applovin.impl.sdk.k.k());
    }

    public static void a(final com.applovin.impl.sdk.k kVar) {
        if (e()) {
            return;
        }
        final int i10 = 1;
        if (f8293d.getAndSet(true)) {
            return;
        }
        if (x3.d()) {
            final int i11 = 0;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.uv
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    com.applovin.impl.sdk.k kVar2 = kVar;
                    switch (i12) {
                        case 0:
                            tr.d(kVar2);
                            return;
                        default:
                            tr.e(kVar2);
                            return;
                    }
                }
            });
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.uv
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i10;
                    com.applovin.impl.sdk.k kVar2 = kVar;
                    switch (i12) {
                        case 0:
                            tr.d(kVar2);
                            return;
                        default:
                            tr.e(kVar2);
                            return;
                    }
                }
            });
        }
    }

    public static String b() {
        return f8296g;
    }

    public static String c() {
        return f8295f;
    }

    public static int d() {
        return f8294e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.k kVar) {
        try {
            f(kVar);
            synchronized (f8292c) {
                f8291b = a.getSettings().getUserAgentString();
                sj.b(qj.K, f8291b, com.applovin.impl.sdk.k.k());
                sj.b(qj.L, Build.VERSION.RELEASE, com.applovin.impl.sdk.k.k());
            }
        } catch (Throwable th2) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    public static void f(com.applovin.impl.sdk.k kVar) {
    }

    public static void b(com.applovin.impl.sdk.k kVar) {
        if (f8297h.getAndSet(true)) {
            return;
        }
        PackageInfo c10 = c(kVar);
        if (c10 == null) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().b("WebViewDataCollector", "Failed to get WebView package info");
                return;
            }
            return;
        }
        f8294e = c10.versionCode;
        f8295f = c10.versionName;
        f8296g = c10.packageName;
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
            synchronized (f8292c) {
                f8291b = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.k.k());
                sj.b(qj.K, f8291b, com.applovin.impl.sdk.k.k());
                sj.b(qj.L, Build.VERSION.RELEASE, com.applovin.impl.sdk.k.k());
            }
        } catch (Throwable th2) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("WebViewDataCollector", "Failed to collect user agent", th2);
            }
            kVar.B().a("WebViewDataCollector", "collectUserAgent", th2);
        }
    }

    public static String a() {
        String str;
        synchronized (f8292c) {
            str = f8291b;
        }
        return str;
    }

    public static boolean e() {
        boolean equals;
        synchronized (f8292c) {
            equals = Build.VERSION.RELEASE.equals((String) sj.a(qj.L, "", com.applovin.impl.sdk.k.k()));
        }
        return equals;
    }
}
