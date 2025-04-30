package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzeso implements zzexv {
    private final double zza;
    private final boolean zzb;

    public zzeso(double d2, boolean z8) {
        this.zza = d2;
        this.zzb = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfic.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfic.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
