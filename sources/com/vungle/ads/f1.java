package com.vungle.ads;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 extends n3 {
    public f1() {
        this(0, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ f1(int i10, com.vungle.ads.internal.protos.g gVar, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? n3.INVALID_AD_STATE : i10, (i11 & 2) != 0 ? null : gVar, (i11 & 4) != 0 ? "Ad state is invalid" : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i10, com.vungle.ads.internal.protos.g gVar, String errorMessage, String str, String str2, String str3) {
        super(Integer.valueOf(i10), gVar, errorMessage, str, str2, str3, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
