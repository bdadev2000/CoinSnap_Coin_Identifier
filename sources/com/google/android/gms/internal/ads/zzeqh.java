package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeqh implements zzevy {
    private final double zza;
    private final boolean zzb;

    public zzeqh(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfgc.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfgc.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
