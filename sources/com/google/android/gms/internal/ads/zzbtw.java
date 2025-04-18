package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbtw extends zzbzd {
    final /* synthetic */ QueryInfoGenerationCallback zza;

    public zzbtw(zzbtx zzbtxVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbze
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new QueryInfo(new com.google.android.gms.ads.internal.client.zzfa(str, bundle, str2)));
    }
}
