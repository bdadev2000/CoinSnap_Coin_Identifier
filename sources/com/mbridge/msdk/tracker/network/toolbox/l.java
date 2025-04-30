package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class l extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final c f18249a;

    public l(c cVar, int i9) {
        this.f18249a = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.a(Math.max(i9, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    private void a(int i9) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i9 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a6 = this.f18249a.a((i10 + i9) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a6, 0, ((ByteArrayOutputStream) this).count);
        this.f18249a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a6;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18249a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f18249a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i9, int i10) {
        a(i10);
        if (bArr != null) {
            super.write(bArr, i9, i10);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i9) {
        a(1);
        super.write(i9);
    }
}
