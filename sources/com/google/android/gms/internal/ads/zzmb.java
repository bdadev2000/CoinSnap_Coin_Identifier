package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzmb {
    public final long zza;
    public final zzcc zzb;
    public final int zzc;

    @Nullable
    public final zzuy zzd;
    public final long zze;
    public final zzcc zzf;
    public final int zzg;

    @Nullable
    public final zzuy zzh;
    public final long zzi;
    public final long zzj;

    public zzmb(long j2, zzcc zzccVar, int i2, @Nullable zzuy zzuyVar, long j3, zzcc zzccVar2, int i3, @Nullable zzuy zzuyVar2, long j4, long j5) {
        this.zza = j2;
        this.zzb = zzccVar;
        this.zzc = i2;
        this.zzd = zzuyVar;
        this.zze = j3;
        this.zzf = zzccVar2;
        this.zzg = i3;
        this.zzh = zzuyVar2;
        this.zzi = j4;
        this.zzj = j5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmb.class == obj.getClass()) {
            zzmb zzmbVar = (zzmb) obj;
            if (this.zza == zzmbVar.zza && this.zzc == zzmbVar.zzc && this.zze == zzmbVar.zze && this.zzg == zzmbVar.zzg && this.zzi == zzmbVar.zzi && this.zzj == zzmbVar.zzj && zzfxw.zza(this.zzb, zzmbVar.zzb) && zzfxw.zza(this.zzd, zzmbVar.zzd) && zzfxw.zza(this.zzf, zzmbVar.zzf) && zzfxw.zza(this.zzh, zzmbVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
