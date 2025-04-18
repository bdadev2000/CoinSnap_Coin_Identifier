package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TI extends OV {
    public final ImageView A00;
    public final C1045Zs A01;

    public TI(C1045Zs c1045Zs) {
        super(c1045Zs);
        this.A01 = c1045Zs;
        this.A00 = new ImageView(c1045Zs);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC0914Un downloadImageTask = new AsyncTaskC0914Un(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
