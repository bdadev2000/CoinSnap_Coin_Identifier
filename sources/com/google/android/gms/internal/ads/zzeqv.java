package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeqv implements zzevz {
    private final zzges zza;
    private final zzdqi zzb;
    private final String zzc;
    private final zzffo zzd;

    public zzeqv(zzges zzgesVar, zzdqi zzdqiVar, zzffo zzffoVar, String str) {
        this.zza = zzgesVar;
        this.zzb = zzdqiVar;
        this.zzd = zzffoVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzequ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqv.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqw zzc() throws Exception {
        zzdqi zzdqiVar = this.zzb;
        return new zzeqw(zzdqiVar.zzb(this.zzd.zzf, this.zzc), zzdqiVar.zza());
    }
}
