package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgkm extends zzggt {
    private final zzgkl zza;

    private zzgkm(zzgkl zzgklVar) {
        this.zza = zzgklVar;
    }

    public static zzgkm zzc(zzgkl zzgklVar) {
        return new zzgkm(zzgklVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgkm) && ((zzgkm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgkm.class, this.zza);
    }

    public final String toString() {
        return e.f("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgkl.zzc;
    }

    public final zzgkl zzb() {
        return this.zza;
    }
}
