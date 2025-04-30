package com.vungle.ads;

/* loaded from: classes3.dex */
public abstract class Y extends AbstractC2123k0 {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(com.vungle.ads.internal.protos.n nVar) {
        super(nVar);
        G7.j.e(nVar, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l) {
        this.valueFirst = l;
    }

    public final void setValueSecond(Long l) {
        this.valueSecond = l;
    }
}
