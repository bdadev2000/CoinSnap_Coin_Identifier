package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcns implements zzbjr {
    final /* synthetic */ zzcnt zza;

    public zzcns(zzcnt zzcntVar) {
        this.zza = zzcntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (!zzcnt.zzg(this.zza, map)) {
            return;
        }
        executor = this.zza.zzc;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
            @Override // java.lang.Runnable
            public final void run() {
                zzcny zzcnyVar;
                zzcnyVar = zzcns.this.zza.zzd;
                zzcnyVar.zzj();
            }
        });
    }
}
