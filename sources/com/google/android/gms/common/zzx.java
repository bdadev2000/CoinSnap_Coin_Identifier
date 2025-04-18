package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.zza = z10;
        this.zzd = i10;
        this.zzb = str;
        this.zzc = th2;
    }

    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    public static zzx zzc(@NonNull String str) {
        return new zzx(false, 1, 5, str, null);
    }

    public static zzx zzd(@NonNull String str, @NonNull Throwable th2) {
        return new zzx(false, 1, 5, str, th2);
    }

    public static zzx zzf(int i10) {
        return new zzx(true, i10, 1, null, null);
    }

    public static zzx zzg(int i10, int i11, @NonNull String str, Throwable th2) {
        return new zzx(false, i10, i11, str, th2);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.zzc != null) {
                Log.d("GoogleCertificatesRslt", zza(), this.zzc);
            } else {
                Log.d("GoogleCertificatesRslt", zza());
            }
        }
    }
}
