package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzes {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};

    public static String zza(int i9, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String zzb(int i9, boolean z8, int i10, int i11, int[] iArr, int i12) {
        char c9;
        int i13;
        String str = zzc[i9];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (true != z8) {
            c9 = 'L';
        } else {
            c9 = 'H';
        }
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", str, valueOf, valueOf2, Character.valueOf(c9), Integer.valueOf(i12)));
        int i14 = 6;
        while (true) {
            if (i14 <= 0) {
                break;
            }
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (i13 = 0; i13 < i14; i13++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb.toString();
    }

    public static byte[] zzc(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = new byte[i10 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i9, bArr2, 4, i10);
        return bArr2;
    }
}
