package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzewg implements zzevy {
    private final int zza;
    private final int zzb;

    public zzewg(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("sessions_without_flags", this.zza);
        bundle.putInt("crashes_without_flags", this.zzb);
        int i10 = com.google.android.gms.ads.internal.client.zzbc.zza;
        if (com.google.android.gms.ads.internal.client.zzbe.zzc().zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
