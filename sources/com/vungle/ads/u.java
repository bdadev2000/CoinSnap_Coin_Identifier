package com.vungle.ads;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends n3 {
    public /* synthetic */ u(String str, Integer num, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String url, Integer num, String str) {
        super(117, com.vungle.ads.internal.protos.g.ASSET_FAILED_STATUS_CODE, "Asset fail to download: " + url + ", Error code:" + num, str, null, null, 48, null);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
