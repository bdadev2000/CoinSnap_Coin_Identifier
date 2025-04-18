package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class A4 extends AbstractC0891Tq {
    public static String[] A06 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC0753Oi A00;
    public final ImageView A01;
    public final C5W A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public A4(C1045Zs c1045Zs, N9 n9, J7 j7, AbstractC1187cD abstractC1187cD, C03226f c03226f, MR mr) {
        super(c1045Zs, n9, j7, abstractC1187cD, c03226f, mr);
        this.A02 = new C0886Tl(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC0914Un(this.A01, super.A03).A05(super.A01.A1P().A0E().A00(), super.A01.A1P().A0E().A01()).A06(new C0885Tk(this)).A07(super.A01.A1P().A0E().A07());
    }

    private AbstractC0753Oi A01(int i2) {
        if (this.A01.getParent() != null) {
            M3.A0J(this.A01);
        }
        return AbstractC0754Oj.A00(new C0756Ol(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0F(this.A07.getToolbarHeight()).A0J(this.A07).A0E(i2).A0M(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0V();
        }
    }

    private void A06(int i2) {
        M3.A0J(this.A00);
        this.A00 = A01(i2);
        C1O colors = this.A00.getColors();
        M3.A0M(this, colors.A07(this.A00 != null && (this.A00.A11() || (this.A00 instanceof AbstractC0904Ud))));
        this.A07.setFullscreen(this.A00.A11());
        this.A07.A09(colors, ViewOnClickListenerC0909Ui.A08(super.A01));
        addView(this.A00, 0, AbstractC0891Tq.A0E);
        setUpFullscreenMode(this.A00 != null && this.A00.A11());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq
    public final void A0W() {
        M3.A0L(this.A00);
        M3.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A1P().A0E().A03();
        if (A03 > 0) {
            if (this.A00 != null) {
                this.A00.A0z();
            }
            A0X(A03, new C0884Tj(this));
        } else {
            this.A05.set(true);
            MQ mq = this.A07;
            int unskippableSeconds = getCloseButtonStyle();
            mq.setToolbarActionMode(unskippableSeconds);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq
    public final void A0Y(C5Q c5q) {
        c5q.A0A(this.A02);
        int orientation = c5q.A05().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        M3.A0H(this.A00);
        M3.A0H(this.A07);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq
    public final boolean A0Z() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC0753Oi abstractC0753Oi = this.A00;
        if (A06[4].length() != 3) {
            throw new RuntimeException();
        }
        A06[4] = "kMg";
        return abstractC0753Oi.A12(false);
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ACz(boolean z2) {
    }

    @Override // com.instagram.common.viewpoint.core.MS
    public final void ADN(boolean z2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A1P().A0P()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0891Tq, com.instagram.common.viewpoint.core.MS
    public final void onDestroy() {
        if (C0608Im.A1p(super.A03)) {
            super.A03.A0A().AHC(this.A01);
        }
        if (this.A00 != null) {
            AbstractC0753Oi abstractC0753Oi = this.A00;
            String[] strArr = A06;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A06[4] = "hIQ";
            abstractC0753Oi.A0v();
        }
        super.onDestroy();
    }
}
