package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzvd implements zzyd {
    private final zzyd zza;
    private final zzbw zzb;

    public zzvd(zzyd zzydVar, zzbw zzbwVar) {
        this.zza = zzydVar;
        this.zzb = zzbwVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvd)) {
            return false;
        }
        zzvd zzvdVar = (zzvd) obj;
        if (this.zza.equals(zzvdVar.zza) && this.zzb.equals(zzvdVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + 527;
        return this.zza.hashCode() + (hashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzb(int i10) {
        return this.zza.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzad zzd(int i10) {
        return this.zzb.zzb(this.zza.zza(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzbw zze() {
        return this.zzb;
    }
}
