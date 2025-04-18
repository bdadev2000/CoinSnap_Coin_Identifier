package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class sr {

    /* renamed from: a, reason: collision with root package name */
    private static WebView f26972a;

    /* renamed from: b, reason: collision with root package name */
    private static String f26973b;
    private static int e;

    /* renamed from: f, reason: collision with root package name */
    private static String f26975f;

    /* renamed from: g, reason: collision with root package name */
    private static String f26976g;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f26974c = new Object();
    private static final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicBoolean f26977h = new AtomicBoolean();

    static {
        if (e()) {
            f26973b = (String) vj.a(uj.J, "", com.applovin.impl.sdk.j.l());
            return;
        }
        f26973b = "";
        vj.b(uj.J, (Object) null, com.applovin.impl.sdk.j.l());
        vj.b(uj.K, (Object) null, com.applovin.impl.sdk.j.l());
    }

    public static void a(com.applovin.impl.sdk.j jVar) {
        if (e()) {
            return;
        }
        int i2 = 1;
        if (d.getAndSet(true)) {
            return;
        }
        if (z3.d()) {
            AppLovinSdkUtils.runOnUiThread(new pu(i2, jVar));
        } else {
            AppLovinSdkUtils.runOnUiThread(new pu(2, jVar));
        }
    }

    public static String b() {
        return f26976g;
    }

    public static String c() {
        return f26975f;
    }

    public static int d() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.j jVar) {
        try {
            f(jVar);
            synchronized (f26974c) {
                f26973b = f26972a.getSettings().getUserAgentString();
                vj.b(uj.J, f26973b, com.applovin.impl.sdk.j.l());
                vj.b(uj.K, Build.VERSION.RELEASE, com.applovin.impl.sdk.j.l());
            }
        } catch (Throwable th) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            jVar.E().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static void f(com.applovin.impl.sdk.j jVar) {
    }

    public static void b(com.applovin.impl.sdk.j jVar) {
        if (f26977h.getAndSet(true)) {
            return;
        }
        PackageInfo c2 = c(jVar);
        if (c2 == null) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().b("WebViewDataCollector", "Failed to get WebView package info");
                return;
            }
            return;
        }
        e = c2.versionCode;
        f26975f = c2.versionName;
        f26976g = c2.packageName;
    }

    private static PackageInfo c(com.applovin.impl.sdk.j jVar) {
        PackageManager packageManager = com.applovin.impl.sdk.j.l().getPackageManager();
        if (z3.i()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = jVar.c(sj.E4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.j jVar) {
        try {
            synchronized (f26974c) {
                f26973b = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.j.l());
                vj.b(uj.J, f26973b, com.applovin.impl.sdk.j.l());
                vj.b(uj.K, Build.VERSION.RELEASE, com.applovin.impl.sdk.j.l());
            }
        } catch (Throwable th) {
            jVar.J();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.J().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            jVar.E().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static String a() {
        String str;
        synchronized (f26974c) {
            str = f26973b;
        }
        return str;
    }

    public static boolean e() {
        boolean equals;
        synchronized (f26974c) {
            equals = Build.VERSION.RELEASE.equals((String) vj.a(uj.K, "", com.applovin.impl.sdk.j.l()));
        }
        return equals;
    }
}
