package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzfnl extends zzfoa {
    public zzfnl(ClientApi clientApi, Context context, int i2, zzbpl zzbplVar, com.google.android.gms.ads.internal.client.zzfu zzfuVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzfnm zzfnmVar, Clock clock) {
        super(clientApi, context, i2, zzbplVar, zzfuVar, zzcfVar, scheduledExecutorService, zzfnmVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfoa
    public final ListenableFuture zza() {
        ClientApi clientApi = this.zza;
        zzggh zze = zzggh.zze();
        com.google.android.gms.ads.internal.client.zzby zzc = clientApi.zzc(ObjectWrapper.wrap(this.zzb), com.google.android.gms.ads.internal.client.zzs.zzb(), this.zze.zza, this.zzd, this.zzc);
        if (zzc != null) {
            try {
                zzc.zzH(new zzfnk(this, zze, this.zze));
                zzc.zzab(this.zze.zzc);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to load app open ad.", e);
                zze.zzd(new zzfni(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfni(1, "Failed to create an app open ad manager."));
        }
        return zze;
    }
}
