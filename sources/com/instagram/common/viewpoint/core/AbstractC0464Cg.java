package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.Cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0464Cg {
    public static byte[] A00;
    public static String[] A01 = {"mMVqpqBVgrnijMcf07ELsDNcJ24OL2nP", "IP6eS0SEp8gBdkX6C7fdNeLrZWtZ", "Csb6WekrqE", "hqLJz7OFCqwyqI3Xl9C5Yk0lZKMX44EB", "EBI4zKNq1U8AXqXtP1Wxz6Xy4vBMW1iS", "UNFwS5L41LHHq5BQuxA2jKAhYKXr1bOi", "a4BPWy1hEZ", "KDcDYO4g5i7d4XPLwMmGmppr610vo4rD"};

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-17, 18, 18, 7, -32, 19, 14, 12, -12, 19, 8, 11, -47, -22, -17, -15, -20, -20, -21, -18, -16, -31, -32, -100, -20, -17, -17, -28, -100, -14, -31, -18, -17, -27, -21, -22, -74, -100};
    }

    static {
        A03();
    }

    public static C0463Cf A00(byte[] bArr) {
        I4 i4 = new I4(bArr);
        if (i4.A07() < 32) {
            return null;
        }
        i4.A0Y(0);
        int A08 = i4.A08();
        int A04 = i4.A04() + 4;
        if (A01[1].length() == 28) {
            String[] strArr = A01;
            strArr[7] = "8tunoJcFY8sdNkzTV28xZ3mFQC5lH0FH";
            strArr[0] = "RL5PFckm7p773rKwLt1g33yNj7eK7Ab7";
            if (A08 != A04) {
                return null;
            }
            int A082 = i4.A08();
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[2].length()) {
                A01[4] = "I3b4ZRO4hoj0qqQ4bLGuwt50SIh123Br";
                if (A082 != CO.A0r) {
                    return null;
                }
                int A012 = CO.A01(i4.A08());
                if (A012 > 1) {
                    Log.w(A01(0, 12, 70), A01(12, 26, 35) + A012);
                    return null;
                }
                UUID uuid = new UUID(i4.A0L(), i4.A0L());
                if (A012 == 1) {
                    int keyIdCount = i4.A0H();
                    if (A01[4].charAt(17) == 'N') {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A01;
                    strArr3[6] = "srnpLtY0xe";
                    strArr3[2] = "yJ4YGMGdHJ";
                    i4.A0Z(keyIdCount * 16);
                }
                int atomSize = i4.A0H();
                if (atomSize != i4.A04()) {
                    return null;
                }
                byte[] bArr2 = new byte[atomSize];
                i4.A0c(bArr2, 0, atomSize);
                return new C0463Cf(uuid, A012, bArr2);
            }
        }
        throw new RuntimeException();
    }

    public static UUID A02(byte[] bArr) {
        UUID uuid;
        C0463Cf parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            uuid = parsedAtom.A01;
            return uuid;
        }
        return null;
    }
}
