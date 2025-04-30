package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbbe implements Runnable {
    final /* synthetic */ zzbbf zza;

    public zzbbe(zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z8;
        boolean z9;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbbf zzbbfVar = this.zza;
            z8 = zzbbfVar.zzd;
            if (z8) {
                z9 = zzbbfVar.zze;
                if (z9) {
                    zzbbfVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzbbg) it.next()).zza(false);
                        } catch (Exception e4) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e4);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
        }
    }
}
