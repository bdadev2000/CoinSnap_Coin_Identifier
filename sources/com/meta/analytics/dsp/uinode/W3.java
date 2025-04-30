package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W3 implements InterfaceC1187Gu {
    public static byte[] A03;
    public static String[] A04 = {"Qh9bmuunZVNjCxMfQqp1TPZ6eQf7WY7l", "EJ3Pv4RmuS56E2GEtVJWqE7", "JL6QL60SCyNREhkJiPjX9lCI5sSEdh3E", "fY9V1T4K", "nskea9", "zswUenOt1n5zUjvxlDGbljbldmkP", "RjSf", "SzU1Hp8PCROGflUtYYCmDG"};
    public int A00;
    public C1191Gy A01;
    public byte[] A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "HPeuzqUxaD1vBlGbyXeTZfZGNJglEGHQ";
            strArr2[2] = "qkhW3lOqTV0ckWqWQ8OcwzSw2chzxPMS";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 53);
            i12++;
        }
    }

    public static void A01() {
        A03 = new byte[]{Ascii.DEL, 114, 43, 40, 58, 44, Ascii.DEL, 125, Ascii.CAN, 47, 47, 50, 47, 125, 42, 53, 52, 49, 56, 125, 45, 60, 47, 46, 52, 51, 58, 125, Ascii.US, 60, 46, 56, 107, 105, 125, 56, 51, 62, 50, 57, 56, 57, 125, 46, 41, 47, 52, 51, 58, 103, 125, 110, 104, Ascii.SYN, 122, 104, 120, 114, 114, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 95, 88, 67, 42, 108, 101, 120, 103, 107, 126, 48, 42, 55, Ascii.FF, 17, Ascii.ETB, Ascii.DC2, Ascii.DC2, Ascii.CR, Ascii.DLE, Ascii.SYN, 7, 6, 66, 17, 1, 10, 7, Ascii.SI, 7, 88, 66, 1, 4, 17, 4};
    }

    static {
        A01();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final Uri A8E() {
        C1191Gy c1191Gy = this.A01;
        if (c1191Gy != null) {
            return c1191Gy.A04;
        }
        return null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final long ADl(C1191Gy c1191Gy) throws IOException {
        this.A01 = c1191Gy;
        Uri uri = c1191Gy.A04;
        String scheme = uri.getScheme();
        if (A00(102, 4, 80).equals(scheme)) {
            String[] uriParts = IF.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 102));
            if (uriParts.length == 2) {
                String str = uriParts[1];
                String dataString = uriParts[0];
                if (dataString.contains(A00(1, 7, 124))) {
                    try {
                        this.A02 = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e4) {
                        String scheme2 = A00(8, 43, 104) + str;
                        throw new C10259v(scheme2, e4);
                    }
                } else {
                    this.A02 = URLDecoder.decode(str, A00(51, 8, 14)).getBytes();
                }
                return this.A02.length;
            }
            String scheme3 = A00(59, 23, 63) + uri;
            throw new C10259v(scheme3);
        }
        String scheme4 = A00(82, 20, 87) + scheme;
        throw new C10259v(scheme4);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1187Gu
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int length = this.A02.length - this.A00;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i10, length);
        byte[] bArr2 = this.A02;
        int remainingBytes = this.A00;
        System.arraycopy(bArr2, remainingBytes, bArr, i9, min);
        int remainingBytes2 = this.A00;
        this.A00 = remainingBytes2 + min;
        return min;
    }
}
