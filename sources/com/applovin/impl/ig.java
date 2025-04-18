package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ig {
    protected final AppLovinAdBase a;

    /* renamed from: b */
    protected final com.applovin.impl.sdk.k f5330b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.t f5331c;

    /* renamed from: d */
    protected final String f5332d;

    /* renamed from: e */
    protected boolean f5333e;

    /* renamed from: f */
    protected AdSession f5334f;

    /* renamed from: g */
    protected AdEvents f5335g;

    public ig(AppLovinAdBase appLovinAdBase) {
        this.a = appLovinAdBase;
        this.f5330b = appLovinAdBase.getSdk();
        this.f5331c = appLovinAdBase.getSdk().L();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder n10 = eb.j.n(str, ":");
            n10.append(appLovinAdBase.getDspName());
            str = n10.toString();
        }
        this.f5332d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new yt(this, 1));
    }

    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a;
        if (!this.a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.d(this.f5332d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f5334f != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.k(this.f5332d, "Attempting to start session again for ad: " + this.a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f5331c.a(this.f5332d, "Starting session");
        }
        AdSessionConfiguration a10 = a();
        if (a10 == null || (a = a(webView)) == null) {
            return;
        }
        try {
            AdSession createAdSession = AdSession.createAdSession(a10, a);
            this.f5334f = createAdSession;
            try {
                this.f5335g = AdEvents.createAdEvents(createAdSession);
                a(this.f5334f);
                this.f5334f.start();
                this.f5333e = true;
                if (com.applovin.impl.sdk.t.a()) {
                    this.f5331c.a(this.f5332d, "Session started");
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f5331c.a(this.f5332d, "Failed to create ad events", th2);
                }
            }
        } catch (Throwable th3) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create session", th3);
            }
        }
    }

    public /* synthetic */ void c() {
        this.f5335g.impressionOccurred();
    }

    public /* synthetic */ void d() {
        this.f5335g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new yt(this, 0));
    }

    public void g() {
        b("track impression event", new yt(this, 2));
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f5333e) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f5331c.a(this.f5332d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to run operation: " + str, th2);
            }
        }
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new rs(17, this, webView));
    }

    public /* synthetic */ void a(String str) {
        this.f5334f.error(ErrorType.VIDEO, str);
    }

    public /* synthetic */ void a(View view, List list) {
        this.f5334f.registerAdView(view);
        this.f5334f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kg kgVar = (kg) it.next();
            if (kgVar.c() != null) {
                try {
                    this.f5334f.addFriendlyObstruction(kgVar.c(), kgVar.b(), kgVar.a());
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f5331c.a(this.f5332d, "Failed to add friendly obstruction (" + kgVar + ")", th2);
                    }
                }
            }
        }
    }

    public /* synthetic */ void b() {
        this.f5333e = false;
        this.f5334f.finish();
        this.f5334f = null;
        this.f5335g = null;
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new yv(8, this, str, runnable));
    }

    public void b(String str) {
        b("track error", new rs(18, this, str));
    }

    public void b(View view, List list) {
        b("update main view: " + view, new yv(7, this, view, list));
    }
}
