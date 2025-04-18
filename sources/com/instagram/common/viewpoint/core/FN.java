package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class FN extends C1106as {
    public final /* synthetic */ FM A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FN(FM fm, Context context) {
        super(context);
        this.A00 = fm;
    }

    @Override // com.instagram.common.viewpoint.core.C1106as, com.instagram.common.viewpoint.core.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C02904z c02904z) {
        int[] A0H = this.A00.A0H(((AbstractC1092ad) this.A00).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c02904z.A04(time, dy, dx, ((C1106as) this).A04);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C1106as
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.instagram.common.viewpoint.core.C1106as
    public final int A0L(int i2) {
        return Math.min(100, super.A0L(i2));
    }
}
