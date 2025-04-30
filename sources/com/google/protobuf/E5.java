package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class E5 {
    public final String decodeUtf8(ByteBuffer byteBuffer, int i9, int i10) throws C1912g3 {
        if (byteBuffer.hasArray()) {
            return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i10);
        }
        if (byteBuffer.isDirect()) {
            return decodeUtf8Direct(byteBuffer, i9, i10);
        }
        return decodeUtf8Default(byteBuffer, i9, i10);
    }

    public abstract String decodeUtf8(byte[] bArr, int i9, int i10) throws C1912g3;

    public final String decodeUtf8Default(ByteBuffer byteBuffer, int i9, int i10) throws C1912g3 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i9 | i10 | ((byteBuffer.limit() - i9) - i10)) >= 0) {
            int i11 = i9 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i9 < i11) {
                byte b = byteBuffer.get(i9);
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
                byte b8 = byteBuffer.get(i9);
                isOneByte = D5.isOneByte(b8);
                if (!isOneByte) {
                    isTwoBytes = D5.isTwoBytes(b8);
                    if (!isTwoBytes) {
                        isThreeBytes = D5.isThreeBytes(b8);
                        if (isThreeBytes) {
                            if (i14 < i11 - 1) {
                                int i15 = i9 + 2;
                                i9 += 3;
                                D5.handleThreeBytes(b8, byteBuffer.get(i14), byteBuffer.get(i15), cArr, i13);
                                i13++;
                            } else {
                                throw C1912g3.invalidUtf8();
                            }
                        } else if (i14 < i11 - 2) {
                            byte b9 = byteBuffer.get(i14);
                            int i16 = i9 + 3;
                            byte b10 = byteBuffer.get(i9 + 2);
                            i9 += 4;
                            D5.handleFourBytes(b8, b9, b10, byteBuffer.get(i16), cArr, i13);
                            i13 += 2;
                        } else {
                            throw C1912g3.invalidUtf8();
                        }
                    } else if (i14 < i11) {
                        i9 += 2;
                        D5.handleTwoBytes(b8, byteBuffer.get(i14), cArr, i13);
                        i13++;
                    } else {
                        throw C1912g3.invalidUtf8();
                    }
                } else {
                    int i17 = i13 + 1;
                    D5.handleOneByte(b8, cArr, i13);
                    while (i14 < i11) {
                        byte b11 = byteBuffer.get(i14);
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
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i9), Integer.valueOf(i10)));
    }

    public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i9, int i10) throws C1912g3;

    public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i9, int i10);

    public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
        } else if (byteBuffer.isDirect()) {
            encodeUtf8Direct(charSequence, byteBuffer);
        } else {
            encodeUtf8Default(charSequence, byteBuffer);
        }
    }

    public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i9 = 0;
        while (i9 < length) {
            try {
                char charAt = charSequence.charAt(i9);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i9, (byte) charAt);
                i9++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (Math.max(i9, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i9 == length) {
            return;
        }
        position += i9;
        while (i9 < length) {
            char charAt2 = charSequence.charAt(i9);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i10 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i10, (byte) ((charAt2 & '?') | 128));
                    position = i10;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i10;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (Math.max(i9, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i11 = i9 + 1;
                    if (i11 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i12 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    int i13 = position + 2;
                                    try {
                                        byteBuffer.put(i12, (byte) (((codePoint >>> 12) & 63) | 128));
                                        position += 3;
                                        byteBuffer.put(i13, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(position, (byte) ((codePoint & 63) | 128));
                                        i9 = i11;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i9 = i11;
                                        position = i13;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (Math.max(i9, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    position = i12;
                                    i9 = i11;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i9) + " at index " + (Math.max(i9, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i9 = i11;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new G5(i9, length);
                }
                int i14 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position += 2;
                byteBuffer.put(i14, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i9++;
            position++;
        }
    }

    public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean isValidUtf8(byte[] bArr, int i9, int i10) {
        return partialIsValidUtf8(0, bArr, i9, i10) == 0;
    }

    public final int partialIsValidUtf8(int i9, ByteBuffer byteBuffer, int i10, int i11) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i9, byteBuffer.array(), i10 + arrayOffset, arrayOffset + i11);
        }
        if (byteBuffer.isDirect()) {
            return partialIsValidUtf8Direct(i9, byteBuffer, i10, i11);
        }
        return partialIsValidUtf8Default(i9, byteBuffer, i10, i11);
    }

    public abstract int partialIsValidUtf8(int i9, byte[] bArr, int i10, int i11);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r8.get(r9) > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        if (r8.get(r9) > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
    
        if (r8.get(r7) > (-65)) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
        /*
            r6 = this;
            if (r7 == 0) goto L92
            if (r9 < r10) goto L5
            return r7
        L5:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1e
            r7 = -62
            if (r0 < r7) goto L1d
            int r7 = r9 + 1
            byte r9 = r8.get(r9)
            if (r9 <= r3) goto L1a
            goto L1d
        L1a:
            r9 = r7
            goto L92
        L1d:
            return r2
        L1e:
            r4 = -16
            if (r0 >= r4) goto L4f
            int r7 = r7 >> 8
            int r7 = ~r7
            byte r7 = (byte) r7
            if (r7 != 0) goto L38
            int r7 = r9 + 1
            byte r9 = r8.get(r9)
            if (r7 < r10) goto L35
            int r7 = com.google.protobuf.I5.access$000(r0, r9)
            return r7
        L35:
            r5 = r9
            r9 = r7
            r7 = r5
        L38:
            if (r7 > r3) goto L4e
            r4 = -96
            if (r0 != r1) goto L40
            if (r7 < r4) goto L4e
        L40:
            r1 = -19
            if (r0 != r1) goto L46
            if (r7 >= r4) goto L4e
        L46:
            int r7 = r9 + 1
            byte r9 = r8.get(r9)
            if (r9 <= r3) goto L1a
        L4e:
            return r2
        L4f:
            int r1 = r7 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L64
            int r7 = r9 + 1
            byte r1 = r8.get(r9)
            if (r7 < r10) goto L62
            int r7 = com.google.protobuf.I5.access$000(r0, r1)
            return r7
        L62:
            r9 = 0
            goto L6a
        L64:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r5 = r9
            r9 = r7
            r7 = r5
        L6a:
            if (r9 != 0) goto L7c
            int r9 = r7 + 1
            byte r7 = r8.get(r7)
            if (r9 < r10) goto L79
            int r7 = com.google.protobuf.I5.access$100(r0, r1, r7)
            return r7
        L79:
            r5 = r9
            r9 = r7
            r7 = r5
        L7c:
            if (r1 > r3) goto L91
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L91
            if (r9 > r3) goto L91
            int r9 = r7 + 1
            byte r7 = r8.get(r7)
            if (r7 <= r3) goto L92
        L91:
            return r2
        L92:
            int r7 = partialIsValidUtf8(r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.E5.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
    }

    public abstract int partialIsValidUtf8Direct(int i9, ByteBuffer byteBuffer, int i10, int i11);

    public final boolean isValidUtf8(ByteBuffer byteBuffer, int i9, int i10) {
        return partialIsValidUtf8(0, byteBuffer, i9, i10) == 0;
    }

    private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i9, int i10) {
        int estimateConsecutiveAscii;
        int incompleteStateFor;
        int incompleteStateFor2;
        estimateConsecutiveAscii = I5.estimateConsecutiveAscii(byteBuffer, i9, i10);
        int i11 = estimateConsecutiveAscii + i9;
        while (i11 < i10) {
            int i12 = i11 + 1;
            byte b = byteBuffer.get(i11);
            if (b >= 0) {
                i11 = i12;
            } else if (b < -32) {
                if (i12 >= i10) {
                    return b;
                }
                if (b < -62 || byteBuffer.get(i12) > -65) {
                    return -1;
                }
                i11 += 2;
            } else {
                if (b >= -16) {
                    if (i12 >= i10 - 2) {
                        incompleteStateFor2 = I5.incompleteStateFor(byteBuffer, b, i12, i10 - i12);
                        return incompleteStateFor2;
                    }
                    int i13 = i11 + 2;
                    byte b8 = byteBuffer.get(i12);
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b << Ascii.FS)) >> 30) == 0) {
                            int i14 = i11 + 3;
                            if (byteBuffer.get(i13) <= -65) {
                                i11 += 4;
                                if (byteBuffer.get(i14) > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i12 >= i10 - 1) {
                    incompleteStateFor = I5.incompleteStateFor(byteBuffer, b, i12, i10 - i12);
                    return incompleteStateFor;
                }
                int i15 = i11 + 2;
                byte b9 = byteBuffer.get(i12);
                if (b9 > -65 || ((b == -32 && b9 < -96) || ((b == -19 && b9 >= -96) || byteBuffer.get(i15) > -65))) {
                    return -1;
                }
                i11 += 3;
            }
        }
        return 0;
    }
}
