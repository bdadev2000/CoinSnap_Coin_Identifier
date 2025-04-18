package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OO {
    public boolean A00;
    public View A03;
    public V2 A04;
    public MB A05;
    public KP A06;
    public final View A07;
    public final AbstractC1173b5 A08;
    public final C1070Yn A09;
    public final J2 A0A;
    public final C0729Lg A0B;
    public final MC A0C;
    public final RE A0D;
    public int A02 = 0;
    public int A01 = 1;

    public OO(C1070Yn c1070Yn, J2 j22, MC mc2, AbstractC1173b5 abstractC1173b5, View view, RE re2, C0729Lg c0729Lg) {
        this.A09 = c1070Yn;
        this.A0A = j22;
        this.A0C = mc2;
        this.A08 = abstractC1173b5;
        this.A07 = view;
        this.A0D = re2;
        this.A0B = c0729Lg;
    }

    public final OO A0D(int i10) {
        this.A01 = i10;
        return this;
    }

    public final OO A0E(int i10) {
        this.A02 = i10;
        return this;
    }

    public final OO A0F(View view) {
        this.A03 = view;
        return this;
    }

    public final OO A0G(V2 v22) {
        this.A04 = v22;
        return this;
    }

    public final OO A0H(MB mb2) {
        this.A05 = mb2;
        return this;
    }

    public final OO A0I(KP kp) {
        this.A06 = kp;
        return this;
    }

    public final OO A0J(boolean z10) {
        this.A00 = z10;
        return this;
    }

    public final OP A0K() {
        return new OP(this);
    }
}
