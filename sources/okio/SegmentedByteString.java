package okio;

import com.facebook.appevents.AppEventsConstants;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import z0.m;

/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SegmentedByteString {

    @NotNull
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b2, int i2) {
        return b2 & i2;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] bArr, int i2, @NotNull byte[] bArr2, int i3, int i4) {
        p0.a.s(bArr, "a");
        p0.a.s(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            StringBuilder r2 = androidx.compose.foundation.text.input.a.r("size=", j2, " offset=");
            r2.append(j3);
            r2.append(" byteCount=");
            r2.append(j4);
            throw new ArrayIndexOutOfBoundsException(r2.toString());
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int leftRotate(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public static final long minOf(long j2, int i2) {
        return Math.min(j2, i2);
    }

    @NotNull
    public static final Buffer.UnsafeCursor resolveDefaultParameter(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        p0.a.s(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final long rightRotate(long j2, int i2) {
        return (j2 << (64 - i2)) | (j2 >>> i2);
    }

    public static final int shl(byte b2, int i2) {
        return b2 << i2;
    }

    public static final int shr(byte b2, int i2) {
        return b2 >> i2;
    }

    @NotNull
    public static final String toHexString(byte b2) {
        return new String(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b2 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b2 & 15]});
    }

    public static final byte xor(byte b2, byte b3) {
        return (byte) (b2 ^ b3);
    }

    public static final long and(byte b2, long j2) {
        return b2 & j2;
    }

    public static final long minOf(int i2, long j2) {
        return Math.min(i2, j2);
    }

    public static final int resolveDefaultParameter(@NotNull ByteString byteString, int i2) {
        p0.a.s(byteString, "<this>");
        return i2 == DEFAULT__ByteString_size ? byteString.size() : i2;
    }

    public static final long reverseBytes(long j2) {
        return ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    public static final long and(int i2, long j2) {
        return i2 & j2;
    }

    public static final int resolveDefaultParameter(@NotNull byte[] bArr, int i2) {
        p0.a.s(bArr, "<this>");
        return i2 == DEFAULT__ByteString_size ? bArr.length : i2;
    }

    public static final short reverseBytes(short s2) {
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    @NotNull
    public static final String toHexString(int i2) {
        if (i2 == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int i3 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i2 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        return m.L0(cArr, i3, 8);
    }

    @NotNull
    public static final String toHexString(long j2) {
        if (j2 == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int i2 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j2 >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j2 & 15)]};
        while (i2 < 16 && cArr[i2] == '0') {
            i2++;
        }
        return m.L0(cArr, i2, 16);
    }
}
