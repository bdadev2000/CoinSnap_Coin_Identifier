package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzerv implements zzexw {
    final zzcby zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgge zzd;
    private final Context zze;

    public zzerv(Context context, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcO)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcbyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcK)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcP)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcL)).booleanValue()) {
                    return zzgft.zzm(zzfvk.zza(this.zzb.getAppSetIdInfo(), null), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzers
                        @Override // com.google.android.gms.internal.ads.zzfxu
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzerw(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzcci.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcO)).booleanValue()) {
                    appSetIdInfo = zzfit.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzgft.zzh(new zzerw(null, -1));
                }
                f4.c zzn = zzgft.zzn(zzfvk.zza(appSetIdInfo, null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzert
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzgft.zzh(new zzerw(null, -1));
                        }
                        return zzgft.zzh(new zzerw(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzcci.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcM)).booleanValue()) {
                    zzn = zzgft.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcN)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgft.zze(zzn, Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeru
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        zzerv.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzerw(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgft.zzh(new zzerw(null, -1));
    }
}
