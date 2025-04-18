package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzoq {
    public static final zzoq zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzgbc zzd;

    static {
        zzoq zzoqVar;
        if (zzeu.zza >= 33) {
            zzgbb zzgbbVar = new zzgbb();
            for (int i2 = 1; i2 <= 10; i2++) {
                zzgbbVar.zzf(Integer.valueOf(zzeu.zzh(i2)));
            }
            zzoqVar = new zzoq(2, zzgbbVar.zzi());
        } else {
            zzoqVar = new zzoq(2, 10);
        }
        zza = zzoqVar;
    }

    public zzoq(int i2, int i3) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoq)) {
            return false;
        }
        zzoq zzoqVar = (zzoq) obj;
        return this.zzb == zzoqVar.zzb && this.zzc == zzoqVar.zzc && Objects.equals(this.zzd, zzoqVar.zzd);
    }

    public final int hashCode() {
        zzgbc zzgbcVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgbcVar == null ? 0 : zzgbcVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i2, zzh zzhVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzeu.zza >= 29) {
            return zzoo.zza(this.zzb, i2, zzhVar);
        }
        Integer num = (Integer) zzos.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i2) {
        if (this.zzd == null) {
            return i2 <= this.zzc;
        }
        int zzh = zzeu.zzh(i2);
        if (zzh == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzh));
    }

    @RequiresApi
    public zzoq(int i2, Set set) {
        this.zzb = i2;
        zzgbc zzl = zzgbc.zzl(set);
        this.zzd = zzl;
        zzgdd it = zzl.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 = Math.max(i3, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i3;
    }
}
