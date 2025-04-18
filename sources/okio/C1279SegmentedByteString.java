package okio;

import android.support.v4.media.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import e0.q;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1279SegmentedByteString extends ByteString {

    @NotNull
    private final transient int[] directory;

    @NotNull
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1279SegmentedByteString(@NotNull byte[][] bArr, @NotNull int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        p0.a.s(bArr, "segments");
        p0.a.s(iArr, "directory");
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        p0.a.q(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        p0.a.r(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    @Override // okio.ByteString
    @NotNull
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    @NotNull
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public void copyInto(int i2, @NotNull byte[] bArr, int i3, int i4) {
        p0.a.s(bArr, "target");
        long j2 = i4;
        SegmentedByteString.checkOffsetAndCount(size(), i2, j2);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i3, j2);
        int i5 = i4 + i2;
        int segment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i7 = getDirectory$okio()[segment] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i5, i7 + i6) - i2;
            int i9 = (i2 - i6) + i8;
            q.Q(getSegments$okio()[segment], i3, bArr, i9, i9 + min);
            i3 += min;
            i2 += min;
            segment++;
        }
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString digest$okio(@NotNull String str) {
        p0.a.s(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            messageDigest.update(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        p0.a.p(digest);
        return new ByteString(digest);
    }

    @Override // okio.ByteString
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] getDirectory$okio() {
        return this.directory;
    }

    @NotNull
    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            byte[] bArr = getSegments$okio()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        setHashCode$okio(i3);
        return i3;
    }

    @Override // okio.ByteString
    @NotNull
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString hmac$okio(@NotNull String str, @NotNull ByteString byteString) {
        p0.a.s(str, "algorithm");
        p0.a.s(byteString, SDKConstants.PARAM_KEY);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = getDirectory$okio()[length + i2];
                int i5 = getDirectory$okio()[i2];
                mac.update(getSegments$okio()[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            byte[] doFinal = mac.doFinal();
            p0.a.r(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // okio.ByteString
    public int indexOf(@NotNull byte[] bArr, int i2) {
        p0.a.s(bArr, "other");
        return toByteString().indexOf(bArr, i2);
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i2) {
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i2, 1L);
        int segment = okio.internal.SegmentedByteString.segment(this, i2);
        return getSegments$okio()[segment][(i2 - (segment == 0 ? 0 : getDirectory$okio()[segment - 1])) + getDirectory$okio()[getSegments$okio().length + segment]];
    }

    @Override // okio.ByteString
    public int lastIndexOf(@NotNull byte[] bArr, int i2) {
        p0.a.s(bArr, "other");
        return toByteString().lastIndexOf(bArr, i2);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i2, @NotNull ByteString byteString, int i3, int i4) {
        p0.a.s(byteString, "other");
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int segment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i7 = getDirectory$okio()[segment] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!byteString.rangeEquals(i3, getSegments$okio()[segment], (i2 - i6) + i8, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            segment++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public String string(@NotNull Charset charset) {
        p0.a.s(charset, "charset");
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString substring(int i2, int i3) {
        int resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException(d.j("beginIndex=", i2, " < 0").toString());
        }
        if (resolveDefaultParameter > size()) {
            StringBuilder t2 = d.t("endIndex=", resolveDefaultParameter, " > length(");
            t2.append(size());
            t2.append(')');
            throw new IllegalArgumentException(t2.toString().toString());
        }
        int i4 = resolveDefaultParameter - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException(d.k("endIndex=", resolveDefaultParameter, " < beginIndex=", i2).toString());
        }
        if (i2 == 0 && resolveDefaultParameter == size()) {
            return this;
        }
        if (i2 == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = okio.internal.SegmentedByteString.segment(this, i2);
        int segment2 = okio.internal.SegmentedByteString.segment(this, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) q.V(segment, segment2 + 1, getSegments$okio());
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i5 = segment;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(getDirectory$okio()[i5] - i2, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i5];
                if (i5 == segment2) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = segment != 0 ? getDirectory$okio()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i2 - i8) + iArr[length];
        return new C1279SegmentedByteString(bArr, iArr);
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    @NotNull
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    @NotNull
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            int i7 = i6 - i3;
            q.Q(getSegments$okio()[i2], i4, bArr, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // okio.ByteString
    @NotNull
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public void write(@NotNull OutputStream outputStream) throws IOException {
        p0.a.s(outputStream, "out");
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            outputStream.write(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
    }

    @Override // okio.ByteString
    public void write$okio(@NotNull Buffer buffer, int i2, int i3) {
        p0.a.s(buffer, "buffer");
        int i4 = i2 + i3;
        int segment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[segment] - i5;
            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i2;
            int i8 = (i2 - i5) + i7;
            Segment segment2 = new Segment(getSegments$okio()[segment], i8, i8 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                p0.a.p(segment3);
                Segment segment4 = segment3.prev;
                p0.a.p(segment4);
                segment4.push(segment2);
            }
            i2 += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i3);
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i2, @NotNull byte[] bArr, int i3, int i4) {
        p0.a.s(bArr, "other");
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int segment = okio.internal.SegmentedByteString.segment(this, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i7 = getDirectory$okio()[segment] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[segment], (i2 - i6) + i8, bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            segment++;
        }
        return true;
    }
}
