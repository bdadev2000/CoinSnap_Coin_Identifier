package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzbn {

    @Nullable
    public final Object zza;
    public final int zzb;

    @Nullable
    public final zzaw zzc;

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

    public zzbn(@Nullable Object obj, int i10, @Nullable zzaw zzawVar, @Nullable Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = zzawVar;
        this.zzd = obj2;
        this.zze = i11;
        this.zzf = j3;
        this.zzg = j10;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbn.class == obj.getClass()) {
            zzbn zzbnVar = (zzbn) obj;
            if (this.zzb == zzbnVar.zzb && this.zze == zzbnVar.zze && this.zzf == zzbnVar.zzf && this.zzg == zzbnVar.zzg && this.zzh == zzbnVar.zzh && this.zzi == zzbnVar.zzi && zzfwn.zza(this.zzc, zzbnVar.zzc) && zzfwn.zza(this.zza, zzbnVar.zza) && zzfwn.zza(this.zzd, zzbnVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }
}
