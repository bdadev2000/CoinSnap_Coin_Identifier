package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9Y extends AbstractC1489Ss {
    public OL A00;
    public final ImageView A01;
    public final C5T A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C9Y(C1636Yn c1636Yn, InterfaceC1324Mj interfaceC1324Mj, J2 j22, AbstractC1739b5 abstractC1739b5, C09416c c09416c, MC mc) {
        super(c1636Yn, interfaceC1324Mj, j22, abstractC1739b5, c09416c, mc);
        this.A02 = new C1484Sn(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC1513Tq(imageView, super.A03).A05(super.A01.A0x().A0D().A00(), super.A01.A0x().A0D().A01()).A06(new C1483Sm(this)).A07(super.A01.A0x().A0D().A07());
    }

    private OL A01(int i9) {
        if (this.A01.getParent() != null) {
            AbstractC1303Lo.A0J(this.A01);
        }
        return OM.A00(new OO(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i9).A0K(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i9) {
        AbstractC1303Lo.A0J(this.A00);
        OL A01 = A01(i9);
        this.A00 = A01;
        C1P colors = A01.getColors();
        OL ol = this.A00;
        AbstractC1303Lo.A0M(this, colors.A07(ol != null && (ol.A11() || (this.A00 instanceof AbstractC1503Tg))));
        this.A07.setFullscreen(this.A00.A11());
        this.A07.A06(colors, ViewOnClickListenerC1508Tl.A08(super.A01));
        addView(this.A00, 0, AbstractC1489Ss.A0E);
        OL ol2 = this.A00;
        setUpFullscreenMode(ol2 != null && ol2.A11());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1489Ss
    public final void A0Q() {
        AbstractC1303Lo.A0L(this.A00);
        AbstractC1303Lo.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0x().A0D().A03();
        if (A03 > 0) {
            OL ol = this.A00;
            if (ol != null) {
                ol.A0z();
            }
            A0R(A03, new C1482Sl(this));
            return;
        }
        this.A05.set(true);
        MB mb = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        mb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1489Ss
    public final void A0S(C5V c5v) {
        c5v.A0N(this.A02);
        int orientation = c5v.A0J().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        AbstractC1303Lo.A0H(this.A00);
        AbstractC1303Lo.A0H(this.A07);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1489Ss
    public final boolean A0T() {
        OL ol = this.A00;
        return ol != null && ol.A12(false);
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACW(boolean z8) {
    }

    @Override // com.meta.analytics.dsp.uinode.MD
    public final void ACu(boolean z8) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        OL ol = this.A00;
        if (ol != null) {
            return ol.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1489Ss, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0x().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1489Ss, com.meta.analytics.dsp.uinode.MD
    public final void onDestroy() {
        if (C1225Ih.A1W(super.A03)) {
            super.A03.A0A().AGk(this.A01);
        }
        OL ol = this.A00;
        if (ol != null) {
            ol.A0v();
        }
        super.onDestroy();
    }
}
