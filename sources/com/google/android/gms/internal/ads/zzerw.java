package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzerw implements zzexv {

    @Nullable
    final String zza;
    final int zzb;

    public zzerw(@Nullable String str, int i9) {
        this.zza = str;
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle zza = zzfic.zza(bundle, "pii");
            bundle.putBundle("pii", zza);
            zza.putString("pvid", this.zza);
            zza.putInt("pvid_s", this.zzb);
        }
    }
}
