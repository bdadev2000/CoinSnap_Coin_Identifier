package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    private static final long serialVersionUID = 1;
    final byte[] data;
    transient int hashCode;
    transient String utf8;
    static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ByteString EMPTY = of(new byte[0]);

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    public static int codePointIndexToCharIndex(String str, int i9) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            if (i11 == i9) {
                return i10;
            }
            int codePointAt = str.codePointAt(i10);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i11++;
            i10 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    public static ByteString decodeBase64(String str) {
        if (str != null) {
            byte[] decode = Base64.decode(str);
            if (decode != null) {
                return new ByteString(decode);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static ByteString decodeHex(String str) {
        if (str != null) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 * 2;
                    bArr[i9] = (byte) ((decodeHexDigit(str.charAt(i10)) << 4) + decodeHexDigit(str.charAt(i10 + 1)));
                }
                return of(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int decodeHexDigit(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return c9 - '0';
        }
        if (c9 >= 'a' && c9 <= 'f') {
            return c9 - 'W';
        }
        if (c9 >= 'A' && c9 <= 'F') {
            return c9 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c9);
    }

    private ByteString digest(String str) {
        try {
            return of(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }

    public static ByteString encodeString(String str, Charset charset) {
        if (str != null) {
            if (charset != null) {
                return new ByteString(str.getBytes(charset));
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("s == null");
    }

    public static ByteString encodeUtf8(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(Util.UTF_8));
            byteString.utf8 = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    private ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            return of(mac.doFinal(this.data));
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException e9) {
            throw new AssertionError(e9);
        }
    }

    public static ByteString of(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString read(InputStream inputStream, int i9) throws IOException {
        if (inputStream != null) {
            if (i9 >= 0) {
                byte[] bArr = new byte[i9];
                int i10 = 0;
                while (i10 < i9) {
                    int read = inputStream.read(bArr, i10, i9 - i10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(o.h(i9, "byteCount < 0: "));
        }
        throw new IllegalArgumentException("in == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = read(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = ByteString.class.getDeclaredField(DataSchemeDataSource.SCHEME_DATA);
            declaredField.setAccessible(true);
            declaredField.set(this, read.data);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public String base64() {
        return Base64.encode(this.data);
    }

    public String base64Url() {
        return Base64.encodeUrl(this.data);
    }

    public final boolean endsWith(ByteString byteString) {
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            byte[] bArr = this.data;
            if (size == bArr.length && byteString.rangeEquals(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte getByte(int i9) {
        return this.data[i9];
    }

    public int hashCode() {
        int i9 = this.hashCode;
        if (i9 == 0) {
            int hashCode = Arrays.hashCode(this.data);
            this.hashCode = hashCode;
            return hashCode;
        }
        return i9;
    }

    public String hex() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i9 = 0;
        for (byte b : bArr) {
            int i10 = i9 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i9] = cArr2[(b >> 4) & 15];
            i9 += 2;
            cArr[i10] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public ByteString hmacSha1(ByteString byteString) {
        return hmac("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        return hmac("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        return hmac("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        return indexOf(byteString.internalArray(), 0);
    }

    public byte[] internalArray() {
        return this.data;
    }

    public final int lastIndexOf(ByteString byteString) {
        return lastIndexOf(byteString.internalArray(), size());
    }

    public ByteString md5() {
        return digest(SameMD5.TAG);
    }

    public boolean rangeEquals(int i9, ByteString byteString, int i10, int i11) {
        return byteString.rangeEquals(i10, this.data, i9, i11);
    }

    public ByteString sha1() {
        return digest("SHA-1");
    }

    public ByteString sha256() {
        return digest(Constants.SHA256);
    }

    public ByteString sha512() {
        return digest("SHA-512");
    }

    public int size() {
        return this.data.length;
    }

    public final boolean startsWith(ByteString byteString) {
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        if (charset != null) {
            return new String(this.data, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public ByteString substring(int i9) {
        return substring(i9, this.data.length);
    }

    public ByteString toAsciiLowercase() {
        int i9 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i9 < bArr.length) {
                byte b = bArr[i9];
                if (b >= 65 && b <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i9] = (byte) (b + 32);
                    for (int i10 = i9 + 1; i10 < bArr2.length; i10++) {
                        byte b8 = bArr2[i10];
                        if (b8 >= 65 && b8 <= 90) {
                            bArr2[i10] = (byte) (b8 + 32);
                        }
                    }
                    return new ByteString(bArr2);
                }
                i9++;
            } else {
                return this;
            }
        }
    }

    public ByteString toAsciiUppercase() {
        int i9 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i9 < bArr.length) {
                byte b = bArr[i9];
                if (b >= 97 && b <= 122) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i9] = (byte) (b - 32);
                    for (int i10 = i9 + 1; i10 < bArr2.length; i10++) {
                        byte b8 = bArr2[i10];
                        if (b8 >= 97 && b8 <= 122) {
                            bArr2[i10] = (byte) (b8 - 32);
                        }
                    }
                    return new ByteString(bArr2);
                }
                i9++;
            } else {
                return this;
            }
        }
    }

    public byte[] toByteArray() {
        return (byte[]) this.data.clone();
    }

    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String utf8 = utf8();
        int codePointIndexToCharIndex = codePointIndexToCharIndex(utf8, 64);
        if (codePointIndexToCharIndex == -1) {
            if (this.data.length <= 64) {
                return "[hex=" + hex() + "]";
            }
            return "[size=" + this.data.length + " hex=" + substring(0, 64).hex() + "…]";
        }
        String replace = utf8.substring(0, codePointIndexToCharIndex).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (codePointIndexToCharIndex < utf8.length()) {
            return "[size=" + this.data.length + " text=" + replace + "…]";
        }
        return AbstractC2914a.e("[text=", replace, "]");
    }

    public String utf8() {
        String str = this.utf8;
        if (str == null) {
            String str2 = new String(this.data, Util.UTF_8);
            this.utf8 = str2;
            return str2;
        }
        return str;
    }

    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.data);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        int min = Math.min(size, size2);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = getByte(i9) & 255;
            int i11 = byteString.getByte(i9) & 255;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(byte[] bArr) {
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(ByteString byteString, int i9) {
        return indexOf(byteString.internalArray(), i9);
    }

    public final int lastIndexOf(ByteString byteString, int i9) {
        return lastIndexOf(byteString.internalArray(), i9);
    }

    public boolean rangeEquals(int i9, byte[] bArr, int i10, int i11) {
        if (i9 >= 0) {
            byte[] bArr2 = this.data;
            if (i9 <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && Util.arrayRangeEquals(bArr2, i9, bArr, i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public final boolean startsWith(byte[] bArr) {
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public ByteString substring(int i9, int i10) {
        if (i9 >= 0) {
            byte[] bArr = this.data;
            if (i10 > bArr.length) {
                throw new IllegalArgumentException(AbstractC2914a.g(new StringBuilder("endIndex > length("), this.data.length, ")"));
            }
            int i11 = i10 - i9;
            if (i11 >= 0) {
                if (i9 == 0 && i10 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i9, bArr2, 0, i11);
                return new ByteString(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public static ByteString of(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            Util.checkOffsetAndCount(bArr.length, i9, i10);
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            return new ByteString(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public final int indexOf(byte[] bArr) {
        return indexOf(bArr, 0);
    }

    public final int lastIndexOf(byte[] bArr) {
        return lastIndexOf(bArr, size());
    }

    public void write(Buffer buffer) {
        byte[] bArr = this.data;
        buffer.write(bArr, 0, bArr.length);
    }

    public int indexOf(byte[] bArr, int i9) {
        int length = this.data.length - bArr.length;
        for (int max = Math.max(i9, 0); max <= length; max++) {
            if (Util.arrayRangeEquals(this.data, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i9) {
        for (int min = Math.min(i9, this.data.length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(this.data, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static ByteString of(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }
}
