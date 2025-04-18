package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzgmb extends zzgic {
    private final zzgma zza;

    private zzgmb(zzgma zzgmaVar) {
        this.zza = zzgmaVar;
    }

    public static zzgmb zzc(zzgma zzgmaVar) {
        return new zzgmb(zzgmaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgmb) && ((zzgmb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgmb.class, this.zza);
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.A("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zza != zzgma.zzc;
    }

    public final zzgma zzb() {
        return this.zza;
    }
}
