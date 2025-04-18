package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes4.dex */
public final class zzbcx {
    public static Object zza(zzfyp zzfypVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfypVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
