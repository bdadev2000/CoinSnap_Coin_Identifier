package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbko implements zzbjw {
    private final zzbkn zza;

    public zzbko(zzbkn zzbknVar) {
        this.zza = zzbknVar;
    }

    public static void zzb(zzcfo zzcfoVar, zzbkn zzbknVar) {
        zzcfoVar.zzag("/reward", new zzbko(zzbknVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbwy zzbwyVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbwyVar = new zzbwy(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbwyVar);
    }
}
