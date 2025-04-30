package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import x.l;

/* loaded from: classes2.dex */
public final class zzdns implements zzdaf {
    private final zzdlt zza;
    private final zzdly zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdns(zzdlt zzdltVar, zzdly zzdlyVar, Executor executor, Executor executor2) {
        this.zza = zzdltVar;
        this.zzb = zzdlyVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzchd zzchdVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnq
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [x.l, java.util.Map] */
            @Override // java.lang.Runnable
            public final void run() {
                zzchd.this.zzd("onSdkImpression", new l());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdlt zzdltVar = this.zza;
            zzehg zzu = zzdltVar.zzu();
            if (zzu == null && zzdltVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
                zzdlt zzdltVar2 = this.zza;
                f4.c zzw = zzdltVar2.zzw();
                zzccn zzp = zzdltVar2.zzp();
                if (zzw != null && zzp != null) {
                    zzgft.zzr(zzgft.zzl(zzw, zzp), new zzdnr(this), this.zzd);
                    return;
                }
                return;
            }
            if (zzu != null) {
                zzdlt zzdltVar3 = this.zza;
                zzchd zzr = zzdltVar3.zzr();
                zzchd zzs = zzdltVar3.zzs();
                if (zzr == null) {
                    if (zzs != null) {
                        zzr = zzs;
                    } else {
                        zzr = null;
                    }
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
