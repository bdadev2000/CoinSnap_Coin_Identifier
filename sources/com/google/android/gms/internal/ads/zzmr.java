package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzmr {
    public static final zzmr zza;
    public static final zzmr zzb;
    public static final zzmr zzc;
    public static final zzmr zzd;
    public static final zzmr zze;
    public final long zzf;
    public final long zzg;

    static {
        zzmr zzmrVar = new zzmr(0L, 0L);
        zza = zzmrVar;
        zzb = new zzmr(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzmr(Long.MAX_VALUE, 0L);
        zzd = new zzmr(0L, Long.MAX_VALUE);
        zze = zzmrVar;
    }

    public zzmr(long j7, long j9) {
        boolean z8;
        if (j7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        zzeq.zzd(j9 >= 0);
        this.zzf = j7;
        this.zzg = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmr.class == obj.getClass()) {
            zzmr zzmrVar = (zzmr) obj;
            if (this.zzf == zzmrVar.zzf && this.zzg == zzmrVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
