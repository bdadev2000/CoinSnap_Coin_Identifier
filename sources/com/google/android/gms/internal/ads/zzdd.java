package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class zzdd {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x022b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ce  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzad r16) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.zza(com.google.android.gms.internal.ads.zzad):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        if (r11.equals("L123") != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x024a  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(java.lang.String r10, java.lang.String[] r11, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzm r12) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.zzb(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzm):android.util.Pair");
    }

    public static String zzc(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzd(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        char c10;
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        if (true != z10) {
            c10 = 'L';
        } else {
            c10 = 'H';
        }
        objArr[3] = Character.valueOf(c10);
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    public static byte[] zze(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
