package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzerq implements zzexw {
    private final Executor zza;
    private final zzcby zzb;

    public zzerq(Executor executor, zzcby zzcbyVar) {
        this.zza = executor;
        this.zzb = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcJ)).booleanValue()) {
            return zzgft.zzh(null);
        }
        return zzgft.zzm(this.zzb.zzk(), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzexv() { // from class: com.google.android.gms.internal.ads.zzero
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
