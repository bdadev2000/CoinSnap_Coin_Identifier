package com.vungle.ads.internal.network;

import i8.M;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class e extends M {
    private final M delegate;
    private final w8.h delegateSource;
    private IOException thrownException;

    public e(M m) {
        G7.j.e(m, "delegate");
        this.delegate = m;
        this.delegateSource = r8.k.f(new d(this, m.source()));
    }

    @Override // i8.M, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // i8.M
    public long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // i8.M
    public i8.x contentType() {
        return this.delegate.contentType();
    }

    public final IOException getThrownException() {
        return this.thrownException;
    }

    public final void setThrownException(IOException iOException) {
        this.thrownException = iOException;
    }

    @Override // i8.M
    public w8.h source() {
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
