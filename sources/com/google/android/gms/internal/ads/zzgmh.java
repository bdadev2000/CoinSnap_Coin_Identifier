package com.google.android.gms.internal.ads;

import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgmh extends zzgii {
    private final zzgmg zza;

    private zzgmh(zzgmg zzgmgVar) {
        this.zza = zzgmgVar;
    }

    public static zzgmh zzc(zzgmg zzgmgVar) {
        return new zzgmh(zzgmgVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgmh) || ((zzgmh) obj).zza != this.zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgmh.class, this.zza);
    }

    public final String toString() {
        return AbstractC2914a.e("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zza != zzgmg.zzc;
    }

    public final zzgmg zzb() {
        return this.zza;
    }
}
