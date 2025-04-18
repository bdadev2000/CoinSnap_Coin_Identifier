package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzevh implements zzevy {
    private final String zza;
    private final Bundle zzb;

    public zzevh(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (!this.zzb.isEmpty()) {
            bundle.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}
