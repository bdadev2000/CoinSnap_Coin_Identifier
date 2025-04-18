package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* loaded from: classes4.dex */
final class zzbue extends zzbua {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbue(zzbuj zzbujVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbub
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
