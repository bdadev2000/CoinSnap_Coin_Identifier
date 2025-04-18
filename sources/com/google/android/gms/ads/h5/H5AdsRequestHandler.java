package com.google.android.gms.ads.h5;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbkx;

/* loaded from: classes3.dex */
public final class H5AdsRequestHandler {
    private final zzbkx zza;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbkx(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return zzbkx.zzc(str);
    }
}
