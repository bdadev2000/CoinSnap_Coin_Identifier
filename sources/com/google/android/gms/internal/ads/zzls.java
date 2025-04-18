package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzls {
    public static final zzls zza;
    public static final zzls zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzls zzlsVar = new zzls(0L, 0L);
        zza = zzlsVar;
        new zzls(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzls(Long.MAX_VALUE, 0L);
        new zzls(0L, Long.MAX_VALUE);
        zzb = zzlsVar;
    }

    public zzls(long j3, long j10) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzd(z10);
        zzdb.zzd(j10 >= 0);
        this.zzc = j3;
        this.zzd = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzls.class == obj.getClass()) {
            zzls zzlsVar = (zzls) obj;
            if (this.zzc == zzlsVar.zzc && this.zzd == zzlsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
