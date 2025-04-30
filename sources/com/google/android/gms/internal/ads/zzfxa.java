package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxa extends zzfww {
    final /* synthetic */ zzfxg zza;

    public zzfxa(zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        zzfwv zzfwvVar;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        zzfwv zzfwvVar2;
        obj = this.zza.zzg;
        synchronized (obj) {
            try {
                atomicInteger = this.zza.zzl;
                if (atomicInteger.get() > 0) {
                    atomicInteger2 = this.zza.zzl;
                    if (atomicInteger2.decrementAndGet() > 0) {
                        zzfwvVar2 = this.zza.zzc;
                        zzfwvVar2.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                zzfxg zzfxgVar = this.zza;
                iInterface = zzfxgVar.zzn;
                if (iInterface != null) {
                    zzfwvVar = zzfxgVar.zzc;
                    zzfwvVar.zzc("Unbind from service.", new Object[0]);
                    zzfxg zzfxgVar2 = this.zza;
                    context = zzfxgVar2.zzb;
                    serviceConnection = zzfxgVar2.zzm;
                    context.unbindService(serviceConnection);
                    this.zza.zzh = false;
                    this.zza.zzn = null;
                    this.zza.zzm = null;
                }
                this.zza.zzw();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
