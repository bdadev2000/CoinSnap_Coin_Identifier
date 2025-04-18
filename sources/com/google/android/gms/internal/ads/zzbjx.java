package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjx implements zzbjr {
    private final Context zza;
    private final Map zzb;

    public zzbjx(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        char c10;
        if (!com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            return;
        }
        String str = (String) map.get("eventName");
        String str2 = (String) map.get("eventId");
        int hashCode = str.hashCode();
        if (hashCode != 94399) {
            if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c10 = 0;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("_aa")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzg("logScionEvent gmsg contained unsupported eventName");
                    return;
                } else {
                    com.google.android.gms.ads.internal.zzv.zzo().zzh(this.zza, str2);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzv.zzo().zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzo().zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
    }
}
