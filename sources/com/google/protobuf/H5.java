package com.google.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class H5 extends E5 {
    public static boolean isAvailable() {
        if (C5.hasUnsafeArrayOperations() && C5.hasUnsafeByteBufferOperations()) {
            return true;
        }
        return false;
    }

    private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j7, int i9) {
        int i10 = 0;
        if (i9 < 16) {
            return 0;
        }
        int i11 = 8 - (((int) j7) & 7);
        while (i10 < i11) {
            long j9 = 1 + j7;
            if (C5.getByte(bArr, j7) < 0) {
                return i10;
            }
            i10++;
            j7 = j9;
        }
        while (true) {
            int i12 = i10 + 8;
            if (i12 > i9 || (C5.getLong((Object) bArr, C5.BYTE_ARRAY_BASE_OFFSET + j7) & (-9187201950435737472L)) != 0) {
                break;
            }
            j7 += 8;
            i10 = i12;
        }
        while (i10 < i9) {
            long j10 = j7 + 1;
            if (C5.getByte(bArr, j7) < 0) {
                return i10;
            }
            i10++;
            j7 = j10;
        }
        return i9;
    }

    private static int unsafeIncompleteStateFor(byte[] bArr, int i9, long j7, int i10) {
        int incompleteStateFor;
        int incompleteStateFor2;
        int incompleteStateFor3;
        if (i10 == 0) {
            incompleteStateFor = I5.incompleteStateFor(i9);
            return incompleteStateFor;
        }
        if (i10 == 1) {
            incompleteStateFor2 = I5.incompleteStateFor(i9, C5.getByte(bArr, j7));
            return incompleteStateFor2;
        }
        if (i10 == 2) {
            incompleteStateFor3 = I5.incompleteStateFor(i9, C5.getByte(bArr, j7), C5.getByte(bArr, j7 + 1));
            return incompleteStateFor3;
        }
        throw new AssertionError();
    }

    @Override // com.google.protobuf.E5
    public String decodeUtf8(byte[] bArr, int i9, int i10) throws C1912g3 {
        Charset charset = C1898e3.UTF_8;
        String str = new String(bArr, i9, i10, charset);
        if (!str.contains("�")) {
            return str;
        }
        if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i9, i10 + i9))) {
            return str;
        }
        throw C1912g3.invalidUtf8();
    }

    @Override // com.google.protobuf.E5
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i9, int i10) throws C1912g3 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i9 | i10 | ((byteBuffer.limit() - i9) - i10)) >= 0) {
            long addressOffset = C5.addressOffset(byteBuffer) + i9;
            long j7 = i10 + addressOffset;
            char[] cArr = new char[i10];
            int i11 = 0;
            while (addressOffset < j7) {
                byte b = C5.getByte(addressOffset);
                isOneByte3 = D5.isOneByte(b);
                if (!isOneByte3) {
                    break;
                }
                addressOffset++;
                D5.handleOneByte(b, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (addressOffset < j7) {
                long j9 = addressOffset + 1;
                byte b8 = C5.getByte(addressOffset);
                isOneByte = D5.isOneByte(b8);
                if (!isOneByte) {
                    isTwoBytes = D5.isTwoBytes(b8);
                    if (!isTwoBytes) {
                        isThreeBytes = D5.isThreeBytes(b8);
                        if (isThreeBytes) {
                            if (j9 < j7 - 1) {
                                long j10 = 2 + addressOffset;
                                addressOffset += 3;
                                D5.handleThreeBytes(b8, C5.getByte(j9), C5.getByte(j10), cArr, i12);
                                i12++;
                            } else {
                                throw C1912g3.invalidUtf8();
                            }
                        } else if (j9 < j7 - 2) {
                            byte b9 = C5.getByte(j9);
                            long j11 = 3 + addressOffset;
                            byte b10 = C5.getByte(2 + addressOffset);
                            addressOffset += 4;
                            D5.handleFourBytes(b8, b9, b10, C5.getByte(j11), cArr, i12);
                            i12 += 2;
                        } else {
                            throw C1912g3.invalidUtf8();
                        }
                    } else if (j9 < j7) {
                        addressOffset += 2;
                        D5.handleTwoBytes(b8, C5.getByte(j9), cArr, i12);
                        i12++;
                    } else {
                        throw C1912g3.invalidUtf8();
                    }
                } else {
                    int i13 = i12 + 1;
                    D5.handleOneByte(b8, cArr, i12);
                    while (j9 < j7) {
                        byte b11 = C5.getByte(j9);
                        isOneByte2 = D5.isOneByte(b11);
                        if (!isOneByte2) {
                            break;
                        }
                        j9++;
                        D5.handleOneByte(b11, cArr, i13);
                        i13++;
                    }
                    i12 = i13;
                    addressOffset = j9;
                }
            }
            return new String(cArr, 0, i12);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    @Override // com.google.protobuf.E5
    public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i9, int i10) {
        long j7;
        String str;
        String str2;
        int i11;
        long j9;
        long j10;
        char charAt;
        long j11 = i9;
        long j12 = i10 + j11;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length <= i10 && bArr.length - i10 >= i9) {
            int i12 = 0;
            while (true) {
                j7 = 1;
                if (i12 >= length || (charAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                C5.putByte(bArr, j11, (byte) charAt);
                i12++;
                j11 = 1 + j11;
            }
            if (i12 == length) {
                return (int) j11;
            }
            while (i12 < length) {
                char charAt2 = charSequence.charAt(i12);
                if (charAt2 < 128 && j11 < j12) {
                    C5.putByte(bArr, j11, (byte) charAt2);
                    j10 = j12;
                    str2 = str4;
                    j9 = j7;
                    j11 += j7;
                    str = str3;
                } else {
                    if (charAt2 < 2048 && j11 <= j12 - 2) {
                        str = str3;
                        str2 = str4;
                        long j13 = j11 + j7;
                        C5.putByte(bArr, j11, (byte) ((charAt2 >>> 6) | 960));
                        j11 += 2;
                        C5.putByte(bArr, j13, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        if ((charAt2 < 55296 || 57343 < charAt2) && j11 <= j12 - 3) {
                            C5.putByte(bArr, j11, (byte) ((charAt2 >>> '\f') | 480));
                            long j14 = j11 + 2;
                            C5.putByte(bArr, j11 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                            j11 += 3;
                            C5.putByte(bArr, j14, (byte) ((charAt2 & '?') | 128));
                        } else {
                            if (j11 <= j12 - 4) {
                                int i13 = i12 + 1;
                                if (i13 != length) {
                                    char charAt3 = charSequence.charAt(i13);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j9 = 1;
                                        C5.putByte(bArr, j11, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        j10 = j12;
                                        C5.putByte(bArr, j11 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j15 = j11 + 3;
                                        C5.putByte(bArr, j11 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j11 += 4;
                                        C5.putByte(bArr, j15, (byte) ((codePoint & 63) | 128));
                                        i12 = i13;
                                    } else {
                                        i12 = i13;
                                    }
                                }
                                throw new G5(i12 - 1, length);
                            }
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i11 = i12 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                                throw new G5(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException(str2 + charAt2 + str + j11);
                        }
                    }
                    j10 = j12;
                    j9 = 1;
                }
                i12++;
                str3 = str;
                str4 = str2;
                j7 = j9;
                j12 = j10;
            }
            return (int) j11;
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i9 + i10));
    }

    @Override // com.google.protobuf.E5
    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j7;
        char c9;
        long j9;
        int i9;
        int i10;
        char c10;
        char charAt;
        long addressOffset = C5.addressOffset(byteBuffer);
        long position = byteBuffer.position() + addressOffset;
        long limit = byteBuffer.limit() + addressOffset;
        int length = charSequence.length();
        if (length <= limit - position) {
            int i11 = 0;
            while (true) {
                j7 = 1;
                c9 = 128;
                if (i11 >= length || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                C5.putByte(position, (byte) charAt);
                i11++;
                position = 1 + position;
            }
            if (i11 == length) {
                return;
            }
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                if (charAt2 < c9 && position < limit) {
                    C5.putByte(position, (byte) charAt2);
                    j9 = addressOffset;
                    i10 = i11;
                    c10 = c9;
                    position += j7;
                } else {
                    if (charAt2 < 2048 && position <= limit - 2) {
                        j9 = addressOffset;
                        long j10 = position + j7;
                        C5.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                        position += 2;
                        C5.putByte(j10, (byte) ((charAt2 & '?') | 128));
                    } else {
                        j9 = addressOffset;
                        if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                            long j11 = position + j7;
                            C5.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                            long j12 = position + 2;
                            C5.putByte(j11, (byte) (((charAt2 >>> 6) & 63) | 128));
                            position += 3;
                            C5.putByte(j12, (byte) ((charAt2 & '?') | 128));
                        } else {
                            if (position <= limit - 4) {
                                i10 = i11 + 1;
                                if (i10 != length) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        C5.putByte(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        c10 = 128;
                                        C5.putByte(position + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j13 = position + 3;
                                        C5.putByte(position + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        position += 4;
                                        C5.putByte(j13, (byte) ((codePoint & 63) | 128));
                                    } else {
                                        i11 = i10;
                                    }
                                }
                                throw new G5(i11 - 1, length);
                            }
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i9 = i11 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i9)))) {
                                throw new G5(i11, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                        }
                    }
                    i10 = i11;
                    c10 = 128;
                }
                c9 = c10;
                addressOffset = j9;
                j7 = 1;
                i11 = i10 + 1;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        if (com.google.protobuf.C5.getByte(r12, r0) > (-65)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        if (com.google.protobuf.C5.getByte(r12, r0) > (-65)) goto L59;
     */
    @Override // com.google.protobuf.E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.H5.partialIsValidUtf8(int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (com.google.protobuf.C5.getByte(r0) > (-65)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (com.google.protobuf.C5.getByte(r0) > (-65)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a3, code lost:
    
        if (com.google.protobuf.C5.getByte(r0) > (-65)) goto L57;
     */
    @Override // com.google.protobuf.E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.H5.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
    }

    private static int unsafeEstimateConsecutiveAscii(long j7, int i9) {
        if (i9 < 16) {
            return 0;
        }
        int i10 = (int) ((-j7) & 7);
        int i11 = i10;
        while (i11 > 0) {
            long j9 = 1 + j7;
            if (C5.getByte(j7) < 0) {
                return i10 - i11;
            }
            i11--;
            j7 = j9;
        }
        int i12 = i9 - i10;
        while (i12 >= 8 && (C5.getLong(j7) & (-9187201950435737472L)) == 0) {
            j7 += 8;
            i12 -= 8;
        }
        return i9 - i12;
    }

    private static int unsafeIncompleteStateFor(long j7, int i9, int i10) {
        int incompleteStateFor;
        int incompleteStateFor2;
        int incompleteStateFor3;
        if (i10 == 0) {
            incompleteStateFor = I5.incompleteStateFor(i9);
            return incompleteStateFor;
        }
        if (i10 == 1) {
            incompleteStateFor2 = I5.incompleteStateFor(i9, C5.getByte(j7));
            return incompleteStateFor2;
        }
        if (i10 == 2) {
            incompleteStateFor3 = I5.incompleteStateFor(i9, C5.getByte(j7), C5.getByte(j7 + 1));
            return incompleteStateFor3;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
        /*
            int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
            int r13 = r13 - r0
            long r0 = (long) r0
            long r11 = r11 + r0
        L7:
            r0 = 0
            r1 = r0
        L9:
            r2 = 1
            if (r13 <= 0) goto L1a
            long r4 = r11 + r2
            byte r1 = com.google.protobuf.C5.getByte(r10, r11)
            if (r1 < 0) goto L19
            int r13 = r13 + (-1)
            r11 = r4
            goto L9
        L19:
            r11 = r4
        L1a:
            if (r13 != 0) goto L1d
            return r0
        L1d:
            int r0 = r13 + (-1)
            r4 = -32
            r5 = -1
            r6 = -65
            if (r1 >= r4) goto L3a
            if (r0 != 0) goto L29
            return r1
        L29:
            int r13 = r13 + (-2)
            r0 = -62
            if (r1 < r0) goto L39
            long r2 = r2 + r11
            byte r11 = com.google.protobuf.C5.getByte(r10, r11)
            if (r11 <= r6) goto L37
            goto L39
        L37:
            r11 = r2
            goto L7
        L39:
            return r5
        L3a:
            r7 = -16
            r8 = 2
            if (r1 >= r7) goto L65
            r7 = 2
            if (r0 >= r7) goto L48
            int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
            return r10
        L48:
            int r13 = r13 + (-3)
            long r2 = r2 + r11
            byte r0 = com.google.protobuf.C5.getByte(r10, r11)
            if (r0 > r6) goto L64
            r7 = -96
            if (r1 != r4) goto L57
            if (r0 < r7) goto L64
        L57:
            r4 = -19
            if (r1 != r4) goto L5d
            if (r0 >= r7) goto L64
        L5d:
            long r11 = r11 + r8
            byte r0 = com.google.protobuf.C5.getByte(r10, r2)
            if (r0 <= r6) goto L7
        L64:
            return r5
        L65:
            r4 = 3
            if (r0 >= r4) goto L6d
            int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
            return r10
        L6d:
            int r13 = r13 + (-4)
            long r2 = r2 + r11
            byte r0 = com.google.protobuf.C5.getByte(r10, r11)
            if (r0 > r6) goto L8f
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L8f
            long r8 = r8 + r11
            byte r0 = com.google.protobuf.C5.getByte(r10, r2)
            if (r0 > r6) goto L8f
            r0 = 3
            long r11 = r11 + r0
            byte r0 = com.google.protobuf.C5.getByte(r10, r8)
            if (r0 <= r6) goto L7
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.H5.partialIsValidUtf8(byte[], long, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int partialIsValidUtf8(long r10, int r12) {
        /*
            int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
            long r1 = (long) r0
            long r10 = r10 + r1
            int r12 = r12 - r0
        L7:
            r0 = 0
            r1 = r0
        L9:
            r2 = 1
            if (r12 <= 0) goto L1a
            long r4 = r10 + r2
            byte r1 = com.google.protobuf.C5.getByte(r10)
            if (r1 < 0) goto L19
            int r12 = r12 + (-1)
            r10 = r4
            goto L9
        L19:
            r10 = r4
        L1a:
            if (r12 != 0) goto L1d
            return r0
        L1d:
            int r0 = r12 + (-1)
            r4 = -32
            r5 = -1
            r6 = -65
            if (r1 >= r4) goto L3a
            if (r0 != 0) goto L29
            return r1
        L29:
            int r12 = r12 + (-2)
            r0 = -62
            if (r1 < r0) goto L39
            long r2 = r2 + r10
            byte r10 = com.google.protobuf.C5.getByte(r10)
            if (r10 <= r6) goto L37
            goto L39
        L37:
            r10 = r2
            goto L7
        L39:
            return r5
        L3a:
            r7 = -16
            r8 = 2
            if (r1 >= r7) goto L65
            r7 = 2
            if (r0 >= r7) goto L48
            int r10 = unsafeIncompleteStateFor(r10, r1, r0)
            return r10
        L48:
            int r12 = r12 + (-3)
            long r2 = r2 + r10
            byte r0 = com.google.protobuf.C5.getByte(r10)
            if (r0 > r6) goto L64
            r7 = -96
            if (r1 != r4) goto L57
            if (r0 < r7) goto L64
        L57:
            r4 = -19
            if (r1 != r4) goto L5d
            if (r0 >= r7) goto L64
        L5d:
            long r10 = r10 + r8
            byte r0 = com.google.protobuf.C5.getByte(r2)
            if (r0 <= r6) goto L7
        L64:
            return r5
        L65:
            r4 = 3
            if (r0 >= r4) goto L6d
            int r10 = unsafeIncompleteStateFor(r10, r1, r0)
            return r10
        L6d:
            int r12 = r12 + (-4)
            long r2 = r2 + r10
            byte r0 = com.google.protobuf.C5.getByte(r10)
            if (r0 > r6) goto L8f
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L8f
            long r8 = r8 + r10
            byte r0 = com.google.protobuf.C5.getByte(r2)
            if (r0 > r6) goto L8f
            r0 = 3
            long r10 = r10 + r0
            byte r0 = com.google.protobuf.C5.getByte(r8)
            if (r0 <= r6) goto L7
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.H5.partialIsValidUtf8(long, int):int");
    }
}
