package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcme implements zzclr {
    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkb)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzE(Boolean.parseBoolean(str));
            }
        }
    }
}
