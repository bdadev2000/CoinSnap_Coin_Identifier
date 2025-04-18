package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 extends n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(String privacyUrl) {
        super(136, com.vungle.ads.internal.protos.g.PRIVACY_URL_ERROR, vd.e.e("Failed to open privacy url: ", privacyUrl), null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(privacyUrl, "privacyUrl");
    }
}
