package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ol */
/* loaded from: assets/audience_network.dex */
public class C0756Ol {
    public boolean A00;
    public View A03;
    public W7 A04;
    public LZ A05;
    public MQ A06;
    public N5 A07;
    public final View A08;
    public final AbstractC1187cD A09;
    public final C1045Zs A0A;
    public final J7 A0B;
    public final C0688Lv A0C;
    public final MR A0D;
    public final C0833Rk A0E;
    public int A02 = 0;
    public int A01 = 1;

    public C0756Ol(C1045Zs c1045Zs, J7 j7, MR mr, AbstractC1187cD abstractC1187cD, View view, C0833Rk c0833Rk, C0688Lv c0688Lv) {
        this.A0A = c1045Zs;
        this.A0B = j7;
        this.A0D = mr;
        this.A09 = abstractC1187cD;
        this.A08 = view;
        this.A0E = c0833Rk;
        this.A0C = c0688Lv;
    }

    public final C0756Ol A0E(int i2) {
        this.A01 = i2;
        return this;
    }

    public final C0756Ol A0F(int i2) {
        this.A02 = i2;
        return this;
    }

    public final C0756Ol A0G(View view) {
        this.A03 = view;
        return this;
    }

    public final C0756Ol A0H(W7 w7) {
        this.A04 = w7;
        return this;
    }

    public final C0756Ol A0I(LZ lz) {
        this.A05 = lz;
        return this;
    }

    public final C0756Ol A0J(MQ mq) {
        this.A06 = mq;
        return this;
    }

    public final C0756Ol A0K(N5 n5) {
        this.A07 = n5;
        return this;
    }

    public final C0756Ol A0L(boolean z2) {
        this.A00 = z2;
        return this;
    }

    public final C0757Om A0M() {
        return new C0757Om(this);
    }
}
