package com.meta.analytics.dsp.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7R extends QQ {
    public static String[] A04 = {"t7nWMgaAgPrF08nCpsue0KJ0bXYxildh", "6KdtKMmtzfHYFwbGu3Z1Ir1zVfPvm0mZ", "4a3tRJ2Sc2HJRD7iGLBoGFg5dIAFXATk", "UpueiF5Mlf4qFrRwKkN0oaj1wZcm2sVE", "2I2trXzlQyfCpDc0SWIB9I9l1xDqUCt2", "pVCp6f81Bxfp7pGgyLuO3QWY2ZOI1Rz7", "JWrnXr9CYPwxDsxVPLOhiB9OxQPOAEin", "O346HS8RGmqKBjl58VTWQBGWIRLrpgc9"};
    public final ImageView A00;
    public final C1636Yn A01;
    public final AbstractC09988s<C9H> A02;
    public final AbstractC09988s<O8> A03;

    public C7R(C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A03 = new C1271Kg(this);
        this.A02 = new C1270Kf(this);
        this.A01 = c1636Yn;
        ImageView imageView = new ImageView(c1636Yn);
        this.A00 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        AbstractC1303Lo.A0M(imageView, ViewCompat.MEASURED_STATE_MASK);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(imageView);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A02);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        this.A00.layout(0, 0, i11 - i9, i12 - i10);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC1348Nh interfaceC1348Nh) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC1513Tq downloadImageTask = new AsyncTaskC1513Tq(this.A00, this.A01).A04();
        if (interfaceC1348Nh != null) {
            downloadImageTask.A06(interfaceC1348Nh);
        }
        downloadImageTask.A07(str);
        String[] strArr = A04;
        if (strArr[0].charAt(21) == strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "kA5c9xFlh2VnhKEqDnwhhyQ6vC8xp51l";
        strArr2[6] = "v6NK46wFN1tyoiPUrV3jpTAezqYTXUDI";
    }
}
