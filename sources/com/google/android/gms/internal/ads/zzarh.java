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
public final class zzarh {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaqo zze;
    private final zzaqx zzf;
    private final zzaqy[] zzg;
    private zzaqq zzh;
    private final List zzi;
    private final List zzj;
    private final zzaqv zzk;

    public zzarh(zzaqo zzaqoVar, zzaqx zzaqxVar, int i9) {
        zzaqv zzaqvVar = new zzaqv(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaqoVar;
        this.zzf = zzaqxVar;
        this.zzg = new zzaqy[4];
        this.zzk = zzaqvVar;
    }

    public final zzare zza(zzare zzareVar) {
        zzareVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzareVar);
        }
        zzareVar.zzg(this.zza.incrementAndGet());
        zzareVar.zzm("add-to-queue");
        zzc(zzareVar, 0);
        this.zzc.add(zzareVar);
        return zzareVar;
    }

    public final void zzb(zzare zzareVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzareVar);
        }
        synchronized (this.zzi) {
            try {
                Iterator it = this.zzi.iterator();
                while (it.hasNext()) {
                    ((zzarg) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzc(zzareVar, 5);
    }

    public final void zzc(zzare zzareVar, int i9) {
        synchronized (this.zzj) {
            try {
                Iterator it = this.zzj.iterator();
                while (it.hasNext()) {
                    ((zzarf) it.next()).zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd() {
        zzaqq zzaqqVar = this.zzh;
        if (zzaqqVar != null) {
            zzaqqVar.zzb();
        }
        zzaqy[] zzaqyVarArr = this.zzg;
        for (int i9 = 0; i9 < 4; i9++) {
            zzaqy zzaqyVar = zzaqyVarArr[i9];
            if (zzaqyVar != null) {
                zzaqyVar.zza();
            }
        }
        zzaqq zzaqqVar2 = new zzaqq(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaqqVar2;
        zzaqqVar2.start();
        for (int i10 = 0; i10 < 4; i10++) {
            zzaqy zzaqyVar2 = new zzaqy(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i10] = zzaqyVar2;
            zzaqyVar2.start();
        }
    }
}
