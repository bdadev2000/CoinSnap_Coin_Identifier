package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes4.dex */
final class zzgae extends zzfzr {
    final /* synthetic */ zzgag zza;
    private final Object zzb;
    private int zzc;

    public zzgae(zzgag zzgagVar, int i2) {
        this.zza = zzgagVar;
        this.zzb = zzgag.zzg(zzgagVar, i2);
        this.zzc = i2;
    }

    private final void zza() {
        int zzw;
        int i2 = this.zzc;
        if (i2 == -1 || i2 >= this.zza.size() || !zzfxw.zza(this.zzb, zzgag.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            return null;
        }
        return zzgag.zzj(this.zza, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfzr, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzgag zzgagVar = this.zza;
        Object zzj = zzgag.zzj(zzgagVar, i2);
        zzgag.zzn(zzgagVar, this.zzc, obj);
        return zzj;
    }
}
