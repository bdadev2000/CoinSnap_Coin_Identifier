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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class og extends ig {

    /* renamed from: p */
    static final /* synthetic */ boolean f9528p = true;

    /* renamed from: h */
    private final bq f9529h;

    /* renamed from: i */
    private final AtomicBoolean f9530i;

    /* renamed from: j */
    private MediaEvents f9531j;

    /* renamed from: k */
    private final VastProperties f9532k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;

    /* renamed from: n */
    private final AtomicBoolean f9533n;

    /* renamed from: o */
    private final AtomicBoolean f9534o;

    public og(bq bqVar) {
        super(bqVar);
        this.f9530i = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = new AtomicBoolean();
        this.f9533n = new AtomicBoolean();
        this.f9534o = new AtomicBoolean();
        this.f9529h = bqVar;
        float l1 = (float) bqVar.l1();
        if (bqVar.l1() == -1) {
            this.f9532k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f9532k = VastProperties.createVastPropertiesForSkippableMedia(l1, true, Position.STANDALONE);
        }
    }

    public void A() {
        b("track resumed", new D1(this, 8));
    }

    public void B() {
        b("track skipped", new D1(this, 10));
    }

    public void C() {
        if (this.f9534o.compareAndSet(false, true)) {
            b("track third quartile", new D1(this, 3));
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.a(this.f8296d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    public void b(final float f9, final boolean z8) {
        if (this.l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.E1
                @Override // java.lang.Runnable
                public final void run() {
                    og.this.a(f9, z8);
                }
            });
        }
    }

    @Override // com.applovin.impl.ig
    public void h() {
        b("track loaded", new D1(this, 7));
    }

    public void v() {
        b("track clicked", new D1(this, 2));
    }

    public void w() {
        b("track completed", new D1(this, 6));
    }

    public void x() {
        if (this.m.compareAndSet(false, true)) {
            b("track first quartile", new D1(this, 1));
        }
    }

    public void y() {
        if (this.f9533n.compareAndSet(false, true)) {
            b("track midpoint", new D1(this, 9));
        }
    }

    public void z() {
        b("track paused", new D1(this, 0));
    }

    public /* synthetic */ void k() {
        this.f9531j.bufferFinish();
    }

    public /* synthetic */ void l() {
        this.f9531j.bufferStart();
    }

    public /* synthetic */ void m() {
        this.f9531j.adUserInteraction(InteractionType.CLICK);
    }

    public /* synthetic */ void n() {
        this.f9531j.complete();
    }

    public /* synthetic */ void o() {
        this.f9531j.firstQuartile();
    }

    public /* synthetic */ void p() {
        this.f8299g.loaded(this.f9532k);
    }

    public /* synthetic */ void q() {
        this.f9531j.midpoint();
    }

    public /* synthetic */ void r() {
        this.f9531j.pause();
    }

    public /* synthetic */ void s() {
        this.f9531j.resume();
    }

    public /* synthetic */ void t() {
        this.f9531j.skipped();
    }

    public /* synthetic */ void u() {
        this.f9531j.thirdQuartile();
    }

    public void i() {
        if (this.f9530i.compareAndSet(true, false)) {
            b("buffer finished", new D1(this, 4));
        }
    }

    public void j() {
        if (this.f9530i.compareAndSet(false, true)) {
            b("buffer started", new D1(this, 5));
        }
    }

    public /* synthetic */ void a(float f9, boolean z8) {
        this.f9531j.start(f9, z8 ? 0.0f : 1.0f);
    }

    public void b(boolean z8) {
        b("track volume changed", new L3.l(2, this, z8));
    }

    public /* synthetic */ void a(boolean z8) {
        this.f9531j.volumeChange(z8 ? 0.0f : 1.0f);
    }

    @Override // com.applovin.impl.ig
    public void a(AdSession adSession) {
        try {
            this.f9531j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.a(this.f8296d, "Failed to create media events", th);
            }
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionContext a(WebView webView) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        if (!f9528p && this.f9529h.d1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (cq cqVar : this.f9529h.d1().a()) {
            List<iq> b = cqVar.b();
            if (b.isEmpty()) {
                nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (iq iqVar : b) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(iqVar.a())) {
                        arrayList2.add(iqVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    nq.a(cqVar.a(), gq.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((iq) it.next()).b()));
                        } catch (Throwable th) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f8295c.a(this.f8296d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.b);
                    } else {
                        String d2 = cqVar.d();
                        String c9 = cqVar.c();
                        if (StringUtils.isValidString(d2) && !StringUtils.isValidString(c9)) {
                            nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.b);
                        } else {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                if (StringUtils.isValidString(d2)) {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(c9, url, d2);
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
        String a6 = this.b.Y().a();
        if (TextUtils.isEmpty(a6)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f8295c.b(this.f8296d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.b.Y().b(), a6, arrayList, this.f9529h.getOpenMeasurementContentUrl(), this.f9529h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.f8295c.a(this.f8296d, "Failed to create ad session context", th2);
            return null;
        }
    }
}
