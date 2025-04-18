package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzeql implements zzexg {

    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzeql(@Nullable String str, boolean z2) {
        this.zza = str;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            Bundle zza = zzfhq.zza(bundle, "pii");
            zza.putString("afai", this.zza);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
