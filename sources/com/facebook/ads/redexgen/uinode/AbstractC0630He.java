package com.facebook.ads.redexgen.uinode;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0630He {
    public static byte[] A00;
    public static String[] A01 = {"hLuAeVo", "xAd", "BycTw1zmUt42SK9Tl7PmiYbTXOv2h", "PsetfG6yciY5a2BvCaZ", "D9JCYa2SYwqlcDmoI8QxkPMLQh1jrwYx", "z42CWN0IsG1EBL", "CLFdSzfEbp5p3IaxEHP", "w1O1Tcjq0FMnxE"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 120);
            String[] strArr = A01;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dt6";
            strArr2[2] = "OnDLvfdZPAa4wnGN2lHsysDkDPPP1";
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{56, 81, 86, 88, 83, 83, 82, 85, 87, 72, 71, 3, 68, 88, 71, 76, 82, 3, 82, 69, 77, 72, 70, 87, 3, 87, 92, 83, 72, Ascii.GS, 3, 53, 78, 83, 85, 80, 80, 79, 82, 84, 69, 68, 0, 69, 80, 35, 79, 78, 70, 73, 71, Ascii.SUB, 0};
        String[] strArr = A01;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "c3c";
        strArr2[2] = "iYeoIjHtwrae0f23gr6EBkw9G0Kfv";
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C0650Hy c0650Hy) {
        int A042 = c0650Hy.A04(5);
        if (A042 == 31) {
            int audioObjectType = c0650Hy.A04(6);
            return audioObjectType + 32;
        }
        return A042;
    }

    public static int A01(C0650Hy c0650Hy) {
        int A042 = c0650Hy.A04(4);
        if (A042 == 15) {
            int frequencyIndex = c0650Hy.A04(24);
            return frequencyIndex;
        }
        AbstractC0626Ha.A03(A042 < 13);
        int frequencyIndex2 = A04[A042];
        return frequencyIndex2;
    }

    public static Pair<Integer, Integer> A02(C0650Hy c0650Hy, boolean z10) throws C04599v {
        int A002 = A00(c0650Hy);
        int A012 = A01(c0650Hy);
        int channelConfiguration = c0650Hy.A04(4);
        if (A002 == 5 || A002 == 29) {
            A012 = A01(c0650Hy);
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[4];
            int sampleRate = str.length();
            int audioObjectType = str2.length();
            if (sampleRate == audioObjectType) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "JGW5XGvoVK0qP1";
            strArr2[5] = "AxLOy3pO6f4GWD";
            A002 = A00(c0650Hy);
            if (A002 == 22) {
                channelConfiguration = c0650Hy.A04(4);
            }
        }
        if (z10) {
            switch (A002) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(c0650Hy, A002, channelConfiguration);
                    switch (A002) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int epConfig = c0650Hy.A04(2);
                            if (epConfig == 2 || epConfig == 3) {
                                throw new C04599v(A04(31, 22, 104) + epConfig);
                            }
                            break;
                    }
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw new C04599v(A04(0, 31, 107) + A002);
            }
        }
        int channelCount = A03[channelConfiguration];
        AbstractC0626Ha.A03(channelCount != -1);
        return Pair.create(Integer.valueOf(A012), Integer.valueOf(channelCount));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws C04599v {
        return A02(new C0650Hy(bArr), false);
    }

    public static void A06(C0650Hy c0650Hy, int i10, int i11) {
        c0650Hy.A08(1);
        if (c0650Hy.A0F()) {
            c0650Hy.A08(14);
        }
        boolean A0F = c0650Hy.A0F();
        String[] strArr = A01;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "nlb";
        strArr2[2] = "S8LKkeIYdF4OoMAzerSloF9wgi0dm";
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                c0650Hy.A08(3);
            }
            if (A0F) {
                if (i10 == 22) {
                    String[] strArr3 = A01;
                    if (strArr3[0].length() != strArr3[4].length()) {
                        String[] strArr4 = A01;
                        strArr4[6] = "BiS0DBnBbJBeAmhr68B";
                        strArr4[3] = "FFiJeWYvMIC9W9Y4RTY";
                        c0650Hy.A08(16);
                    } else {
                        String[] strArr5 = A01;
                        strArr5[7] = "qOSfS5LOAo7Xl2";
                        strArr5[5] = "vocqRDobCtB3dP";
                        c0650Hy.A08(16);
                    }
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    c0650Hy.A08(3);
                }
                c0650Hy.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = A02;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }
}
