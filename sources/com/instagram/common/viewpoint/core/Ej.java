package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class Ej extends C1090ab {
    public Ej(C5Q c5q) {
        super(c5q);
    }

    @Override // com.instagram.common.viewpoint.core.C1090ab, com.instagram.common.viewpoint.core.MR
    public final /* bridge */ /* synthetic */ void A3p(View view, int i2, RelativeLayout.LayoutParams layoutParams) {
        super.A3p(view, i2, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1090ab, com.instagram.common.viewpoint.core.MR
    public final /* bridge */ /* synthetic */ void A3q(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A3q(view, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.C1090ab, com.instagram.common.viewpoint.core.MR
    public final void A4P(String str) {
        super.A4P(str);
        if (this.A00.get() == null) {
            return;
        }
        String A03 = EnumC0818Qv.A08.A03();
        String rewardedVideoError = EnumC0818Qv.A09.A03();
        if (str.equals(A03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C1090ab, com.instagram.common.viewpoint.core.MR
    public final /* bridge */ /* synthetic */ void A4Q(String str, C03788v c03788v) {
        super.A4Q(str, c03788v);
    }

    @Override // com.instagram.common.viewpoint.core.C1090ab, com.instagram.common.viewpoint.core.MR
    public final /* bridge */ /* synthetic */ void A9l(String str, C1Z c1z) {
        super.A9l(str, c1z);
    }

    @Override // com.instagram.common.viewpoint.core.C1090ab, com.instagram.common.viewpoint.core.MR
    public final /* bridge */ /* synthetic */ void ABR(int i2) {
        super.ABR(i2);
    }
}
