package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzfwm extends zzfvp {
    final /* synthetic */ zzfwn zza;
    private final zzfws zzb;

    public zzfwm(zzfwn zzfwnVar, zzfws zzfwsVar) {
        this.zza = zzfwnVar;
        this.zzb = zzfwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvq
    public final void zzb(Bundle bundle) {
        int i9 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfwq zzc = zzfwr.zzc();
        zzc.zzb(i9);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i9 == 8157) {
            this.zza.zzc();
        }
    }
}
