package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzeou implements zzevy {
    private final Bundle zza;

    public zzeou(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.zza);
        }
    }
}
