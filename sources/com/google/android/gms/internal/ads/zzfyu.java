package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzfyu extends zzfyi {
    final /* synthetic */ zzfyx zza;
    private final Object zzb;
    private int zzc;

    public zzfyu(zzfyx zzfyxVar, int i10) {
        this.zza = zzfyxVar;
        this.zzb = zzfyx.zzg(zzfyxVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int zzw;
        int i10 = this.zzc;
        if (i10 != -1 && i10 < this.zza.size() && zzfwn.zza(this.zzb, zzfyx.zzg(this.zza, this.zzc))) {
            return;
        }
        zzw = this.zza.zzw(this.zzb);
        this.zzc = zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzfyx.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfyx zzfyxVar = this.zza;
        Object zzj = zzfyx.zzj(zzfyxVar, i10);
        zzfyx.zzn(zzfyxVar, this.zzc, obj);
        return zzj;
    }
}
