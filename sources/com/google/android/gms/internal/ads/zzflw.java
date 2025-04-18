package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzflw extends zzfmo {
    public zzflw(ClientApi clientApi, Context context, int i10, zzbpg zzbpgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzflx zzflxVar, Clock clock) {
        super(clientApi, context, i10, zzbpgVar, zzftVar, zzcfVar, scheduledExecutorService, zzflxVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfmo
    public final ua.b zza() {
        ClientApi clientApi = this.zza;
        zzgfa zze = zzgfa.zze();
        com.google.android.gms.ads.internal.client.zzby zzc = clientApi.zzc(ObjectWrapper.wrap(this.zzb), com.google.android.gms.ads.internal.client.zzs.zzb(), this.zze.zza, this.zzd, this.zzc);
        if (zzc != null) {
            try {
                zzc.zzH(new zzflv(this, zze, this.zze));
                zzc.zzab(this.zze.zzc);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to load app open ad.", e2);
                zze.zzd(new zzflt(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzflt(1, "Failed to create an app open ad manager."));
        }
        return zze;
    }
}
