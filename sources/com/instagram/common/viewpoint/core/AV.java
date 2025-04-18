package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class AV {
    public static byte[] A00;
    public static String[] A01 = {"feKkTIGaKBzYly9JWp1UGSpJz", "JpaSPsw5bhSGcni6SunY9qE9XqqxOTB4", "FdOEv1spqmDR0S1eel7tXx2JiMt3s7CT", "r67N7OmmUfE7C5kYOwS37DJ2khtydzMF", "kr3JWI8OgoIha1qlRfFHcWBfXWb0v", "RBj3wIWlApOb1m0jvRLNALJUkjzpgsHR", "X8Xzq1UvYCBYzPt3qtZ0CSa2Q2yi8g5o", "c5elHHscTrd0Xh0UaNxMEpwYBzse3bvH"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A07(I4 i4, String str, String str2, DrmInitData drmInitData) {
        int i2 = A05[(i4.A0E() & Opcodes.CHECKCAST) >> 6];
        int A0E = i4.A0E();
        int i3 = A04[(A0E & 56) >> 3];
        if ((A0E & 4) != 0) {
            i3++;
        }
        return Format.A07(str, A0A(0, 9, 27), null, -1, -1, i3, i2, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Format A08(I4 i4, String str, String str2, DrmInitData drmInitData) {
        i4.A0Z(2);
        int i2 = A05[(i4.A0E() & Opcodes.CHECKCAST) >> 6];
        int A0E = i4.A0E();
        int i3 = A04[(A0E & 14) >> 1];
        if ((A0E & 1) != 0) {
            i3++;
        }
        if (((i4.A0E() & 30) >> 1) > 0 && (i4.A0E() & 2) != 0) {
            i3 += 2;
        }
        String A0A = A0A(9, 10, 9);
        if (i4.A04() > 0 && (i4.A0E() & 1) != 0) {
            A0A = A0A(19, 14, 6);
        }
        if (A01[4].length() != 29) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "hD3DRaYZXSMOR9zyDUbj39jX2JJ2nHPn";
        strArr[1] = "v3z9M6fGZsIfOS8Dc7RRmNft5mWEgAHm";
        return Format.A07(str, A0A, null, -1, -1, i3, i2, null, drmInitData, 0, str2);
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-84, -64, -81, -76, -70, 122, -84, -82, 126, -102, -82, -99, -94, -88, 104, -98, -102, -100, 108, -105, -85, -102, -97, -91, 101, -101, -105, -103, 105, 99, -96, -91, -103};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};
        A07 = new int[]{69, 87, 104, Opcodes.LSHL, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int halfFrmsizecod = A05.length;
        if (i2 >= halfFrmsizecod || i3 < 0) {
            return -1;
        }
        int halfFrmsizecod2 = A07.length;
        if (i4 >= halfFrmsizecod2) {
            return -1;
        }
        int i5 = A05[i2];
        if (i5 == 44100) {
            int halfFrmsizecod3 = i3 % 2;
            return (A07[i4] + halfFrmsizecod3) * 2;
        }
        int[] iArr = A02;
        if (A01[0].length() == 25) {
            String[] strArr = A01;
            strArr[5] = "z2kqD8LOBdJ7Jqq56i3U3gKvsmG5ydnN";
            strArr[1] = "YMMRFpU7Ahc9T1mVgCBm1YbjvN5yyMtc";
            int sampleRate = iArr[i4];
            if (i5 == 32000) {
                int halfFrmsizecod4 = sampleRate * 6;
                return halfFrmsizecod4;
            }
            int i6 = sampleRate * 4;
            if (A01[2].charAt(5) != 89) {
                A01[3] = "t1FH6FzkE8u1jEcLtoSWphmlT7OPpQP7";
                return i6;
            }
        }
        throw new RuntimeException();
    }

    public static int A02(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i2 = startIndex - 10;
        for (int i3 = position; i3 <= i2; i3++) {
            int startIndex2 = i3 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i3 - position;
            }
        }
        String[] strArr = A01;
        String str = strArr[5];
        String str2 = strArr[1];
        int endIndex2 = str.charAt(24);
        int startIndex3 = str2.charAt(24);
        if (endIndex2 == startIndex3) {
            throw new RuntimeException();
        }
        A01[7] = "r38b7CGA0ZL34koDTyhy3Bv0CTT7Kabk";
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i2 = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i2 = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i2 * 256;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i2) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i2) + 7) & UnsignedBytes.MAX_VALUE) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & Utf8.REPLACEMENT_BYTE;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & UnsignedBytes.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x02b5, code lost:
    
        if (r11 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02b7, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02be, code lost:
    
        if (r19.A0F() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02c0, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c7, code lost:
    
        if (r19.A0F() == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c9, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02d0, code lost:
    
        if (r19.A0F() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d2, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d9, code lost:
    
        if (r19.A0F() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02db, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e2, code lost:
    
        if (r19.A0F() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e4, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02eb, code lost:
    
        if (r19.A0F() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f1, code lost:
    
        if (r19.A0F() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02f3, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f6, code lost:
    
        r11 = r19.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0305, code lost:
    
        if (com.instagram.common.viewpoint.core.AV.A01[0].length() == 25) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0307, code lost:
    
        com.instagram.common.viewpoint.core.AV.A01[3] = "qJzivxaQKyIBuYFA9MtvwwNWCqeYoXjr";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x030e, code lost:
    
        if (r11 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0310, code lost:
    
        r19.A08(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033d, code lost:
    
        com.instagram.common.viewpoint.core.AV.A01[4] = "1LYtBwQIYeIEBcVIN3d1egxpsMHGR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0344, code lost:
    
        if (r11 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0347, code lost:
    
        if (r11 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        if (r13 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0156, code lost:
    
        r19.A08(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0352, code lost:
    
        if (r13 != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.AU A09(com.instagram.common.viewpoint.core.I3 r19) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AV.A09(com.facebook.ads.redexgen.X.I3):com.facebook.ads.redexgen.X.AU");
    }
}
