package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbmh implements zzblp {
    private final zzbmg zza;

    public zzbmh(zzbmg zzbmgVar) {
        this.zza = zzbmgVar;
    }

    public static void zzb(zzchd zzchdVar, zzbmg zzbmgVar) {
        zzchdVar.zzag("/reward", new zzbmh(zzbmgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbyt zzbytVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbytVar = new zzbyt(str2, parseInt);
                }
            } catch (NumberFormatException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse reward amount.", e4);
            }
            this.zza.zza(zzbytVar);
            return;
        }
        if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
