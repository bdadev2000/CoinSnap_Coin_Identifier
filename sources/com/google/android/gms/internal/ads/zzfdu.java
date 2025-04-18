package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
final class zzfdu {
    private final zzfiq zza;
    private final zzcxh zzb;
    private final Executor zzc;
    private zzfdt zzd;

    public zzfdu(zzfiq zzfiqVar, zzcxh zzcxhVar, Executor executor) {
        this.zza = zzfiqVar;
        this.zzb = zzcxhVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfja zze() {
        zzfhc zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture listenableFuture;
        zzfdt zzfdtVar = this.zzd;
        if (zzfdtVar != null) {
            return zzgfo.zzh(zzfdtVar);
        }
        if (((Boolean) zzbey.zza.zze()).booleanValue()) {
            listenableFuture = (zzgff) zzgfo.zze((zzgff) zzgfo.zzm(zzgff.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfdr(this), this.zzc), zzeag.class, new zzfdq(this), this.zzc);
        } else {
            zzfdt zzfdtVar2 = new zzfdt(null, zze(), null);
            this.zzd = zzfdtVar2;
            listenableFuture = zzgfo.zzh(zzfdtVar2);
        }
        return zzgfo.zzm(listenableFuture, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzfdp
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                return (zzfdt) obj;
            }
        }, this.zzc);
    }
}
