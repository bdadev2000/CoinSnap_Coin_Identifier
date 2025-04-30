package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzcpg implements zzcot {
    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkt)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.zzu.zzo().zzi().zzJ(Boolean.parseBoolean(str));
            }
        }
    }
}
