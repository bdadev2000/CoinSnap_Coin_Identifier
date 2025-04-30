package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16073a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f16074c;

    public p(int i9) {
        this(new byte[i9], 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = i9 + 1;
            char charAt = str.charAt(i9);
            if (charAt < 128) {
                i10++;
            } else if (charAt < 2048) {
                i10 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i10 += 3;
            } else {
                i9 += 2;
                i10 += 4;
            }
            i9 = i11;
        }
        return i10;
    }

    private long c(int i9) {
        byte[] bArr = this.f16073a;
        int i10 = i9 + 6;
        return (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i10] & 255) << 48) | (bArr[i9 + 7] << 56);
    }

    public final long b() {
        long c9 = c(this.b);
        this.b += 8;
        return c9;
    }

    public final short d() {
        byte[] bArr = this.f16073a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = bArr[i9] & 255;
        this.b = i9 + 2;
        return (short) ((bArr[i10] << 8) | i11);
    }

    public p(byte[] bArr, int i9) {
        this.f16074c = null;
        this.f16073a = bArr;
        this.b = i9;
    }

    public final int c() {
        byte[] bArr = this.f16073a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i9 + 3;
        this.b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.b = i9 + 4;
        return (bArr[i14] << Ascii.CAN) | i15;
    }

    public final byte a() {
        byte[] bArr = this.f16073a;
        int i9 = this.b;
        this.b = i9 + 1;
        return bArr[i9];
    }

    public final void b(int i9) {
        byte[] bArr = this.f16073a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        bArr[i10] = (byte) i9;
        int i12 = i10 + 2;
        this.b = i12;
        bArr[i11] = (byte) (i9 >> 8);
        int i13 = i10 + 3;
        this.b = i13;
        bArr[i12] = (byte) (i9 >> 16);
        this.b = i10 + 4;
        bArr[i13] = (byte) (i9 >> 24);
    }

    public final long a(int i9, int i10) {
        long j7 = 0;
        if (i10 <= 0) {
            return 0L;
        }
        int i11 = i10 >> 3;
        int i12 = i10 & 7;
        int i13 = 0;
        int i14 = i9;
        for (int i15 = 0; i15 < i11; i15++) {
            j7 ^= c(i14);
            i14 += 8;
        }
        while (i13 < (i12 << 3)) {
            j7 ^= (this.f16073a[i14] & 255) << i13;
            i13 += 8;
            i14++;
        }
        int i16 = (i9 & 7) << 3;
        return (j7 >>> (64 - i16)) | (j7 << i16);
    }

    public p(byte[] bArr) {
        this(bArr, 0);
    }

    public final String a(int i9) {
        String str;
        if (i9 < 0) {
            return null;
        }
        if (i9 == 0) {
            return "";
        }
        if (i9 > 2048) {
            str = new String(this.f16073a, this.b, i9, StandardCharsets.UTF_8);
        } else {
            char[] cArr = this.f16074c;
            if (cArr == null) {
                if (i9 <= 256) {
                    this.f16074c = new char[NotificationCompat.FLAG_LOCAL_ONLY];
                } else {
                    this.f16074c = new char[2048];
                }
            } else if (cArr.length < i9) {
                this.f16074c = new char[2048];
            }
            char[] cArr2 = this.f16074c;
            byte[] bArr = this.f16073a;
            int i10 = this.b;
            int i11 = i10 + i9;
            int i12 = 0;
            while (i10 < i11) {
                int i13 = i10 + 1;
                byte b = bArr[i10];
                if (b > 0) {
                    cArr2[i12] = (char) b;
                    i12++;
                    i10 = i13;
                } else if (b < -32) {
                    i10 += 2;
                    cArr2[i12] = (char) ((bArr[i13] & 63) | ((b & Ascii.US) << 6));
                    i12++;
                } else if (b < -16) {
                    int i14 = i10 + 2;
                    i10 += 3;
                    cArr2[i12] = (char) (((bArr[i13] & 63) << 6) | ((b & Ascii.SI) << 12) | (bArr[i14] & 63));
                    i12++;
                } else {
                    byte b8 = bArr[i13];
                    int i15 = i10 + 3;
                    byte b9 = bArr[i10 + 2];
                    i10 += 4;
                    int i16 = ((b8 & 63) << 12) | ((b & 7) << 18) | ((b9 & 63) << 6) | (bArr[i15] & 63);
                    int i17 = i12 + 1;
                    cArr2[i12] = (char) ((i16 >>> 10) + 55232);
                    i12 += 2;
                    cArr2[i17] = (char) ((i16 & 1023) + 56320);
                }
            }
            if (i10 <= i11) {
                str = new String(cArr2, 0, i12);
            } else {
                throw new IllegalArgumentException("Invalid String");
            }
        }
        this.b += i9;
        return str;
    }

    public final void b(int i9, int i10) {
        byte[] bArr = this.f16073a;
        bArr[i9] = (byte) i10;
        bArr[i9 + 1] = (byte) (i10 >> 8);
        bArr[i9 + 2] = (byte) (i10 >> 16);
        bArr[i9 + 3] = (byte) (i10 >> 24);
    }

    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.f16073a;
        int i9 = this.b;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                bArr[i9] = (byte) charAt;
                i9++;
            } else if (charAt < 2048) {
                int i12 = i9 + 1;
                bArr[i9] = (byte) ((charAt >>> 6) | PsExtractor.AUDIO_STREAM);
                i9 += 2;
                bArr[i12] = (byte) ((charAt & '?') | 128);
            } else if (charAt >= 55296 && charAt <= 57343) {
                i10 += 2;
                int charAt2 = ((charAt << '\n') + str.charAt(i11)) - 56613888;
                bArr[i9] = (byte) ((charAt2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i9 + 1] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i13 = i9 + 3;
                bArr[i9 + 2] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i9 += 4;
                bArr[i13] = (byte) ((charAt2 & 63) | 128);
            } else {
                bArr[i9] = (byte) ((charAt >>> '\f') | 224);
                int i14 = i9 + 2;
                bArr[i9 + 1] = (byte) (((charAt >>> 6) & 63) | 128);
                i9 += 3;
                bArr[i14] = (byte) ((charAt & '?') | 128);
            }
            i10 = i11;
        }
        this.b = i9;
    }

    public final void a(byte b) {
        byte[] bArr = this.f16073a;
        int i9 = this.b;
        this.b = i9 + 1;
        bArr[i9] = b;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f16073a, this.b, length);
            this.b += length;
        }
    }

    public final void a(long j7) {
        a(this.b, j7);
        this.b += 8;
    }

    public final void a(int i9, long j7) {
        byte[] bArr = this.f16073a;
        bArr[i9] = (byte) j7;
        bArr[i9 + 1] = (byte) (j7 >> 8);
        bArr[i9 + 2] = (byte) (j7 >> 16);
        bArr[i9 + 3] = (byte) (j7 >> 24);
        bArr[i9 + 4] = (byte) (j7 >> 32);
        bArr[i9 + 5] = (byte) (j7 >> 40);
        bArr[i9 + 6] = (byte) (j7 >> 48);
        bArr[i9 + 7] = (byte) (j7 >> 56);
    }

    public final void a(short s5) {
        byte[] bArr = this.f16073a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        bArr[i9] = (byte) s5;
        this.b = i9 + 2;
        bArr[i10] = (byte) (s5 >> 8);
    }
}
