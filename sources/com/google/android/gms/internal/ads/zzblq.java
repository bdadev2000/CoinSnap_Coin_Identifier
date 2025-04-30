package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblq implements zzblp {
    private final zzdya zza;

    public zzblq(zzdya zzdyaVar) {
        Preconditions.checkNotNull(zzdyaVar, "The Inspector Manager must not be null");
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.zza.zzj((String) map.get("persistentData"));
        }
    }
}
