package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcmp implements zzclr {
    private final zzdvk zza;

    public zzcmp(zzdvk zzdvkVar) {
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals("true"));
    }
}
