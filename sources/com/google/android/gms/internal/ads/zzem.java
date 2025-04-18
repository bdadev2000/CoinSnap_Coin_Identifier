package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzem implements zzdj {
    @Override // com.google.android.gms.internal.ads.zzdj
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final long zzc() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final zzdt zzd(Looper looper, @Nullable Handler.Callback callback) {
        return new zzep(new Handler(looper, callback));
    }
}
