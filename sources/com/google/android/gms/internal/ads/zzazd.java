package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzazd implements Runnable {
    final /* synthetic */ zzaze zza;

    public zzazd(zzaze zzazeVar) {
        this.zza = zzazeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        boolean z11;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzaze zzazeVar = this.zza;
            z10 = zzazeVar.zzd;
            if (z10) {
                z11 = zzazeVar.zze;
                if (z11) {
                    zzazeVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzazf) it.next()).zza(false);
                        } catch (Exception e2) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e2);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
        }
    }
}
