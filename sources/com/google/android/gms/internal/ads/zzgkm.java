package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgkm extends zzgic {
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
        return androidx.compose.foundation.text.input.a.A("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zza != zzgkl.zzc;
    }

    public final zzgkl zzb() {
        return this.zza;
    }
}
