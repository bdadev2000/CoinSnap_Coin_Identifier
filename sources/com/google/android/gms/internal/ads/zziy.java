package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zziy {
    public final String zza;
    public final zzan zzb;
    public final zzan zzc;
    public final int zzd;
    public final int zze;

    public zziy(String str, zzan zzanVar, zzan zzanVar2, int i9, int i10) {
        boolean z8 = true;
        if (i9 != 0) {
            if (i10 == 0) {
                i10 = 0;
            } else {
                z8 = false;
            }
        }
        zzeq.zzd(z8);
        zzeq.zzc(str);
        this.zza = str;
        this.zzb = zzanVar;
        zzanVar2.getClass();
        this.zzc = zzanVar2;
        this.zzd = i9;
        this.zze = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zziy.class == obj.getClass()) {
            zziy zziyVar = (zziy) obj;
            if (this.zzd == zziyVar.zzd && this.zze == zziyVar.zze && this.zza.equals(zziyVar.zza) && this.zzb.equals(zziyVar.zzb) && this.zzc.equals(zziyVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zzd + 527;
        String str = this.zza;
        int hashCode = str.hashCode() + (((i9 * 31) + this.zze) * 31);
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        return this.zzc.hashCode() + (hashCode2 * 31);
    }
}
