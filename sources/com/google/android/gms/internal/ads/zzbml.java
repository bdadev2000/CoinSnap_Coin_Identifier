package com.google.android.gms.internal.ads;

import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class zzbml extends zzbmn {
    private final OnH5AdsEventListener zza;

    public zzbml(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
