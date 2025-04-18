package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* loaded from: classes3.dex */
final class zzbty extends zzbtu {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbty(zzbud zzbudVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
