package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzasi extends ByteArrayOutputStream {
    private final zzarv zza;

    public zzasi(zzarv zzarvVar, int i9) {
        this.zza = zzarvVar;
        ((ByteArrayOutputStream) this).buf = zzarvVar.zzb(Math.max(i9, NotificationCompat.FLAG_LOCAL_ONLY));
    }

    private final void zza(int i9) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i9 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i11 = i10 + i9;
        byte[] zzb = this.zza.zzb(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, zzb, 0, ((ByteArrayOutputStream) this).count);
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = zzb;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zza(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i9) {
        zza(1);
        super.write(i9);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i9, int i10) {
        zza(i10);
        super.write(bArr, i9, i10);
    }
}
