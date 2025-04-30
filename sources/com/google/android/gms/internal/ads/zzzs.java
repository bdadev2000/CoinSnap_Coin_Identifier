package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzzs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzt zzztVar) {
        zzc(zzztVar);
        this.zza.add(new zzzr(handler, zzztVar));
    }

    public final void zzb(final int i9, final long j7, final long j9) {
        boolean z8;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzzr zzzrVar = (zzzr) it.next();
            z8 = zzzrVar.zzc;
            if (!z8) {
                handler = zzzrVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzzt zzztVar;
                        zzztVar = zzzr.this.zzb;
                        zzztVar.zzX(i9, j7, j9);
                    }
                });
            }
        }
    }

    public final void zzc(zzzt zzztVar) {
        zzzt zzztVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzzr zzzrVar = (zzzr) it.next();
            zzztVar2 = zzzrVar.zzb;
            if (zzztVar2 == zzztVar) {
                zzzrVar.zzc();
                this.zza.remove(zzzrVar);
            }
        }
    }
}
