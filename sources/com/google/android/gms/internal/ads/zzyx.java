package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzyx {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzyy zzyyVar) {
        zzc(zzyyVar);
        this.zza.add(new zzyw(handler, zzyyVar));
    }

    public final void zzb(final int i2, final long j2, final long j3) {
        boolean z2;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzyw zzywVar = (zzyw) it.next();
            z2 = zzywVar.zzc;
            if (!z2) {
                handler = zzywVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzyy zzyyVar;
                        zzyyVar = zzyw.this.zzb;
                        zzyyVar.zzX(i2, j2, j3);
                    }
                });
            }
        }
    }

    public final void zzc(zzyy zzyyVar) {
        zzyy zzyyVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzyw zzywVar = (zzyw) it.next();
            zzyyVar2 = zzywVar.zzb;
            if (zzyyVar2 == zzyyVar) {
                zzywVar.zzc();
                this.zza.remove(zzywVar);
            }
        }
    }
}
