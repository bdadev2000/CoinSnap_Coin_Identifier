package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public abstract class zzcq {
    private static zzcq zza = new zzcp();

    public static synchronized zzcq zza() {
        zzcq zzcqVar;
        synchronized (zzcq.class) {
            zzcqVar = zza;
        }
        return zzcqVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
