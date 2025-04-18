package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzon {
    public static final zzon zza;
    public final int zzb;
    public final int zzc;

    @Nullable
    private final zzfzt zzd;

    static {
        zzon zzonVar;
        if (zzen.zza >= 33) {
            zzfzs zzfzsVar = new zzfzs();
            for (int i10 = 1; i10 <= 10; i10++) {
                zzfzsVar.zzf(Integer.valueOf(zzen.zzi(i10)));
            }
            zzonVar = new zzon(2, zzfzsVar.zzi());
        } else {
            zzonVar = new zzon(2, 10);
        }
        zza = zzonVar;
    }

    public zzon(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzon)) {
            return false;
        }
        zzon zzonVar = (zzon) obj;
        if (this.zzb == zzonVar.zzb && this.zzc == zzonVar.zzc && Objects.equals(this.zzd, zzonVar.zzd)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        zzfzt zzfztVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfztVar == null ? 0 : zzfztVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i10, zzg zzgVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzen.zza >= 29) {
            return zzol.zza(this.zzb, i10, zzgVar);
        }
        Integer num = (Integer) zzop.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        return num.intValue();
    }

    public final boolean zzb(int i10) {
        if (this.zzd == null) {
            if (i10 > this.zzc) {
                return false;
            }
            return true;
        }
        int zzi = zzen.zzi(i10);
        if (zzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzi));
    }

    @RequiresApi(33)
    public zzon(int i10, Set set) {
        this.zzb = i10;
        zzfzt zzl = zzfzt.zzl(set);
        this.zzd = zzl;
        zzgbu it = zzl.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = Math.max(i11, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i11;
    }
}
