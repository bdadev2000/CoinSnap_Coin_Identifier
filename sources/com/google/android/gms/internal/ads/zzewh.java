package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzewh implements zzexw {

    @Nullable
    private final Bundle zza;

    public zzewh(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzh(new zzewi(this.zza));
    }
}
