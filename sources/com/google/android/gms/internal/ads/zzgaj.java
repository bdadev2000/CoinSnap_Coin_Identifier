package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzgaj extends zzfzw {
    final /* synthetic */ zzgal zza;
    private final Object zzb;
    private int zzc;

    public zzgaj(zzgal zzgalVar, int i9) {
        this.zza = zzgalVar;
        this.zzb = zzgal.zzg(zzgalVar, i9);
        this.zzc = i9;
    }

    private final void zza() {
        int zzw;
        int i9 = this.zzc;
        if (i9 != -1 && i9 < this.zza.size() && zzfya.zza(this.zzb, zzgal.zzg(this.zza, this.zzc))) {
            return;
        }
        zzw = this.zza.zzw(this.zzb);
        this.zzc = zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzfzw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzw, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i9 = this.zzc;
        if (i9 == -1) {
            return null;
        }
        return zzgal.zzj(this.zza, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzfzw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i9 = this.zzc;
        if (i9 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzgal zzgalVar = this.zza;
        Object zzj = zzgal.zzj(zzgalVar, i9);
        zzgal.zzn(zzgalVar, this.zzc, obj);
        return zzj;
    }
}
