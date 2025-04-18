package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdmo implements zzcyu {
    private final zzdkp zza;
    private final zzdku zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdmo(zzdkp zzdkpVar, zzdku zzdkuVar, Executor executor, Executor executor2) {
        this.zza = zzdkpVar;
        this.zzb = zzdkuVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcfo zzcfoVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmm
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
            @Override // java.lang.Runnable
            public final void run() {
                zzcfo.this.zzd("onSdkImpression", new SimpleArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdkp zzdkpVar = this.zza;
            zzegf zzu = zzdkpVar.zzu();
            if (zzu == null && zzdkpVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfd)).booleanValue()) {
                zzdkp zzdkpVar2 = this.zza;
                ListenableFuture zzw = zzdkpVar2.zzw();
                zzcas zzp = zzdkpVar2.zzp();
                if (zzw == null || zzp == null) {
                    return;
                }
                zzgfo.zzr(zzgfo.zzl(zzw, zzp), new zzdmn(this), this.zzd);
                return;
            }
            if (zzu != null) {
                zzdkp zzdkpVar3 = this.zza;
                zzcfo zzr = zzdkpVar3.zzr();
                zzcfo zzs = zzdkpVar3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
