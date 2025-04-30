package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
/* loaded from: classes2.dex */
public final class HexDumpUtils {
    @Nullable
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i9, int i10, boolean z8) {
        int length;
        int i11;
        if (bArr != null && (length = bArr.length) != 0 && i9 >= 0 && i10 > 0 && i9 + i10 <= length) {
            if (z8) {
                i11 = 75;
            } else {
                i11 = 57;
            }
            StringBuilder sb = new StringBuilder(((i10 + 15) / 16) * i11);
            int i12 = i10;
            int i13 = 0;
            int i14 = 0;
            while (i12 > 0) {
                if (i13 == 0) {
                    if (i10 < 65536) {
                        sb.append(String.format("%04X:", Integer.valueOf(i9)));
                    } else {
                        sb.append(String.format("%08X:", Integer.valueOf(i9)));
                    }
                    i14 = i9;
                } else if (i13 == 8) {
                    sb.append(" -");
                }
                sb.append(String.format(" %02X", Integer.valueOf(bArr[i9] & 255)));
                i12--;
                i13++;
                if (z8 && (i13 == 16 || i12 == 0)) {
                    int i15 = 16 - i13;
                    if (i15 > 0) {
                        for (int i16 = 0; i16 < i15; i16++) {
                            sb.append("   ");
                        }
                    }
                    if (i15 >= 8) {
                        sb.append("  ");
                    }
                    sb.append("  ");
                    for (int i17 = 0; i17 < i13; i17++) {
                        char c9 = (char) bArr[i14 + i17];
                        if (c9 < ' ' || c9 > '~') {
                            c9 = '.';
                        }
                        sb.append(c9);
                    }
                }
                if (i13 == 16 || i12 == 0) {
                    sb.append('\n');
                    i13 = 0;
                }
                i9++;
            }
            return sb.toString();
        }
        return null;
    }
}
