package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcpe implements zzbjw {
    final /* synthetic */ zzcph zza;

    public zzcpe(zzcph zzcphVar) {
        this.zza = zzcphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcph.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcpm zzcpmVar;
                    zzcpmVar = zzcpe.this.zza.zzd;
                    zzcpmVar.zzg();
                }
            });
        }
    }
}
