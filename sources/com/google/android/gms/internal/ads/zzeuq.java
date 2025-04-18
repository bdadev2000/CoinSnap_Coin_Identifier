package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeuq implements zzexh {
    private final zzgfz zza;
    private final zzdxb zzb;

    public zzeuq(zzgfz zzgfzVar, zzdxb zzdxbVar) {
        this.zza = zzgfzVar;
        this.zzb = zzdxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuq.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeur zzc() throws Exception {
        zzdxb zzdxbVar = this.zzb;
        String zzc = zzdxbVar.zzc();
        boolean zzr = zzdxbVar.zzr();
        boolean zzl = com.google.android.gms.ads.internal.zzu.zzs().zzl();
        zzdxb zzdxbVar2 = this.zzb;
        return new zzeur(zzc, zzr, zzl, zzdxbVar2.zzp(), zzdxbVar2.zzs());
    }
}
