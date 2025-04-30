package com.meta.analytics.dsp.uinode;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class T8 extends PQ {
    public static String[] A07 = {"itiy11Wl5lP7QtpB3", "v6A5WW2CB", "SYp5FzxPKMl", "MKN0lN1Uug", "IQIXhYysWoH9a5YMZx5hFMUL6lEdxT5q", "FECz3BMfLn4pJfwLFVrIm2wrzlNMsWJ3", "RmVgcuWcoU56A5AXkQhrmgSRFj76ryom", "F5uv5dts8QHAu8Ovw"};
    public static final RelativeLayout.LayoutParams A08 = new RelativeLayout.LayoutParams(-1, -1);
    public L9 A00;
    public OL A01;
    public final int A02;
    public final ImageView A03;
    public final MB A04;
    public final InterfaceC1396Pd A05;
    public final AtomicBoolean A06;

    public T8(C1636Yn c1636Yn, InterfaceC1324Mj interfaceC1324Mj, int i9, J2 j22, AbstractC1739b5 abstractC1739b5, MC mc, FullScreenAdToolbar fullScreenAdToolbar, boolean z8, boolean z9, InterfaceC1396Pd interfaceC1396Pd, int i10) {
        super(c1636Yn, interfaceC1324Mj, j22, abstractC1739b5, i9, z8, z9, mc);
        this.A06 = new AtomicBoolean(false);
        this.A02 = i10;
        this.A05 = interfaceC1396Pd;
        ImageView imageView = new ImageView(getContext());
        this.A03 = imageView;
        this.A04 = fullScreenAdToolbar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC1513Tq(imageView, c1636Yn).A05(abstractC1739b5.A0x().A0D().A00(), abstractC1739b5.A0x().A0D().A01()).A06(new TA(this)).A07(abstractC1739b5.A0x().A0D().A07());
        A08(c1636Yn.getResources().getConfiguration().orientation);
    }

    private OL A04(int i9) {
        if (this.A03.getParent() != null) {
            ImageView imageView = this.A03;
            if (A07[4].charAt(16) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[3] = "PnJcnL34IR";
            strArr[1] = "4gIzhBkuZ";
            AbstractC1303Lo.A0J(imageView);
        }
        if (A07[4].charAt(16) != 'Z') {
            throw new RuntimeException();
        }
        A07[4] = "hUws06ULbo6w3OlBZNW9WYMgHjAED42u";
        OP params = new OO(super.A06, this.A07, this.A09, super.A05, this.A03, this.A0B, this.A08).A0E(this.A04.getToolbarHeight()).A0H(this.A04).A0D(i9).A0J(i9 != 2).A0K();
        return OM.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A06.get()) {
            A03();
        }
    }

    private void A08(int i9) {
        AbstractC1303Lo.A0J(this.A01);
        OL A04 = A04(i9);
        this.A01 = A04;
        addView(A04, 0, A08);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A0z() {
        if (C1225Ih.A1W(super.A06)) {
            super.A06.A0A().AGk(this.A03);
        }
        OL ol = this.A01;
        if (ol != null) {
            ol.A0v();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A10() {
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A11() {
        int i9 = this.A02;
        if (i9 > 0) {
            L9 l9 = new L9(i9, 100.0f, 100L, new Handler(Looper.getMainLooper()), new T9(this));
            this.A00 = l9;
            l9.A07();
            return;
        }
        this.A05.AD7(false);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A12(boolean z8) {
        L9 l9 = this.A00;
        if (l9 != null && l9.A05()) {
            this.A00.A06();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final void A13(boolean z8) {
        L9 l9 = this.A00;
        if (l9 != null && !l9.A04()) {
            this.A00.A07();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A14() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public final boolean A15() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.PQ
    public C1395Pc getFullScreenAdStyle() {
        C1P colors = this.A01.getColors();
        return new C1395Pc(this.A01.A11(), C1395Pc.A07, colors, ViewOnClickListenerC1508Tl.A08(super.A05), colors.A07(this.A01.A11() || (this.A01 instanceof AbstractC1503Tg)), null);
    }

    @Override // com.meta.analytics.dsp.uinode.PQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A05.A0x().A0N()) {
            A08(configuration.orientation);
        }
    }
}
