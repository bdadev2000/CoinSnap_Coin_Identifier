package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public abstract class zzcy {
    private static zzcy zza = new zzcx();

    public static synchronized zzcy zza() {
        zzcy zzcyVar;
        synchronized (zzcy.class) {
            zzcyVar = zza;
        }
        return zzcyVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
