package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class sg extends mg {

    /* renamed from: p */
    static final /* synthetic */ boolean f26885p = true;

    /* renamed from: h */
    private final aq f26886h;

    /* renamed from: i */
    private final AtomicBoolean f26887i;

    /* renamed from: j */
    private MediaEvents f26888j;

    /* renamed from: k */
    private final VastProperties f26889k;

    /* renamed from: l */
    private final AtomicBoolean f26890l;

    /* renamed from: m */
    private final AtomicBoolean f26891m;

    /* renamed from: n */
    private final AtomicBoolean f26892n;

    /* renamed from: o */
    private final AtomicBoolean f26893o;

    public sg(aq aqVar) {
        super(aqVar);
        this.f26887i = new AtomicBoolean();
        this.f26890l = new AtomicBoolean();
        this.f26891m = new AtomicBoolean();
        this.f26892n = new AtomicBoolean();
        this.f26893o = new AtomicBoolean();
        this.f26886h = aqVar;
        float q1 = (float) aqVar.q1();
        if (aqVar.q1() == -1) {
            this.f26889k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f26889k = VastProperties.createVastPropertiesForSkippableMedia(q1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new vv(this, 2));
    }

    public void B() {
        b("track skipped", new vv(this, 4));
    }

    public void C() {
        if (this.f26893o.compareAndSet(false, true)) {
            b("track third quartile", new vv(this, 6));
        }
    }

    @Override // com.applovin.impl.mg
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.a(this.d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    public void b(final float f2, final boolean z2) {
        if (this.f26890l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.wv
                @Override // java.lang.Runnable
                public final void run() {
                    sg.this.a(f2, z2);
                }
            });
        }
    }

    @Override // com.applovin.impl.mg
    public void h() {
        b("track loaded", new vv(this, 1));
    }

    public void v() {
        b("track clicked", new vv(this, 5));
    }

    public void w() {
        b("track completed", new vv(this, 10));
    }

    public void x() {
        if (this.f26891m.compareAndSet(false, true)) {
            b("track first quartile", new vv(this, 9));
        }
    }

    public void y() {
        if (this.f26892n.compareAndSet(false, true)) {
            b("track midpoint", new vv(this, 0));
        }
    }

    public void z() {
        b("track paused", new vv(this, 8));
    }

    public /* synthetic */ void k() {
        this.f26888j.bufferFinish();
    }

    public /* synthetic */ void l() {
        this.f26888j.bufferStart();
    }

    public /* synthetic */ void m() {
        this.f26888j.adUserInteraction(InteractionType.CLICK);
    }

    public /* synthetic */ void n() {
        this.f26888j.complete();
    }

    public /* synthetic */ void o() {
        this.f26888j.firstQuartile();
    }

    public /* synthetic */ void p() {
        this.f25580g.loaded(this.f26889k);
    }

    public /* synthetic */ void q() {
        this.f26888j.midpoint();
    }

    public /* synthetic */ void r() {
        this.f26888j.pause();
    }

    public /* synthetic */ void s() {
        this.f26888j.resume();
    }

    public /* synthetic */ void t() {
        this.f26888j.skipped();
    }

    public /* synthetic */ void u() {
        this.f26888j.thirdQuartile();
    }

    public void i() {
        if (this.f26887i.compareAndSet(true, false)) {
            b("buffer finished", new vv(this, 7));
        }
    }

    public void j() {
        if (this.f26887i.compareAndSet(false, true)) {
            b("buffer started", new vv(this, 3));
        }
    }

    public /* synthetic */ void a(float f2, boolean z2) {
        this.f26888j.start(f2, z2 ? 0.0f : 1.0f);
    }

    public void b(boolean z2) {
        b("track volume changed", new wu(1, this, z2));
    }

    public /* synthetic */ void a(boolean z2) {
        this.f26888j.volumeChange(z2 ? 0.0f : 1.0f);
    }

    @Override // com.applovin.impl.mg
    public void a(AdSession adSession) {
        try {
            this.f26888j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.a(this.d, "Failed to create media events", th);
            }
        }
    }

    @Override // com.applovin.impl.mg
    public AdSessionContext a(WebView webView) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        if (!f26885p && this.f26886h.i1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (bq bqVar : this.f26886h.i1().a()) {
            List<hq> b2 = bqVar.b();
            if (b2.isEmpty()) {
                mq.a(bqVar.a(), fq.FAILED_TO_LOAD_RESOURCE, this.f25577b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (hq hqVar : b2) {
                    if ("omid".equalsIgnoreCase(hqVar.a())) {
                        arrayList2.add(hqVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    mq.a(bqVar.a(), fq.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f25577b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((hq) it.next()).b()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.n.a()) {
                                this.f25578c.a(this.d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        mq.a(bqVar.a(), fq.FAILED_TO_LOAD_RESOURCE, this.f25577b);
                    } else {
                        String d = bqVar.d();
                        String c2 = bqVar.c();
                        if (StringUtils.isValidString(d) && !StringUtils.isValidString(c2)) {
                            mq.a(bqVar.a(), fq.FAILED_TO_LOAD_RESOURCE, this.f25577b);
                        } else {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                if (StringUtils.isValidString(d)) {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(c2, url, d);
                                } else {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                }
                                arrayList.add(createVerificationScriptResourceWithoutParameters);
                            }
                        }
                    }
                }
            }
        }
        String a2 = this.f25577b.W().a();
        if (TextUtils.isEmpty(a2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25578c.b(this.d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f25577b.W().b(), a2, arrayList, this.f26886h.getOpenMeasurementContentUrl(), this.f26886h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.f25578c.a(this.d, "Failed to create ad session context", th2);
            return null;
        }
    }
}
