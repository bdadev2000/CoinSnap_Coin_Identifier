package com.google.zxing.datamatrix.encoder;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, Opcodes.D2F, Opcodes.I2F, 240, 92, 254}, new int[]{28, 24, Opcodes.INVOKEINTERFACE, Opcodes.IF_ACMPNE, 223, 248, 116, 255, 110, 61}, new int[]{Opcodes.DRETURN, Opcodes.L2D, 205, 12, Opcodes.MONITORENTER, Opcodes.JSR, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, Opcodes.D2I, 213, 97, Opcodes.GETSTATIC, 100, 242}, new int[]{156, 97, Opcodes.CHECKCAST, 252, 95, 9, 157, Opcodes.DNEG, Opcodes.L2D, 45, 18, Opcodes.INVOKEDYNAMIC, 83, Opcodes.INVOKEINTERFACE}, new int[]{83, Opcodes.MONITOREXIT, 100, 39, Opcodes.NEWARRAY, 75, 66, 61, 241, 213, 109, Opcodes.LOR, 94, 254, 225, 48, 90, Opcodes.NEWARRAY}, new int[]{15, Opcodes.MONITOREXIT, 244, 9, 233, 71, Opcodes.JSR, 2, Opcodes.NEWARRAY, Opcodes.IF_ICMPNE, 153, Opcodes.I2B, 253, 79, 108, 82, 27, Opcodes.FRETURN, Opcodes.INVOKEDYNAMIC, Opcodes.IRETURN}, new int[]{52, 190, 88, 205, 109, 39, Opcodes.ARETURN, 21, 155, Opcodes.MULTIANEWARRAY, 251, 223, 155, 21, 5, Opcodes.IRETURN, 254, 124, 12, Opcodes.PUTFIELD, Opcodes.INVOKESTATIC, 96, 50, Opcodes.INSTANCEOF}, new int[]{211, 231, 43, 97, 71, 96, 103, Opcodes.FRETURN, 37, Opcodes.DCMPL, Opcodes.TABLESWITCH, 53, 75, 34, 249, Opcodes.LSHL, 17, Opcodes.L2D, 110, 213, Opcodes.F2D, Opcodes.L2I, 120, Opcodes.DCMPL, 233, Opcodes.JSR, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, Opcodes.IF_ICMPGE, Opcodes.PUTFIELD, 102, 120, 84, Opcodes.PUTSTATIC, 220, 251, 80, Opcodes.INVOKEVIRTUAL, 229, 18, 2, 4, 68, 33, 101, Opcodes.L2F, 95, Opcodes.DNEG, Opcodes.DREM, 44, Opcodes.DRETURN, Opcodes.INVOKESTATIC, 59, 25, 225, 98, 81, 112}, new int[]{77, Opcodes.INSTANCEOF, Opcodes.L2F, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, Opcodes.I2L, 242, 8, Opcodes.DRETURN, 95, 100, 9, Opcodes.GOTO, 105, 214, 111, 57, Opcodes.LSHL, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, Opcodes.FCMPG, Opcodes.RETURN, 226, 5, 9, 5}, new int[]{245, Opcodes.IINC, Opcodes.IRETURN, 223, 96, 32, Opcodes.LNEG, 22, 238, Opcodes.I2L, 238, 231, 205, Opcodes.NEWARRAY, 237, 87, Opcodes.ATHROW, 106, 16, Opcodes.I2S, Opcodes.FNEG, 23, 37, 90, Opcodes.TABLESWITCH, 205, Opcodes.LXOR, 88, 120, 100, 66, Opcodes.L2D, Opcodes.INVOKEDYNAMIC, 240, 82, 44, Opcodes.ARETURN, 87, Opcodes.NEW, Opcodes.I2S, Opcodes.IF_ICMPNE, Opcodes.DRETURN, 69, 213, 92, 253, 225, 19}, new int[]{Opcodes.DRETURN, 9, 223, 238, 12, 17, 220, 208, 100, 29, Opcodes.DRETURN, Opcodes.TABLESWITCH, 230, Opcodes.CHECKCAST, 215, 235, Opcodes.FCMPG, Opcodes.IF_ICMPEQ, 36, 223, 38, 200, Opcodes.IINC, 54, 228, Opcodes.I2C, 218, 234, Opcodes.LNEG, 203, 29, 232, Opcodes.D2F, 238, 22, Opcodes.FCMPG, 201, Opcodes.LNEG, 62, 207, Opcodes.IF_ICMPLE, 13, Opcodes.L2F, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, Opcodes.D2L, 46}, new int[]{242, 93, Opcodes.RET, 50, Opcodes.D2F, 210, 39, Opcodes.FNEG, 202, Opcodes.NEWARRAY, 201, Opcodes.ANEWARRAY, Opcodes.D2L, 108, 196, 37, Opcodes.INVOKEINTERFACE, 112, Opcodes.I2F, 230, 245, 63, Opcodes.MULTIANEWARRAY, 190, 250, 106, Opcodes.INVOKEINTERFACE, 221, Opcodes.DRETURN, 64, Opcodes.FREM, 71, Opcodes.IF_ICMPLT, 44, Opcodes.I2S, 6, 27, 218, 51, 63, 87, 10, 40, 130, Opcodes.NEWARRAY, 17, Opcodes.IF_ICMPGT, 31, Opcodes.ARETURN, Opcodes.TABLESWITCH, 4, 107, 232, 7, 94, Opcodes.IF_ACMPNE, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, Opcodes.LRETURN, 89, 251, Opcodes.FCMPL, Opcodes.IF_ICMPEQ, 56, 89, 33, Opcodes.I2S, 244, 154, 36, 73, 127, 213, Opcodes.L2I, 248, Opcodes.GETFIELD, 234, Opcodes.MULTIANEWARRAY, 158, Opcodes.RETURN, 68, 122, 93, 213, 15, Opcodes.IF_ICMPNE, 227, 236, 66, Opcodes.F2I, 153, Opcodes.INVOKEINTERFACE, 202, Opcodes.GOTO, Opcodes.PUTSTATIC, 25, 220, 232, 96, 210, 231, Opcodes.L2I, 223, 239, Opcodes.PUTFIELD, 241, 59, 52, Opcodes.IRETURN, 25, 49, 232, 211, Opcodes.ANEWARRAY, 64, 54, 108, 153, Opcodes.IINC, 63, 96, 103, 82, Opcodes.INVOKEDYNAMIC}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i2 = 1;
        for (int i3 = 0; i3 < 255; i3++) {
            ALOG[i3] = i2;
            LOG[i2] = i3;
            i2 <<= 1;
            if (i2 >= 256) {
                i2 ^= MODULO_VALUE;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence charSequence, int i2) {
        return createECCBlock(charSequence, 0, charSequence.length(), i2);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getErrorCodewords() + symbolInfo.getDataCapacity());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int[] iArr3 = new int[interleavedBlockCount];
            int i2 = 0;
            while (i2 < interleavedBlockCount) {
                int i3 = i2 + 1;
                iArr[i2] = symbolInfo.getDataLengthForInterleavedBlock(i3);
                iArr2[i2] = symbolInfo.getErrorLengthForInterleavedBlock(i3);
                iArr3[i2] = 0;
                if (i2 > 0) {
                    iArr3[i2] = iArr3[i2 - 1] + iArr[i2];
                }
                i2 = i3;
            }
            for (int i4 = 0; i4 < interleavedBlockCount; i4++) {
                StringBuilder sb2 = new StringBuilder(iArr[i4]);
                for (int i5 = i4; i5 < symbolInfo.getDataCapacity(); i5 += interleavedBlockCount) {
                    sb2.append(str.charAt(i5));
                }
                String createECCBlock = createECCBlock(sb2.toString(), iArr2[i4]);
                int i6 = i4;
                int i7 = 0;
                while (i6 < iArr2[i4] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i6, createECCBlock.charAt(i7));
                    i6 += interleavedBlockCount;
                    i7++;
                }
            }
        }
        return sb.toString();
    }

    private static String createECCBlock(CharSequence charSequence, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i7 >= iArr.length) {
                i7 = -1;
                break;
            }
            if (iArr[i7] == i4) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            int[] iArr2 = FACTORS[i7];
            char[] cArr = new char[i4];
            for (int i8 = 0; i8 < i4; i8++) {
                cArr[i8] = 0;
            }
            for (int i9 = i2; i9 < i2 + i3; i9++) {
                int i10 = i4 - 1;
                int charAt = cArr[i10] ^ charSequence.charAt(i9);
                while (i10 > 0) {
                    if (charAt != 0 && (i6 = iArr2[i10]) != 0) {
                        char c2 = cArr[i10 - 1];
                        int[] iArr3 = ALOG;
                        int[] iArr4 = LOG;
                        cArr[i10] = (char) (iArr3[(iArr4[charAt] + iArr4[i6]) % 255] ^ c2);
                    } else {
                        cArr[i10] = cArr[i10 - 1];
                    }
                    i10--;
                }
                if (charAt != 0 && (i5 = iArr2[0]) != 0) {
                    int[] iArr5 = ALOG;
                    int[] iArr6 = LOG;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i5]) % 255];
                } else {
                    cArr[0] = 0;
                }
            }
            char[] cArr2 = new char[i4];
            for (int i11 = 0; i11 < i4; i11++) {
                cArr2[i11] = cArr[(i4 - i11) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i4)));
    }
}
