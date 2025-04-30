package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcur implements zzcus {
    private final Map zza;

    public zzcur(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcus
    @Nullable
    public final zzehl zza(int i9, String str) {
        return (zzehl) this.zza.get(str);
    }
}
