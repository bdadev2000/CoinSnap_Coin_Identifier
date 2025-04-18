package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class g9 extends f9 {
    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i10, int i11) {
        int incompleteStateFor;
        int incompleteStateFor2;
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b3 = bArr[i10];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i12 >= i11) {
                        return b3;
                    }
                    if (b3 >= -62) {
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b3 < -16) {
                    if (i12 >= i11 - 1) {
                        incompleteStateFor = j9.incompleteStateFor(bArr, i12, i11);
                        return incompleteStateFor;
                    }
                    int i13 = i12 + 1;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && ((b3 != -32 || b10 >= -96) && (b3 != -19 || b10 < -96))) {
                        i10 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    incompleteStateFor2 = j9.incompleteStateFor(bArr, i12, i11);
                    return incompleteStateFor2;
                }
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b3 << Ascii.FS)) >> 30) == 0) {
                        int i15 = i14 + 1;
                        if (bArr[i14] <= -65) {
                            i12 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }

    @Override // com.google.protobuf.f9
    public String decodeUtf8(byte[] bArr, int i10, int i11) throws h4 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b3 = bArr[i10];
                isOneByte3 = e9.isOneByte(b3);
                if (!isOneByte3) {
                    break;
                }
                i10++;
                e9.handleOneByte(b3, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                isOneByte = e9.isOneByte(b10);
                if (isOneByte) {
                    int i16 = i14 + 1;
                    e9.handleOneByte(b10, cArr, i14);
                    while (i15 < i12) {
                        byte b11 = bArr[i15];
                        isOneByte2 = e9.isOneByte(b11);
                        if (!isOneByte2) {
                            break;
                        }
                        i15++;
                        e9.handleOneByte(b11, cArr, i16);
                        i16++;
                    }
                    i10 = i15;
                    i14 = i16;
                } else {
                    isTwoBytes = e9.isTwoBytes(b10);
                    if (isTwoBytes) {
                        if (i15 < i12) {
                            e9.handleTwoBytes(b10, bArr[i15], cArr, i14);
                            i10 = i15 + 1;
                            i14++;
                        } else {
                            throw h4.invalidUtf8();
                        }
                    } else {
                        isThreeBytes = e9.isThreeBytes(b10);
                        if (isThreeBytes) {
                            if (i15 < i12 - 1) {
                                int i17 = i15 + 1;
                                e9.handleThreeBytes(b10, bArr[i15], bArr[i17], cArr, i14);
                                i10 = i17 + 1;
                                i14++;
                            } else {
                                throw h4.invalidUtf8();
                            }
                        } else if (i15 < i12 - 2) {
                            int i18 = i15 + 1;
                            byte b12 = bArr[i15];
                            int i19 = i18 + 1;
                            e9.handleFourBytes(b10, b12, bArr[i18], bArr[i19], cArr, i14);
                            i10 = i19 + 1;
                            i14 = i14 + 1 + 1;
                        } else {
                            throw h4.invalidUtf8();
                        }
                    }
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // com.google.protobuf.f9
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i10, int i11) throws h4 {
        return decodeUtf8Default(byteBuffer, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.protobuf.f9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g9.encodeUtf8(java.lang.CharSequence, byte[], int, int):int");
    }

    @Override // com.google.protobuf.f9
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
    @Override // com.google.protobuf.f9
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
            int r7 = com.google.protobuf.j9.access$000(r0, r9)
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
            int r7 = com.google.protobuf.j9.access$000(r0, r1)
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
            int r7 = com.google.protobuf.j9.access$100(r0, r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g9.partialIsValidUtf8(int, byte[], int, int):int");
    }

    @Override // com.google.protobuf.f9
    public int partialIsValidUtf8Direct(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        return partialIsValidUtf8Default(i10, byteBuffer, i11, i12);
    }

    private static int partialIsValidUtf8(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i10, i11);
    }
}
