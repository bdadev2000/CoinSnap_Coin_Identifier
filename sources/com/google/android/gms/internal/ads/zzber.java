package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public final class zzber {
    public static Object zza(zzfyw zzfywVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfywVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
