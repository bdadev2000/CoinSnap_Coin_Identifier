package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class zzetk implements zzevz {
    private final Context zza;
    private final Intent zzb;

    public zzetk(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmx)).booleanValue()) {
            boolean z10 = false;
            try {
                if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                    z10 = true;
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            return zzgei.zzh(new zzetl(Boolean.valueOf(z10)));
        }
        return zzgei.zzh(new zzetl(null));
    }
}
