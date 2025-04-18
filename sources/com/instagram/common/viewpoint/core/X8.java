package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X8 implements InterfaceC0570Gz {
    public static byte[] A03;
    public static String[] A04 = {"Ne7ZKUe", "PSO0U5rzFo7bmFbA9aIaTCLs4C45Ec76", "n2YcQoEvp", "A0Q5ZUOPoOCVUrviysnzG", "zb5q8BZfDBvmVPM7uFOoyQTMVCraB8xF", "52iGK0t26yzfPfzglwEyvTsLNRy5L", "Ycsm2ZrfC0lohk9KjHhsrMWfSuRqw1L2", "37ez3Sl1APBPbLkl98B7sVpsTL4MR"};
    public int A00;
    public H3 A01;
    public byte[] A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{11, 115, 42, 41, 59, 45, 126, 124, 89, 110, 110, 115, 110, 60, 107, 116, 117, 112, 121, 60, 108, 125, 110, 111, 117, 114, 123, 60, 94, 125, 111, 121, 42, 40, 60, 121, 114, Byte.MAX_VALUE, 115, 120, 121, 120, 60, 111, 104, 110, 117, 114, 123, 38, 60, 2, 4, 122, 22, 4, 20, 30, 30, 69, 126, 117, 104, 96, 117, 115, 100, 117, 116, 48, 69, 66, 89, 48, 118, Byte.MAX_VALUE, 98, 125, 113, 100, 42, 48, 88, 99, 126, 120, 125, 125, 98, Byte.MAX_VALUE, 121, 104, 105, 45, 126, 110, 101, 104, 96, 104, 55, 45, 118, 115, 102, 115};
    }

    static {
        A01();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final Uri A8c() {
        if (this.A01 == null) {
            return null;
        }
        H3 h3 = this.A01;
        if (A04[0].length() == 15) {
            throw new RuntimeException();
        }
        A04[2] = "GK7vJTRqbjO3";
        return h3.A04;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final long AEE(H3 h3) throws IOException {
        this.A01 = h3;
        Uri uri = h3.A04;
        String scheme = uri.getScheme();
        if (A00(102, 4, 94).equals(scheme)) {
            String[] uriParts = IK.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 107));
            if (uriParts.length == 2) {
                String str = uriParts[1];
                String dataString = uriParts[0];
                if (dataString.contains(A00(1, 7, 4))) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        String scheme2 = A00(8, 43, 80) + str;
                        throw new A0(scheme2, e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, A00(51, 8, 27)).getBytes();
                }
                return this.A02.length;
            }
            String scheme3 = A00(59, 23, 92) + uri;
            throw new A0(scheme3);
        }
        String scheme4 = A00(82, 20, 65) + scheme;
        throw new A0(scheme4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0570Gz
    public final int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int length = this.A02.length;
        if (A04[2].length() == 11) {
            throw new RuntimeException();
        }
        A04[0] = "UkFdkMsPJijR7VnNGK8H6arT";
        int i4 = length - this.A00;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        byte[] bArr2 = this.A02;
        int remainingBytes = this.A00;
        System.arraycopy(bArr2, remainingBytes, bArr, i2, min);
        int remainingBytes2 = this.A00;
        this.A00 = remainingBytes2 + min;
        return min;
    }
}
