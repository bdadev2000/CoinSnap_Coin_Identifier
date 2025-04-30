package com.vungle.ads;

/* loaded from: classes3.dex */
public final class i1 extends o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String str) {
        super(137, com.vungle.ads.internal.protos.g.TPAT_RETRY_FAILED, "Pinging Tpat did not succeed during all allowed reries. Failed url is ".concat(str), null, null, null, 56, null);
        G7.j.e(str, "url");
    }
}
