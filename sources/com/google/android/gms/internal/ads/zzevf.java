package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzevf implements zzexw {
    private final zzgge zza;
    private final zzdya zzb;

    public zzevf(zzgge zzggeVar, zzdya zzdyaVar) {
        this.zza = zzggeVar;
        this.zzb = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevf.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzevg zzc() throws Exception {
        zzdya zzdyaVar = this.zzb;
        String zzc = zzdyaVar.zzc();
        boolean zzr = zzdyaVar.zzr();
        boolean zzl = com.google.android.gms.ads.internal.zzu.zzs().zzl();
        zzdya zzdyaVar2 = this.zzb;
        return new zzevg(zzc, zzr, zzl, zzdyaVar2.zzp(), zzdyaVar2.zzs());
    }
}
