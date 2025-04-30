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
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class ig {

    /* renamed from: a */
    protected final AppLovinAdBase f8294a;
    protected final com.applovin.impl.sdk.k b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.t f8295c;

    /* renamed from: d */
    protected final String f8296d;

    /* renamed from: e */
    protected boolean f8297e;

    /* renamed from: f */
    protected AdSession f8298f;

    /* renamed from: g */
    protected AdEvents f8299g;

    public ig(AppLovinAdBase appLovinAdBase) {
        this.f8294a = appLovinAdBase;
        this.b = appLovinAdBase.getSdk();
        this.f8295c = appLovinAdBase.getSdk().L();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder c9 = AbstractC2965e.c(str, ":");
            c9.append(appLovinAdBase.getDspName());
            str = c9.toString();
        }
        this.f8296d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new Q0(this, 2));
    }

    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a6;
        if (!this.f8294a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.d(this.f8296d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f8298f != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.k(this.f8296d, "Attempting to start session again for ad: " + this.f8294a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f8295c.a(this.f8296d, "Starting session");
        }
        AdSessionConfiguration a9 = a();
        if (a9 == null || (a6 = a(webView)) == null) {
            return;
        }
        try {
            AdSession createAdSession = AdSession.createAdSession(a9, a6);
            this.f8298f = createAdSession;
            try {
                this.f8299g = AdEvents.createAdEvents(createAdSession);
                a(this.f8298f);
                this.f8298f.start();
                this.f8297e = true;
                if (com.applovin.impl.sdk.t.a()) {
                    this.f8295c.a(this.f8296d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f8295c.a(this.f8296d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.a(this.f8296d, "Failed to create session", th2);
            }
        }
    }

    public /* synthetic */ void c() {
        this.f8299g.impressionOccurred();
    }

    public /* synthetic */ void d() {
        this.f8299g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void e() {
        c(null);
    }

    public void f() {
        b("stop session", new Q0(this, 1));
    }

    public void g() {
        b("track impression event", new Q0(this, 0));
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f8297e) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f8295c.a(this.f8296d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.a(this.f8296d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new F(17, this, webView));
    }

    public /* synthetic */ void a(String str) {
        this.f8298f.error(ErrorType.VIDEO, str);
    }

    public /* synthetic */ void a(View view, List list) {
        this.f8298f.registerAdView(view);
        this.f8298f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kg kgVar = (kg) it.next();
            if (kgVar.c() != null) {
                try {
                    this.f8298f.addFriendlyObstruction(kgVar.c(), kgVar.b(), kgVar.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f8295c.a(this.f8296d, "Failed to add friendly obstruction (" + kgVar + ")", th);
                    }
                }
            }
        }
    }

    public /* synthetic */ void b() {
        this.f8297e = false;
        this.f8298f.finish();
        this.f8298f = null;
        this.f8299g = null;
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new O2(this, str, runnable, 7));
    }

    public void b(String str) {
        b("track error", new F(18, this, str));
    }

    public void b(View view, List list) {
        b("update main view: " + view, new O2(this, view, list, 8));
    }
}
