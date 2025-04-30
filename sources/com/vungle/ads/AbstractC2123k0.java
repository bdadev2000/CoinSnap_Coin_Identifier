package com.vungle.ads;

/* renamed from: com.vungle.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2123k0 {
    private String meta;
    private final com.vungle.ads.internal.protos.n metricType;

    public AbstractC2123k0(com.vungle.ads.internal.protos.n nVar) {
        G7.j.e(nVar, "metricType");
        this.metricType = nVar;
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
