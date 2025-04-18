package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzfno extends zzfoa {
    public zzfno(ClientApi clientApi, Context context, int i2, zzbpl zzbplVar, com.google.android.gms.ads.internal.client.zzfu zzfuVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzfnm zzfnmVar, Clock clock) {
        super(clientApi, context, i2, zzbplVar, zzfuVar, zzcfVar, scheduledExecutorService, zzfnmVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final ListenableFuture zza() {
        zzggh zze = zzggh.zze();
        com.google.android.gms.ads.internal.client.zzby zze2 = this.zza.zze(ObjectWrapper.wrap(this.zzb), new com.google.android.gms.ads.internal.client.zzs(), this.zze.zza, this.zzd, this.zzc);
        if (zze2 != null) {
            try {
                zze2.zzy(this.zze.zzc, new zzfnn(this, zze, zze2));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to load interstitial ad.", e);
                zze.zzd(new zzfni(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfni(1, "Failed to create an interstitial ad manager."));
        }
        return zze;
    }
}
