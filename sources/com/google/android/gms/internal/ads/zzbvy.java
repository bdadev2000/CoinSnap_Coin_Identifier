package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* loaded from: classes2.dex */
final class zzbvy extends zzbvu {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    public zzbvy(zzbwd zzbwdVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
