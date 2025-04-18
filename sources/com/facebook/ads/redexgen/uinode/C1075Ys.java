package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1075Ys extends KT {
    public final /* synthetic */ C6U A00;
    public final /* synthetic */ C6V A01;
    public final /* synthetic */ C03756c A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1075Ys(C03756c c03756c, ArrayList arrayList, C6V c6v, C6U c6u, ArrayList arrayList2) {
        this.A02 = c03756c;
        this.A03 = arrayList;
        this.A01 = c6v;
        this.A00 = c6u;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AtomicBoolean A0D;
        C03987f c03987f;
        Handler handler;
        C03987f c03987f2;
        long j3;
        long j10;
        long j11;
        long j12;
        A0D = C03756c.A0D(this.A03);
        c03987f = this.A02.A04;
        if (c03987f instanceof C1070Yn) {
            c03987f2 = this.A02.A04;
            C1070Yn c1070Yn = (C1070Yn) c03987f2;
            if (this.A01.A00 == -1) {
                if (A0D.get()) {
                    C0S A0E = c1070Yn.A0E();
                    j12 = this.A02.A00;
                    A0E.A48(C0728Lf.A01(j12));
                } else {
                    C0S A0E2 = c1070Yn.A0E();
                    j11 = this.A02.A00;
                    A0E2.A46(C0728Lf.A01(j11));
                }
            } else if (A0D.get()) {
                C0S A0E3 = c1070Yn.A0E();
                j10 = this.A02.A00;
                A0E3.A49(C0728Lf.A01(j10), this.A01.A00);
            } else {
                C0S A0E4 = c1070Yn.A0E();
                j3 = this.A02.A00;
                A0E4.A47(C0728Lf.A01(j3), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C1076Yt(this, A0D));
        C03756c.A0D(this.A04);
    }
}
