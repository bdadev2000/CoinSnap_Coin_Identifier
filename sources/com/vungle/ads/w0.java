package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class w0 extends i1 {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.vungle.ads.internal.protos.n metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l10) {
        this.valueFirst = l10;
    }

    public final void setValueSecond(Long l10) {
        this.valueSecond = l10;
    }
}
