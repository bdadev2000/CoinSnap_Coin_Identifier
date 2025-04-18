package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcmj implements zzclr {
    private final zzfes zza;

    public zzcmj(zzfes zzfesVar) {
        this.zza = zzfesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(str));
            } catch (Exception e2) {
                throw new IllegalStateException("Invalid render_in_browser state", e2);
            }
        }
    }
}
