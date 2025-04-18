package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzaxi extends zzayc {
    private final zzawp zzh;

    public zzaxi(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, zzawp zzawpVar) {
        super(zzawoVar, "s/IaC73MjD9vpfzZvssIGR7eelXzGompBCRU9Px19GF39ZofYoD29ElcUTZqSvpM", "t30h8UZEoZP8GE77k4AdlDjTvNQpvs7DHs10k6C9ZzU=", zzasmVar, i2, 85);
        this.zzh = zzawpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zze.invoke(null, Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzv(jArr[0]);
            this.zzd.zzu(jArr[1]);
        }
    }
}
