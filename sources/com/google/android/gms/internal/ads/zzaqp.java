package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
final class zzaqp implements zzaqb {
    private final Map zza = new HashMap();

    @Nullable
    private final zzapo zzb;

    @Nullable
    private final BlockingQueue zzc;
    private final zzapt zzd;

    public zzaqp(@NonNull zzapo zzapoVar, @NonNull BlockingQueue blockingQueue, zzapt zzaptVar) {
        this.zzd = zzaptVar;
        this.zzb = zzapoVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final synchronized void zza(zzaqc zzaqcVar) {
        try {
            Map map = this.zza;
            String zzj = zzaqcVar.zzj();
            List list = (List) map.remove(zzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzaqo.zzb) {
                zzaqo.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
            }
            zzaqc zzaqcVar2 = (zzaqc) list.remove(0);
            this.zza.put(zzj, list);
            zzaqcVar2.zzu(this);
            try {
                this.zzc.put(zzaqcVar2);
            } catch (InterruptedException e) {
                zzaqo.zzb("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final void zzb(zzaqc zzaqcVar, zzaqi zzaqiVar) {
        List list;
        zzapl zzaplVar = zzaqiVar.zzb;
        if (zzaplVar == null || zzaplVar.zza(System.currentTimeMillis())) {
            zza(zzaqcVar);
            return;
        }
        String zzj = zzaqcVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzaqo.zzb) {
                zzaqo.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzaqc) it.next(), zzaqiVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzaqc zzaqcVar) {
        try {
            Map map = this.zza;
            String zzj = zzaqcVar.zzj();
            if (!map.containsKey(zzj)) {
                this.zza.put(zzj, null);
                zzaqcVar.zzu(this);
                if (zzaqo.zzb) {
                    zzaqo.zza("new request, sending to network %s", zzj);
                }
                return false;
            }
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzaqcVar.zzm("waiting-for-response");
            list.add(zzaqcVar);
            this.zza.put(zzj, list);
            if (zzaqo.zzb) {
                zzaqo.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
