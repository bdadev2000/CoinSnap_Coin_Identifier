package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes4.dex */
final class zzbbn extends PushbackInputStream {
    final /* synthetic */ zzbbo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbn(zzbbo zzbboVar, InputStream inputStream, int i2) {
        super(inputStream, 1);
        this.zza = zzbboVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbbq.zze(this.zza.zzc);
        super.close();
    }
}
