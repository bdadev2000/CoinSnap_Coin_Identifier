package com.facebook.ads.redexgen.uinode;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: assets/audience_network.dex */
public final class I6 extends BufferedOutputStream {
    public boolean A00;

    public I6(OutputStream outputStream) {
        super(outputStream);
    }

    public I6(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public final void A00(OutputStream outputStream) {
        AbstractC0626Ha.A04(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00 = true;
        Throwable e2 = null;
        try {
            flush();
        } catch (Throwable th2) {
            e2 = th2;
        }
        try {
            this.out.close();
        } catch (Throwable thrown) {
            if (e2 == null) {
                e2 = thrown;
            }
        }
        if (e2 != null) {
            IF.A0Y(e2);
            throw null;
        }
    }
}
