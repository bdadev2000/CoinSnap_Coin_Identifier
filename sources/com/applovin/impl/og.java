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
    static final /* synthetic */ boolean f6591p = true;

    /* renamed from: h */
    private final bq f6592h;

    /* renamed from: i */
    private final AtomicBoolean f6593i;

    /* renamed from: j */
    private MediaEvents f6594j;

    /* renamed from: k */
    private final VastProperties f6595k;

    /* renamed from: l */
    private final AtomicBoolean f6596l;

    /* renamed from: m */
    private final AtomicBoolean f6597m;

    /* renamed from: n */
    private final AtomicBoolean f6598n;

    /* renamed from: o */
    private final AtomicBoolean f6599o;

    public og(bq bqVar) {
        super(bqVar);
        this.f6593i = new AtomicBoolean();
        this.f6596l = new AtomicBoolean();
        this.f6597m = new AtomicBoolean();
        this.f6598n = new AtomicBoolean();
        this.f6599o = new AtomicBoolean();
        this.f6592h = bqVar;
        float l12 = (float) bqVar.l1();
        if (bqVar.l1() == -1) {
            this.f6595k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f6595k = VastProperties.createVastPropertiesForSkippableMedia(l12, true, Position.STANDALONE);
        }
    }

    public static /* synthetic */ void u(og ogVar, boolean z10) {
        ogVar.a(z10);
    }

    public void A() {
        b("track resumed", new mu(this, 10));
    }

    public void B() {
        b("track skipped", new mu(this, 7));
    }

    public void C() {
        if (this.f6599o.compareAndSet(false, true)) {
            b("track third quartile", new mu(this, 9));
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create ad session configuration", th2);
            }
            return null;
        }
    }

    public void b(final float f10, final boolean z10) {
        if (this.f6596l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.ou
                @Override // java.lang.Runnable
                public final void run() {
                    og.this.a(f10, z10);
                }
            });
        }
    }

    @Override // com.applovin.impl.ig
    public void h() {
        b("track loaded", new mu(this, 3));
    }

    public void v() {
        b("track clicked", new mu(this, 5));
    }

    public void w() {
        b("track completed", new mu(this, 1));
    }

    public void x() {
        if (this.f6597m.compareAndSet(false, true)) {
            b("track first quartile", new mu(this, 2));
        }
    }

    public void y() {
        int i10 = 0;
        if (this.f6598n.compareAndSet(false, true)) {
            b("track midpoint", new mu(this, i10));
        }
    }

    public void z() {
        b("track paused", new mu(this, 6));
    }

    public /* synthetic */ void k() {
        this.f6594j.bufferFinish();
    }

    public /* synthetic */ void l() {
        this.f6594j.bufferStart();
    }

    public /* synthetic */ void m() {
        this.f6594j.adUserInteraction(InteractionType.CLICK);
    }

    public /* synthetic */ void n() {
        this.f6594j.complete();
    }

    public /* synthetic */ void o() {
        this.f6594j.firstQuartile();
    }

    public /* synthetic */ void p() {
        this.f5335g.loaded(this.f6595k);
    }

    public /* synthetic */ void q() {
        this.f6594j.midpoint();
    }

    public /* synthetic */ void r() {
        this.f6594j.pause();
    }

    public /* synthetic */ void s() {
        this.f6594j.resume();
    }

    public /* synthetic */ void t() {
        this.f6594j.skipped();
    }

    public /* synthetic */ void u() {
        this.f6594j.thirdQuartile();
    }

    public void i() {
        if (this.f6593i.compareAndSet(true, false)) {
            b("buffer finished", new mu(this, 4));
        }
    }

    public void j() {
        if (this.f6593i.compareAndSet(false, true)) {
            b("buffer started", new mu(this, 8));
        }
    }

    public /* synthetic */ void a(float f10, boolean z10) {
        this.f6594j.start(f10, z10 ? 0.0f : 1.0f);
    }

    public void b(boolean z10) {
        b("track volume changed", new nu(0, this, z10));
    }

    public /* synthetic */ void a(boolean z10) {
        this.f6594j.volumeChange(z10 ? 0.0f : 1.0f);
    }

    @Override // com.applovin.impl.ig
    public void a(AdSession adSession) {
        try {
            this.f6594j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.a(this.f5332d, "Failed to create media events", th2);
            }
        }
    }

    @Override // com.applovin.impl.ig
    public AdSessionContext a(WebView webView) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        if (!f6591p && this.f6592h.d1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (cq cqVar : this.f6592h.d1().a()) {
            List<iq> b3 = cqVar.b();
            if (b3.isEmpty()) {
                nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.f5330b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (iq iqVar : b3) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(iqVar.a())) {
                        arrayList2.add(iqVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    nq.a(cqVar.a(), gq.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f5330b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((iq) it.next()).b()));
                        } catch (Throwable th2) {
                            if (com.applovin.impl.sdk.t.a()) {
                                this.f5331c.a(this.f5332d, "Failed to parse JavaScript resource url", th2);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.f5330b);
                    } else {
                        String d10 = cqVar.d();
                        String c10 = cqVar.c();
                        if (StringUtils.isValidString(d10) && !StringUtils.isValidString(c10)) {
                            nq.a(cqVar.a(), gq.FAILED_TO_LOAD_RESOURCE, this.f5330b);
                        } else {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                if (StringUtils.isValidString(d10)) {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(c10, url, d10);
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
        String a = this.f5330b.Y().a();
        if (TextUtils.isEmpty(a)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f5331c.b(this.f5332d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f5330b.Y().b(), a, arrayList, this.f6592h.getOpenMeasurementContentUrl(), this.f6592h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th3) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.f5331c.a(this.f5332d, "Failed to create ad session context", th3);
            return null;
        }
    }
}
