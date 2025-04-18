package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzaqc implements zzapo {
    private final Map zza = new HashMap();

    @Nullable
    private final zzapb zzb;

    @Nullable
    private final BlockingQueue zzc;
    private final zzapg zzd;

    public zzaqc(@NonNull zzapb zzapbVar, @NonNull BlockingQueue blockingQueue, zzapg zzapgVar) {
        this.zzd = zzapgVar;
        this.zzb = zzapbVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final synchronized void zza(zzapp zzappVar) {
        Map map = this.zza;
        String zzj = zzappVar.zzj();
        List list = (List) map.remove(zzj);
        if (list != null && !list.isEmpty()) {
            if (zzaqb.zzb) {
                zzaqb.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
            }
            zzapp zzappVar2 = (zzapp) list.remove(0);
            this.zza.put(zzj, list);
            zzappVar2.zzu(this);
            try {
                this.zzc.put(zzappVar2);
            } catch (InterruptedException e2) {
                zzaqb.zzb("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzb(zzapp zzappVar, zzapv zzapvVar) {
        List list;
        zzaoy zzaoyVar = zzapvVar.zzb;
        if (zzaoyVar != null && !zzaoyVar.zza(System.currentTimeMillis())) {
            String zzj = zzappVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzaqb.zzb) {
                    zzaqb.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzd.zzb((zzapp) it.next(), zzapvVar, null);
                }
                return;
            }
            return;
        }
        zza(zzappVar);
    }

    public final synchronized boolean zzc(zzapp zzappVar) {
        Map map = this.zza;
        String zzj = zzappVar.zzj();
        if (map.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzappVar.zzm("waiting-for-response");
            list.add(zzappVar);
            this.zza.put(zzj, list);
            if (zzaqb.zzb) {
                zzaqb.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzappVar.zzu(this);
        if (zzaqb.zzb) {
            zzaqb.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}
