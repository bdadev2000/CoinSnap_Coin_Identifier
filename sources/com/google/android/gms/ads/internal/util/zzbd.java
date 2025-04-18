package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzbd {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbd(String str, double d10, double d11, double d12, int i10) {
        this.zza = str;
        this.zzc = d10;
        this.zzb = d11;
        this.zzd = d12;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbdVar = (zzbd) obj;
        if (!Objects.equal(this.zza, zzbdVar.zza) || this.zzb != zzbdVar.zzb || this.zzc != zzbdVar.zzc || this.zze != zzbdVar.zze || Double.compare(this.zzd, zzbdVar.zzd) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.zza).add("minBound", Double.valueOf(this.zzc)).add("maxBound", Double.valueOf(this.zzb)).add("percent", Double.valueOf(this.zzd)).add("count", Integer.valueOf(this.zze)).toString();
    }
}
