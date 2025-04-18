package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeur implements zzevy {

    @Nullable
    private final Bundle zza;

    public zzeur(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
