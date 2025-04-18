package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgkg extends zzgic {
    private final int zza;
    private final zzgke zzb;

    public /* synthetic */ zzgkg(int i2, zzgke zzgkeVar, zzgkf zzgkfVar) {
        this.zza = i2;
        this.zzb = zzgkeVar;
    }

    public static zzgkd zzc() {
        return new zzgkd(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgkg)) {
            return false;
        }
        zzgkg zzgkgVar = (zzgkg) obj;
        return zzgkgVar.zza == this.zza && zzgkgVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgkg.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.n(d.v("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zzb != zzgke.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgke zzd() {
        return this.zzb;
    }
}
