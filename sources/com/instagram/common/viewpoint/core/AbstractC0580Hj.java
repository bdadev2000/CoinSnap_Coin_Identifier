package com.instagram.common.viewpoint.core;

import android.util.Pair;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0580Hj {
    public static byte[] A00;
    public static String[] A01 = {"hgkv3K5D7LUdfYtfghp3vny7W6PJ75x1", "5OxuqdKIp2nP9LR2zHzFDLENZioxECvO", "CAnbNdwyZNAIqQCRG3atCxjTS11tGtep", "nI9Q0c0eZRrT7faNpsYhcG", "wvdDgPhEetLkfVyUXU5OqcDmpJOXplEG", "lkGhosMNtvxo3OcAc0XPmTZNlf43dohM", "7WCwK6uLOSx7G5D82H1RtAFjcLrdRlkB", "N3LI1K8U1EAyrNNyoXaRNfYZq4euqJJf"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].length() == 9) {
                throw new RuntimeException();
            }
            A01[0] = "te1WrCSgggsWDMNxGrks3ULWi6FlwITL";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 52);
            i5++;
        }
    }

    public static void A05() {
        A00 = new byte[]{53, 14, 19, 21, 16, 16, 15, 18, 20, 5, 4, 64, 1, 21, 4, 9, 15, 64, 15, 2, 10, 5, 3, 20, 64, 20, 25, 16, 5, 90, 64, 113, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, 4, 65, 84, 103, 75, 74, 66, 77, 67, 30, 4};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(I3 i3) {
        int A042 = i3.A04(5);
        if (A042 == 31) {
            int audioObjectType = i3.A04(6);
            return audioObjectType + 32;
        }
        return A042;
    }

    public static int A01(I3 i3) {
        int A042 = i3.A04(4);
        if (A042 == 15) {
            int frequencyIndex = i3.A04(24);
            return frequencyIndex;
        }
        AbstractC0576Hf.A03(A042 < 13);
        int frequencyIndex2 = A04[A042];
        return frequencyIndex2;
    }

    public static Pair<Integer, Integer> A02(I3 i3, boolean z2) throws A0 {
        int A002 = A00(i3);
        int channelConfiguration = A01(i3);
        int sampleRate = i3.A04(4);
        if (A002 == 5 || A002 == 29) {
            channelConfiguration = A01(i3);
            A002 = A00(i3);
            if (A002 == 22) {
                sampleRate = i3.A04(4);
            }
        }
        if (z2) {
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
                    A06(i3, A002, sampleRate);
                    switch (A002) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int epConfig = i3.A04(2);
                            if (epConfig == 2 || epConfig == 3) {
                                throw new A0(A04(31, 22, 16) + epConfig);
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
                    throw new A0(A04(0, 31, 84) + A002);
            }
        }
        int channelCount = A03[sampleRate];
        AbstractC0576Hf.A03(channelCount != -1);
        return Pair.create(Integer.valueOf(channelConfiguration), Integer.valueOf(channelCount));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws A0 {
        return A02(new I3(bArr), false);
    }

    public static void A06(I3 i3, int i2, int i4) {
        i3.A08(1);
        if (i3.A0F()) {
            i3.A08(14);
        }
        boolean dependsOnCoreDecoder = i3.A0F();
        if (i4 != 0) {
            if (i2 == 6 || i2 == 20) {
                i3.A08(3);
            }
            if (dependsOnCoreDecoder) {
                if (i2 == 22) {
                    i3.A08(16);
                }
                if (A01[1].charAt(24) != 'Z') {
                    throw new RuntimeException();
                }
                A01[3] = "4px";
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    i3.A08(3);
                }
                i3.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[A02.length + i3];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        System.arraycopy(bArr, i2, bArr2, nalUnit2.length, i3);
        return bArr2;
    }
}
