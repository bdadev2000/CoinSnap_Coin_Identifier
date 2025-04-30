package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgrn extends zzgsj {
    private final int zza;
    private final int zzb;
    private final zzgrl zzc;

    public /* synthetic */ zzgrn(int i9, int i10, zzgrl zzgrlVar, zzgrm zzgrmVar) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = zzgrlVar;
    }

    public static zzgrk zze() {
        return new zzgrk(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgrn)) {
            return false;
        }
        zzgrn zzgrnVar = (zzgrn) obj;
        if (zzgrnVar.zza != this.zza || zzgrnVar.zzd() != zzd() || zzgrnVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgrn.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder n2 = o.n("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        n2.append(this.zzb);
        n2.append("-byte tags, and ");
        return AbstractC2914a.g(n2, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzc != zzgrl.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgrl zzgrlVar = this.zzc;
        if (zzgrlVar == zzgrl.zzd) {
            return this.zzb;
        }
        if (zzgrlVar == zzgrl.zza || zzgrlVar == zzgrl.zzb || zzgrlVar == zzgrl.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgrl zzf() {
        return this.zzc;
    }
}
