package com.mbridge.msdk.thrid.okio;

import eb.j;

/* loaded from: classes4.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static long size(String str) {
        return size(str, 0, str.length());
    }

    public static long size(String str, int i10, int i11) {
        long j3;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(j.i("beginIndex < 0: ", i10));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder m10 = a4.j.m("endIndex > string.length: ", i11, " > ");
                m10.append(str.length());
                throw new IllegalArgumentException(m10.toString());
            }
            long j10 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt < 128) {
                    j10++;
                } else {
                    if (charAt < 2048) {
                        j3 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        j3 = 3;
                    } else {
                        int i12 = i10 + 1;
                        char charAt2 = i12 < i11 ? str.charAt(i12) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j10++;
                            i10 = i12;
                        } else {
                            j10 += 4;
                            i10 += 2;
                        }
                    }
                    j10 += j3;
                }
                i10++;
            }
            return j10;
        }
        throw new IllegalArgumentException(a4.j.e("endIndex < beginIndex: ", i11, " < ", i10));
    }
}
