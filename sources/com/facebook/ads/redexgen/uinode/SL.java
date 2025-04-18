package com.facebook.ads.redexgen.uinode;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class SL extends O4 {
    public final ImageView A00;
    public final C1070Yn A01;

    public SL(C1070Yn c1070Yn) {
        super(c1070Yn);
        this.A01 = c1070Yn;
        ImageView imageView = new ImageView(c1070Yn);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0947Tq downloadImageTask = new AsyncTaskC0947Tq(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
