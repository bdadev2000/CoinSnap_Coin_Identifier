package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgkm extends zzgii {
    private final int zza;
    private final zzgkk zzb;

    public /* synthetic */ zzgkm(int i9, zzgkk zzgkkVar, zzgkl zzgklVar) {
        this.zza = i9;
        this.zzb = zzgkkVar;
    }

    public static zzgkj zzc() {
        return new zzgkj(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkm)) {
            return false;
        }
        zzgkm zzgkmVar = (zzgkm) obj;
        if (zzgkmVar.zza != this.zza || zzgkmVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgkm.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return AbstractC2914a.g(o.n("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzb != zzgkk.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgkk zzd() {
        return this.zzb;
    }
}
