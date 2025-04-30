package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzbe {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(String str, double d2, double d9, double d10, int i9) {
        this.zza = str;
        this.zzc = d2;
        this.zzb = d9;
        this.zzd = d10;
        this.zze = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (!Objects.equal(this.zza, zzbeVar.zza) || this.zzb != zzbeVar.zzb || this.zzc != zzbeVar.zzc || this.zze != zzbeVar.zze || Double.compare(this.zzd, zzbeVar.zzd) != 0) {
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
