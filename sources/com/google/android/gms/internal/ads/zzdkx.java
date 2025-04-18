package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdkx implements zzcxg {
    private final zzdiy zza;
    private final zzdjd zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkx(zzdiy zzdiyVar, zzdjd zzdjdVar, Executor executor, Executor executor2) {
        this.zza = zzdiyVar;
        this.zzb = zzdjdVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcfk zzcfkVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkv
            @Override // java.lang.Runnable
            public final void run() {
                zzcfk.this.zzd("onSdkImpression", new r.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdiy zzdiyVar = this.zza;
            zzeew zzu = zzdiyVar.zzu();
            if (zzu == null && zzdiyVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfk)).booleanValue()) {
                zzdiy zzdiyVar2 = this.zza;
                ua.b zzw = zzdiyVar2.zzw();
                zzcao zzp = zzdiyVar2.zzp();
                if (zzw != null && zzp != null) {
                    zzgei.zzr(zzgei.zzl(zzw, zzp), new zzdkw(this), this.zzd);
                    return;
                }
                return;
            }
            if (zzu != null) {
                zzdiy zzdiyVar3 = this.zza;
                zzcfk zzr = zzdiyVar3.zzr();
                zzcfk zzs = zzdiyVar3.zzs();
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
