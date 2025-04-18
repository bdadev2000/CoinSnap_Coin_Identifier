package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzepp implements zzevy {

    @Nullable
    final String zza;
    final int zzb;

    public zzepp(@Nullable String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle zza = zzfgc.zza(bundle, "pii");
            bundle.putBundle("pii", zza);
            zza.putString("pvid", this.zza);
            zza.putInt("pvid_s", this.zzb);
        }
    }
}
