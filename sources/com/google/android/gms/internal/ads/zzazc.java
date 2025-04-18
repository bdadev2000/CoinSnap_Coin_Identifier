package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzazc {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzazb zzazbVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Queue is full, current size = " + this.zzc.size());
                this.zzc.remove(0);
            }
            int i10 = this.zza;
            this.zza = i10 + 1;
            zzazbVar.zzg(i10);
            zzazbVar.zzk();
            this.zzc.add(zzazbVar);
        }
    }

    public final boolean zzb(zzazb zzazbVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzazb zzazbVar2 = (zzazb) it.next();
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                    if (!zzazbVar.equals(zzazbVar2) && zzazbVar2.zzc().equals(zzazbVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL() && !zzazbVar.equals(zzazbVar2) && zzazbVar2.zzd().equals(zzazbVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzc(zzazb zzazbVar) {
        synchronized (this.zzb) {
            if (this.zzc.contains(zzazbVar)) {
                return true;
            }
            return false;
        }
    }
}
