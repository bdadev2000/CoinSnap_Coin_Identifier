package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzeum implements zzexh {
    private final Context zza;
    private final Intent zzb;

    public zzeum(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzms)).booleanValue()) {
            return zzgfo.zzh(new zzeun(null));
        }
        boolean z2 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                z2 = true;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgfo.zzh(new zzeun(Boolean.valueOf(z2)));
    }
}
