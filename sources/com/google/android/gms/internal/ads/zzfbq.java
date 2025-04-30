package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfbq implements zzexw {
    private final zzgge zza;

    public zzfbq(zzgge zzggeVar) {
        this.zza = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzJ);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzK)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzcn.zza(str2));
                        }
                    }
                }
                return new zzfbr(hashMap);
            }
        });
    }
}
