package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzaqf {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzapm zze;
    private final zzapv zzf;
    private final zzapw[] zzg;
    private zzapo zzh;
    private final List zzi;
    private final List zzj;
    private final zzapt zzk;

    public zzaqf(zzapm zzapmVar, zzapv zzapvVar, int i2) {
        zzapt zzaptVar = new zzapt(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzapmVar;
        this.zzf = zzapvVar;
        this.zzg = new zzapw[4];
        this.zzk = zzaptVar;
    }

    public final zzaqc zza(zzaqc zzaqcVar) {
        zzaqcVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzaqcVar);
        }
        zzaqcVar.zzg(this.zza.incrementAndGet());
        zzaqcVar.zzm("add-to-queue");
        zzc(zzaqcVar, 0);
        this.zzc.add(zzaqcVar);
        return zzaqcVar;
    }

    public final void zzb(zzaqc zzaqcVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzaqcVar);
        }
        synchronized (this.zzi) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzaqe) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzc(zzaqcVar, 5);
    }

    public final void zzc(zzaqc zzaqcVar, int i2) {
        synchronized (this.zzj) {
            try {
                Iterator it = this.zzj.iterator();
                while (it.hasNext()) {
                    ((zzaqd) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd() {
        zzapo zzapoVar = this.zzh;
        if (zzapoVar != null) {
            zzapoVar.zzb();
        }
        zzapw[] zzapwVarArr = this.zzg;
        for (int i2 = 0; i2 < 4; i2++) {
            zzapw zzapwVar = zzapwVarArr[i2];
            if (zzapwVar != null) {
                zzapwVar.zza();
            }
        }
        zzapo zzapoVar2 = new zzapo(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzapoVar2;
        zzapoVar2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            zzapw zzapwVar2 = new zzapw(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i3] = zzapwVar2;
            zzapwVar2.start();
        }
    }
}
