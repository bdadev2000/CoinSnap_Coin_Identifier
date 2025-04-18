package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzgav extends zzfxq {
    final transient zzfxg zza;

    public zzgav(Map map, zzfxg zzfxgVar) {
        super(map);
        this.zza = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq, com.google.android.gms.internal.ads.zzfyh
    public final /* bridge */ /* synthetic */ Collection zza() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfyk
    public final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, com.google.android.gms.internal.ads.zzfyk
    public final Set zzl() {
        return zzm();
    }
}
