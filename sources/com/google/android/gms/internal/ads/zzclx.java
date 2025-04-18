package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzclx implements zzclr {
    private final zzdvk zza;

    public zzclx(zzdvk zzdvkVar) {
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclr
    public final void zza(Map map) {
        char c10;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c10 = 0;
            }
            c10 = 65535;
        } else {
            if (str.equals("flick")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                this.zza.zzm(zzdvg.NONE);
                return;
            } else {
                this.zza.zzm(zzdvg.FLICK);
                return;
            }
        }
        this.zza.zzm(zzdvg.SHAKE);
    }
}
