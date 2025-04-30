package com.vungle.ads;

/* loaded from: classes3.dex */
public final class g1 extends AbstractC2123k0 {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.vungle.ads.internal.protos.n nVar) {
        super(nVar);
        G7.j.e(nVar, "metricType");
    }

    public final void addValue(long j7) {
        long j9;
        Long l = this.value;
        if (l != null) {
            j9 = l.longValue();
        } else {
            j9 = 0;
        }
        this.value = Long.valueOf(j9 + j7);
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final Long m18getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    @Override // com.vungle.ads.AbstractC2123k0
    public long getValue() {
        Long l = this.value;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
