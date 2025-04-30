package com.bytedance.sdk.component.lMd.zp.lMd;

import Q7.n0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zp implements KS, lMd, Cloneable, ByteChannel {
    private static final byte[] KS = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long lMd;
    COT zp;

    public final jU COT() {
        long j7 = this.lMd;
        if (j7 <= 2147483647L) {
            return jU((int) j7);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.lMd);
    }

    public String KS() {
        try {
            return zp(this.lMd, YW.zp);
        } catch (EOFException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        long j7 = this.lMd;
        if (j7 != zpVar.lMd) {
            return false;
        }
        long j9 = 0;
        if (j7 == 0) {
            return true;
        }
        COT cot = this.zp;
        COT cot2 = zpVar.zp;
        int i9 = cot.lMd;
        int i10 = cot2.lMd;
        while (j9 < this.lMd) {
            long min = Math.min(cot.KS - i9, cot2.KS - i10);
            int i11 = 0;
            while (i11 < min) {
                int i12 = i9 + 1;
                int i13 = i10 + 1;
                if (cot.zp[i9] != cot2.zp[i10]) {
                    return false;
                }
                i11++;
                i9 = i12;
                i10 = i13;
            }
            if (i9 == cot.KS) {
                cot = cot.HWF;
                i9 = cot.lMd;
            }
            if (i10 == cot2.KS) {
                cot2 = cot2.HWF;
                i10 = cot2.lMd;
            }
            j9 += min;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        COT cot = this.zp;
        if (cot == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = cot.KS;
            for (int i11 = cot.lMd; i11 < i10; i11++) {
                i9 = (i9 * 31) + cot.zp[i11];
            }
            cot = cot.HWF;
        } while (cot != this.zp);
        return i9;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* renamed from: jU, reason: merged with bridge method [inline-methods] */
    public zp clone() {
        zp zpVar = new zp();
        if (this.lMd == 0) {
            return zpVar;
        }
        COT zp = this.zp.zp();
        zpVar.zp = zp;
        zp.QR = zp;
        zp.HWF = zp;
        COT cot = this.zp;
        while (true) {
            cot = cot.HWF;
            if (cot != this.zp) {
                zpVar.zp.QR.zp(cot.zp());
            } else {
                zpVar.lMd = this.lMd;
                return zpVar;
            }
        }
    }

    public byte lMd() {
        long j7 = this.lMd;
        if (j7 != 0) {
            COT cot = this.zp;
            int i9 = cot.lMd;
            int i10 = cot.KS;
            int i11 = i9 + 1;
            byte b = cot.zp[i9];
            this.lMd = j7 - 1;
            if (i11 == i10) {
                this.zp = cot.lMd();
                HWF.zp(cot);
            } else {
                cot.lMd = i11;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        COT cot = this.zp;
        if (cot == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), cot.KS - cot.lMd);
        byteBuffer.put(cot.zp, cot.lMd, min);
        int i9 = cot.lMd + min;
        cot.lMd = i9;
        this.lMd -= min;
        if (i9 == cot.KS) {
            this.zp = cot.lMd();
            HWF.zp(cot);
        }
        return min;
    }

    public String toString() {
        return COT().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i9 = remaining;
            while (i9 > 0) {
                COT KS2 = KS(1);
                int min = Math.min(i9, 8192 - KS2.KS);
                byteBuffer.get(KS2.zp, KS2.KS, min);
                i9 -= min;
                KS2.KS += min;
            }
            this.lMd += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public boolean zp() {
        return this.lMd == 0;
    }

    public String zp(long j7, Charset charset) throws EOFException {
        YW.zp(this.lMd, 0L, j7);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j7 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j7)));
        }
        if (j7 == 0) {
            return "";
        }
        COT cot = this.zp;
        int i9 = cot.lMd;
        if (i9 + j7 > cot.KS) {
            return new String(zp(j7), charset);
        }
        String str = new String(cot.zp, i9, (int) j7, charset);
        int i10 = (int) (cot.lMd + j7);
        cot.lMd = i10;
        this.lMd -= j7;
        if (i10 == cot.KS) {
            this.zp = cot.lMd();
            HWF.zp(cot);
        }
        return str;
    }

    public COT KS(int i9) {
        if (i9 > 0 && i9 <= 8192) {
            COT cot = this.zp;
            if (cot == null) {
                COT zp = HWF.zp();
                this.zp = zp;
                zp.QR = zp;
                zp.HWF = zp;
                return zp;
            }
            COT cot2 = cot.QR;
            return (cot2.KS + i9 > 8192 || !cot2.COT) ? cot2.zp(HWF.zp()) : cot2;
        }
        throw new IllegalArgumentException();
    }

    public final jU jU(int i9) {
        if (i9 == 0) {
            return jU.KS;
        }
        return new QR(this, i9);
    }

    public zp lMd(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            long j7 = i10;
            YW.zp(bArr.length, i9, j7);
            int i11 = i10 + i9;
            while (i9 < i11) {
                COT KS2 = KS(1);
                int min = Math.min(i11 - i9, 8192 - KS2.KS);
                System.arraycopy(bArr, i9, KS2.zp, KS2.KS, min);
                i9 += min;
                KS2.KS += min;
            }
            this.lMd += j7;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] zp(long j7) throws EOFException {
        YW.zp(this.lMd, 0L, j7);
        if (j7 <= 2147483647L) {
            byte[] bArr = new byte[(int) j7];
            zp(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j7)));
    }

    public zp lMd(int i9) {
        COT KS2 = KS(1);
        byte[] bArr = KS2.zp;
        int i10 = KS2.KS;
        KS2.KS = i10 + 1;
        bArr[i10] = (byte) i9;
        this.lMd++;
        return this;
    }

    public void zp(byte[] bArr) throws EOFException {
        int i9 = 0;
        while (i9 < bArr.length) {
            int zp = zp(bArr, i9, bArr.length - i9);
            if (zp == -1) {
                throw new EOFException();
            }
            i9 += zp;
        }
    }

    public zp lMd(long j7) {
        if (j7 == 0) {
            return lMd(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j7)) / 4) + 1;
        COT KS2 = KS(numberOfTrailingZeros);
        byte[] bArr = KS2.zp;
        int i9 = KS2.KS;
        for (int i10 = (i9 + numberOfTrailingZeros) - 1; i10 >= i9; i10--) {
            bArr[i10] = KS[(int) (15 & j7)];
            j7 >>>= 4;
        }
        KS2.KS += numberOfTrailingZeros;
        this.lMd += numberOfTrailingZeros;
        return this;
    }

    public int zp(byte[] bArr, int i9, int i10) {
        YW.zp(bArr.length, i9, i10);
        COT cot = this.zp;
        if (cot == null) {
            return -1;
        }
        int min = Math.min(i10, cot.KS - cot.lMd);
        System.arraycopy(cot.zp, cot.lMd, bArr, i9, min);
        int i11 = cot.lMd + min;
        cot.lMd = i11;
        this.lMd -= min;
        if (i11 == cot.KS) {
            this.zp = cot.lMd();
            HWF.zp(cot);
        }
        return min;
    }

    public zp zp(String str) {
        return zp(str, 0, str.length());
    }

    public zp zp(String str, int i9, int i10) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i9)));
        }
        if (i10 >= i9) {
            if (i10 > str.length()) {
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString());
            }
            while (i9 < i10) {
                char charAt2 = str.charAt(i9);
                if (charAt2 < 128) {
                    COT KS2 = KS(1);
                    byte[] bArr = KS2.zp;
                    int i11 = KS2.KS - i9;
                    int min = Math.min(i10, 8192 - i11);
                    int i12 = i9 + 1;
                    bArr[i9 + i11] = (byte) charAt2;
                    while (true) {
                        i9 = i12;
                        if (i9 >= min || (charAt = str.charAt(i9)) >= 128) {
                            break;
                        }
                        i12 = i9 + 1;
                        bArr[i9 + i11] = (byte) charAt;
                    }
                    int i13 = KS2.KS;
                    int i14 = (i11 + i9) - i13;
                    KS2.KS = i13 + i14;
                    this.lMd += i14;
                } else {
                    if (charAt2 < 2048) {
                        lMd((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        lMd((charAt2 & '?') | 128);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i15 = i9 + 1;
                        char charAt3 = i15 < i10 ? str.charAt(i15) : (char) 0;
                        if (charAt2 <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                            int i16 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            lMd((i16 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            lMd(((i16 >> 12) & 63) | 128);
                            lMd(((i16 >> 6) & 63) | 128);
                            lMd((i16 & 63) | 128);
                            i9 += 2;
                        } else {
                            lMd(63);
                            i9 = i15;
                        }
                    } else {
                        lMd((charAt2 >> '\f') | 224);
                        lMd(((charAt2 >> 6) & 63) | 128);
                        lMd((charAt2 & '?') | 128);
                    }
                    i9++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < "));
    }

    public zp zp(int i9) {
        if (i9 < 128) {
            lMd(i9);
        } else if (i9 < 2048) {
            lMd((i9 >> 6) | PsExtractor.AUDIO_STREAM);
            lMd((i9 & 63) | 128);
        } else if (i9 < 65536) {
            if (i9 >= 55296 && i9 <= 57343) {
                lMd(63);
            } else {
                lMd((i9 >> 12) | 224);
                lMd(((i9 >> 6) & 63) | 128);
                lMd((i9 & 63) | 128);
            }
        } else if (i9 <= 1114111) {
            lMd((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            lMd(((i9 >> 12) & 63) | 128);
            lMd(((i9 >> 6) & 63) | 128);
            lMd((i9 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i9));
        }
        return this;
    }

    public zp zp(String str, int i9, int i10, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i9 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i9)));
        }
        if (i10 >= i9) {
            if (i10 > str.length()) {
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString());
            }
            if (charset != null) {
                if (charset.equals(YW.zp)) {
                    return zp(str, i9, i10);
                }
                byte[] bytes = str.substring(i9, i10).getBytes(charset);
                return lMd(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < "));
    }
}
