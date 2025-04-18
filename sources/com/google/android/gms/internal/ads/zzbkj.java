package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbkj implements zzbjr {
    private final zzbki zza;

    public zzbkj(zzbki zzbkiVar) {
        this.zza = zzbkiVar;
    }

    public static void zzb(zzcfk zzcfkVar, zzbki zzbkiVar) {
        zzcfkVar.zzag("/reward", new zzbkj(zzbkiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzbwv zzbwvVar = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzbwvVar = new zzbwv(str2, parseInt);
                }
            } catch (NumberFormatException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse reward amount.", e2);
            }
            this.zza.zza(zzbwvVar);
            return;
        }
        if ("video_start".equals(str)) {
            this.zza.zzc();
        } else if ("video_complete".equals(str)) {
            this.zza.zzb();
        }
    }
}
