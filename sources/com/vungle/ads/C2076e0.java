package com.vungle.ads;

import android.content.Context;

/* renamed from: com.vungle.ads.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2076e0 extends U {
    public /* synthetic */ C2076e0(Context context, String str, C2073d c2073d, int i9, G7.f fVar) {
        this(context, str, (i9 & 4) != 0 ? new C2073d() : c2073d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2076e0(Context context, String str, C2073d c2073d) {
        super(context, str, c2073d);
        G7.j.e(context, "context");
        G7.j.e(str, "placementId");
        G7.j.e(c2073d, "adConfig");
    }

    @Override // com.vungle.ads.P
    public C2078f0 constructAdInternal$vungle_ads_release(Context context) {
        G7.j.e(context, "context");
        return new C2078f0(context);
    }
}
