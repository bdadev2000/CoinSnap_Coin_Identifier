package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class C3 {
    public static byte[] A07;
    public static String[] A08 = {"6kStEXL0N53GFq3V1gqexDowqRHYGeCf", "GvacQN", "vwcu66U", "A1GXyDBA", "87T5d6sd1ik", "wZXLMf", "Pesi6L7S5NgS5H9VNXNfznCxhERgloSD", "i5d"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{87, 67, 82, 95, 89, 25, 91, 70, 83, 81, 24, 12, 29, 16, 22, 86, 20, 9, 28, 30, 84, 53, 72, 66, 86, 71, 74, 76, 12, 78, 83, 70, 68, 14, 111, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A04(int i2, C3 c3) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & (-2097152)) != -2097152) {
            return false;
        }
        int i8 = (i2 >>> 19) & 3;
        if (A08[4].length() == 11) {
            String[] strArr = A08;
            strArr[0] = "RiUw1eqoDvBahj8V6TDcRS8iwH7eOScG";
            strArr[6] = "kmp5wJKEvw6YmujV2HYKRga0mutSjdRV";
            if (i8 == 1) {
                return false;
            }
            int i9 = (i2 >>> 17) & 3;
            String[] strArr2 = A08;
            if (strArr2[2].length() == strArr2[3].length()) {
                throw new RuntimeException();
            }
            A08[7] = "sO7yywxLPUYvKcLMkDALEGxaOlT";
            if (i9 == 0 || (i3 = (i2 >>> 12) & 15) == 0 || i3 == 15 || (i4 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            int i10 = A0E[i4];
            if (i8 == 2) {
                i10 /= 2;
            } else if (i8 == 0) {
                i10 /= 4;
            }
            int i11 = i2 >>> 9;
            if (A08[4].length() == 11) {
                String[] strArr3 = A08;
                strArr3[0] = "VOyNOfFo7BnWiNbVlgRj6mnxWRwbIkpB";
                strArr3[6] = "81RrLaAoVLspvvFVdtLQ2olTPTjFw09L";
                int i12 = i11 & 1;
                if (i9 == 3) {
                    i5 = i8 == 3 ? A09[i3 - 1] : A0D[i3 - 1];
                    i7 = (((i5 * 12000) / i10) + i12) * 4;
                    i6 = 384;
                    String[] strArr4 = A08;
                    if (strArr4[2].length() == strArr4[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A08;
                    strArr5[2] = "h6mf2Ke";
                    strArr5[3] = "gfVBXOvo";
                } else {
                    if (i8 == 3) {
                        i5 = i9 == 2 ? A0A[i3 - 1] : A0B[i3 - 1];
                        i6 = 1152;
                        i7 = ((144000 * i5) / i10) + i12;
                    } else {
                        i5 = A0C[i3 - 1];
                        i6 = i9 == 1 ? 576 : 1152;
                        i7 = (((i9 == 1 ? 72000 : 144000) * i5) / i10) + i12;
                    }
                }
                c3.A03(i8, A0F[3 - i9], i7, i10, ((i2 >> 6) & 3) == 3 ? 1 : 2, i5 * 1000, i6);
                return true;
            }
        }
        throw new RuntimeException();
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 127), A01(23, 13, 37), A01(0, 10, 48)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 288, 320, 352, 384, 416, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, Opcodes.D2F, Opcodes.IF_ICMPNE, Opcodes.ARETURN, Opcodes.CHECKCAST, 224, 256};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.D2F, Opcodes.IF_ICMPNE};
    }

    public static int A00(int i2) {
        int padding;
        int bitrateIndex;
        int layer;
        int i3;
        int i4;
        int version;
        if ((i2 & (-2097152)) != -2097152 || (padding = (i2 >>> 19) & 3) == 1 || (bitrateIndex = (i2 >>> 17) & 3) == 0 || (layer = (i2 >>> 12) & 15) == 0 || layer == 15 || (i3 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i5 = A0E[i3];
        if (A08[4].length() == 11) {
            String[] strArr = A08;
            strArr[0] = "SACavNzUqDihaCCVBwhZqH9dgMV7CCgo";
            strArr[6] = "NGXmQ6vSzJX8uyjVaek6YMFly75gW1GO";
            if (padding == 2) {
                i5 /= 2;
            } else if (padding == 0) {
                i5 /= 4;
            }
            int i6 = (i2 >>> 9) & 1;
            if (bitrateIndex == 3) {
                if (padding == 3) {
                    int[] iArr = A09;
                    String[] strArr2 = A08;
                    String str = strArr2[2];
                    String str2 = strArr2[3];
                    int length = str.length();
                    int version2 = str2.length();
                    if (length != version2) {
                        String[] strArr3 = A08;
                        strArr3[1] = "i4D7hx";
                        strArr3[5] = "J2Oys6";
                        int version3 = layer - 1;
                        version = iArr[version3];
                    } else {
                        int version4 = layer - 1;
                        version = iArr[version4];
                    }
                } else {
                    int[] iArr2 = A0D;
                    int layer2 = layer - 1;
                    String[] strArr4 = A08;
                    String str3 = strArr4[1];
                    String str4 = strArr4[5];
                    int bitrate = str3.length();
                    int version5 = str4.length();
                    if (bitrate == version5) {
                        String[] strArr5 = A08;
                        strArr5[0] = "C0vPmVzFtdLa424VF7oLSPXdFv7JPKYl";
                        strArr5[6] = "qJ70LKr8xHxcQctVJa4tIMefqwiAYJOB";
                        version = iArr2[layer2];
                    }
                }
                return (((version * 12000) / i5) + i6) * 4;
            }
            if (padding == 3) {
                if (bitrateIndex == 2) {
                    int version6 = layer - 1;
                    i4 = A0A[version6];
                } else {
                    int version7 = layer - 1;
                    i4 = A0B[version7];
                }
            } else {
                int[] iArr3 = A0C;
                String[] strArr6 = A08;
                String str5 = strArr6[2];
                String str6 = strArr6[3];
                int length2 = str5.length();
                int version8 = str6.length();
                if (length2 != version8) {
                    A08[4] = "atDS8UAgb8L";
                    int version9 = layer - 1;
                    i4 = iArr3[version9];
                }
            }
            if (padding == 3) {
                int version10 = 144000 * i4;
                return (version10 / i5) + i6;
            }
            int version11 = bitrateIndex == 1 ? 72000 : 144000;
            return ((version11 * i4) / i5) + i6;
        }
        throw new RuntimeException();
    }

    private void A03(int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        this.A05 = i2;
        this.A06 = str;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A04 = i7;
    }
}
