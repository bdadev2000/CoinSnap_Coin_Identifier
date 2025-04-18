package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzctt {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzctt(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzctt zzcttVar, List list, final zzgfk zzgfkVar) {
        if (list == null || list.isEmpty()) {
            zzcttVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcto
                @Override // java.lang.Runnable
                public final void run() {
                    zzgfk.this.zza(new zzdye(3));
                }
            });
            return;
        }
        ListenableFuture zzh = zzgfo.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzh = zzgfo.zzn(zzgfo.zzf(zzh, Throwable.class, new zzgev() { // from class: com.google.android.gms.internal.ads.zzctp
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    zzgfk.this.zza((Throwable) obj);
                    return zzgfo.zzh(null);
                }
            }, zzcttVar.zza), new zzgev() { // from class: com.google.android.gms.internal.ads.zzctq
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzctt.this.zza(zzgfkVar, listenableFuture, (zzcte) obj);
                }
            }, zzcttVar.zza);
        }
        zzgfo.zzr(zzh, new zzcts(zzcttVar, zzgfkVar), zzcttVar.zza);
    }

    public final /* synthetic */ ListenableFuture zza(zzgfk zzgfkVar, ListenableFuture listenableFuture, zzcte zzcteVar) throws Exception {
        if (zzcteVar != null) {
            zzgfkVar.zzb(zzcteVar);
        }
        return zzgfo.zzo(listenableFuture, ((Long) zzbfe.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgfk zzgfkVar) {
        zzgfo.zzr(this.zzc, new zzctr(this, zzgfkVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
