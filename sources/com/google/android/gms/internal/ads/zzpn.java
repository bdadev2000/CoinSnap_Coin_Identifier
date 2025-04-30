package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpn {
    public static final zzpn zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzgbh zzd;

    static {
        zzpn zzpnVar;
        if (zzgd.zza >= 33) {
            zzgbg zzgbgVar = new zzgbg();
            for (int i9 = 1; i9 <= 10; i9++) {
                zzgbgVar.zzf(Integer.valueOf(zzgd.zzh(i9)));
            }
            zzpnVar = new zzpn(2, zzgbgVar.zzi());
        } else {
            zzpnVar = new zzpn(2, 10);
        }
        zza = zzpnVar;
    }

    public zzpn(int i9, int i10) {
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpn)) {
            return false;
        }
        zzpn zzpnVar = (zzpn) obj;
        if (this.zzb == zzpnVar.zzb && this.zzc == zzpnVar.zzc && zzgd.zzG(this.zzd, zzpnVar.zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        zzgbh zzgbhVar = this.zzd;
        if (zzgbhVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzgbhVar.hashCode();
        }
        return (((this.zzb * 31) + this.zzc) * 31) + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i9, zzk zzkVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzgd.zza >= 29) {
            return zzpl.zza(this.zzb, i9, zzkVar);
        }
        Integer num = (Integer) zzpp.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i9) {
        if (this.zzd == null) {
            if (i9 > this.zzc) {
                return false;
            }
            return true;
        }
        int zzh = zzgd.zzh(i9);
        if (zzh == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzh));
    }

    @RequiresApi(33)
    public zzpn(int i9, Set set) {
        this.zzb = i9;
        zzgbh zzl = zzgbh.zzl(set);
        this.zzd = zzl;
        zzgdi it = zzl.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i10;
    }
}
