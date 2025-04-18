package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzctg implements zzcth {
    private final Map zza;

    public zzctg(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcth
    @Nullable
    public final zzegk zza(int i2, String str) {
        return (zzegk) this.zza.get(str);
    }
}
