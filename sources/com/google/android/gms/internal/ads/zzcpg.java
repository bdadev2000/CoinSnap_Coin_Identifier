package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcpg implements zzbjw {
    final /* synthetic */ zzcph zza;

    public zzcpg(zzcph zzcphVar) {
        this.zza = zzcphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcph.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpf
                @Override // java.lang.Runnable
                public final void run() {
                    zzcpm zzcpmVar;
                    zzcpmVar = zzcpg.this.zza.zzd;
                    zzcpmVar.zzj();
                }
            });
        }
    }
}
