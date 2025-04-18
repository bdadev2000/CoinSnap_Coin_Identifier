package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* loaded from: classes3.dex */
public final class zzbcp {
    public static Object zza(zzfxg zzfxgVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzfxgVar.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
