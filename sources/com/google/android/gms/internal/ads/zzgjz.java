package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzgjz extends zzgii {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgjx zzd;

    public /* synthetic */ zzgjz(int i9, int i10, int i11, zzgjx zzgjxVar, zzgjy zzgjyVar) {
        this.zza = i9;
        this.zzd = zzgjxVar;
    }

    public static zzgjw zzc() {
        return new zzgjw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjz)) {
            return false;
        }
        zzgjz zzgjzVar = (zzgjz) obj;
        if (zzgjzVar.zza != this.zza || zzgjzVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(zzgjz.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return AbstractC2914a.g(o.n("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghx
    public final boolean zza() {
        return this.zzd != zzgjx.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgjx zzd() {
        return this.zzd;
    }
}
