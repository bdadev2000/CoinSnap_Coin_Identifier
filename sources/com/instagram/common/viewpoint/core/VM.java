package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class VM extends AbstractC0699Mg {
    public final O5 A00;

    public VM(C1045Zs c1045Zs, View.OnClickListener onClickListener) {
        super(c1045Zs, onClickListener);
        this.A00 = new O5(c1045Zs);
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
    }

    public final VM A0F(String str) {
        new AsyncTaskC0914Un(this.A00, this.A01).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new VN(this)).A07(str);
        A0C();
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0699Mg
    public int getMediaViewId() {
        return this.A00.getId();
    }
}
