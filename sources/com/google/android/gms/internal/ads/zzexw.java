package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzexw implements zzevz {
    private final zzbzz zza;
    private final ScheduledExecutorService zzb;
    private final zzges zzc;

    public zzexw(String str, zzbao zzbaoVar, zzbzz zzbzzVar, ScheduledExecutorService scheduledExecutorService, zzges zzgesVar) {
        this.zza = zzbzzVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcW)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdb)).booleanValue()) {
                ua.b zzn = zzgei.zzn(zzftq.zza(Tasks.forResult(null), null), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzexu
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgei.zzh(new zzexx(null, -1));
                        }
                        return zzgei.zzh(new zzexx(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzc);
                if (((Boolean) zzbea.zza.zze()).booleanValue()) {
                    zzn = zzgei.zzo(zzn, ((Long) zzbea.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgei.zze(zzn, Exception.class, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzexv
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object apply(Object obj) {
                        return zzexw.this.zzc((Exception) obj);
                    }
                }, this.zzc);
            }
        }
        return zzgei.zzh(new zzexx(null, -1));
    }

    public final /* synthetic */ zzexx zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzexx(null, -1);
    }
}
