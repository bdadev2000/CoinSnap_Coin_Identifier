package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class zzfxq extends zzfyh implements zzfzz {
    public zzfxq(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public /* bridge */ /* synthetic */ Collection zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final Collection zzb(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    public final Collection zzc(Object obj, Collection collection) {
        return zzh(obj, (List) collection, null);
    }
}
