package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfmp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpg zze;
    private final Clock zzf;

    public zzfmp(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static zzflx zzc() {
        return new zzflx(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzu)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzv)).longValue(), 0.2d);
    }

    @Nullable
    public final zzfmo zza(com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat != null) {
            int ordinal = adFormat.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        return null;
                    }
                    return new zzflw(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
                }
                return new zzfms(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
            }
            return new zzflz(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
        }
        return null;
    }

    public final void zzb(zzbpg zzbpgVar) {
        this.zze = zzbpgVar;
    }
}
