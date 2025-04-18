package com.google.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class f9 {
    public final String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11) throws h4 {
        if (byteBuffer.hasArray()) {
            return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        if (byteBuffer.isDirect()) {
            return decodeUtf8Direct(byteBuffer, i10, i11);
        }
        return decodeUtf8Default(byteBuffer, i10, i11);
    }

    public abstract String decodeUtf8(byte[] bArr, int i10, int i11) throws h4;

    public final String decodeUtf8Default(ByteBuffer byteBuffer, int i10, int i11) throws h4 {
        boolean isOneByte;
        boolean isOneByte2;
        boolean isTwoBytes;
        boolean isThreeBytes;
        boolean isOneByte3;
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b3 = byteBuffer.get(i10);
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
                byte b10 = byteBuffer.get(i10);
                isOneByte = e9.isOneByte(b10);
                if (isOneByte) {
                    int i16 = i14 + 1;
                    e9.handleOneByte(b10, cArr, i14);
                    while (i15 < i12) {
                        byte b11 = byteBuffer.get(i15);
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
                            e9.handleTwoBytes(b10, byteBuffer.get(i15), cArr, i14);
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
                                e9.handleThreeBytes(b10, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                                i10 = i17 + 1;
                                i14++;
                            } else {
                                throw h4.invalidUtf8();
                            }
                        } else if (i15 < i12 - 2) {
                            int i18 = i15 + 1;
                            byte b12 = byteBuffer.get(i15);
                            int i19 = i18 + 1;
                            e9.handleFourBytes(b10, b12, byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
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
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i10, int i11) throws h4;

    public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i10, int i11);

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
        int i10 = 0;
        while (i10 < length) {
            try {
                char charAt = charSequence.charAt(i10);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i10, (byte) charAt);
                i10++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i10 == length) {
            return;
        }
        position += i10;
        while (i10 < length) {
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i11 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i11, (byte) ((charAt2 & '?') | 128));
                    position = i11;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i11;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (charAt2 >= 55296 && 57343 >= charAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i13 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    int i14 = i13 + 1;
                                    byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                    int i15 = i14 + 1;
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i15, (byte) ((codePoint & 63) | 128));
                                    position = i15;
                                    i10 = i12;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i13;
                                    i10 = i12;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (position - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                        }
                    }
                    throw new h9(i10, length);
                }
                int i16 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position = i16 + 1;
                byteBuffer.put(i16, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i10++;
            position++;
        }
    }

    public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean isValidUtf8(byte[] bArr, int i10, int i11) {
        return partialIsValidUtf8(0, bArr, i10, i11) == 0;
    }

    public final int partialIsValidUtf8(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i10, byteBuffer.array(), i11 + arrayOffset, arrayOffset + i12);
        }
        if (byteBuffer.isDirect()) {
            return partialIsValidUtf8Direct(i10, byteBuffer, i11, i12);
        }
        return partialIsValidUtf8Default(i10, byteBuffer, i11, i12);
    }

    public abstract int partialIsValidUtf8(int i10, byte[] bArr, int i11, int i12);

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
            int r7 = com.google.protobuf.j9.access$000(r0, r9)
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
            int r7 = com.google.protobuf.j9.access$000(r0, r1)
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
            int r7 = com.google.protobuf.j9.access$100(r0, r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f9.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
    }

    public abstract int partialIsValidUtf8Direct(int i10, ByteBuffer byteBuffer, int i11, int i12);

    public final boolean isValidUtf8(ByteBuffer byteBuffer, int i10, int i11) {
        return partialIsValidUtf8(0, byteBuffer, i10, i11) == 0;
    }

    private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i10, int i11) {
        int estimateConsecutiveAscii;
        int incompleteStateFor;
        int incompleteStateFor2;
        estimateConsecutiveAscii = j9.estimateConsecutiveAscii(byteBuffer, i10, i11);
        int i12 = estimateConsecutiveAscii + i10;
        while (i12 < i11) {
            int i13 = i12 + 1;
            byte b3 = byteBuffer.get(i12);
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i13 >= i11) {
                        return b3;
                    }
                    if (b3 < -62 || byteBuffer.get(i13) > -65) {
                        return -1;
                    }
                    i13++;
                } else {
                    if (b3 >= -16) {
                        if (i13 >= i11 - 2) {
                            incompleteStateFor2 = j9.incompleteStateFor(byteBuffer, b3, i13, i11 - i13);
                            return incompleteStateFor2;
                        }
                        int i14 = i13 + 1;
                        byte b10 = byteBuffer.get(i13);
                        if (b10 <= -65) {
                            if ((((b10 + 112) + (b3 << Ascii.FS)) >> 30) == 0) {
                                int i15 = i14 + 1;
                                if (byteBuffer.get(i14) <= -65) {
                                    i12 = i15 + 1;
                                    if (byteBuffer.get(i15) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i11 - 1) {
                        incompleteStateFor = j9.incompleteStateFor(byteBuffer, b3, i13, i11 - i13);
                        return incompleteStateFor;
                    }
                    int i16 = i13 + 1;
                    byte b11 = byteBuffer.get(i13);
                    if (b11 > -65 || ((b3 == -32 && b11 < -96) || ((b3 == -19 && b11 >= -96) || byteBuffer.get(i16) > -65))) {
                        return -1;
                    }
                    i12 = i16 + 1;
                }
            }
            i12 = i13;
        }
        return 0;
    }
}
