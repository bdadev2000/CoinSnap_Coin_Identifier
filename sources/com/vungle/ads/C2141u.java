package com.vungle.ads;

/* renamed from: com.vungle.ads.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2141u extends o1 {
    public /* synthetic */ C2141u(String str, Integer num, String str2, int i9, G7.f fVar) {
        this(str, (i9 & 2) != 0 ? null : num, (i9 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141u(String str, Integer num, String str2) {
        super(117, com.vungle.ads.internal.protos.g.ASSET_FAILED_STATUS_CODE, "Asset fail to download: " + str + ", Error code:" + num, str2, null, null, 48, null);
        G7.j.e(str, "url");
    }
}
