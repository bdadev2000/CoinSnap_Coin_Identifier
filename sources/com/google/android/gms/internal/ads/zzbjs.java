package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjs implements zzbjr {
    private final zzdvk zza;

    public zzbjs(zzdvk zzdvkVar) {
        Preconditions.checkNotNull(zzdvkVar, "The Inspector Manager must not be null");
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.zza.zzj((String) map.get("persistentData"));
        }
    }
}
