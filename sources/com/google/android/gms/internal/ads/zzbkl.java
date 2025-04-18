package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbkl implements zzbjr {
    private final zzdvk zza;

    public zzbkl(zzdvk zzdvkVar) {
        Preconditions.checkNotNull(zzdvkVar, "The Inspector Manager must not be null");
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j3 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j3 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j3);
        }
    }
}
