package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

@RequiresApi
/* loaded from: classes3.dex */
public final class zzbks extends zzbku {
    private final OnH5AdsEventListener zza;

    public zzbks(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
