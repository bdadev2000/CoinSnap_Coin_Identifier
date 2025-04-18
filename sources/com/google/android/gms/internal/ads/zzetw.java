package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzetw implements zzevy {
    public final zzfes zza;

    public zzetw(zzfes zzfesVar) {
        this.zza = zzfesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlE)).booleanValue()) {
                bundle.putBoolean("render_in_browser", this.zza.zzd());
                bundle.putBoolean("disable_ml", this.zza.zzc());
            }
        }
    }
}
