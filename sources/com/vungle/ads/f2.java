package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f2 extends n3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(String placementId) {
        super(201, com.vungle.ads.internal.protos.g.INVALID_PLACEMENT_ID, com.applovin.impl.mediation.ads.e.f("Placement '", placementId, "' is invalid"), placementId, null, null, 48, null);
        Intrinsics.checkNotNullParameter(placementId, "placementId");
    }
}
