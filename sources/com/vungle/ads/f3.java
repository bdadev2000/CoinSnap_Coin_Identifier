package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f3 extends i1 {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.vungle.ads.internal.protos.n metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final void addValue(long j3) {
        Long l10 = this.value;
        this.value = Long.valueOf((l10 != null ? l10.longValue() : 0L) + j3);
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final Long m13getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l10) {
        this.value = l10;
    }

    @Override // com.vungle.ads.i1
    public long getValue() {
        Long l10 = this.value;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }
}
