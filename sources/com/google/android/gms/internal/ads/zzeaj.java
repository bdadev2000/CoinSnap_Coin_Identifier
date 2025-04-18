package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeaj extends zzeap {
    private zzbvb zzh;

    public zzeaj(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzu().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(@Nullable Bundle bundle) {
        if (!this.zzc) {
            this.zzc = true;
            try {
                try {
                    this.zzd.zzp().zze(this.zzh, new zzeao(this));
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "RemoteAdsServiceProxyClientTask.onConnected");
                    this.zza.zzd(th2);
                }
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyw(1));
            }
        }
    }

    public final synchronized ua.b zza(zzbvb zzbvbVar, long j3) {
        if (this.zzb) {
            return zzgei.zzo(this.zza, j3, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbvbVar;
        zzb();
        ua.b zzo = zzgei.zzo(this.zza, j3, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeai
            @Override // java.lang.Runnable
            public final void run() {
                zzeaj.this.zzc();
            }
        }, zzcaj.zzf);
        return zzo;
    }
}
