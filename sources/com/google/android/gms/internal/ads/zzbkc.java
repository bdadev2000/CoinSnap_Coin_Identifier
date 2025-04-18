package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbkc implements zzbjw {
    private final Context zza;
    private final Map zzb;

    public zzbkc(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        char c2;
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c2 = 0;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                com.google.android.gms.ads.internal.zzu.zzn().zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
            } else if (c2 == 1) {
                com.google.android.gms.ads.internal.zzu.zzn().zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            } else if (c2 != 2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzu.zzn().zzh(this.zza, str2);
            }
        }
    }
}
