package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzfoe extends zzfoa {
    public zzfoe(ClientApi clientApi, Context context, int i2, zzbpl zzbplVar, com.google.android.gms.ads.internal.client.zzfu zzfuVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzfnm zzfnmVar, Clock clock) {
        super(clientApi, context, i2, zzbplVar, zzfuVar, zzcfVar, scheduledExecutorService, zzfnmVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final ListenableFuture zza() {
        ClientApi clientApi = this.zza;
        zzggh zze = zzggh.zze();
        zzbxf zzp = clientApi.zzp(ObjectWrapper.wrap(this.zzb), this.zze.zza, this.zzd, this.zzc);
        zzfod zzfodVar = new zzfod(this, zze, zzp);
        if (zzp != null) {
            try {
                zzp.zzf(this.zze.zzc, zzfodVar);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load rewarded ad.");
                zze.zzd(new zzfni(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfni(1, "Failed to create a rewarded ad."));
        }
        return zze;
    }
}
