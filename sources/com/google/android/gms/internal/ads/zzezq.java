package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzezq implements zzevz {
    private final zzges zza;

    public zzezq(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzezp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzT);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzU)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzci.zza(str2));
                        }
                    }
                }
                return new zzezr(hashMap);
            }
        });
    }
}
