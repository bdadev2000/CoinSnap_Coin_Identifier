package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1121Ed extends C1661Zn {
    public final /* synthetic */ C1120Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121Ed(C1120Ec c1120Ec, Context context) {
        super(context);
        this.A00 = c1120Ec;
    }

    @Override // com.meta.analytics.dsp.uinode.C1661Zn, com.meta.analytics.dsp.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C09124z c09124z) {
        C1120Ec c1120Ec = this.A00;
        int[] A0H = c1120Ec.A0H(((ZY) c1120Ec).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c09124z.A04(time, dy, dx, ((C1661Zn) this).A04);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1661Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.meta.analytics.dsp.uinode.C1661Zn
    public final int A0L(int i9) {
        return Math.min(100, super.A0L(i9));
    }
}
