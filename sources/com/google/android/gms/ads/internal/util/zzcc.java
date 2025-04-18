package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbuj;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzcc {
    @Deprecated
    public static Object zza(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unexpected exception.", th2);
            zzbuj.zza(context).zzh(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
