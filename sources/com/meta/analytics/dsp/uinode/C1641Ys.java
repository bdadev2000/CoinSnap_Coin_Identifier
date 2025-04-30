package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1641Ys extends KT {
    public final /* synthetic */ C6U A00;
    public final /* synthetic */ C6V A01;
    public final /* synthetic */ C09416c A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1641Ys(C09416c c09416c, ArrayList arrayList, C6V c6v, C6U c6u, ArrayList arrayList2) {
        this.A02 = c09416c;
        this.A03 = arrayList;
        this.A01 = c6v;
        this.A00 = c6u;
        this.A04 = arrayList2;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AtomicBoolean A0D;
        C09647f c09647f;
        Handler handler;
        C09647f c09647f2;
        long j7;
        long j9;
        long j10;
        long j11;
        A0D = C09416c.A0D(this.A03);
        c09647f = this.A02.A04;
        if (c09647f instanceof C1636Yn) {
            c09647f2 = this.A02.A04;
            C1636Yn c1636Yn = (C1636Yn) c09647f2;
            if (this.A01.A00 == -1) {
                if (A0D.get()) {
                    C0S A0E = c1636Yn.A0E();
                    j11 = this.A02.A00;
                    A0E.A48(C1294Lf.A01(j11));
                } else {
                    C0S A0E2 = c1636Yn.A0E();
                    j10 = this.A02.A00;
                    A0E2.A46(C1294Lf.A01(j10));
                }
            } else if (A0D.get()) {
                C0S A0E3 = c1636Yn.A0E();
                j9 = this.A02.A00;
                A0E3.A49(C1294Lf.A01(j9), this.A01.A00);
            } else {
                C0S A0E4 = c1636Yn.A0E();
                j7 = this.A02.A00;
                A0E4.A47(C1294Lf.A01(j7), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C1642Yt(this, A0D));
        C09416c.A0D(this.A04);
    }
}
