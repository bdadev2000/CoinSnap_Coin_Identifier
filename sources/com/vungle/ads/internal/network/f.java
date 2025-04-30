package com.vungle.ads.internal.network;

import i8.M;

/* loaded from: classes3.dex */
public final class f extends M {
    private final long contentLength;
    private final i8.x contentType;

    public f(i8.x xVar, long j7) {
        this.contentType = xVar;
        this.contentLength = j7;
    }

    @Override // i8.M
    public long contentLength() {
        return this.contentLength;
    }

    @Override // i8.M
    public i8.x contentType() {
        return this.contentType;
    }

    @Override // i8.M
    public w8.h source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
