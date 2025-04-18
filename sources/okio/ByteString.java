package okio;

import android.support.v4.media.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.q;
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
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.m;

/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    @NotNull
    private final byte[] data;
    private transient int hashCode;

    @Nullable
    private transient String utf8;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                charset = z0.a.f31458a;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = 0;
            }
            if ((i4 & 2) != 0) {
                i3 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i2, i3);
        }

        @d0.a
        @Nullable
        /* renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m770deprecated_decodeBase64(@NotNull String str) {
            p0.a.s(str, "string");
            return decodeBase64(str);
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m771deprecated_decodeHex(@NotNull String str) {
            p0.a.s(str, "string");
            return decodeHex(str);
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m772deprecated_encodeString(@NotNull String str, @NotNull Charset charset) {
            p0.a.s(str, "string");
            p0.a.s(charset, "charset");
            return encodeString(str, charset);
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m773deprecated_encodeUtf8(@NotNull String str) {
            p0.a.s(str, "string");
            return encodeUtf8(str);
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m774deprecated_of(@NotNull ByteBuffer byteBuffer) {
            p0.a.s(byteBuffer, "buffer");
            return of(byteBuffer);
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m776deprecated_read(@NotNull InputStream inputStream, int i2) {
            p0.a.s(inputStream, "inputstream");
            return read(inputStream, i2);
        }

        @Nullable
        public final ByteString decodeBase64(@NotNull String str) {
            p0.a.s(str, "<this>");
            byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @NotNull
        public final ByteString decodeHex(@NotNull String str) {
            p0.a.s(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (okio.internal.ByteString.access$decodeHexDigit(str.charAt(i3 + 1)) + (okio.internal.ByteString.access$decodeHexDigit(str.charAt(i3)) << 4));
            }
            return new ByteString(bArr);
        }

        @NotNull
        public final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
            p0.a.s(str, "<this>");
            p0.a.s(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            p0.a.r(bytes, "getBytes(...)");
            return new ByteString(bytes);
        }

        @NotNull
        public final ByteString encodeUtf8(@NotNull String str) {
            p0.a.s(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @NotNull
        public final ByteString of(@NotNull ByteBuffer byteBuffer) {
            p0.a.s(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @NotNull
        public final ByteString read(@NotNull InputStream inputStream, int i2) throws IOException {
            p0.a.s(inputStream, "<this>");
            if (i2 < 0) {
                throw new IllegalArgumentException(d.i("byteCount < 0: ", i2).toString());
            }
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    throw new EOFException();
                }
                i3 += read;
            }
            return new ByteString(bArr);
        }

        @d0.a
        @NotNull
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m775deprecated_of(@NotNull byte[] bArr, int i2, int i3) {
            p0.a.s(bArr, "array");
            return of(bArr, i2, i3);
        }

        @NotNull
        public final ByteString of(@NotNull byte... bArr) {
            p0.a.s(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            p0.a.r(copyOf, "copyOf(...)");
            return new ByteString(copyOf);
        }

        @NotNull
        public final ByteString of(@NotNull byte[] bArr, int i2, int i3) {
            p0.a.s(bArr, "<this>");
            int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i3);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i2, resolveDefaultParameter);
            return new ByteString(q.U(i2, bArr, resolveDefaultParameter + i2));
        }
    }

    public ByteString(@NotNull byte[] bArr) {
        p0.a.s(bArr, "data");
        this.data = bArr;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i2, byte[] bArr, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        byteString.copyInto(i2, bArr, i3, i4);
    }

    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return Companion.decodeBase64(str);
    }

    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return Companion.decodeHex(str);
    }

    @NotNull
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return byteString.indexOf(byteString2, i2);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i2);
    }

    @NotNull
    public static final ByteString of(@NotNull ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    @NotNull
    public static final ByteString read(@NotNull InputStream inputStream, int i2) throws IOException {
        return Companion.read(inputStream, i2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i2, i3);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @d0.a
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m768deprecated_getByte(int i2) {
        return getByte(i2);
    }

    @d0.a
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m769deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        p0.a.r(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    @NotNull
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public void copyInto(int i2, @NotNull byte[] bArr, int i3, int i4) {
        p0.a.s(bArr, "target");
        q.Q(getData$okio(), i3, bArr, i2, i4 + i2);
    }

    @NotNull
    public ByteString digest$okio(@NotNull String str) {
        p0.a.s(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, size());
        byte[] digest = messageDigest.digest();
        p0.a.p(digest);
        return new ByteString(digest);
    }

    public final boolean endsWith(@NotNull ByteString byteString) {
        p0.a.s(byteString, "suffix");
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i2) {
        return internalGet$okio(i2);
    }

    @NotNull
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @Nullable
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i2 = 0;
        for (byte b2 : getData$okio()) {
            int i3 = i2 + 1;
            cArr[i2] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b2 >> 4) & 15];
            i2 += 2;
            cArr[i3] = okio.internal.ByteString.getHEX_DIGIT_CHARS()[b2 & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public ByteString hmac$okio(@NotNull String str, @NotNull ByteString byteString) {
        p0.a.s(str, "algorithm");
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = mac.doFinal(this.data);
            p0.a.r(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString byteString) {
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        return hmac$okio("HmacSHA1", byteString);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString byteString) {
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        return hmac$okio("HmacSHA256", byteString);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString byteString) {
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        return hmac$okio("HmacSHA512", byteString);
    }

    public final int indexOf(@NotNull ByteString byteString) {
        p0.a.s(byteString, "other");
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @NotNull
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i2) {
        return getData$okio()[i2];
    }

    public final int lastIndexOf(@NotNull ByteString byteString) {
        p0.a.s(byteString, "other");
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @NotNull
    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i2, @NotNull ByteString byteString, int i3, int i4) {
        p0.a.s(byteString, "other");
        return byteString.rangeEquals(i3, getData$okio(), i2, i4);
    }

    public final void setHashCode$okio(int i2) {
        this.hashCode = i2;
    }

    public final void setUtf8$okio(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@NotNull ByteString byteString) {
        p0.a.s(byteString, "prefix");
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        p0.a.s(charset, "charset");
        return new String(this.data, charset);
    }

    @NotNull
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            if (b2 >= 65 && b2 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                p0.a.r(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        copyOf[i3] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        for (int i2 = 0; i2 < getData$okio().length; i2++) {
            byte b2 = getData$okio()[i2];
            if (b2 >= 97 && b2 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                p0.a.r(copyOf, "copyOf(...)");
                copyOf[i2] = (byte) (b2 - 32);
                for (int i3 = i2 + 1; i3 < copyOf.length; i3++) {
                    byte b3 = copyOf[i3];
                    if (b3 >= 97 && b3 <= 122) {
                        copyOf[i3] = (byte) (b3 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        p0.a.r(copyOf, "copyOf(...)");
        return copyOf;
    }

    @NotNull
    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = okio.internal.ByteString.access$codePointIndexToCharIndex(getData$okio(), 64);
        if (access$codePointIndexToCharIndex != -1) {
            String utf8 = utf8();
            String substring = utf8.substring(0, access$codePointIndexToCharIndex);
            p0.a.r(substring, "substring(...)");
            String k12 = m.k1(m.k1(m.k1(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (access$codePointIndexToCharIndex >= utf8.length()) {
                return "[text=" + k12 + ']';
            }
            return "[size=" + getData$okio().length + " text=" + k12 + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(getData$okio().length);
        sb.append(" hex=");
        int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
        if (resolveDefaultParameter > getData$okio().length) {
            throw new IllegalArgumentException(d.o(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
        }
        if (resolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        sb.append((resolveDefaultParameter == getData$okio().length ? this : new ByteString(q.U(0, getData$okio(), resolveDefaultParameter))).hex());
        sb.append("…]");
        return sb.toString();
    }

    @NotNull
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(@NotNull OutputStream outputStream) throws IOException {
        p0.a.s(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(@NotNull Buffer buffer, int i2, int i3) {
        p0.a.s(buffer, "buffer");
        okio.internal.ByteString.commonWrite(this, buffer, i2, i3);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return byteString.indexOf(bArr, i2);
    }

    @NotNull
    public static final ByteString of(@NotNull byte... bArr) {
        return Companion.of(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p0.a.s(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    public final boolean endsWith(@NotNull byte[] bArr) {
        p0.a.s(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(@NotNull byte[] bArr) {
        p0.a.s(bArr, "other");
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(@NotNull byte[] bArr) {
        p0.a.s(bArr, "other");
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i2, @NotNull byte[] bArr, int i3, int i4) {
        p0.a.s(bArr, "other");
        return i2 >= 0 && i2 <= getData$okio().length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && SegmentedByteString.arrayRangeEquals(getData$okio(), i2, bArr, i3, i4);
    }

    public final boolean startsWith(@NotNull byte[] bArr) {
        p0.a.s(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    @NotNull
    public final ByteString substring(int i2) {
        return substring$default(this, i2, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i3 & 2) != 0) {
            i2 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i2);
    }

    @NotNull
    public static final ByteString of(@NotNull byte[] bArr, int i2, int i3) {
        return Companion.of(bArr, i2, i3);
    }

    public final int indexOf(@NotNull ByteString byteString, int i2) {
        p0.a.s(byteString, "other");
        return indexOf(byteString.internalArray$okio(), i2);
    }

    public final int lastIndexOf(@NotNull ByteString byteString, int i2) {
        p0.a.s(byteString, "other");
        return lastIndexOf(byteString.internalArray$okio(), i2);
    }

    @NotNull
    public ByteString substring(int i2, int i3) {
        int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i3);
        if (i2 >= 0) {
            if (resolveDefaultParameter > getData$okio().length) {
                throw new IllegalArgumentException(d.o(new StringBuilder("endIndex > length("), getData$okio().length, ')').toString());
            }
            if (resolveDefaultParameter - i2 >= 0) {
                return (i2 == 0 && resolveDefaultParameter == getData$okio().length) ? this : new ByteString(q.U(i2, getData$okio(), resolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public int indexOf(@NotNull byte[] bArr, int i2) {
        p0.a.s(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i2, 0);
        if (max <= length) {
            while (!SegmentedByteString.arrayRangeEquals(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(@NotNull byte[] bArr, int i2) {
        p0.a.s(bArr, "other");
        for (int min = Math.min(SegmentedByteString.resolveDefaultParameter(this, i2), getData$okio().length - bArr.length); -1 < min; min--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }
}
