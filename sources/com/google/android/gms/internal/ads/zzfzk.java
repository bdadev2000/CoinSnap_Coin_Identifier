package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class zzfzk extends zzfyi implements Serializable {
    final Object zza;
    final Object zzb;

    public zzfzk(Object obj, Object obj2) {
        this.zza = obj;
        this.zzb = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object getKey() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object getValue() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyi, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
