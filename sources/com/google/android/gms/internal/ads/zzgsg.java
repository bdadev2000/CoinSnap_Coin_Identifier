package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgsg extends zzgsj {
    private final int zza;
    private final int zzb;
    private final zzgse zzc;
    private final zzgsd zzd;

    public /* synthetic */ zzgsg(int i9, int i10, zzgse zzgseVar, zzgsd zzgsdVar, zzgsf zzgsfVar) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = zzgseVar;
        this.zzd = zzgsdVar;
    }

    public static zzgsc zze() {
        return new zzgsc(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgsg)) {
            return false;
        }
        zzgsg zzgsgVar = (zzgsg) obj;
        if (zzgsgVar.zza != this.zza || zzgsgVar.zzd() != zzd() || zzgsgVar.zzc != this.zzc || zzgsgVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgsg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder o3 = o.o("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        o3.append(this.zzb);
        o3.append("-byte tags, and ");
        return AbstractC2914a.g(o3, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzc != zzgse.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgse zzgseVar = this.zzc;
        if (zzgseVar == zzgse.zzd) {
            return this.zzb;
        }
        if (zzgseVar == zzgse.zza || zzgseVar == zzgse.zzb || zzgseVar == zzgse.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgsd zzf() {
        return this.zzd;
    }

    public final zzgse zzg() {
        return this.zzc;
    }
}
