package com.google.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class i9 extends f9 {
    public static boolean isAvailable() {
        return d9.hasUnsafeArrayOperations() && d9.hasUnsafeByteBufferOperations();
    }

    private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j3, int i10) {
        int i11 = 0;
        if (i10 < 16) {
            return 0;
        }
        int i12 = 8 - (((int) j3) & 7);
        while (i11 < i12) {
            long j10 = 1 + j3;
            if (d9.getByte(bArr, j3) < 0) {
                return i11;
            }
            i11++;
            j3 = j10;
        }
        while (true) {
            int i13 = i11 + 8;
            if (i13 > i10 || (d9.getLong((Object) bArr, d9.BYTE_ARRAY_BASE_OFFSET + j3) & (-9187201950435737472L)) != 0) {
                break;
            }
            j3 += 8;
            i11 = i13;
        }
        while (i11 < i10) {
            long j11 = j3 + 1;
            if (d9.getByte(bArr, j3) < 0) {
                return i11;
            }
            i11++;
            j3 = j11;
        }
        return i10;
    }

    private static int unsafeIncompleteStateFor(byte[] bArr, int i10, long j3, int i11) {
        int incompleteStateFor;
        int incompleteStateFor2;
        int incompleteStateFor3;
        if (i11 == 0) {
            incompleteStateFor = j9.incompleteStateFor(i10);
            return incompleteStateFor;
        }
        if (i11 == 1) {
            incompleteStateFor2 = j9.incompleteStateFor(i10, d9.getByte(bArr, j3));
            return incompleteStateFor2;
        }
        if (i11 == 2) {
            incompleteStateFor3 = j9.incompleteStateFor(i10, d9.getByte(bArr, j3), d9.getByte(bArr, j3 + 1));
            return incompleteStateFor3;
        }
        throw new AssertionError();
    }

    @Override // com.google.protobuf.f9
    public String decodeUtf8(byte[] bArr, int i10, int i11) throws h4 {
        Charset charset = f4.UTF_8;
        String str = new String(bArr, i10, i11, charset);
        if (!str.contains("�")) {
            return str;
        }
        if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
            return str;
        }
        throw h4.invalidUtf8();
    }

    @Override // com.google.protobuf.f9
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i10, int i11) throws h4 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
            long addressOffset = d9.addressOffset(byteBuffer) + i10;
            long j3 = i11 + addressOffset;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (addressOffset < j3) {
                byte b3 = d9.getByte(addressOffset);
                isOneByte3 = e9.isOneByte(b3);
                if (!isOneByte3) {
                    break;
                }
                addressOffset++;
                e9.handleOneByte(b3, cArr, i12);
                i12++;
            }
            while (true) {
                int i13 = i12;
                while (addressOffset < j3) {
                    long j10 = addressOffset + 1;
                    byte b10 = d9.getByte(addressOffset);
                    isOneByte = e9.isOneByte(b10);
                    if (isOneByte) {
                        int i14 = i13 + 1;
                        e9.handleOneByte(b10, cArr, i13);
                        while (j10 < j3) {
                            byte b11 = d9.getByte(j10);
                            isOneByte2 = e9.isOneByte(b11);
                            if (!isOneByte2) {
                                break;
                            }
                            j10++;
                            e9.handleOneByte(b11, cArr, i14);
                            i14++;
                        }
                        i13 = i14;
                        addressOffset = j10;
                    } else {
                        isTwoBytes = e9.isTwoBytes(b10);
                        if (isTwoBytes) {
                            if (j10 < j3) {
                                addressOffset = j10 + 1;
                                e9.handleTwoBytes(b10, d9.getByte(j10), cArr, i13);
                                i13++;
                            } else {
                                throw h4.invalidUtf8();
                            }
                        } else {
                            isThreeBytes = e9.isThreeBytes(b10);
                            if (isThreeBytes) {
                                if (j10 < j3 - 1) {
                                    long j11 = j10 + 1;
                                    e9.handleThreeBytes(b10, d9.getByte(j10), d9.getByte(j11), cArr, i13);
                                    i13++;
                                    addressOffset = j11 + 1;
                                } else {
                                    throw h4.invalidUtf8();
                                }
                            } else if (j10 < j3 - 2) {
                                long j12 = j10 + 1;
                                byte b12 = d9.getByte(j10);
                                long j13 = j12 + 1;
                                byte b13 = d9.getByte(j12);
                                addressOffset = j13 + 1;
                                e9.handleFourBytes(b10, b12, b13, d9.getByte(j13), cArr, i13);
                                i12 = i13 + 1 + 1;
                            } else {
                                throw h4.invalidUtf8();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i13);
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // com.google.protobuf.f9
    public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        char c10;
        long j3;
        long j10;
        long j11;
        char c11;
        int i12;
        char charAt;
        long j12 = i10;
        long j13 = i11 + j12;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
        }
        int i13 = 0;
        while (true) {
            c10 = 128;
            j3 = 1;
            if (i13 >= length || (charAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            d9.putByte(bArr, j12, (byte) charAt);
            i13++;
            j12 = 1 + j12;
        }
        if (i13 == length) {
            return (int) j12;
        }
        while (i13 < length) {
            char charAt2 = charSequence.charAt(i13);
            if (charAt2 < c10 && j12 < j13) {
                long j14 = j12 + j3;
                d9.putByte(bArr, j12, (byte) charAt2);
                j11 = j3;
                j10 = j14;
                c11 = c10;
            } else if (charAt2 < 2048 && j12 <= j13 - 2) {
                long j15 = j12 + j3;
                d9.putByte(bArr, j12, (byte) ((charAt2 >>> 6) | 960));
                long j16 = j15 + j3;
                d9.putByte(bArr, j15, (byte) ((charAt2 & '?') | 128));
                long j17 = j3;
                c11 = 128;
                j10 = j16;
                j11 = j17;
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || j12 > j13 - 3) {
                    if (j12 <= j13 - 4) {
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char charAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j18 = j12 + 1;
                                d9.putByte(bArr, j12, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                long j19 = j18 + 1;
                                c11 = 128;
                                d9.putByte(bArr, j18, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j20 = j19 + 1;
                                d9.putByte(bArr, j19, (byte) (((codePoint >>> 6) & 63) | 128));
                                j11 = 1;
                                j10 = j20 + 1;
                                d9.putByte(bArr, j20, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new h9(i13 - 1, length);
                    }
                    if (55296 <= charAt2 && charAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                        throw new h9(i13, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j12);
                }
                long j21 = j12 + j3;
                d9.putByte(bArr, j12, (byte) ((charAt2 >>> '\f') | 480));
                long j22 = j21 + j3;
                d9.putByte(bArr, j21, (byte) (((charAt2 >>> 6) & 63) | 128));
                d9.putByte(bArr, j22, (byte) ((charAt2 & '?') | 128));
                j10 = j22 + 1;
                j11 = 1;
                c11 = 128;
            }
            i13++;
            c10 = c11;
            long j23 = j11;
            j12 = j10;
            j3 = j23;
        }
        return (int) j12;
    }

    @Override // com.google.protobuf.f9
    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        char c10;
        long j3;
        int i10;
        int i11;
        long j10;
        char c11;
        char charAt;
        long addressOffset = d9.addressOffset(byteBuffer);
        long position = byteBuffer.position() + addressOffset;
        long limit = byteBuffer.limit() + addressOffset;
        int length = charSequence.length();
        if (length <= limit - position) {
            int i12 = 0;
            while (true) {
                c10 = 128;
                if (i12 >= length || (charAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                d9.putByte(position, (byte) charAt);
                i12++;
                position++;
            }
            if (i12 == length) {
                return;
            }
            while (i12 < length) {
                char charAt2 = charSequence.charAt(i12);
                if (charAt2 < c10 && position < limit) {
                    d9.putByte(position, (byte) charAt2);
                    j10 = limit;
                    i11 = i12;
                    c11 = c10;
                    position++;
                    j3 = addressOffset;
                } else {
                    if (charAt2 < 2048 && position <= limit - 2) {
                        j3 = addressOffset;
                        long j11 = position + 1;
                        d9.putByte(position, (byte) ((charAt2 >>> 6) | 960));
                        d9.putByte(j11, (byte) ((charAt2 & '?') | 128));
                        position = j11 + 1;
                    } else {
                        j3 = addressOffset;
                        if ((charAt2 < 55296 || 57343 < charAt2) && position <= limit - 3) {
                            long j12 = position + 1;
                            d9.putByte(position, (byte) ((charAt2 >>> '\f') | 480));
                            long j13 = j12 + 1;
                            d9.putByte(j12, (byte) (((charAt2 >>> 6) & 63) | 128));
                            d9.putByte(j13, (byte) ((charAt2 & '?') | 128));
                            position = j13 + 1;
                        } else {
                            if (position <= limit - 4) {
                                i11 = i12 + 1;
                                if (i11 != length) {
                                    char charAt3 = charSequence.charAt(i11);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        j10 = limit;
                                        long j14 = position + 1;
                                        d9.putByte(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        long j15 = j14 + 1;
                                        c11 = 128;
                                        d9.putByte(j14, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j16 = j15 + 1;
                                        d9.putByte(j15, (byte) (((codePoint >>> 6) & 63) | 128));
                                        d9.putByte(j16, (byte) ((codePoint & 63) | 128));
                                        position = j16 + 1;
                                    } else {
                                        i12 = i11;
                                    }
                                }
                                throw new h9(i12 - 1, length);
                            }
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i10 = i12 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i10)))) {
                                throw new h9(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + position);
                        }
                    }
                    j10 = limit;
                    i11 = i12;
                    c11 = 128;
                }
                c10 = c11;
                addressOffset = j3;
                limit = j10;
                i12 = i11 + 1;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (com.google.protobuf.d9.getByte(r13, r2) > (-65)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        if (com.google.protobuf.d9.getByte(r13, r2) > (-65)) goto L59;
     */
    @Override // com.google.protobuf.f9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i9.partialIsValidUtf8(int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (com.google.protobuf.d9.getByte(r2) > (-65)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
    
        if (com.google.protobuf.d9.getByte(r2) > (-65)) goto L59;
     */
    @Override // com.google.protobuf.f9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i9.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
    }

    private static int unsafeEstimateConsecutiveAscii(long j3, int i10) {
        if (i10 < 16) {
            return 0;
        }
        int i11 = (int) ((-j3) & 7);
        int i12 = i11;
        while (i12 > 0) {
            long j10 = 1 + j3;
            if (d9.getByte(j3) < 0) {
                return i11 - i12;
            }
            i12--;
            j3 = j10;
        }
        int i13 = i10 - i11;
        while (i13 >= 8 && (d9.getLong(j3) & (-9187201950435737472L)) == 0) {
            j3 += 8;
            i13 -= 8;
        }
        return i10 - i13;
    }

    private static int unsafeIncompleteStateFor(long j3, int i10, int i11) {
        int incompleteStateFor;
        int incompleteStateFor2;
        int incompleteStateFor3;
        if (i11 == 0) {
            incompleteStateFor = j9.incompleteStateFor(i10);
            return incompleteStateFor;
        }
        if (i11 == 1) {
            incompleteStateFor2 = j9.incompleteStateFor(i10, d9.getByte(j3));
            return incompleteStateFor2;
        }
        if (i11 == 2) {
            incompleteStateFor3 = j9.incompleteStateFor(i10, d9.getByte(j3), d9.getByte(j3 + 1));
            return incompleteStateFor3;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
        /*
            int r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11)
            int r11 = r11 - r0
            long r0 = (long) r0
            long r9 = r9 + r0
        L7:
            r0 = 0
            r1 = r0
        L9:
            r2 = 1
            if (r11 <= 0) goto L1a
            long r4 = r9 + r2
            byte r1 = com.google.protobuf.d9.getByte(r8, r9)
            if (r1 < 0) goto L19
            int r11 = r11 + (-1)
            r9 = r4
            goto L9
        L19:
            r9 = r4
        L1a:
            if (r11 != 0) goto L1d
            return r0
        L1d:
            int r11 = r11 + (-1)
            r0 = -32
            r4 = -65
            r5 = -1
            if (r1 >= r0) goto L3a
            if (r11 != 0) goto L29
            return r1
        L29:
            int r11 = r11 + (-1)
            r0 = -62
            if (r1 < r0) goto L39
            long r2 = r2 + r9
            byte r9 = com.google.protobuf.d9.getByte(r8, r9)
            if (r9 <= r4) goto L37
            goto L39
        L37:
            r9 = r2
            goto L7
        L39:
            return r5
        L3a:
            r6 = -16
            if (r1 >= r6) goto L64
            r6 = 2
            if (r11 >= r6) goto L46
            int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
            return r8
        L46:
            int r11 = r11 + (-2)
            long r6 = r9 + r2
            byte r9 = com.google.protobuf.d9.getByte(r8, r9)
            if (r9 > r4) goto L63
            r10 = -96
            if (r1 != r0) goto L56
            if (r9 < r10) goto L63
        L56:
            r0 = -19
            if (r1 != r0) goto L5c
            if (r9 >= r10) goto L63
        L5c:
            long r2 = r2 + r6
            byte r9 = com.google.protobuf.d9.getByte(r8, r6)
            if (r9 <= r4) goto L37
        L63:
            return r5
        L64:
            r0 = 3
            if (r11 >= r0) goto L6c
            int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
            return r8
        L6c:
            int r11 = r11 + (-3)
            long r6 = r9 + r2
            byte r9 = com.google.protobuf.d9.getByte(r8, r9)
            if (r9 > r4) goto L8e
            int r10 = r1 << 28
            int r9 = r9 + 112
            int r9 = r9 + r10
            int r9 = r9 >> 30
            if (r9 != 0) goto L8e
            long r9 = r6 + r2
            byte r0 = com.google.protobuf.d9.getByte(r8, r6)
            if (r0 > r4) goto L8e
            long r2 = r2 + r9
            byte r9 = com.google.protobuf.d9.getByte(r8, r9)
            if (r9 <= r4) goto L37
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i9.partialIsValidUtf8(byte[], long, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int partialIsValidUtf8(long r8, int r10) {
        /*
            int r0 = unsafeEstimateConsecutiveAscii(r8, r10)
            long r1 = (long) r0
            long r8 = r8 + r1
            int r10 = r10 - r0
        L7:
            r0 = 0
            r1 = r0
        L9:
            r2 = 1
            if (r10 <= 0) goto L1a
            long r4 = r8 + r2
            byte r1 = com.google.protobuf.d9.getByte(r8)
            if (r1 < 0) goto L19
            int r10 = r10 + (-1)
            r8 = r4
            goto L9
        L19:
            r8 = r4
        L1a:
            if (r10 != 0) goto L1d
            return r0
        L1d:
            int r10 = r10 + (-1)
            r0 = -32
            r4 = -65
            r5 = -1
            if (r1 >= r0) goto L3a
            if (r10 != 0) goto L29
            return r1
        L29:
            int r10 = r10 + (-1)
            r0 = -62
            if (r1 < r0) goto L39
            long r2 = r2 + r8
            byte r8 = com.google.protobuf.d9.getByte(r8)
            if (r8 <= r4) goto L37
            goto L39
        L37:
            r8 = r2
            goto L7
        L39:
            return r5
        L3a:
            r6 = -16
            if (r1 >= r6) goto L64
            r6 = 2
            if (r10 >= r6) goto L46
            int r8 = unsafeIncompleteStateFor(r8, r1, r10)
            return r8
        L46:
            int r10 = r10 + (-2)
            long r6 = r8 + r2
            byte r8 = com.google.protobuf.d9.getByte(r8)
            if (r8 > r4) goto L63
            r9 = -96
            if (r1 != r0) goto L56
            if (r8 < r9) goto L63
        L56:
            r0 = -19
            if (r1 != r0) goto L5c
            if (r8 >= r9) goto L63
        L5c:
            long r2 = r2 + r6
            byte r8 = com.google.protobuf.d9.getByte(r6)
            if (r8 <= r4) goto L37
        L63:
            return r5
        L64:
            r0 = 3
            if (r10 >= r0) goto L6c
            int r8 = unsafeIncompleteStateFor(r8, r1, r10)
            return r8
        L6c:
            int r10 = r10 + (-3)
            long r6 = r8 + r2
            byte r8 = com.google.protobuf.d9.getByte(r8)
            if (r8 > r4) goto L8e
            int r9 = r1 << 28
            int r8 = r8 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L8e
            long r8 = r6 + r2
            byte r0 = com.google.protobuf.d9.getByte(r6)
            if (r0 > r4) goto L8e
            long r2 = r2 + r8
            byte r8 = com.google.protobuf.d9.getByte(r8)
            if (r8 <= r4) goto L37
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i9.partialIsValidUtf8(long, int):int");
    }
}
