package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9I extends QS {
    public int A00;
    public boolean A01;
    public final AbstractC09988s<C9H> A02;
    public final AbstractC09988s<AnonymousClass98> A03;
    public final AbstractC09988s<O8> A04;
    public final AbstractC09988s<AnonymousClass93> A05;
    public final AbstractC09988s<C1332Mr> A06;
    public final AbstractC09988s<C1320Mf> A07;
    public final AbstractC09988s<C1315Ma> A08;
    public final AbstractC09988s<MU> A09;
    public final AbstractC09988s<C1309Lu> A0A;
    public final SA A0B;
    public final NX A0C;
    public final MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C9I(C1636Yn c1636Yn, J2 j22, SA sa, List<C2P> list, String str) {
        super(c1636Yn, j22, sa, list, str, !sa.A0h(), new QR(c1636Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                C9I.this.A0a();
            }
        };
        this.A0D = mv;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s32 = new S3(this);
        this.A03 = s32;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra = new RA(this);
        this.A05 = ra;
        C1422Qd c1422Qd = new C1422Qd(this);
        this.A02 = c1422Qd;
        C1421Qc c1421Qc = new C1421Qc(this);
        this.A06 = c1421Qc;
        C1419Qa c1419Qa = new C1419Qa(this);
        this.A09 = c1419Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        NX nx = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C1354Nn c1354Nn) {
                SA sa2;
                C9I c9i = C9I.this;
                sa2 = c9i.A0B;
                c9i.A00 = sa2.getDuration();
            }
        };
        this.A0C = nx;
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra, s72, rh, s32, c1422Qd, c1421Qc, c1419Qa, qv, nx, s9);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C9I(C1636Yn c1636Yn, J2 j22, SA sa, List<C2P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c1636Yn, j22, sa, list, str, !sa.A0h(), bundle, map, new QR(c1636Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                C9I.this.A0a();
            }
        };
        this.A0D = mv;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s32 = new S3(this);
        this.A03 = s32;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra = new RA(this);
        this.A05 = ra;
        C1422Qd c1422Qd = new C1422Qd(this);
        this.A02 = c1422Qd;
        C1421Qc c1421Qc = new C1421Qc(this);
        this.A06 = c1421Qc;
        C1419Qa c1419Qa = new C1419Qa(this);
        this.A09 = c1419Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        this.A0C = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C1354Nn c1354Nn) {
                SA sa2;
                C9I c9i = C9I.this;
                sa2 = c9i.A0B;
                c9i.A00 = sa2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra, s72, rh, s32, c1422Qd, c1421Qc, c1419Qa, qv, s9);
    }

    public C9I(C1636Yn c1636Yn, J2 j22, SA sa, String str) {
        this(c1636Yn, j22, sa, new ArrayList(), str);
    }

    public C9I(C1636Yn c1636Yn, J2 j22, SA sa, String str, Bundle bundle) {
        this(c1636Yn, j22, sa, new ArrayList(), str, bundle, null);
    }

    public C9I(C1636Yn c1636Yn, J2 j22, SA sa, String str, Map<String, String> extraParams) {
        this(c1636Yn, j22, sa, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        S8 s82 = new S8(this);
        if (this.A0B.A0l()) {
            ExecutorC1297Li.A00(s82);
        } else {
            this.A0B.getStateHandler().post(s82);
        }
    }
}
