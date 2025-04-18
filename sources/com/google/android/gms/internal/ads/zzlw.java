package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzlw {
    public static final zzlw zza;
    public static final zzlw zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlw zzlwVar = new zzlw(0L, 0L);
        zza = zzlwVar;
        new zzlw(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlw(Long.MAX_VALUE, 0L);
        new zzlw(0L, Long.MAX_VALUE);
        zzb = zzlwVar;
    }

    public zzlw(long j2, long j3) {
        zzdi.zzd(j2 >= 0);
        zzdi.zzd(j3 >= 0);
        this.zzc = j2;
        this.zzd = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlw.class == obj.getClass()) {
            zzlw zzlwVar = (zzlw) obj;
            if (this.zzc == zzlwVar.zzc && this.zzd == zzlwVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
