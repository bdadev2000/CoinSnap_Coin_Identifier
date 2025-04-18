package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcnq implements zzbjr {
    final /* synthetic */ zzcnt zza;

    public zzcnq(zzcnt zzcntVar) {
        this.zza = zzcntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (!zzcnt.zzg(this.zza, map)) {
            return;
        }
        executor = this.zza.zzc;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnp
            @Override // java.lang.Runnable
            public final void run() {
                zzcny zzcnyVar;
                zzcnyVar = zzcnq.this.zza.zzd;
                zzcnyVar.zzg();
            }
        });
    }
}
