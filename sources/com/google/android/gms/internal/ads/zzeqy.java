package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeqy implements zzexh {

    @VisibleForTesting
    final zzcad zza;

    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgfz zzd;
    private final Context zze;

    public zzeqy(Context context, zzcad zzcadVar, ScheduledExecutorService scheduledExecutorService, zzgfz zzgfzVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcR)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcadVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcN)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcS)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcO)).booleanValue()) {
                    return zzgfo.zzm(zzfuy.zza(this.zzb.getAppSetIdInfo(), null), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzeqv
                        @Override // com.google.android.gms.internal.ads.zzfxq
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzeqz(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcan.zzf);
                }
                Task<AppSetIdInfo> zza = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcR)).booleanValue() ? zzfih.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (zza == null) {
                    return zzgfo.zzh(new zzeqz(null, -1));
                }
                ListenableFuture zzn = zzgfo.zzn(zzfuy.zza(zza, null), new zzgev() { // from class: com.google.android.gms.internal.ads.zzeqw
                    @Override // com.google.android.gms.internal.ads.zzgev
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgfo.zzh(new zzeqz(null, -1)) : zzgfo.zzh(new zzeqz(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcan.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcP)).booleanValue()) {
                    zzn = zzgfo.zzo(zzn, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcQ)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgfo.zze(zzn, Exception.class, new zzfxq() { // from class: com.google.android.gms.internal.ads.zzeqx
                    @Override // com.google.android.gms.internal.ads.zzfxq
                    public final Object apply(Object obj) {
                        zzeqy.this.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzeqz(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgfo.zzh(new zzeqz(null, -1));
    }
}
