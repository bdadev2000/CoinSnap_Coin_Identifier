package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2 extends g3 {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.vungle.ads.internal.protos.n metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final boolean alreadyMetered$vungle_ads_release() {
        return (getValueFirst() == null || getValueSecond() == null) ? false : true;
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    @Override // com.vungle.ads.g3
    public void markEnd() {
        if (getValueSecond() == null) {
            super.markEnd();
        }
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }

    @Override // com.vungle.ads.g3
    public void markStart() {
        if (getValueFirst() == null) {
            super.markStart();
        }
    }
}
