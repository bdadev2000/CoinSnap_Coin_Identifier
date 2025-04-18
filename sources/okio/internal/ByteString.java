package okio.internal;

import android.support.v4.media.d;
import com.google.common.primitives.UnsignedBytes;
import e0.q;
import java.util.Arrays;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

/* renamed from: okio.internal.-ByteString */
/* loaded from: classes3.dex */
public final class ByteString {

    @NotNull
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int codePointIndexToCharIndex(byte[] bArr, int i2) {
        byte b2;
        int i3;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (i4 < length) {
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                int i7 = i6 + 1;
                if (i6 == i2) {
                    return i5;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (Byte.MAX_VALUE <= b3 && b3 < 160))) || b3 == 65533) {
                    return -1;
                }
                i5 += b3 < 65536 ? 1 : 2;
                i4++;
                while (true) {
                    i6 = i7;
                    if (i4 < length && (b2 = bArr[i4]) >= 0) {
                        i4++;
                        i7 = i6 + 1;
                        if (i6 == i2) {
                            return i5;
                        }
                        if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (Byte.MAX_VALUE > b2 || b2 >= 160))) && b2 != 65533) {
                            i5 += b2 < 65536 ? 1 : 2;
                        }
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i8 = i4 + 1;
                if (length <= i8) {
                    if (i6 == i2) {
                        return i5;
                    }
                    return -1;
                }
                byte b4 = bArr[i8];
                if ((b4 & 192) != 128) {
                    if (i6 == i2) {
                        return i5;
                    }
                    return -1;
                }
                int i9 = (b3 << 6) ^ (b4 ^ UnsignedBytes.MAX_POWER_OF_TWO);
                if (i9 < 128) {
                    if (i6 == i2) {
                        return i5;
                    }
                    return -1;
                }
                int i10 = i6 + 1;
                if (i6 == i2) {
                    return i5;
                }
                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                    return -1;
                }
                i5 += i9 < 65536 ? 1 : 2;
                i4 += 2;
                i6 = i10;
            } else {
                if ((b3 >> 4) == -2) {
                    int i11 = i4 + 2;
                    if (length <= i11) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b5 = bArr[i4 + 1];
                    if ((b5 & 192) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b6 = bArr[i11];
                    if ((b6 & 192) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    int i12 = (b3 << 12) ^ ((b6 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b5 << 6));
                    if (i12 < 2048) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    if (55296 <= i12 && i12 < 57344) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    i3 = i6 + 1;
                    if (i6 == i2) {
                        return i5;
                    }
                    if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                        return -1;
                    }
                    i5 += i12 < 65536 ? 1 : 2;
                    i4 += 3;
                } else {
                    if ((b3 >> 3) != -2) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    int i13 = i4 + 3;
                    if (length <= i13) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i4 + 1];
                    if ((b7 & 192) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i4 + 2];
                    if ((b8 & 192) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    byte b9 = bArr[i13];
                    if ((b9 & 192) != 128) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    int i14 = (b3 << 18) ^ (((b9 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b8 << 6)) ^ (b7 << 12));
                    if (i14 > 1114111) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    if (55296 <= i14 && i14 < 57344) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    if (i14 < 65536) {
                        if (i6 == i2) {
                            return i5;
                        }
                        return -1;
                    }
                    i3 = i6 + 1;
                    if (i6 == i2) {
                        return i5;
                    }
                    if ((i14 != 10 && i14 != 13 && ((i14 >= 0 && i14 < 32) || (127 <= i14 && i14 < 160))) || i14 == 65533) {
                        return -1;
                    }
                    i5 += i14 < 65536 ? 1 : 2;
                    i4 += 4;
                }
                i6 = i3;
            }
        }
        return i5;
    }

    @NotNull
    public static final String commonBase64(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@NotNull okio.ByteString byteString, @NotNull okio.ByteString byteString2) {
        a.s(byteString, "<this>");
        a.s(byteString2, "other");
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = byteString.getByte(i2) & UnsignedBytes.MAX_VALUE;
            int i4 = byteString2.getByte(i2) & UnsignedBytes.MAX_VALUE;
            if (i3 != i4) {
                return i3 < i4 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(@NotNull okio.ByteString byteString, int i2, @NotNull byte[] bArr, int i3, int i4) {
        a.s(byteString, "<this>");
        a.s(bArr, "target");
        q.Q(byteString.getData$okio(), i3, bArr, i2, i4 + i2);
    }

    @Nullable
    public static final okio.ByteString commonDecodeBase64(@NotNull String str) {
        a.s(str, "<this>");
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new okio.ByteString(decodeBase64ToArray);
        }
        return null;
    }

    @NotNull
    public static final okio.ByteString commonDecodeHex(@NotNull String str) {
        a.s(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (decodeHexDigit(str.charAt(i3 + 1)) + (decodeHexDigit(str.charAt(i3)) << 4));
        }
        return new okio.ByteString(bArr);
    }

    @NotNull
    public static final okio.ByteString commonEncodeUtf8(@NotNull String str) {
        a.s(str, "<this>");
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(@NotNull okio.ByteString byteString, @NotNull okio.ByteString byteString2) {
        a.s(byteString, "<this>");
        a.s(byteString2, "suffix");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(@NotNull okio.ByteString byteString, @Nullable Object obj) {
        a.s(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@NotNull okio.ByteString byteString, int i2) {
        a.s(byteString, "<this>");
        return byteString.getData$okio()[i2];
    }

    public static final int commonGetSize(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public static final String commonHex(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i2 = 0;
        for (byte b2 : byteString.getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = getHEX_DIGIT_CHARS()[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = getHEX_DIGIT_CHARS()[b2 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@NotNull okio.ByteString byteString, @NotNull byte[] bArr, int i2) {
        a.s(byteString, "<this>");
        a.s(bArr, "other");
        int length = byteString.getData$okio().length - bArr.length;
        int max = Math.max(i2, 0);
        if (max > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull okio.ByteString byteString, @NotNull okio.ByteString byteString2, int i2) {
        a.s(byteString, "<this>");
        a.s(byteString2, "other");
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i2);
    }

    @NotNull
    public static final okio.ByteString commonOf(@NotNull byte[] bArr) {
        a.s(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        a.r(copyOf, "copyOf(...)");
        return new okio.ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(@NotNull okio.ByteString byteString, int i2, @NotNull okio.ByteString byteString2, int i3, int i4) {
        a.s(byteString, "<this>");
        a.s(byteString2, "other");
        return byteString2.rangeEquals(i3, byteString.getData$okio(), i2, i4);
    }

    public static final boolean commonStartsWith(@NotNull okio.ByteString byteString, @NotNull okio.ByteString byteString2) {
        a.s(byteString, "<this>");
        a.s(byteString2, "prefix");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    @NotNull
    public static final okio.ByteString commonSubstring(@NotNull okio.ByteString byteString, int i2, int i3) {
        a.s(byteString, "<this>");
        int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (resolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(d.o(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (resolveDefaultParameter - i2 >= 0) {
            return (i2 == 0 && resolveDefaultParameter == byteString.getData$okio().length) ? byteString : new okio.ByteString(q.U(i2, byteString.getData$okio(), resolveDefaultParameter));
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }

    @NotNull
    public static final okio.ByteString commonToAsciiLowercase(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        for (int i2 = 0; i2 < byteString.getData$okio().length; i2++) {
            byte b2 = byteString.getData$okio()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                a.r(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new okio.ByteString(copyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final okio.ByteString commonToAsciiUppercase(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        for (int i2 = 0; i2 < byteString.getData$okio().length; i2++) {
            byte b2 = byteString.getData$okio()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                a.r(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        copyOf[i3] = (byte) (b3 - 32);
                    }
                }
                return new okio.ByteString(copyOf);
            }
        }
        return byteString;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        a.r(copyOf, "copyOf(...)");
        return copyOf;
    }

    @NotNull
    public static final okio.ByteString commonToByteString(@NotNull byte[] bArr, int i2, int i3) {
        a.s(bArr, "<this>");
        int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i3);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i2, resolveDefaultParameter);
        return new okio.ByteString(q.U(i2, bArr, resolveDefaultParameter + i2));
    }

    @NotNull
    public static final String commonToString(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (codePointIndexToCharIndex != -1) {
            String utf8 = byteString.utf8();
            String substring = utf8.substring(0, codePointIndexToCharIndex);
            a.r(substring, "substring(...)");
            String k12 = m.k1(m.k1(m.k1(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (codePointIndexToCharIndex >= utf8.length()) {
                return "[text=" + k12 + ']';
            }
            return "[size=" + byteString.getData$okio().length + " text=" + k12 + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(byteString.getData$okio().length);
        sb.append(" hex=");
        int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (resolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(d.o(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')').toString());
        }
        if (resolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (resolveDefaultParameter != byteString.getData$okio().length) {
            byteString = new okio.ByteString(q.U(0, byteString.getData$okio(), resolveDefaultParameter));
        }
        sb.append(byteString.hex());
        sb.append("…]");
        return sb.toString();
    }

    @NotNull
    public static final String commonUtf8(@NotNull okio.ByteString byteString) {
        a.s(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@NotNull okio.ByteString byteString, @NotNull Buffer buffer, int i2, int i3) {
        a.s(byteString, "<this>");
        a.s(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i2, i3);
    }

    public static final int decodeHexDigit(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonEndsWith(@NotNull okio.ByteString byteString, @NotNull byte[] bArr) {
        a.s(byteString, "<this>");
        a.s(bArr, "suffix");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonLastIndexOf(@NotNull okio.ByteString byteString, @NotNull byte[] bArr, int i2) {
        a.s(byteString, "<this>");
        a.s(bArr, "other");
        for (int min = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i2), byteString.getData$okio().length - bArr.length); -1 < min; min--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(@NotNull okio.ByteString byteString, int i2, @NotNull byte[] bArr, int i3, int i4) {
        a.s(byteString, "<this>");
        a.s(bArr, "other");
        return i2 >= 0 && i2 <= byteString.getData$okio().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i2, bArr, i3, i4);
    }

    public static final boolean commonStartsWith(@NotNull okio.ByteString byteString, @NotNull byte[] bArr) {
        a.s(byteString, "<this>");
        a.s(bArr, "prefix");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }
}
