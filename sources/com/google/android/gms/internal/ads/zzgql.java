package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;
import vd.e;

/* loaded from: classes3.dex */
public final class zzgql extends zzgqo {
    private final int zza;
    private final int zzb;
    private final zzgqj zzc;
    private final zzgqi zzd;

    public /* synthetic */ zzgql(int i10, int i11, zzgqj zzgqjVar, zzgqi zzgqiVar, zzgqk zzgqkVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgqjVar;
        this.zzd = zzgqiVar;
    }

    public static zzgqh zze() {
        return new zzgqh(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgql)) {
            return false;
        }
        zzgql zzgqlVar = (zzgql) obj;
        if (zzgqlVar.zza != this.zza || zzgqlVar.zzd() != zzd() || zzgqlVar.zzc != this.zzc || zzgqlVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgql.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder p10 = j.p("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        p10.append(this.zzb);
        p10.append("-byte tags, and ");
        return e.g(p10, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzc != zzgqj.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgqj zzgqjVar = this.zzc;
        if (zzgqjVar == zzgqj.zzd) {
            return this.zzb;
        }
        if (zzgqjVar == zzgqj.zza || zzgqjVar == zzgqj.zzb || zzgqjVar == zzgqj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgqi zzf() {
        return this.zzd;
    }

    public final zzgqj zzg() {
        return this.zzc;
    }
}
