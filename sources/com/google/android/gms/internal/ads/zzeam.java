package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeam extends zzeap {
    private zzbuv zzh;

    public zzeam(Context context, ScheduledExecutorService scheduledExecutorService) {
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
                    this.zzd.zzp().zzf(this.zzh, new zzeao(this));
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "RemoteAdsServiceSignalClientTask.onConnected");
                    this.zza.zzd(th2);
                }
            } catch (RemoteException unused) {
                this.zza.zzd(new zzdyw(1));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeap, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i10));
        com.google.android.gms.ads.internal.util.client.zzm.zze(format);
        this.zza.zzd(new zzdyw(1, format));
    }

    public final synchronized ua.b zza(zzbuv zzbuvVar, long j3) {
        if (this.zzb) {
            return zzgei.zzo(this.zza, j3, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbuvVar;
        zzb();
        ua.b zzo = zzgei.zzo(this.zza, j3, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // java.lang.Runnable
            public final void run() {
                zzeam.this.zzc();
            }
        }, zzcaj.zzf);
        return zzo;
    }
}
