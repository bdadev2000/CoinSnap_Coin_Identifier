package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzezt implements zzexw {
    private final zzcby zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgge zzd;
    private final zzbcp zze;

    public zzezt(String str, zzbcp zzbcpVar, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar) {
        this.zzb = str;
        this.zze = zzbcpVar;
        this.zza = zzcbyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcP)).booleanValue()) {
                f4.c zzn = zzgft.zzn(zzfvk.zza(Tasks.forResult(null), null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzezr
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final f4.c zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        if (appSetIdInfo == null) {
                            return zzgft.zzh(new zzezu(null, -1));
                        }
                        return zzgft.zzh(new zzezu(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbfy.zza.zze()).booleanValue()) {
                    zzn = zzgft.zzo(zzn, ((Long) zzbfy.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgft.zze(zzn, Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzezs
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return zzezt.this.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzgft.zzh(new zzezu(null, -1));
    }

    public final /* synthetic */ zzezu zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzezu(null, -1);
    }
}
