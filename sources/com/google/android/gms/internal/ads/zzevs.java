package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzevs implements zzevz {
    private final boolean zza;

    public zzevs(@Nullable zzfco zzfcoVar) {
        this.zza = zzfcoVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzh(this.zza ? new zzevy() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
