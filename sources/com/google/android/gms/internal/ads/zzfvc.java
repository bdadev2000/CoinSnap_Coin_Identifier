package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfvc extends zzftv {
    final /* synthetic */ zzfvd zza;
    private final zzfvi zzb;

    public zzfvc(zzfvd zzfvdVar, zzfvi zzfviVar) {
        this.zza = zzfvdVar;
        this.zzb = zzfviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftw
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfvg zzc = zzfvh.zzc();
        zzc.zzb(i10);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i10 == 8157) {
            this.zza.zza();
        }
    }
}
