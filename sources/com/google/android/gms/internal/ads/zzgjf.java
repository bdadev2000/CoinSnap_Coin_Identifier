package com.google.android.gms.internal.ads;

import a4.j;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgjf extends zzggt {
    private final String zza;
    private final zzgje zzb;

    private zzgjf(String str, zzgje zzgjeVar) {
        this.zza = str;
        this.zzb = zzgjeVar;
    }

    public static zzgjf zzc(String str, zzgje zzgjeVar) {
        return new zzgjf(str, zzgjeVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjf)) {
            return false;
        }
        zzgjf zzgjfVar = (zzgjf) obj;
        if (!zzgjfVar.zza.equals(this.zza) || !zzgjfVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgjf.class, this.zza, this.zzb);
    }

    public final String toString() {
        return j.k(new StringBuilder("LegacyKmsAead Parameters (keyUri: "), this.zza, ", variant: ", this.zzb.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zzb != zzgje.zzb;
    }

    public final zzgje zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
