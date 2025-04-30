package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzeyo implements zzexv {
    final String zza;
    final int zzb;

    public /* synthetic */ zzeyo(String str, int i9, zzeyn zzeynVar) {
        this.zza = str;
        this.zzb = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkt)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                bundle.putString("topics", this.zza);
            }
            int i9 = this.zzb;
            if (i9 != -1) {
                bundle.putInt("atps", i9);
            }
        }
    }
}
