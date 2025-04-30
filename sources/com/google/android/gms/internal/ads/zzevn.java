package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzevn implements zzexv {
    public final zzfgs zza;

    public zzevn(zzfgs zzfgsVar) {
        this.zza = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlS)).booleanValue()) {
                bundle.putBoolean("render_in_browser", this.zza.zzd());
                bundle.putBoolean("disable_ml", this.zza.zzc());
            }
        }
    }
}
