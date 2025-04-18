package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class DC {
    public static byte[] A02;
    public static String[] A03 = {"bNHe44ulArk1xcRYAVyHtoGKVU", "QD", "aMTE8ODS1fB3wUoSeM6Q2gidKTvMoW4X", "4fY6lb", "", "aWVrp0mKdoUjEw5SYp1JNmLVN3TGGrgB", "smiAt4f5K0wNgaKDUiJHJwFhj8HF310X", "AdX7FICxySrq9cdTZMKXjUqVSoNzVC1J"};
    public final List<Format> A00;
    public final C9[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{116, 83, 75, 92, 81, 84, 89, 29, 94, 81, 82, 78, 88, 89, 29, 94, 92, 77, 73, 84, 82, 83, 29, 80, 84, 80, 88, 29, 73, 68, 77, 88, 29, 77, 79, 82, 75, 84, 89, 88, 89, 7, 29, 58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 56, 62, 58, 118, 109, 107, 99, 113, 96, 96, 124, 121, 115, 113, 100, 121, Byte.MAX_VALUE, 126, Utf8.REPLACEMENT_BYTE, 115, 117, 113, 61, 39, 32, 40};
        String[] strArr = A03;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "JlzGEhMpBCn7kPvihI6A0OtqgZKGmN9X";
        strArr2[2] = "Z5Nu5Vsju66DFZXsBOeO580LAuIeU0sX";
    }

    static {
        A01();
    }

    public DC(List<Format> closedCaptionFormats) {
        this.A00 = closedCaptionFormats;
        this.A01 = new C9[closedCaptionFormats.size()];
    }

    public final void A02(long j2, I4 i4) {
        G3.A03(j2, i4, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(com.instagram.common.viewpoint.core.InterfaceC0457Bz r16, com.instagram.common.viewpoint.core.DH r17) {
        /*
            r15 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.C9[] r0 = r15.A01
            int r0 = r0.length
            if (r2 >= r0) goto L80
            r17.A05()
            int r1 = r17.A03()
            r0 = 3
            r3 = r16
            com.facebook.ads.redexgen.X.C9 r1 = r3.AHA(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r15.A00
            java.lang.Object r5 = r0.get(r2)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r5 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r5
            java.lang.String r8 = r5.A0O
            r4 = 43
            r3 = 19
            r0 = 23
            java.lang.String r0 = A00(r4, r3, r0)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L3e
            r4 = 62
            r3 = 19
            r0 = 92
            java.lang.String r0 = A00(r4, r3, r0)
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L7e
        L3e:
            r7 = 1
        L3f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r4 = 0
            r3 = 43
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A00(r4, r3, r0)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.instagram.common.viewpoint.core.AbstractC0576Hf.A05(r7, r0)
            java.lang.String r0 = r5.A0M
            if (r0 == 0) goto L79
            java.lang.String r7 = r5.A0M
        L62:
            int r11 = r5.A0D
            java.lang.String r12 = r5.A0N
            int r13 = r5.A03
            r9 = 0
            r10 = -1
            r14 = 0
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.internal.exoplayer2.thirdparty.Format.A08(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A69(r0)
            com.facebook.ads.redexgen.X.C9[] r0 = r15.A01
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1
        L79:
            java.lang.String r7 = r17.A04()
            goto L62
        L7e:
            r7 = 0
            goto L3f
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.DC.A03(com.facebook.ads.redexgen.X.Bz, com.facebook.ads.redexgen.X.DH):void");
    }
}
