package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes2.dex */
public final class zzfsw {
    private final zzbac zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfsw(@NonNull zzbac zzbacVar, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.zza = zzbacVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzbac zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j7) {
        if (this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] zze() {
        /*
            r9 = this;
            byte[] r0 = r9.zze
            r1 = 0
            if (r0 != 0) goto L56
            java.io.File r0 = r9.zzd
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r3 = 256(0x100, float:3.59E-43)
        L13:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r5 = 0
            r6 = r5
        L17:
            if (r6 >= r3) goto L27
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            r8 = -1
            if (r7 != r8) goto L23
            goto L27
        L23:
            int r6 = r6 + r7
            goto L17
        L25:
            r0 = move-exception
            goto L48
        L27:
            if (r6 != 0) goto L2b
            r4 = r1
            goto L2f
        L2b:
            com.google.android.gms.internal.ads.zzhac r4 = com.google.android.gms.internal.ads.zzhac.zzv(r4, r5, r6)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
        L2f:
            if (r4 != 0) goto L3d
            com.google.android.gms.internal.ads.zzhac r0 = com.google.android.gms.internal.ads.zzhac.zzu(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            byte[] r0 = r0.zzB()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L54
        L3d:
            r0.add(r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L50
            goto L13
        L48:
            r1 = r2
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L4f:
            r2 = r1
        L50:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r0 = r1
        L54:
            r9.zze = r0
        L56:
            byte[] r0 = r9.zze
            if (r0 != 0) goto L5b
            return r1
        L5b:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsw.zze():byte[]");
    }
}
