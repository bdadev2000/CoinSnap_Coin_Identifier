package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface zzhkb extends Closeable {
    int zza(ByteBuffer byteBuffer) throws IOException;

    long zzb() throws IOException;

    long zzc() throws IOException;

    ByteBuffer zzd(long j7, long j9) throws IOException;

    void zze(long j7) throws IOException;
}
