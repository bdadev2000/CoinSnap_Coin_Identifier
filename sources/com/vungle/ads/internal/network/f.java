package com.vungle.ads.internal.network;

import wh.g0;
import wh.y0;

/* loaded from: classes4.dex */
public final class f extends y0 {
    private final long contentLength;
    private final g0 contentType;

    public f(g0 g0Var, long j3) {
        this.contentType = g0Var;
        this.contentLength = j3;
    }

    @Override // wh.y0
    public long contentLength() {
        return this.contentLength;
    }

    @Override // wh.y0
    public g0 contentType() {
        return this.contentType;
    }

    @Override // wh.y0
    public ki.k source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
