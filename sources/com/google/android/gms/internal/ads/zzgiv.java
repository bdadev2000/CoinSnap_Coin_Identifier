package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgiv extends zzggt {
    private final zzgiu zza;

    private zzgiv(zzgiu zzgiuVar) {
        this.zza = zzgiuVar;
    }

    public static zzgiv zzc(zzgiu zzgiuVar) {
        return new zzgiv(zzgiuVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgiv) && ((zzgiv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgiv.class, this.zza);
    }

    public final String toString() {
        return e.f("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final boolean zza() {
        return this.zza != zzgiu.zzc;
    }

    public final zzgiu zzb() {
        return this.zza;
    }
}
