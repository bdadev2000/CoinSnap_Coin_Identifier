package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.vungle.ads.internal.presenter.q;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblw implements zzblp {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", q.SET_ORIENTATION_PROPERTIES, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbud zzc;
    private final zzbuk zzd;

    public zzblw(com.google.android.gms.ads.internal.zzb zzbVar, zzbud zzbudVar, zzbuk zzbukVar) {
        this.zzb = zzbVar;
        this.zzc = zzbudVar;
        this.zzd = zzbukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i9 = 6;
        boolean z8 = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (this.zzb.zzc()) {
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
                                new zzbua(zzchdVar, map).zzc();
                                return;
                            }
                        } else {
                            new zzbug(zzchdVar, map).zzb();
                            return;
                        }
                    } else {
                        this.zzc.zzb(map);
                        return;
                    }
                } else {
                    this.zzb.zzb(null);
                    return;
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z8 = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzchdVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i9 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z8) {
                i9 = -1;
            } else {
                i9 = 14;
            }
        }
        zzchdVar.zzau(i9);
    }
}
