package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcoz implements zzcot {
    private final zzdya zza;

    public zzcoz(zzdya zzdyaVar) {
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        char c9;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c9 = 0;
            }
            c9 = 65535;
        } else {
            if (str.equals("flick")) {
                c9 = 1;
            }
            c9 = 65535;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                this.zza.zzm(zzdxw.NONE);
                return;
            } else {
                this.zza.zzm(zzdxw.FLICK);
                return;
            }
        }
        this.zza.zzm(zzdxw.SHAKE);
    }
}
