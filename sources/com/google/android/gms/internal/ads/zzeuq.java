package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzeuq implements zzevz {

    @Nullable
    private final Bundle zza;

    public zzeuq(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzh(new zzeur(this.zza));
    }
}
