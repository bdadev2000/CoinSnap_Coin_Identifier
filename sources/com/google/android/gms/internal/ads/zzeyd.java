package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public final class zzeyd implements zzexg {

    @VisibleForTesting
    final String zza;
    final int zzb;

    public /* synthetic */ zzeyd(String str, int i2, zzeyc zzeycVar) {
        this.zza = str;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjZ)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i2 = this.zzb;
            if (i2 != -1) {
                bundle.putInt("atps", i2);
            }
        }
    }
}
