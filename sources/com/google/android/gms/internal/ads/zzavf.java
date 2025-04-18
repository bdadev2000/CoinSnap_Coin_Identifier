package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzavf {
    private final ua.b zza;

    public zzavf(final Context context, Executor executor) {
        this.zza = zzgei.zzj(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzave
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                try {
                    return zzfpx.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final ua.b zza() {
        return this.zza;
    }
}
