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
final class zzarr implements zzard {
    private final Map zza = new HashMap();

    @Nullable
    private final zzaqq zzb;

    @Nullable
    private final BlockingQueue zzc;
    private final zzaqv zzd;

    public zzarr(@NonNull zzaqq zzaqqVar, @NonNull BlockingQueue blockingQueue, zzaqv zzaqvVar) {
        this.zzd = zzaqvVar;
        this.zzb = zzaqqVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final synchronized void zza(zzare zzareVar) {
        try {
            Map map = this.zza;
            String zzj = zzareVar.zzj();
            List list = (List) map.remove(zzj);
            if (list != null && !list.isEmpty()) {
                if (zzarq.zzb) {
                    zzarq.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
                }
                zzare zzareVar2 = (zzare) list.remove(0);
                this.zza.put(zzj, list);
                zzareVar2.zzu(this);
                try {
                    this.zzc.put(zzareVar2);
                } catch (InterruptedException e4) {
                    zzarq.zzb("Couldn't add request to queue. %s", e4.toString());
                    Thread.currentThread().interrupt();
                    this.zzb.zzb();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public final void zzb(zzare zzareVar, zzark zzarkVar) {
        List list;
        zzaqn zzaqnVar = zzarkVar.zzb;
        if (zzaqnVar != null && !zzaqnVar.zza(System.currentTimeMillis())) {
            String zzj = zzareVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzarq.zzb) {
                    zzarq.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzd.zzb((zzare) it.next(), zzarkVar, null);
                }
                return;
            }
            return;
        }
        zza(zzareVar);
    }

    public final synchronized boolean zzc(zzare zzareVar) {
        try {
            Map map = this.zza;
            String zzj = zzareVar.zzj();
            if (map.containsKey(zzj)) {
                List list = (List) this.zza.get(zzj);
                if (list == null) {
                    list = new ArrayList();
                }
                zzareVar.zzm("waiting-for-response");
                list.add(zzareVar);
                this.zza.put(zzj, list);
                if (zzarq.zzb) {
                    zzarq.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
                }
                return true;
            }
            this.zza.put(zzj, null);
            zzareVar.zzu(this);
            if (zzarq.zzb) {
                zzarq.zza("new request, sending to network %s", zzj);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
