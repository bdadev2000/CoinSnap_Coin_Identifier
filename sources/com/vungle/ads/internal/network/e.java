package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import wh.g0;
import wh.y0;

/* loaded from: classes4.dex */
public final class e extends y0 {
    private final y0 delegate;
    private final ki.k delegateSource;
    private IOException thrownException;

    public e(y0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.delegateSource = a6.k.f(new d(this, delegate.source()));
    }

    @Override // wh.y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // wh.y0
    public long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // wh.y0
    public g0 contentType() {
        return this.delegate.contentType();
    }

    public final IOException getThrownException() {
        return this.thrownException;
    }

    public final void setThrownException(IOException iOException) {
        this.thrownException = iOException;
    }

    @Override // wh.y0
    public ki.k source() {
        return this.delegateSource;
    }

    public final void throwIfCaught() throws IOException {
        IOException iOException = this.thrownException;
        if (iOException == null) {
        } else {
            throw iOException;
        }
    }
}
