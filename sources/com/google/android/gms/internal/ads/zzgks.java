package com.google.android.gms.internal.ads;

import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgks extends zzgii {
    private final zzgkr zza;

    private zzgks(zzgkr zzgkrVar) {
        this.zza = zzgkrVar;
    }

    public static zzgks zzc(zzgkr zzgkrVar) {
        return new zzgks(zzgkrVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgks) || ((zzgks) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgks.class, this.zza);
    }

    public final String toString() {
        return AbstractC2914a.e("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zza != zzgkr.zzc;
    }

    public final zzgkr zzb() {
        return this.zza;
    }
}
