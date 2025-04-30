package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzfw implements zzer {
    @Override // com.google.android.gms.internal.ads.zzer
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final zzfb zzb(Looper looper, @Nullable Handler.Callback callback) {
        return new zzfz(new Handler(looper, callback));
    }
}
