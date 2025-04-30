package com.mbridge.msdk.thrid.okio;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes3.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static long size(String str) {
        return size(str, 0, str.length());
    }

    public static long size(String str, int i9, int i10) {
        long j7;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(o.h(i9, "beginIndex < 0: "));
        }
        if (i10 >= i9) {
            if (i10 > str.length()) {
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString());
            }
            long j9 = 0;
            while (i9 < i10) {
                char charAt = str.charAt(i9);
                if (charAt < 128) {
                    j9++;
                } else {
                    if (charAt < 2048) {
                        j7 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        j7 = 3;
                    } else {
                        int i11 = i9 + 1;
                        char charAt2 = i11 < i10 ? str.charAt(i11) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j9++;
                            i9 = i11;
                        } else {
                            j9 += 4;
                            i9 += 2;
                        }
                    }
                    j9 += j7;
                }
                i9++;
            }
            return j9;
        }
        throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < "));
    }
}
