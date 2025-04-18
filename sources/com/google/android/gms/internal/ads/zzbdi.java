package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes4.dex */
public final class zzbdi {
    private final Map zza = new HashMap();
    private final zzbdk zzb;

    public zzbdi(zzbdk zzbdkVar) {
        this.zzb = zzbdkVar;
    }

    public final zzbdk zza() {
        return this.zzb;
    }

    public final void zzb(String str, @Nullable zzbdh zzbdhVar) {
        this.zza.put(str, zzbdhVar);
    }

    public final void zzc(String str, String str2, long j2) {
        zzbdh zzbdhVar = (zzbdh) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbdhVar != null) {
            this.zzb.zze(zzbdhVar, j2, strArr);
        }
        this.zza.put(str, new zzbdh(j2, null, null));
    }
}
