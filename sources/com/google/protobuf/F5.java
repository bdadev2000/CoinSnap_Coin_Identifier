package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class F5 extends E5 {
    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i9, int i10) {
        int incompleteStateFor;
        int incompleteStateFor2;
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte b = bArr[i9];
            if (b < 0) {
                if (b < -32) {
                    if (i11 >= i10) {
                        return b;
                    }
                    if (b >= -62) {
                        i9 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i11 >= i10 - 1) {
                        incompleteStateFor = I5.incompleteStateFor(bArr, i11, i10);
                        return incompleteStateFor;
                    }
                    int i12 = i9 + 2;
                    byte b8 = bArr[i11];
                    if (b8 <= -65 && ((b != -32 || b8 >= -96) && (b != -19 || b8 < -96))) {
                        i9 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (i11 >= i10 - 2) {
                    incompleteStateFor2 = I5.incompleteStateFor(bArr, i11, i10);
                    return incompleteStateFor2;
                }
                int i13 = i9 + 2;
                byte b9 = bArr[i11];
                if (b9 <= -65) {
                    if ((((b9 + 112) + (b << Ascii.FS)) >> 30) == 0) {
                        int i14 = i9 + 3;
                        if (bArr[i13] <= -65) {
                            i9 += 4;
                            if (bArr[i14] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i9 = i11;
        }
        return 0;
    }

    @Override // com.google.protobuf.E5
    public String decodeUtf8(byte[] bArr, int i9, int i10) throws C1912g3 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i9 | i10 | ((bArr.length - i9) - i10)) >= 0) {
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte b = bArr[i9];
                isOneByte3 = D5.isOneByte(b);
                if (!isOneByte3) {
                    break;
                }
                i9++;
                D5.handleOneByte(b, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i9 < i11) {
                int i14 = i9 + 1;
                byte b8 = bArr[i9];
                isOneByte = D5.isOneByte(b8);
                if (!isOneByte) {
                    isTwoBytes = D5.isTwoBytes(b8);
                    if (!isTwoBytes) {
                        isThreeBytes = D5.isThreeBytes(b8);
                        if (isThreeBytes) {
                            if (i14 < i11 - 1) {
                                int i15 = i9 + 2;
                                i9 += 3;
                                D5.handleThreeBytes(b8, bArr[i14], bArr[i15], cArr, i13);
                                i13++;
                            } else {
                                throw C1912g3.invalidUtf8();
                            }
                        } else if (i14 < i11 - 2) {
                            byte b9 = bArr[i14];
                            int i16 = i9 + 3;
                            byte b10 = bArr[i9 + 2];
                            i9 += 4;
                            D5.handleFourBytes(b8, b9, b10, bArr[i16], cArr, i13);
                            i13 += 2;
                        } else {
                            throw C1912g3.invalidUtf8();
                        }
                    } else if (i14 < i11) {
                        i9 += 2;
                        D5.handleTwoBytes(b8, bArr[i14], cArr, i13);
                        i13++;
                    } else {
                        throw C1912g3.invalidUtf8();
                    }
                } else {
                    int i17 = i13 + 1;
                    D5.handleOneByte(b8, cArr, i13);
                    while (i14 < i11) {
                        byte b11 = bArr[i14];
                        isOneByte2 = D5.isOneByte(b11);
                        if (!isOneByte2) {
                            break;
                        }
                        i14++;
                        D5.handleOneByte(b11, cArr, i17);
                        i17++;
                    }
                    i13 = i17;
                    i9 = i14;
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.E5
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i9, int i10) throws C1912g3 {
        return decodeUtf8Default(byteBuffer, i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.protobuf.E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.F5.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // com.google.protobuf.E5
    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        encodeUtf8Default(charSequence, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r8[r9] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r8[r9] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
    
        if (r8[r7] > (-65)) goto L53;
     */
    @Override // com.google.protobuf.E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
        /*
            r6 = this;
            if (r7 == 0) goto L86
            if (r9 < r10) goto L5
            return r7
        L5:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r7 = -62
            if (r0 < r7) goto L1b
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r9 <= r3) goto L18
            goto L1b
        L18:
            r9 = r7
            goto L86
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L34
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r7 < r10) goto L31
            int r7 = com.google.protobuf.I5.access$000(r0, r9)
            return r7
        L31:
            r5 = r9
            r9 = r7
            r7 = r5
        L34:
            if (r7 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r7 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r7 >= r4) goto L48
        L42:
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r9 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L5c
            int r7 = r9 + 1
            r1 = r8[r9]
            if (r7 < r10) goto L5a
            int r7 = com.google.protobuf.I5.access$000(r0, r1)
            return r7
        L5a:
            r9 = 0
            goto L62
        L5c:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r9
            r9 = r7
            r7 = r5
        L62:
            if (r9 != 0) goto L72
            int r9 = r7 + 1
            r7 = r8[r7]
            if (r9 < r10) goto L6f
            int r7 = com.google.protobuf.I5.access$100(r0, r1, r7)
            return r7
        L6f:
            r5 = r9
            r9 = r7
            r7 = r5
        L72:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L85
            if (r9 > r3) goto L85
            int r9 = r7 + 1
            r7 = r8[r7]
            if (r7 <= r3) goto L86
        L85:
            return r2
        L86:
            int r7 = partialIsValidUtf8(r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.F5.partialIsValidUtf8(int, byte[], int, int):int");
    }

    @Override // com.google.protobuf.E5
    public int partialIsValidUtf8Direct(int i9, ByteBuffer byteBuffer, int i10, int i11) {
        return partialIsValidUtf8Default(i9, byteBuffer, i10, i11);
    }

    private static int partialIsValidUtf8(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 >= i10) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i9, i10);
    }
}
