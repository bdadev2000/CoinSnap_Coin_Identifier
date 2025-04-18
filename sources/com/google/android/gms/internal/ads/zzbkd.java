package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbkd implements zzbjw {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbsj zzc;
    private final zzbsq zzd;

    public zzbkd(com.google.android.gms.ads.internal.zzb zzbVar, zzbsj zzbsjVar, zzbsq zzbsqVar) {
        this.zzb = zzbVar;
        this.zzc = zzbsjVar;
        this.zzd = zzbsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfo zzcfoVar = (zzcfo) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i2 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzc()) {
                    zzbVar.zzb(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbsm(zzcfoVar, map).zzb();
                    return;
                }
                if (intValue == 4) {
                    new zzbsg(zzcfoVar, map).zzc();
                    return;
                } else if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (intValue != 7) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcfoVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i2 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i2 = parseBoolean ? -1 : 14;
        }
        zzcfoVar.zzau(i2);
    }
}
