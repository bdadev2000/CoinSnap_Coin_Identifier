package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzfwk extends zzfvd {
    final /* synthetic */ zzfwl zza;
    private final zzfwq zzb;

    public zzfwk(zzfwl zzfwlVar, zzfwq zzfwqVar) {
        this.zza = zzfwlVar;
        this.zzb = zzfwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final void zzb(Bundle bundle) {
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfwo zzc = zzfwp.zzc();
        zzc.zzb(i2);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i2 == 8157) {
            this.zza.zza();
        }
    }
}
