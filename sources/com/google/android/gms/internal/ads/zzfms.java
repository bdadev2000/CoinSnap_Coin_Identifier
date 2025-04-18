package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfms extends zzfmo {
    public zzfms(ClientApi clientApi, Context context, int i10, zzbpg zzbpgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzflx zzflxVar, Clock clock) {
        super(clientApi, context, i10, zzbpgVar, zzftVar, zzcfVar, scheduledExecutorService, zzflxVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final ua.b zza() {
        ClientApi clientApi = this.zza;
        zzgfa zze = zzgfa.zze();
        zzbxc zzp = clientApi.zzp(ObjectWrapper.wrap(this.zzb), this.zze.zza, this.zzd, this.zzc);
        zzfmr zzfmrVar = new zzfmr(this, zze, zzp);
        if (zzp != null) {
            try {
                zzp.zzf(this.zze.zzc, zzfmrVar);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to load rewarded ad.");
                zze.zzd(new zzflt(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzflt(1, "Failed to create a rewarded ad."));
        }
        return zze;
    }
}
