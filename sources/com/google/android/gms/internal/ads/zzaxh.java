package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
public final class zzaxh {
    private NetworkCapabilities zza;

    public zzaxh(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new zzaxg(this));
            } catch (RuntimeException unused) {
                synchronized (zzaxh.class) {
                    this.zza = null;
                }
            }
        }
    }

    public static zzaxh zzc(Context context) {
        if (context != null) {
            return new zzaxh((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long zza() {
        synchronized (zzaxh.class) {
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }
}
