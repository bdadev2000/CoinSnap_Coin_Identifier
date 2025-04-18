package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeta implements zzevy {

    @Nullable
    private final Integer zza;

    public zzeta(@Nullable Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
