package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h3 extends n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(String url) {
        super(137, com.vungle.ads.internal.protos.g.TPAT_RETRY_FAILED, vd.e.e("Pinging Tpat did not succeed during all allowed reries. Failed url is ", url), null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(url, "url");
    }
}
