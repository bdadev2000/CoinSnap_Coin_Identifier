package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzepb implements zzevy {

    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzepb(@Nullable String str, boolean z10) {
        this.zza = str;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zza != null) {
            Bundle zza = zzfgc.zza(bundle, "pii");
            zza.putString("afai", this.zza);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
