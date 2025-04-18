package com.facebook.ads.redexgen.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7R extends QQ {
    public static String[] A04 = {"t7nWMgaAgPrF08nCpsue0KJ0bXYxildh", "6KdtKMmtzfHYFwbGu3Z1Ir1zVfPvm0mZ", "4a3tRJ2Sc2HJRD7iGLBoGFg5dIAFXATk", "UpueiF5Mlf4qFrRwKkN0oaj1wZcm2sVE", "2I2trXzlQyfCpDc0SWIB9I9l1xDqUCt2", "pVCp6f81Bxfp7pGgyLuO3QWY2ZOI1Rz7", "JWrnXr9CYPwxDsxVPLOhiB9OxQPOAEin", "O346HS8RGmqKBjl58VTWQBGWIRLrpgc9"};
    public final ImageView A00;
    public final C1070Yn A01;
    public final AbstractC04328s<C9H> A02;
    public final AbstractC04328s<O8> A03;

    public C7R(C1070Yn c1070Yn) {
        super(c1070Yn);
        this.A03 = new C0705Kg(this);
        this.A02 = new C0704Kf(this);
        this.A01 = c1070Yn;
        ImageView imageView = new ImageView(c1070Yn);
        this.A00 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        AbstractC0737Lo.A0M(imageView, ViewCompat.MEASURED_STATE_MASK);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(imageView);
    }

    @Override // com.facebook.ads.redexgen.uinode.QQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A00.layout(0, 0, i12 - i10, i13 - i11);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, InterfaceC0782Nh interfaceC0782Nh) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC0947Tq downloadImageTask = new AsyncTaskC0947Tq(this.A00, this.A01).A04();
        if (interfaceC0782Nh != null) {
            downloadImageTask.A06(interfaceC0782Nh);
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
