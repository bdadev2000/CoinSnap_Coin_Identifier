package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeoc implements zzevy {

    @Nullable
    private final String zza;

    public zzeoc(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
