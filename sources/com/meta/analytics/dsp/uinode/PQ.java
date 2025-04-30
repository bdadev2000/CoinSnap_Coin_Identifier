package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class PQ extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final RD A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC1739b5 A05;
    public final C1636Yn A06;
    public final J2 A07;
    public final C1295Lg A08;
    public final MC A09;
    public final InterfaceC1324Mj A0A;
    public final RE A0B;

    public abstract void A0z();

    public abstract void A10();

    public abstract void A11();

    public abstract void A12(boolean z8);

    public abstract void A13(boolean z8);

    public abstract boolean A14();

    public abstract boolean A15();

    public abstract C1395Pc getFullScreenAdStyle();

    public PQ(C1636Yn c1636Yn, InterfaceC1324Mj interfaceC1324Mj, J2 j22, AbstractC1739b5 abstractC1739b5, int i9, boolean z8, boolean z9, MC mc) {
        super(c1636Yn);
        this.A08 = new C1295Lg();
        this.A00 = false;
        TB tb = new TB(this);
        this.A02 = tb;
        this.A01 = i9;
        this.A06 = c1636Yn;
        this.A04 = z8;
        this.A03 = z9;
        this.A09 = mc;
        this.A0A = interfaceC1324Mj;
        this.A05 = abstractC1739b5;
        this.A07 = j22;
        RE re = new RE(this, 1, new WeakReference(tb), c1636Yn);
        this.A0B = re;
        re.A0W(abstractC1739b5.A0C());
        re.A0X(abstractC1739b5.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC1739b5 getAdDataBundle() {
        return this.A05;
    }

    public RE getAdViewabilityChecker() {
        return this.A0B;
    }

    public C1295Lg getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
