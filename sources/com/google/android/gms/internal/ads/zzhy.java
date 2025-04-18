package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzhy {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzhy(String str, zzad zzadVar, zzad zzadVar2, int i10, int i11) {
        boolean z10 = true;
        if (i10 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else {
                z10 = false;
            }
        }
        zzdb.zzd(z10);
        zzdb.zzc(str);
        this.zza = str;
        this.zzb = zzadVar;
        zzadVar2.getClass();
        this.zzc = zzadVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhy.class == obj.getClass()) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zzd == zzhyVar.zzd && this.zze == zzhyVar.zze && this.zza.equals(zzhyVar.zza) && this.zzb.equals(zzhyVar.zzb) && this.zzc.equals(zzhyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd + 527;
        String str = this.zza;
        int hashCode = str.hashCode() + (((i10 * 31) + this.zze) * 31);
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        return this.zzc.hashCode() + (hashCode2 * 31);
    }
}
