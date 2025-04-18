package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mg {

    /* renamed from: a */
    protected final AppLovinAdBase f25576a;

    /* renamed from: b */
    protected final com.applovin.impl.sdk.j f25577b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.n f25578c;
    protected final String d;
    protected boolean e;

    /* renamed from: f */
    protected AdSession f25579f;

    /* renamed from: g */
    protected AdEvents f25580g;

    public mg(AppLovinAdBase appLovinAdBase) {
        this.f25576a = appLovinAdBase;
        this.f25577b = appLovinAdBase.getSdk();
        this.f25578c = appLovinAdBase.getSdk().J();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder B = androidx.compose.foundation.text.input.a.B(str, CertificateUtil.DELIMITER);
            B.append(appLovinAdBase.getDspName());
            str = B.toString();
        }
        this.d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void h() {
        b("track loaded", new ku(this, 2));
    }

    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a2;
        if (!this.f25576a.isOpenMeasurementEnabled()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.d(this.d, "Skip starting session - Open Measurement disabled");
                return;
            }
            return;
        }
        if (this.f25579f != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.k(this.d, "Attempting to start session again for ad: " + this.f25576a);
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25578c.a(this.d, "Starting session");
        }
        AdSessionConfiguration a3 = a();
        if (a3 == null || (a2 = a(webView)) == null) {
            return;
        }
        try {
            AdSession createAdSession = AdSession.createAdSession(a3, a2);
            this.f25579f = createAdSession;
            try {
                this.f25580g = AdEvents.createAdEvents(createAdSession);
                a(this.f25579f);
                this.f25579f.start();
                this.e = true;
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25578c.a(this.d, "Session started");
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25578c.a(this.d, "Failed to create ad events", th);
                }
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.a(this.d, "Failed to create session", th2);
            }
        }
    }

    public /* synthetic */ void c() {
        this.f25580g.impressionOccurred();
    }

    public /* synthetic */ void d() {
        this.f25580g.loaded();
    }

    public void a(AdSession adSession) {
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", new ku(this, 0));
    }

    public void g() {
        b("track impression event", new ku(this, 1));
    }

    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.e) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f25578c.a(this.d, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.a(this.d, "Failed to run operation: " + str, th);
            }
        }
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new ms(19, this, webView));
    }

    public /* synthetic */ void a(String str) {
        this.f25579f.error(ErrorType.VIDEO, str);
    }

    public /* synthetic */ void a(View view, List list) {
        this.f25579f.registerAdView(view);
        this.f25579f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            og ogVar = (og) it.next();
            if (ogVar.c() != null) {
                try {
                    this.f25579f.addFriendlyObstruction(ogVar.c(), ogVar.b(), ogVar.a());
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f25578c.a(this.d, "Failed to add friendly obstruction (" + ogVar + ")", th);
                    }
                }
            }
        }
    }

    public /* synthetic */ void b() {
        this.e = false;
        this.f25579f.finish();
        this.f25579f = null;
        this.f25580g = null;
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new ks(this, 9, str, runnable));
    }

    public void b(String str) {
        b("track error", new ms(18, this, str));
    }

    public void b(View view, List list) {
        b("update main view: " + view, new ks(this, 10, view, list));
    }
}
