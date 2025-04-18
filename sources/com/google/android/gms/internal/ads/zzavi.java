package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
public final class zzavi {
    private NetworkCapabilities zza;

    public zzavi(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzavh(this));
            } catch (RuntimeException unused) {
                synchronized (zzavi.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static zzavi zzc(Context context) {
        if (context != null) {
            return new zzavi((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzavi.class) {
            NetworkCapabilities networkCapabilities = this.zza;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.zza.hasTransport(1)) {
                    return 1L;
                }
                if (this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
