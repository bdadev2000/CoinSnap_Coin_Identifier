package com.vungle.ads;

/* loaded from: classes3.dex */
public class h1 extends Y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.vungle.ads.internal.protos.n nVar) {
        super(nVar);
        G7.j.e(nVar, "metricType");
    }

    private final long getCurrentTime() {
        return System.currentTimeMillis();
    }

    public final long calculateIntervalDuration() {
        long currentTimeMillis;
        long currentTimeMillis2;
        Long valueSecond = getValueSecond();
        if (valueSecond != null) {
            currentTimeMillis = valueSecond.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTimeMillis2 = valueFirst.longValue();
        } else {
            currentTimeMillis2 = System.currentTimeMillis();
        }
        return currentTimeMillis - currentTimeMillis2;
    }

    @Override // com.vungle.ads.AbstractC2123k0
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
