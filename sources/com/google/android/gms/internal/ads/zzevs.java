package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class zzevs implements zzexh {

    @Nullable
    private final Bundle zza;

    public zzevs(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return zzgfo.zzh(new zzevt(this.zza));
    }
}
