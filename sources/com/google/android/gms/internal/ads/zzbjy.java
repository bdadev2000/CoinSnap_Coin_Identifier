package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.vungle.ads.internal.presenter.q;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbjy implements zzbjr {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", q.SET_ORIENTATION_PROPERTIES, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbse zzc;
    private final zzbsl zzd;

    public zzbjy(com.google.android.gms.ads.internal.zzb zzbVar, zzbse zzbseVar, zzbsl zzbslVar) {
        this.zzb = zzbVar;
        this.zzc = zzbseVar;
        this.zzd = zzbslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        boolean z10 = true;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (zzbVar.zzc()) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 6) {
                                        if (intValue != 7) {
                                            com.google.android.gms.ads.internal.util.client.zzm.zzi("Unknown MRAID command called.");
                                            return;
                                        }
                                    } else {
                                        this.zzc.zza(true);
                                        return;
                                    }
                                }
                            } else {
                                new zzbsb(zzcfkVar, map).zzc();
                                return;
                            }
                        } else {
                            new zzbsh(zzcfkVar, map).zzb();
                            return;
                        }
                    } else {
                        this.zzc.zzb(map);
                        return;
                    }
                } else {
                    zzbVar.zzb(null);
                    return;
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z10 = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcfkVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z10) {
                i10 = -1;
            } else {
                i10 = 14;
            }
        }
        zzcfkVar.zzau(i10);
    }
}
