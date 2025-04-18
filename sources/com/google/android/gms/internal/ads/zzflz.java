package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzflz extends zzfmo {
    public zzflz(ClientApi clientApi, Context context, int i10, zzbpg zzbpgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzflx zzflxVar, Clock clock) {
        super(clientApi, context, i10, zzbpgVar, zzftVar, zzcfVar, scheduledExecutorService, zzflxVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final ua.b zza() {
        zzgfa zze = zzgfa.zze();
        com.google.android.gms.ads.internal.client.zzby zze2 = this.zza.zze(ObjectWrapper.wrap(this.zzb), new com.google.android.gms.ads.internal.client.zzs(), this.zze.zza, this.zzd, this.zzc);
        if (zze2 != null) {
            try {
                zze2.zzy(this.zze.zzc, new zzfly(this, zze, zze2));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to load interstitial ad.", e2);
                zze.zzd(new zzflt(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzflt(1, "Failed to create an interstitial ad manager."));
        }
        return zze;
    }
}
