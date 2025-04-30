package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1329Mo extends FrameLayout {
    public int A00;
    public C2U A01;
    public C2V A02;
    public C2W A03;
    public final C2S A04;
    public final C1636Yn A05;
    public final J2 A06;
    public final MC A07;
    public final MD A08;
    public final String A09;
    public final C08111a A0A;
    public final InterfaceC1331Mq A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2W c2w, C2U c2u);

    public abstract void A0O(C2W c2w, C2U c2u);

    public abstract boolean A0P();

    public AbstractC1329Mo(C1636Yn c1636Yn, J2 j22, String str) {
        this(c1636Yn, j22, str, null, null, null);
    }

    public AbstractC1329Mo(C1636Yn c1636Yn, J2 j22, String str, C08111a c08111a, MD md, MC mc) {
        super(c1636Yn);
        this.A00 = 0;
        this.A01 = C2U.A04;
        this.A03 = null;
        this.A0B = new U7(this);
        this.A05 = c1636Yn;
        this.A06 = j22;
        this.A08 = md;
        this.A07 = mc;
        this.A09 = str;
        this.A0A = c08111a;
        this.A04 = C2T.A00(c1636Yn.A01());
    }

    public static /* synthetic */ int A00(AbstractC1329Mo abstractC1329Mo) {
        int i9 = abstractC1329Mo.A00;
        abstractC1329Mo.A00 = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int A01(AbstractC1329Mo abstractC1329Mo) {
        int i9 = abstractC1329Mo.A00;
        abstractC1329Mo.A00 = i9 - 1;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9T(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2W c2w) {
        this.A02.A08(this.A01);
        A0N(c2w, this.A01);
        C08070w.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2W c2w) {
        this.A03 = c2w;
        this.A02.A09(this.A01, this.A00);
        A0O(c2w, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2V(new JA(this.A09, this.A06));
        MD md = this.A08;
        if (md != null) {
            md.ACW(true);
        }
        A0C();
    }
}
