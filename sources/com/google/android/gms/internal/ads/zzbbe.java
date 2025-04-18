package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes3.dex */
final class zzbbe extends PushbackInputStream {
    final /* synthetic */ zzbbf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbe(zzbbf zzbbfVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.zza = zzbbfVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbbh.zze(this.zza.zzc);
        super.close();
    }
}
