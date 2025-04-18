package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcrs implements zzcrt {
    private final Map zza;

    public zzcrs(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    @Nullable
    public final zzefb zza(int i10, String str) {
        return (zzefb) this.zza.get(str);
    }
}
