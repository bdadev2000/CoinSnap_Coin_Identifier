package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzara extends zzhfi {
    static {
        zzhfp.zzb(zzara.class);
    }

    public zzara(zzhfj zzhfjVar, zzaqz zzaqzVar) throws IOException {
        zze(zzhfjVar, zzhfjVar.zzc(), zzaqzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
