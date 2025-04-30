package com.vungle.ads;

/* renamed from: com.vungle.ads.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2082h0 extends o1 {
    public C2082h0() {
        this(0, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ C2082h0(int i9, com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4, int i10, G7.f fVar) {
        this((i10 & 1) != 0 ? o1.INVALID_AD_STATE : i9, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? "Ad state is invalid" : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2082h0(int i9, com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4) {
        super(Integer.valueOf(i9), gVar, str, str2, str3, str4, null);
        G7.j.e(str, "errorMessage");
    }
}
