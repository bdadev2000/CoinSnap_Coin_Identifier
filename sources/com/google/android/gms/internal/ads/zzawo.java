package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzawo {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    public zzawo(@NonNull Context context, @NonNull Executor executor, @NonNull String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzawn(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzawo zzd(@NonNull Context context, @NonNull Executor executor) {
        return new zzawo(context, executor, zza);
    }

    public final long zzb() {
        long j3 = this.zzd;
        this.zzd = -1L;
        return j3;
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final void zzh() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }
}
