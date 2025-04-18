package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0555Ed extends C1095Zn {
    public final /* synthetic */ C0554Ec A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0555Ed(C0554Ec c0554Ec, Context context) {
        super(context);
        this.A00 = c0554Ec;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1095Zn, com.facebook.ads.redexgen.uinode.AnonymousClass51
    public final void A0I(View view, AnonymousClass53 anonymousClass53, C03464z c03464z) {
        C0554Ec c0554Ec = this.A00;
        int[] A0H = c0554Ec.A0H(((ZY) c0554Ec).A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c03464z.A04(time, dy, dx, ((C1095Zn) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1095Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1095Zn
    public final int A0L(int i10) {
        return Math.min(100, super.A0L(i10));
    }
}
