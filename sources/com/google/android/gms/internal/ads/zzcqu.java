package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcqu implements zzblp {
    final /* synthetic */ zzcqv zza;

    public zzcqu(zzcqv zzcqvVar) {
        this.zza = zzcqvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (!zzcqv.zzg(this.zza, map)) {
            return;
        }
        executor = this.zza.zzc;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqt
            @Override // java.lang.Runnable
            public final void run() {
                zzcra zzcraVar;
                zzcraVar = zzcqu.this.zza.zzd;
                zzcraVar.zzj();
            }
        });
    }
}
