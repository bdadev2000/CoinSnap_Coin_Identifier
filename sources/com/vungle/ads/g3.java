package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class g3 extends w0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.vungle.ads.internal.protos.n metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final long calculateIntervalDuration() {
        Long valueSecond = getValueSecond();
        long longValue = valueSecond != null ? valueSecond.longValue() : System.currentTimeMillis();
        Long valueFirst = getValueFirst();
        return longValue - (valueFirst != null ? valueFirst.longValue() : System.currentTimeMillis());
    }

    @Override // com.vungle.ads.i1
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
