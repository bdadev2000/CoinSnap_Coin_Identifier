package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjx implements zzbjw {
    private final zzdxb zza;

    public zzbjx(zzdxb zzdxbVar) {
        Preconditions.checkNotNull(zzdxbVar, "The Inspector Manager must not be null");
        this.zza = zzdxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.zza.zzj((String) map.get("persistentData"));
    }
}
