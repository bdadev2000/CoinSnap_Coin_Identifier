package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class zzgce extends zzfyz {
    final transient zzfyp zza;

    public zzgce(Map map, zzfyp zzfypVar) {
        super(map);
        this.zza = zzfypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyz, com.google.android.gms.internal.ads.zzfzq
    public final /* bridge */ /* synthetic */ Collection zza() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, com.google.android.gms.internal.ads.zzfzt
    public final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, com.google.android.gms.internal.ads.zzfzt
    public final Set zzl() {
        return zzm();
    }
}
