package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcnl implements zzcnf {
    private final zzdxb zza;

    public zzcnl(zzdxb zzdxbVar) {
        this.zza = zzdxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(Map map) {
        char c2;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("flick")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            this.zza.zzm(zzdwx.SHAKE);
        } else if (c2 != 1) {
            this.zza.zzm(zzdwx.NONE);
        } else {
            this.zza.zzm(zzdwx.FLICK);
        }
    }
}
