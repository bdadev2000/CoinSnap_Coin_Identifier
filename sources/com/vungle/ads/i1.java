package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class i1 {
    private String meta;
    private final com.vungle.ads.internal.protos.n metricType;

    public i1(com.vungle.ads.internal.protos.n metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.metricType = metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final com.vungle.ads.internal.protos.n getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }
}
