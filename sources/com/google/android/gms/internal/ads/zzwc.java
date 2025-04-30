package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzwc implements zzzg {
    private final zzzg zza;
    private final zzde zzb;

    public zzwc(zzzg zzzgVar, zzde zzdeVar) {
        this.zza = zzzgVar;
        this.zzb = zzdeVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwc)) {
            return false;
        }
        zzwc zzwcVar = (zzwc) obj;
        if (this.zza.equals(zzwcVar.zza) && this.zzb.equals(zzwcVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + 527;
        return this.zza.hashCode() + (hashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zza(int i9) {
        return this.zza.zza(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zzb(int i9) {
        return this.zza.zzb(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzan zzd(int i9) {
        return this.zzb.zzb(this.zza.zza(i9));
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzde zze() {
        return this.zzb;
    }
}
