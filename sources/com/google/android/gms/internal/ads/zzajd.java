package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzajd {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzadu zza(zzacs zzacsVar) throws IOException {
        return zzc(zzacsVar, true, false);
    }

    @Nullable
    public static zzadu zzb(zzacs zzacsVar, boolean z10) throws IOException {
        return zzc(zzacsVar, false, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
    
        return com.google.android.gms.internal.ads.zzaiz.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        if (r25 == r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012e, code lost:
    
        if (r8 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return com.google.android.gms.internal.ads.zzaiu.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
    
        return com.google.android.gms.internal.ads.zzaiu.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        r8 = 1;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzadu zzc(com.google.android.gms.internal.ads.zzacs r24, boolean r25, boolean r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zzc(com.google.android.gms.internal.ads.zzacs, boolean, boolean):com.google.android.gms.internal.ads.zzadu");
    }

    private static boolean zzd(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z10) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = zza;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
