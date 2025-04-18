package com.bytedance.sdk.component.Sg.YFl.Sg;

import a4.j;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class YFl implements Sg, tN, Cloneable, ByteChannel {
    private static final byte[] tN = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long Sg;
    wN YFl;

    /* renamed from: AlY, reason: merged with bridge method [inline-methods] */
    public YFl clone() {
        YFl yFl = new YFl();
        if (this.Sg == 0) {
            return yFl;
        }
        wN YFl = this.YFl.YFl();
        yFl.YFl = YFl;
        YFl.DSW = YFl;
        YFl.f10333vc = YFl;
        wN wNVar = this.YFl;
        while (true) {
            wNVar = wNVar.f10333vc;
            if (wNVar != this.YFl) {
                yFl.YFl.DSW.YFl(wNVar.YFl());
            } else {
                yFl.Sg = this.Sg;
                return yFl;
            }
        }
    }

    public byte Sg() {
        long j3 = this.Sg;
        if (j3 != 0) {
            wN wNVar = this.YFl;
            int i10 = wNVar.Sg;
            int i11 = wNVar.tN;
            int i12 = i10 + 1;
            byte b3 = wNVar.YFl[i10];
            this.Sg = j3 - 1;
            if (i12 == i11) {
                this.YFl = wNVar.Sg();
                vc.YFl(wNVar);
            } else {
                wNVar.Sg = i12;
            }
            return b3;
        }
        throw new IllegalStateException("size == 0");
    }

    public boolean YFl() {
        return this.Sg == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YFl)) {
            return false;
        }
        YFl yFl = (YFl) obj;
        long j3 = this.Sg;
        if (j3 != yFl.Sg) {
            return false;
        }
        long j10 = 0;
        if (j3 == 0) {
            return true;
        }
        wN wNVar = this.YFl;
        wN wNVar2 = yFl.YFl;
        int i10 = wNVar.Sg;
        int i11 = wNVar2.Sg;
        while (j10 < this.Sg) {
            long min = Math.min(wNVar.tN - i10, wNVar2.tN - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (wNVar.YFl[i10] != wNVar2.YFl[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == wNVar.tN) {
                wNVar = wNVar.f10333vc;
                i10 = wNVar.Sg;
            }
            if (i11 == wNVar2.tN) {
                wNVar2 = wNVar2.f10333vc;
                i11 = wNVar2.Sg;
            }
            j10 += min;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        wN wNVar = this.YFl;
        if (wNVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = wNVar.tN;
            for (int i12 = wNVar.Sg; i12 < i11; i12++) {
                i10 = (i10 * 31) + wNVar.YFl[i12];
            }
            wNVar = wNVar.f10333vc;
        } while (wNVar != this.YFl);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        wN wNVar = this.YFl;
        if (wNVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wNVar.tN - wNVar.Sg);
        byteBuffer.put(wNVar.YFl, wNVar.Sg, min);
        int i10 = wNVar.Sg + min;
        wNVar.Sg = i10;
        this.Sg -= min;
        if (i10 == wNVar.tN) {
            this.YFl = wNVar.Sg();
            vc.YFl(wNVar);
        }
        return min;
    }

    public String tN() {
        try {
            return YFl(this.Sg, NjR.YFl);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String toString() {
        return wN().toString();
    }

    public final AlY wN() {
        long j3 = this.Sg;
        if (j3 <= 2147483647L) {
            return AlY((int) j3);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.Sg);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                wN tN2 = tN(1);
                int min = Math.min(i10, 8192 - tN2.tN);
                byteBuffer.get(tN2.YFl, tN2.tN, min);
                i10 -= min;
                tN2.tN += min;
            }
            this.Sg += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public String YFl(long j3, Charset charset) throws EOFException {
        NjR.YFl(this.Sg, 0L, j3);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j3 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j3)));
        }
        if (j3 == 0) {
            return "";
        }
        wN wNVar = this.YFl;
        int i10 = wNVar.Sg;
        if (i10 + j3 > wNVar.tN) {
            return new String(YFl(j3), charset);
        }
        String str = new String(wNVar.YFl, i10, (int) j3, charset);
        int i11 = (int) (wNVar.Sg + j3);
        wNVar.Sg = i11;
        this.Sg -= j3;
        if (i11 == wNVar.tN) {
            this.YFl = wNVar.Sg();
            vc.YFl(wNVar);
        }
        return str;
    }

    public wN tN(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            wN wNVar = this.YFl;
            if (wNVar == null) {
                wN YFl = vc.YFl();
                this.YFl = YFl;
                YFl.DSW = YFl;
                YFl.f10333vc = YFl;
                return YFl;
            }
            wN wNVar2 = wNVar.DSW;
            return (wNVar2.tN + i10 > 8192 || !wNVar2.wN) ? wNVar2.YFl(vc.YFl()) : wNVar2;
        }
        throw new IllegalArgumentException();
    }

    public final AlY AlY(int i10) {
        if (i10 == 0) {
            return AlY.tN;
        }
        return new DSW(this, i10);
    }

    public YFl Sg(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j3 = i11;
            NjR.YFl(bArr.length, i10, j3);
            int i12 = i11 + i10;
            while (i10 < i12) {
                wN tN2 = tN(1);
                int min = Math.min(i12 - i10, 8192 - tN2.tN);
                System.arraycopy(bArr, i10, tN2.YFl, tN2.tN, min);
                i10 += min;
                tN2.tN += min;
            }
            this.Sg += j3;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] YFl(long j3) throws EOFException {
        NjR.YFl(this.Sg, 0L, j3);
        if (j3 <= 2147483647L) {
            byte[] bArr = new byte[(int) j3];
            YFl(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j3)));
    }

    public void YFl(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int YFl = YFl(bArr, i10, bArr.length - i10);
            if (YFl == -1) {
                throw new EOFException();
            }
            i10 += YFl;
        }
    }

    public YFl Sg(int i10) {
        wN tN2 = tN(1);
        byte[] bArr = tN2.YFl;
        int i11 = tN2.tN;
        tN2.tN = i11 + 1;
        bArr[i11] = (byte) i10;
        this.Sg++;
        return this;
    }

    public int YFl(byte[] bArr, int i10, int i11) {
        NjR.YFl(bArr.length, i10, i11);
        wN wNVar = this.YFl;
        if (wNVar == null) {
            return -1;
        }
        int min = Math.min(i11, wNVar.tN - wNVar.Sg);
        System.arraycopy(wNVar.YFl, wNVar.Sg, bArr, i10, min);
        int i12 = wNVar.Sg + min;
        wNVar.Sg = i12;
        this.Sg -= min;
        if (i12 == wNVar.tN) {
            this.YFl = wNVar.Sg();
            vc.YFl(wNVar);
        }
        return min;
    }

    public YFl Sg(long j3) {
        if (j3 == 0) {
            return Sg(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j3)) / 4) + 1;
        wN tN2 = tN(numberOfTrailingZeros);
        byte[] bArr = tN2.YFl;
        int i10 = tN2.tN;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = tN[(int) (15 & j3)];
            j3 >>>= 4;
        }
        tN2.tN += numberOfTrailingZeros;
        this.Sg += numberOfTrailingZeros;
        return this;
    }

    public YFl YFl(String str) {
        return YFl(str, 0, str.length());
    }

    public YFl YFl(String str, int i10, int i11) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder m10 = j.m("endIndex > string.length: ", i11, " > ");
                m10.append(str.length());
                throw new IllegalArgumentException(m10.toString());
            }
            while (i10 < i11) {
                char charAt2 = str.charAt(i10);
                if (charAt2 < 128) {
                    wN tN2 = tN(1);
                    byte[] bArr = tN2.YFl;
                    int i12 = tN2.tN - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) charAt;
                    }
                    int i14 = tN2.tN;
                    int i15 = (i12 + i10) - i14;
                    tN2.tN = i14 + i15;
                    this.Sg += i15;
                } else {
                    if (charAt2 < 2048) {
                        Sg((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        Sg((charAt2 & '?') | 128);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char charAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i17 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            Sg((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            Sg(((i17 >> 12) & 63) | 128);
                            Sg(((i17 >> 6) & 63) | 128);
                            Sg((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            Sg(63);
                            i10 = i16;
                        }
                    } else {
                        Sg((charAt2 >> '\f') | 224);
                        Sg(((charAt2 >> 6) & 63) | 128);
                        Sg((charAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(j.e("endIndex < beginIndex: ", i11, " < ", i10));
    }

    public YFl YFl(int i10) {
        if (i10 < 128) {
            Sg(i10);
        } else if (i10 < 2048) {
            Sg((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            Sg((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                Sg(63);
            } else {
                Sg((i10 >> 12) | 224);
                Sg(((i10 >> 6) & 63) | 128);
                Sg((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            Sg((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            Sg(((i10 >> 12) & 63) | 128);
            Sg(((i10 >> 6) & 63) | 128);
            Sg((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    public YFl YFl(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder m10 = j.m("endIndex > string.length: ", i11, " > ");
                m10.append(str.length());
                throw new IllegalArgumentException(m10.toString());
            }
            if (charset != null) {
                if (charset.equals(NjR.YFl)) {
                    return YFl(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return Sg(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(j.e("endIndex < beginIndex: ", i11, " < ", i10));
    }
}
