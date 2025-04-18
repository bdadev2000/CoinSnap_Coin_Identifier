package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class zzazm implements Runnable {
    final /* synthetic */ zzazn zza;

    public zzazm(zzazn zzaznVar) {
        this.zza = zzaznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z2;
        boolean z3;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzazn zzaznVar = this.zza;
            z2 = zzaznVar.zzd;
            if (z2) {
                z3 = zzaznVar.zze;
                if (z3) {
                    zzaznVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzazo) it.next()).zza(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
        }
    }
}
