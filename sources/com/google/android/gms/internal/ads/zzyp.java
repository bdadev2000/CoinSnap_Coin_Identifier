package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzyp {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyq zzyqVar) {
        zzc(zzyqVar);
        this.zza.add(new zzyo(handler, zzyqVar));
    }

    public final void zzb(final int i10, final long j3, final long j10) {
        boolean z10;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyo zzyoVar = (zzyo) it.next();
            z10 = zzyoVar.zzc;
            if (!z10) {
                handler = zzyoVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyq zzyqVar;
                        zzyqVar = zzyo.this.zzb;
                        zzyqVar.zzY(i10, j3, j10);
                    }
                });
            }
        }
    }

    public final void zzc(zzyq zzyqVar) {
        zzyq zzyqVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzyo zzyoVar = (zzyo) it.next();
            zzyqVar2 = zzyoVar.zzb;
            if (zzyqVar2 == zzyqVar) {
                zzyoVar.zzc();
                this.zza.remove(zzyoVar);
            }
        }
    }
}
