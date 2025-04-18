package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzlx {
    public final long zza;
    public final zzbv zzb;
    public final int zzc;

    @Nullable
    public final zzur zzd;
    public final long zze;
    public final zzbv zzf;
    public final int zzg;

    @Nullable
    public final zzur zzh;
    public final long zzi;
    public final long zzj;

    public zzlx(long j3, zzbv zzbvVar, int i10, @Nullable zzur zzurVar, long j10, zzbv zzbvVar2, int i11, @Nullable zzur zzurVar2, long j11, long j12) {
        this.zza = j3;
        this.zzb = zzbvVar;
        this.zzc = i10;
        this.zzd = zzurVar;
        this.zze = j10;
        this.zzf = zzbvVar2;
        this.zzg = i11;
        this.zzh = zzurVar2;
        this.zzi = j11;
        this.zzj = j12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlx.class == obj.getClass()) {
            zzlx zzlxVar = (zzlx) obj;
            if (this.zza == zzlxVar.zza && this.zzc == zzlxVar.zzc && this.zze == zzlxVar.zze && this.zzg == zzlxVar.zzg && this.zzi == zzlxVar.zzi && this.zzj == zzlxVar.zzj && zzfwn.zza(this.zzb, zzlxVar.zzb) && zzfwn.zza(this.zzd, zzlxVar.zzd) && zzfwn.zza(this.zzf, zzlxVar.zzf) && zzfwn.zza(this.zzh, zzlxVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
