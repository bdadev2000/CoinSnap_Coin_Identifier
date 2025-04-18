package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbda {
    private final Map zza = new HashMap();
    private final zzbdc zzb;

    public zzbda(zzbdc zzbdcVar) {
        this.zzb = zzbdcVar;
    }

    public final zzbdc zza() {
        return this.zzb;
    }

    public final void zzb(String str, @Nullable zzbcz zzbczVar) {
        this.zza.put(str, zzbczVar);
    }

    public final void zzc(String str, String str2, long j3) {
        zzbcz zzbczVar = (zzbcz) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbczVar != null) {
            this.zzb.zze(zzbczVar, j3, strArr);
        }
        this.zza.put(str, new zzbcz(j3, null, null));
    }
}
