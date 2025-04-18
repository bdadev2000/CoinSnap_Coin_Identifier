package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzexo implements zzexg {
    private final int zza;
    private final int zzb;

    public zzexo(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("sessions_without_flags", this.zza);
        bundle.putInt("crashes_without_flags", this.zzb);
        int i2 = com.google.android.gms.ads.internal.client.zzbc.zza;
        if (com.google.android.gms.ads.internal.client.zzbe.zzc().zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
