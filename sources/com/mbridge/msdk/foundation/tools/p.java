package com.mbridge.msdk.foundation.tools;

import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.StandardCharsets;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class p {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f13633b;

    /* renamed from: c, reason: collision with root package name */
    private char[] f13634c;

    public p(int i10) {
        this(new byte[i10], 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                i11++;
            } else if (charAt < 2048) {
                i11 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i11 += 3;
            } else {
                i12++;
                i11 += 4;
            }
            i10 = i12;
        }
        return i11;
    }

    private long c(int i10) {
        byte[] bArr = this.a;
        long j3 = bArr[i10] & 255;
        int i11 = i10 + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r1] & 255) << 8) | ((bArr[r9] & 255) << 16);
        long j11 = j10 | ((bArr[i11] & 255) << 24);
        long j12 = j11 | ((bArr[r9] & 255) << 32);
        int i12 = i11 + 1 + 1 + 1;
        return j12 | ((bArr[r3] & 255) << 40) | ((255 & bArr[i12]) << 48) | (bArr[i12 + 1] << 56);
    }

    public final long b() {
        long c10 = c(this.f13633b);
        this.f13633b += 8;
        return c10;
    }

    public final short d() {
        byte[] bArr = this.a;
        int i10 = this.f13633b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f13633b = i11 + 1;
        return (short) ((bArr[i11] << 8) | i12);
    }

    public p(byte[] bArr, int i10) {
        this.f13634c = null;
        this.a = bArr;
        this.f13633b = i10;
    }

    public final int c() {
        byte[] bArr = this.a;
        int i10 = this.f13633b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 16);
        this.f13633b = i14 + 1;
        return (bArr[i14] << Ascii.CAN) | i15;
    }

    public final byte a() {
        byte[] bArr = this.a;
        int i10 = this.f13633b;
        this.f13633b = i10 + 1;
        return bArr[i10];
    }

    public final void b(int i10) {
        byte[] bArr = this.a;
        int i11 = this.f13633b;
        int i12 = i11 + 1;
        bArr[i11] = (byte) i10;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i10 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i10 >> 16);
        this.f13633b = i14 + 1;
        bArr[i14] = (byte) (i10 >> 24);
    }

    public final long a(int i10, int i11) {
        long j3 = 0;
        if (i11 <= 0) {
            return 0L;
        }
        int i12 = i11 >> 3;
        int i13 = i11 & 7;
        int i14 = 0;
        int i15 = i10;
        for (int i16 = 0; i16 < i12; i16++) {
            j3 ^= c(i15);
            i15 += 8;
        }
        while (i14 < (i13 << 3)) {
            j3 ^= (this.a[i15] & 255) << i14;
            i14 += 8;
            i15++;
        }
        int i17 = (i10 & 7) << 3;
        return (j3 >>> (64 - i17)) | (j3 << i17);
    }

    public p(byte[] bArr) {
        this(bArr, 0);
    }

    public final void a(byte b3) {
        byte[] bArr = this.a;
        int i10 = this.f13633b;
        this.f13633b = i10 + 1;
        bArr[i10] = b3;
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.a, this.f13633b, length);
            this.f13633b += length;
        }
    }

    public final void b(int i10, int i11) {
        byte[] bArr = this.a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        bArr[i13] = (byte) (i11 >> 16);
        bArr[i13 + 1] = (byte) (i11 >> 24);
    }

    public final void a(long j3) {
        a(this.f13633b, j3);
        this.f13633b += 8;
    }

    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.a;
        int i10 = this.f13633b;
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                bArr[i10] = (byte) charAt;
                i11 = i12;
                i10++;
            } else if (charAt < 2048) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) ((charAt >>> 6) | PsExtractor.AUDIO_STREAM);
                i10 = i13 + 1;
                bArr[i13] = (byte) ((charAt & '?') | 128);
                i11 = i12;
            } else if (charAt >= 55296 && charAt <= 57343) {
                int i14 = i12 + 1;
                int charAt2 = ((charAt << '\n') + str.charAt(i12)) - 56613888;
                int i15 = i10 + 1;
                bArr[i10] = (byte) ((charAt2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((charAt2 >>> 12) & 63) | 128);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i10 = i17 + 1;
                bArr[i17] = (byte) ((charAt2 & 63) | 128);
                i11 = i14;
            } else {
                int i18 = i10 + 1;
                bArr[i10] = (byte) ((charAt >>> '\f') | 224);
                int i19 = i18 + 1;
                bArr[i18] = (byte) (((charAt >>> 6) & 63) | 128);
                bArr[i19] = (byte) ((charAt & '?') | 128);
                i11 = i12;
                i10 = i19 + 1;
            }
        }
        this.f13633b = i10;
    }

    public final void a(int i10, long j3) {
        byte[] bArr = this.a;
        int i11 = i10 + 1;
        bArr[i10] = (byte) j3;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (j3 >> 8);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (j3 >> 16);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (j3 >> 24);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (j3 >> 32);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (j3 >> 40);
        bArr[i16] = (byte) (j3 >> 48);
        bArr[i16 + 1] = (byte) (j3 >> 56);
    }

    public final void a(short s5) {
        byte[] bArr = this.a;
        int i10 = this.f13633b;
        int i11 = i10 + 1;
        bArr[i10] = (byte) s5;
        this.f13633b = i11 + 1;
        bArr[i11] = (byte) (s5 >> 8);
    }

    public final String a(int i10) {
        String str;
        if (i10 < 0) {
            return null;
        }
        if (i10 == 0) {
            return "";
        }
        if (i10 > 2048) {
            str = new String(this.a, this.f13633b, i10, StandardCharsets.UTF_8);
        } else {
            char[] cArr = this.f13634c;
            if (cArr == null) {
                if (i10 <= 256) {
                    this.f13634c = new char[NotificationCompat.FLAG_LOCAL_ONLY];
                } else {
                    this.f13634c = new char[2048];
                }
            } else if (cArr.length < i10) {
                this.f13634c = new char[2048];
            }
            char[] cArr2 = this.f13634c;
            byte[] bArr = this.a;
            int i11 = this.f13633b;
            int i12 = i11 + i10;
            int i13 = 0;
            while (i11 < i12) {
                int i14 = i11 + 1;
                byte b3 = bArr[i11];
                if (b3 > 0) {
                    cArr2[i13] = (char) b3;
                    i11 = i14;
                    i13++;
                } else if (b3 < -32) {
                    cArr2[i13] = (char) (((b3 & Ascii.US) << 6) | (bArr[i14] & 63));
                    i11 = i14 + 1;
                    i13++;
                } else if (b3 < -16) {
                    int i15 = i14 + 1;
                    cArr2[i13] = (char) (((b3 & Ascii.SI) << 12) | ((bArr[i14] & 63) << 6) | (bArr[i15] & 63));
                    i11 = i15 + 1;
                    i13++;
                } else {
                    int i16 = i14 + 1;
                    int i17 = i16 + 1;
                    int i18 = ((b3 & 7) << 18) | ((bArr[i14] & 63) << 12) | ((bArr[i16] & 63) << 6) | (bArr[i17] & 63);
                    int i19 = i13 + 1;
                    cArr2[i13] = (char) ((i18 >>> 10) + 55232);
                    i13 = i19 + 1;
                    cArr2[i19] = (char) ((i18 & 1023) + 56320);
                    i11 = i17 + 1;
                }
            }
            if (i11 <= i12) {
                str = new String(cArr2, 0, i13);
            } else {
                throw new IllegalArgumentException("Invalid String");
            }
        }
        this.f13633b += i10;
        return str;
    }
}
