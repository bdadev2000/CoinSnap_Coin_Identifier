package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzvk implements zzyl {
    private final zzyl zza;
    private final zzcd zzb;

    public zzvk(zzyl zzylVar, zzcd zzcdVar) {
        this.zza = zzylVar;
        this.zzb = zzcdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvk)) {
            return false;
        }
        zzvk zzvkVar = (zzvk) obj;
        return this.zza.equals(zzvkVar.zza) && this.zzb.equals(zzvkVar.zzb);
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + 527;
        return this.zza.hashCode() + (hashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zza(int i2) {
        return this.zza.zza(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzb(int i2) {
        return this.zza.zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzaf zzd(int i2) {
        return this.zzb.zzb(this.zza.zza(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final zzcd zze() {
        return this.zzb;
    }
}
