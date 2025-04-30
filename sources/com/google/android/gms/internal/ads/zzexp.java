package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzexp implements zzexw {
    private final boolean zza;

    public zzexp(@Nullable zzfeo zzfeoVar) {
        this.zza = zzfeoVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        zzexv zzexvVar;
        if (this.zza) {
            zzexvVar = new zzexv() { // from class: com.google.android.gms.internal.ads.zzexo
                @Override // com.google.android.gms.internal.ads.zzexv
                public final void zzj(Object obj) {
                    ((Bundle) obj).putBoolean("sdk_prefetch", true);
                }
            };
        } else {
            zzexvVar = null;
        }
        return zzgft.zzh(zzexvVar);
    }
}
