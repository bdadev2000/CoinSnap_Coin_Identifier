package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbmj implements zzblp {
    private final zzdya zza;

    public zzbmj(zzdya zzdyaVar) {
        Preconditions.checkNotNull(zzdyaVar, "The Inspector Manager must not be null");
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j7 = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j7 = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j7);
        }
    }
}
