package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblv implements zzblp {
    private final Context zza;
    private final Map zzb;

    public zzblv(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        char c9;
        if (!com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zza)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c9 = 1;
                }
                c9 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c9 = 0;
                }
                c9 = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c9 = 2;
            }
            c9 = 65535;
        }
        if (c9 != 0) {
            if (c9 != 1) {
                if (c9 != 2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    com.google.android.gms.ads.internal.zzu.zzn().zzh(this.zza, str2);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzu.zzn().zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzn().zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
    }
}
