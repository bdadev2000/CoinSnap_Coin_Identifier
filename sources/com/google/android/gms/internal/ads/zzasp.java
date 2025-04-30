package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzasp extends zzhka implements Closeable {
    private static final zzhkh zza = zzhkh.zzb(zzasp.class);

    public zzasp(zzhkb zzhkbVar, zzaso zzasoVar) throws IOException {
        zzf(zzhkbVar, zzhkbVar.zzc(), zzasoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhka, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhka
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
