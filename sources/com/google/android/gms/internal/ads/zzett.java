package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzett implements zzevy {
    public final Bundle zza;

    public zzett(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfgc.zza(bundle, "device");
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza);
    }
}
