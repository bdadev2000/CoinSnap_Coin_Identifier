package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class l extends ByteArrayOutputStream {
    private final c a;

    public l(c cVar, int i10) {
        this.a = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.a(Math.max(i10, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    private void a(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a = this.a.a((i11 + i10) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        a(i11);
        if (bArr != null) {
            super.write(bArr, i10, i11);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        a(1);
        super.write(i10);
    }
}
