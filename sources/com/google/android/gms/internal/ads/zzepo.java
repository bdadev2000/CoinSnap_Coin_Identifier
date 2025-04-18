package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzepo implements zzevz {
    final zzbzz zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzges zzd;
    private final Context zze;

    public zzepo(Context context, zzbzz zzbzzVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzda)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzzVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        Task<AppSetIdInfo> appSetIdInfo;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcW)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdb)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcX)).booleanValue()) {
                    return zzgei.zzm(zzftq.zza(this.zzb.getAppSetIdInfo(), null), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzepl
                        @Override // com.google.android.gms.internal.ads.zzfwh
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                            return new zzepp(appSetIdInfo2.getId(), appSetIdInfo2.getScope());
                        }
                    }, zzcaj.zzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzda)).booleanValue()) {
                    appSetIdInfo = zzfgt.zza(this.zze);
                } else {
                    appSetIdInfo = this.zzb.getAppSetIdInfo();
                }
                if (appSetIdInfo == null) {
                    return zzgei.zzh(new zzepp(null, -1));
                }
                ua.b zzn = zzgei.zzn(zzftq.zza(appSetIdInfo, null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzepm
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        AppSetIdInfo appSetIdInfo2 = (AppSetIdInfo) obj;
                        if (appSetIdInfo2 == null) {
                            return zzgei.zzh(new zzepp(null, -1));
                        }
                        return zzgei.zzh(new zzepp(appSetIdInfo2.getId(), appSetIdInfo2.getScope()));
                    }
                }, zzcaj.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcY)).booleanValue()) {
                    zzn = zzgei.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcZ)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgei.zze(zzn, Exception.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzepn
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        zzepo.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzepp(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgei.zzh(new zzepp(null, -1));
    }
}
