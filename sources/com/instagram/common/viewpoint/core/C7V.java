package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7V extends AbstractC0861Sm {
    public static String[] A04 = {"hk0dnqphYZ0B2FA2HHbeoaEOUC9cHUBv", "tTD1hmxYdA3U5n9t8Z20NsAIS", "BfpeWRttIDT9n", "BdF5VvNpfNEd8dAFz8yBB3tju8j2QPKu", "opIRFI8OjkHX6xnIsWRzCqWD0", "Ob0oYr4gU4dgC4EVWukqT8XlG8BtSCcB", "HPuRIIJ62FmEL4YF0ip1f4WrSa12U9bK", "7SB"};
    public final ImageView A00;
    public final C1045Zs A01;
    public final AbstractC03808x<C9R> A02;
    public final AbstractC03808x<SZ> A03;

    public C7V(C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A03 = new C0735Nq(this);
        this.A02 = new NH(this);
        this.A01 = c1045Zs;
        this.A00 = new ImageView(c1045Zs);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        M3.A0M(this.A00, -16777216);
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0861Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            C03798w<AbstractC03808x, C03788v> eventBus = getVideoView().getEventBus();
            AbstractC03808x[] abstractC03808xArr = new AbstractC03808x[2];
            String[] strArr = A04;
            if (strArr[3].charAt(25) != strArr[5].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "Nqq";
            strArr2[2] = "4efeQvUmAeHBj";
            abstractC03808xArr[0] = this.A03;
            abstractC03808xArr[1] = this.A02;
            eventBus.A03(abstractC03808xArr);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0861Sm
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A03);
        }
        super.A08();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.A00.layout(0, 0, i4 - i2, i5 - i3);
    }

    public void setImage(String str) {
        setImage(str, null);
    }

    public void setImage(String str, O7 o7) {
        if (str == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        AsyncTaskC0914Un downloadImageTask = new AsyncTaskC0914Un(this.A00, this.A01).A04();
        if (o7 != null) {
            downloadImageTask.A06(o7);
        }
        downloadImageTask.A07(str);
    }
}
