package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcve {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final f4.c zzc;
    private volatile boolean zzd = true;

    public zzcve(Executor executor, ScheduledExecutorService scheduledExecutorService, f4.c cVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = cVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcve zzcveVar, List list, final zzgfp zzgfpVar) {
        if (list != null && !list.isEmpty()) {
            f4.c zzh = zzgft.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final f4.c cVar = (f4.c) it.next();
                zzh = zzgft.zzn(zzgft.zzf(zzh, Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcva
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        zzgfp.this.zza((Throwable) obj);
                        return zzgft.zzh(null);
                    }
                }, zzcveVar.zza), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcvb
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        return zzcve.this.zza(zzgfpVar, cVar, (zzcup) obj);
                    }
                }, zzcveVar.zza);
            }
            zzgft.zzr(zzh, new zzcvd(zzcveVar, zzgfpVar), zzcveVar.zza);
            return;
        }
        zzcveVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuz
            @Override // java.lang.Runnable
            public final void run() {
                zzgfp.this.zza(new zzdzd(3));
            }
        });
    }

    public final /* synthetic */ f4.c zza(zzgfp zzgfpVar, f4.c cVar, zzcup zzcupVar) throws Exception {
        if (zzcupVar != null) {
            zzgfpVar.zzb(zzcupVar);
        }
        return zzgft.zzo(cVar, ((Long) zzbgx.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgfp zzgfpVar) {
        zzgft.zzr(this.zzc, new zzcvc(this, zzgfpVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
