package com.google.android.gms.common;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i9, boolean z8, String str2, Throwable th) {
        this.zza = str;
        this.zzb = z8;
        this.zzc = str2;
        this.zzd = th;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String str, @NonNull String str2, Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String str, int i9) {
        return new PackageVerificationResult(str, i9, true, null, null);
    }

    public final void zzb() {
        if (!this.zzb) {
            String str = this.zzc;
            Throwable th = this.zzd;
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(str));
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
