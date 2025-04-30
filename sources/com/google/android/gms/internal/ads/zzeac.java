package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzeac {
    private final ScheduledExecutorService zza;
    private final zzgge zzb;
    private final zzgge zzc;
    private final zzeau zzd;
    private final zzhkj zze;

    public zzeac(ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar, zzgge zzggeVar2, zzeau zzeauVar, zzhkj zzhkjVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzggeVar;
        this.zzc = zzggeVar2;
        this.zzd = zzeauVar;
        this.zze = zzhkjVar;
    }

    public final /* synthetic */ zzebi zza(zzbxu zzbxuVar) throws Exception {
        return (zzebi) this.zzd.zza(zzbxuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ f4.c zzb(final zzbxu zzbxuVar, int i9, Throwable th) throws Exception {
        return zzgft.zzn(((zzedq) this.zze.zzb()).zzd(zzbxuVar, i9), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdzz
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzgft.zzh(new zzebi((InputStream) obj, zzbxu.this));
            }
        }, this.zzb);
    }

    public final f4.c zzc(final zzbxu zzbxuVar) {
        f4.c zza;
        String str = zzbxuVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        if (com.google.android.gms.ads.internal.util.zzt.zzC(str)) {
            zza = zzgft.zzg(new zzebh(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhH)).booleanValue()) {
                zza = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeaa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzeac.this.zza(zzbxuVar);
                    }
                });
            } else {
                zza = this.zzd.zza(zzbxuVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzgft.zzf((zzgfk) zzgft.zzo(zzgfk.zzu(zza), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzeac.this.zzb(zzbxuVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
