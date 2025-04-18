package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeto implements zzevz {
    private final zzges zza;
    private final zzdvk zzb;

    public zzeto(zzges zzgesVar, zzdvk zzdvkVar) {
        this.zza = zzgesVar;
        this.zzb = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeto.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzetp zzc() throws Exception {
        zzdvk zzdvkVar = this.zzb;
        String zzc = zzdvkVar.zzc();
        boolean zzr = zzdvkVar.zzr();
        boolean zzl = com.google.android.gms.ads.internal.zzv.zzt().zzl();
        zzdvk zzdvkVar2 = this.zzb;
        return new zzetp(zzc, zzr, zzl, zzdvkVar2.zzp(), zzdvkVar2.zzs());
    }
}
