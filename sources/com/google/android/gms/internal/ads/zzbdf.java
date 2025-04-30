package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
final class zzbdf extends PushbackInputStream {
    final /* synthetic */ zzbdg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbdf(zzbdg zzbdgVar, InputStream inputStream, int i9) {
        super(inputStream, 1);
        this.zza = zzbdgVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbdi.zze(this.zza.zzc);
        super.close();
    }
}
