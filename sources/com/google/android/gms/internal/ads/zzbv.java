package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzbv {

    @Nullable
    public final Object zza;
    public final int zzb;

    @Nullable
    public final zzbc zzc;

    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzbv(@Nullable Object obj, int i2, @Nullable zzbc zzbcVar, @Nullable Object obj2, int i3, long j2, long j3, int i4, int i5) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = zzbcVar;
        this.zzd = obj2;
        this.zze = i3;
        this.zzf = j2;
        this.zzg = j3;
        this.zzh = i4;
        this.zzi = i5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbv.class == obj.getClass()) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zze == zzbvVar.zze && this.zzf == zzbvVar.zzf && this.zzg == zzbvVar.zzg && this.zzh == zzbvVar.zzh && this.zzi == zzbvVar.zzi && zzfxw.zza(this.zzc, zzbvVar.zzc) && zzfxw.zza(this.zza, zzbvVar.zza) && zzfxw.zza(this.zzd, zzbvVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
