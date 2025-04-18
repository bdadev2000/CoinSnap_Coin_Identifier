package com.safedk.android.analytics.brandsafety;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.URI;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class i implements com.safedk.android.internal.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29661a = "ClickUrlsManager";

    /* renamed from: b, reason: collision with root package name */
    private static final int f29662b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final String f29663c = "https://play.google.com/store/apps/details?id=%s";
    private static i d;

    /* renamed from: l, reason: collision with root package name */
    private static final Object f29664l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private static AtomicBoolean f29665m = new AtomicBoolean();

    /* renamed from: n, reason: collision with root package name */
    private static final ScheduledExecutorService f29666n = Executors.newScheduledThreadPool(0);
    private String e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f29667f = null;

    /* renamed from: g, reason: collision with root package name */
    private String f29668g = null;

    /* renamed from: h, reason: collision with root package name */
    private String f29669h = null;

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f29671j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private AtomicInteger f29672k = new AtomicInteger(0);

    /* renamed from: i, reason: collision with root package name */
    private Set<String> f29670i = new HashSet();

    private i() {
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
    }

    public static i a() {
        i iVar;
        synchronized (f29664l) {
            if (d == null) {
                d = new i();
            }
            iVar = d;
        }
        return iVar;
    }

    public static void a(boolean z2) {
        synchronized (f29664l) {
            Logger.d(f29661a, "setActiveMode to " + z2);
            d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str, String str2, String str3, String str4) {
        if (this.e == null && !this.f29670i.contains(str)) {
            Logger.d(f29661a, "logging url: " + str + ", fingerprint: " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            this.e = str;
            this.f29667f = str2;
            this.f29668g = str3;
            this.f29669h = str4;
            if (TextUtils.isEmpty(this.f29667f)) {
                this.f29667f = str;
            }
        }
    }

    public static String a(String str) {
        return com.safedk.android.utils.k.w(str) ? com.safedk.android.utils.k.y(str) : b(str);
    }

    public static String b(String str) {
        try {
            URI uri = new URI(URLEncoder.encode(str, "UTF-8"));
            String query = uri.getQuery();
            if (!TextUtils.isEmpty(query)) {
                String str2 = "";
                String[] split = query.split("&");
                for (String str3 : split) {
                    if (!com.safedk.android.utils.f.M().matcher(str3).find()) {
                        if (str2.length() > 0) {
                            str2 = str2 + "&";
                        }
                        str2 = str2 + str3;
                    }
                }
                return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
            }
            return str;
        } catch (Throwable th) {
            Logger.w(f29661a, "Unable to clean url: " + th.getMessage());
            return str;
        }
    }

    public static String c(String str) {
        return String.format(Locale.ENGLISH, f29663c, str);
    }

    public synchronized String b() {
        return this.f29667f;
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        f29665m.set(true);
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        String str;
        String str2;
        String str3;
        String str4;
        Logger.d(f29661a, "onForeground started");
        f29665m.set(false);
        if (this.f29671j.get()) {
            if (this.f29672k.getAndIncrement() <= 2) {
                synchronized (d) {
                    if (this.e != null) {
                        str4 = this.e;
                        str3 = this.f29667f;
                        String str5 = this.f29668g;
                        str = this.f29669h;
                        str2 = str5;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                    }
                }
                c(str4, str3, str2, str);
            } else {
                Logger.d(f29661a, "Exhausted2 attempts to resolve URL. Clearing the slot.");
                d();
            }
        }
    }

    private void d() {
        synchronized (d) {
            if (this.e != null) {
                String str = this.e;
                this.e = null;
                this.f29667f = null;
                this.f29670i.add(str);
                this.f29671j.set(false);
                this.f29672k.set(0);
            }
        }
    }

    public void a(String str, final String str2, final String str3, final String str4) {
        Logger.d(f29661a, "resolve Url started, url = " + str + ", fingerprint = " + str2 + ", sdkUuid: " + str3 + ", impressionId: " + str4 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str3);
        boolean a2 = CreativeInfoManager.a(sdkPackageByPackageUUID, AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        Logger.d(f29661a, "resolve Url setting shouldDecode is " + a2 + " for sdkPackageName " + sdkPackageByPackageUUID);
        String F = a2 ? com.safedk.android.utils.k.F(str) : str;
        if (com.safedk.android.utils.k.w(F)) {
            a(F, com.safedk.android.utils.k.x(F), str2, str3, str4, false);
        } else {
            final String str5 = F;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.1
                @Override // java.lang.Runnable
                public void run() {
                    if (i.f29665m.get()) {
                        i.this.b(str5, str2, str3, str4);
                        i.this.f29671j.set(true);
                        Logger.d(i.f29661a, "server asked to resolve but currently in background.");
                    } else {
                        Logger.d(i.f29661a, "not currently in background, try to resolve.");
                        i.this.c(str5, str2, str3, str4);
                    }
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String str2, String str3, String str4) {
        Logger.d(f29661a, "resolveUrlInternal starting Url resolution. url = " + str + ", isOnUiThread = " + com.safedk.android.utils.k.c());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final WebView webView = new WebView(SafeDK.getInstance().l());
        Runnable runnable = new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2
            @Override // java.lang.Runnable
            public void run() {
                if (atomicBoolean.get()) {
                    Logger.d(i.f29661a, "Url resolved. no timeout.");
                } else {
                    webView.post(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.d(i.f29661a, "Timeout resolving url");
                            webView.stopLoading();
                        }
                    });
                }
            }
        };
        AtomicLong atomicLong = new AtomicLong(0L);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new AnonymousClass3(str, atomicBoolean, str2, str3, str4));
        atomicLong.set(System.currentTimeMillis());
        webView.loadUrl(str);
        Logger.d(f29661a, "Starting resolution, timeout = " + SafeDK.getInstance().K());
        f29666n.schedule(runnable, SafeDK.getInstance().K(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.safedk.android.analytics.brandsafety.i$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        AtomicInteger f29680a = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29681b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f29682c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29683f;

        AnonymousClass3(String str, AtomicBoolean atomicBoolean, String str2, String str3, String str4) {
            this.f29681b = str;
            this.f29682c = atomicBoolean;
            this.d = str2;
            this.e = str3;
            this.f29683f = str4;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, final String url, Bitmap favicon) {
            final int incrementAndGet = this.f29680a.incrementAndGet();
            Logger.d(i.f29661a, "onPageStarted started. callbackCounter=" + incrementAndGet + ", url= " + url);
            if (!url.equals(this.f29681b)) {
                new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AnonymousClass3.this.f29680a.get() == incrementAndGet) {
                            Logger.d(i.f29661a, "onPageFinished never called, assuming last onPageStarted is the landing page.");
                            Logger.d(i.f29661a, "Landing page detected: " + url);
                            AnonymousClass3.this.f29682c.set(true);
                            i.this.a(AnonymousClass3.this.f29681b, url, AnonymousClass3.this.d, AnonymousClass3.this.e, AnonymousClass3.this.f29683f, true);
                            return;
                        }
                        Logger.d(i.f29661a, "onPageStarted resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.f29680a.get() + ", callbackCounter=" + incrementAndGet);
                    }
                }, 60000L);
            }
            super.onPageStarted(view, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, final String url) {
            final int incrementAndGet = this.f29680a.incrementAndGet();
            Logger.d(i.f29661a, "onPageFinished started. callbackCounter=" + incrementAndGet + ", url= " + url);
            new Handler().postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.i.3.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass3.this.f29680a.get() == incrementAndGet) {
                        Logger.d(i.f29661a, "Landing page detected. is original url same as resolved ? " + AnonymousClass3.this.f29681b.equals(url) + " , url " + url);
                        AnonymousClass3.this.f29682c.set(true);
                        i.this.a(AnonymousClass3.this.f29681b, url, AnonymousClass3.this.d, AnonymousClass3.this.e, AnonymousClass3.this.f29683f, true);
                        return;
                    }
                    Logger.d(i.f29661a, "onPageFinished resolveCounter.get() is not equal to callbackCounter. resolveCounter.get()=" + AnonymousClass3.this.f29680a.get() + ", callbackCounter=" + incrementAndGet);
                }
            }, 5000L);
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            Logger.d(i.f29661a, "onRenderProcessGone for view = " + view.toString());
            this.f29682c.set(true);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, String str5, boolean z2) {
        try {
            Logger.d(f29661a, "reportResolvedUrlToServer started. originalUrl=" + str + ", resolvedUrl=" + str2 + ", fingerprint=" + str3 + ", isOnUiThread = " + com.safedk.android.utils.k.c());
            d();
            if (z2 && com.safedk.android.utils.k.w(str2)) {
                str2 = com.safedk.android.utils.k.x(a(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putString(k.f29696a, str);
            bundle.putString(k.f29697b, str2);
            bundle.putString(k.f29698c, str3);
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("sdk_uuid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("impression_id", str5);
            }
            bundle.putString("package", SafeDK.getInstance().l().getPackageName());
            g.b(bundle);
        } catch (Throwable th) {
            Logger.d(f29661a, "Failed to report url resolve to server");
            new CrashReporter().caughtException(th);
        }
    }
}
