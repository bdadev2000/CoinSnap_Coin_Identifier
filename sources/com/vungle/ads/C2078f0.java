package com.vungle.ads;

import android.content.Context;

/* renamed from: com.vungle.ads.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2078f0 extends AbstractC2068a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2078f0(Context context) {
        super(context);
        G7.j.e(context, "context");
    }

    @Override // com.vungle.ads.internal.AbstractC2115v
    public boolean isValidAdTypeForPlacement(c7.p1 p1Var) {
        G7.j.e(p1Var, "placement");
        return p1Var.isInterstitial();
    }
}
