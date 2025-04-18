package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzib {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzib(String str, zzaf zzafVar, zzaf zzafVar2, int i2, int i3) {
        boolean z2 = true;
        if (i2 != 0) {
            if (i3 == 0) {
                i3 = 0;
            } else {
                z2 = false;
            }
        }
        zzdi.zzd(z2);
        zzdi.zzc(str);
        this.zza = str;
        this.zzb = zzafVar;
        zzafVar2.getClass();
        this.zzc = zzafVar2;
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzib.class == obj.getClass()) {
            zzib zzibVar = (zzib) obj;
            if (this.zzd == zzibVar.zzd && this.zze == zzibVar.zze && this.zza.equals(zzibVar.zza) && this.zzb.equals(zzibVar.zzb) && this.zzc.equals(zzibVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzd + 527;
        String str = this.zza;
        int hashCode = str.hashCode() + (((i2 * 31) + this.zze) * 31);
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        return this.zzc.hashCode() + (hashCode2 * 31);
    }
}
