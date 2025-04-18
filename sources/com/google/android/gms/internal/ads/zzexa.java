package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzexa implements zzexh {
    private final boolean zza;

    public zzexa(@Nullable zzfec zzfecVar) {
        this.zza = zzfecVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzh(this.zza ? new zzexg() { // from class: com.google.android.gms.internal.ads.zzewz
            @Override // com.google.android.gms.internal.ads.zzexg
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
