package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcpl implements zzcot {
    private final zzfgs zza;

    public zzcpl(zzfgs zzfgsVar) {
        this.zza = zzfgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zza.zzb(Boolean.parseBoolean(str));
            } catch (Exception e4) {
                throw new IllegalStateException("Invalid render_in_browser state", e4);
            }
        }
    }
}
