package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OO {
    public boolean A00;
    public View A03;
    public V2 A04;
    public MB A05;
    public KP A06;
    public final View A07;
    public final AbstractC1739b5 A08;
    public final C1636Yn A09;
    public final J2 A0A;
    public final C1295Lg A0B;
    public final MC A0C;
    public final RE A0D;
    public int A02 = 0;
    public int A01 = 1;

    public OO(C1636Yn c1636Yn, J2 j22, MC mc, AbstractC1739b5 abstractC1739b5, View view, RE re, C1295Lg c1295Lg) {
        this.A09 = c1636Yn;
        this.A0A = j22;
        this.A0C = mc;
        this.A08 = abstractC1739b5;
        this.A07 = view;
        this.A0D = re;
        this.A0B = c1295Lg;
    }

    public final OO A0D(int i9) {
        this.A01 = i9;
        return this;
    }

    public final OO A0E(int i9) {
        this.A02 = i9;
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

    public final OO A0H(MB mb) {
        this.A05 = mb;
        return this;
    }

    public final OO A0I(KP kp) {
        this.A06 = kp;
        return this;
    }

    public final OO A0J(boolean z8) {
        this.A00 = z8;
        return this;
    }

    public final OP A0K() {
        return new OP(this);
    }
}
