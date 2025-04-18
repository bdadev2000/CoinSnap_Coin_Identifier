package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzewv implements zzevy {
    final String zza;
    final int zzb;

    public /* synthetic */ zzewv(String str, int i10, zzewu zzewuVar) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkb)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                bundle.putInt("atps", i10);
            }
        }
    }
}
