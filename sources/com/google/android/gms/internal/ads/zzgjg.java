package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzgjg extends zzgic {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgje zzd;

    public /* synthetic */ zzgjg(int i2, int i3, int i4, zzgje zzgjeVar, zzgjf zzgjfVar) {
        this.zza = i2;
        this.zzb = i3;
        this.zzd = zzgjeVar;
    }

    public static zzgjd zzd() {
        return new zzgjd(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjg)) {
            return false;
        }
        zzgjg zzgjgVar = (zzgjg) obj;
        return zzgjgVar.zza == this.zza && zzgjgVar.zzb == this.zzb && zzgjgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgjg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder v2 = d.v("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        v2.append(this.zzb);
        v2.append("-byte IV, 16-byte tag, and ");
        return androidx.compose.foundation.text.input.a.n(v2, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzghs
    public final boolean zza() {
        return this.zzd != zzgje.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgje zze() {
        return this.zzd;
    }
}
