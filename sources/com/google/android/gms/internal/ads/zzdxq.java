package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzdxq {
    private final ScheduledExecutorService zza;
    private final zzges zzb;
    private final zzges zzc;
    private final zzdyj zzd;
    private final zzhfr zze;

    public zzdxq(ScheduledExecutorService scheduledExecutorService, zzges zzgesVar, zzges zzgesVar2, zzdyj zzdyjVar, zzhfr zzhfrVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgesVar;
        this.zzc = zzgesVar2;
        this.zzd = zzdyjVar;
        this.zze = zzhfrVar;
    }

    public final /* synthetic */ zzdyx zza(zzbvx zzbvxVar) throws Exception {
        return (zzdyx) this.zzd.zza(zzbvxVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ ua.b zzb(final zzbvx zzbvxVar, int i10, Throwable th2) throws Exception {
        Bundle bundle;
        if (zzbvxVar != null && (bundle = zzbvxVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgei.zzn(((zzebg) this.zze.zzb()).zzd(zzbvxVar, i10), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxn
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(new zzdyx((InputStream) obj, zzbvx.this));
            }
        }, this.zzb);
    }

    public final ua.b zzc(final zzbvx zzbvxVar) {
        ua.b zza;
        String str = zzbvxVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzC(str)) {
            zza = zzgei.zzg(new zzdyw(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhi)).booleanValue()) {
                zza = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdxq.this.zza(zzbvxVar);
                    }
                });
            } else {
                zza = this.zzd.zza(zzbvxVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgdz) zzgei.zzf((zzgdz) zzgei.zzo(zzgdz.zzu(zza), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfx)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdxp
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdxq.this.zzb(zzbvxVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
