package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzecu extends zzeda {
    private zzbwz zzh;

    public zzecu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(@Nullable Bundle bundle) {
        if (!this.zzc) {
            this.zzc = true;
            try {
                this.zzd.zzp().zze(this.zzh, new zzecz(this));
            } catch (RemoteException unused) {
                this.zza.zzd(new zzebh(1));
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "RemoteAdsServiceProxyClientTask.onConnected");
                this.zza.zzd(th);
            }
        }
    }

    public final synchronized f4.c zza(zzbwz zzbwzVar, long j7) {
        if (this.zzb) {
            return zzgft.zzo(this.zza, j7, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbwzVar;
        zzb();
        f4.c zzo = zzgft.zzo(this.zza, j7, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzect
            @Override // java.lang.Runnable
            public final void run() {
                zzecu.this.zzc();
            }
        }, zzcci.zzf);
        return zzo;
    }
}
