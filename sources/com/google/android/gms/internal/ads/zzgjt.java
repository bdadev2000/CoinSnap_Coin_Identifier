package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgjt extends zzgic {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzgjr zzd;

    public /* synthetic */ zzgjt(int i2, int i3, int i4, zzgjr zzgjrVar, zzgjs zzgjsVar) {
        this.zza = i2;
        this.zzd = zzgjrVar;
    }

    public static zzgjq zzc() {
        return new zzgjq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjt)) {
            return false;
        }
        zzgjt zzgjtVar = (zzgjt) obj;
        return zzgjtVar.zza == this.zza && zzgjtVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgjt.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.n(d.v("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zzd != zzgjr.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzgjr zzd() {
        return this.zzd;
    }
}
