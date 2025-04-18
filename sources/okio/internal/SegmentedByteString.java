package okio.internal;

import android.support.v4.media.d;
import e0.q;
import okio.Buffer;
import okio.ByteString;
import okio.C1279SegmentedByteString;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i2, int i3, int i4) {
        a.s(iArr, "<this>");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final void commonCopyInto(@NotNull C1279SegmentedByteString c1279SegmentedByteString, int i2, @NotNull byte[] bArr, int i3, int i4) {
        a.s(c1279SegmentedByteString, "<this>");
        a.s(bArr, "target");
        long j2 = i4;
        okio.SegmentedByteString.checkOffsetAndCount(c1279SegmentedByteString.size(), i2, j2);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i3, j2);
        int i5 = i4 + i2;
        int segment = segment(c1279SegmentedByteString, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : c1279SegmentedByteString.getDirectory$okio()[segment - 1];
            int i7 = c1279SegmentedByteString.getDirectory$okio()[segment] - i6;
            int i8 = c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i5, i7 + i6) - i2;
            int i9 = (i2 - i6) + i8;
            q.Q(c1279SegmentedByteString.getSegments$okio()[segment], i3, bArr, i9, i9 + min);
            i3 += min;
            i2 += min;
            segment++;
        }
    }

    public static final boolean commonEquals(@NotNull C1279SegmentedByteString c1279SegmentedByteString, @Nullable Object obj) {
        a.s(c1279SegmentedByteString, "<this>");
        if (obj == c1279SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c1279SegmentedByteString.size() && c1279SegmentedByteString.rangeEquals(0, byteString, 0, c1279SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C1279SegmentedByteString c1279SegmentedByteString) {
        a.s(c1279SegmentedByteString, "<this>");
        return c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(@NotNull C1279SegmentedByteString c1279SegmentedByteString) {
        a.s(c1279SegmentedByteString, "<this>");
        int hashCode$okio = c1279SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c1279SegmentedByteString.getSegments$okio().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = c1279SegmentedByteString.getDirectory$okio()[length + i2];
            int i6 = c1279SegmentedByteString.getDirectory$okio()[i2];
            byte[] bArr = c1279SegmentedByteString.getSegments$okio()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        c1279SegmentedByteString.setHashCode$okio(i3);
        return i3;
    }

    public static final byte commonInternalGet(@NotNull C1279SegmentedByteString c1279SegmentedByteString, int i2) {
        a.s(c1279SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length - 1], i2, 1L);
        int segment = segment(c1279SegmentedByteString, i2);
        return c1279SegmentedByteString.getSegments$okio()[segment][(i2 - (segment == 0 ? 0 : c1279SegmentedByteString.getDirectory$okio()[segment - 1])) + c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + segment]];
    }

    public static final boolean commonRangeEquals(@NotNull C1279SegmentedByteString c1279SegmentedByteString, int i2, @NotNull ByteString byteString, int i3, int i4) {
        a.s(c1279SegmentedByteString, "<this>");
        a.s(byteString, "other");
        if (i2 < 0 || i2 > c1279SegmentedByteString.size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int segment = segment(c1279SegmentedByteString, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : c1279SegmentedByteString.getDirectory$okio()[segment - 1];
            int i7 = c1279SegmentedByteString.getDirectory$okio()[segment] - i6;
            int i8 = c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!byteString.rangeEquals(i3, c1279SegmentedByteString.getSegments$okio()[segment], (i2 - i6) + i8, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            segment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C1279SegmentedByteString c1279SegmentedByteString, int i2, int i3) {
        a.s(c1279SegmentedByteString, "<this>");
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c1279SegmentedByteString, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException(d.j("beginIndex=", i2, " < 0").toString());
        }
        if (resolveDefaultParameter > c1279SegmentedByteString.size()) {
            StringBuilder t2 = d.t("endIndex=", resolveDefaultParameter, " > length(");
            t2.append(c1279SegmentedByteString.size());
            t2.append(')');
            throw new IllegalArgumentException(t2.toString().toString());
        }
        int i4 = resolveDefaultParameter - i2;
        if (i4 < 0) {
            throw new IllegalArgumentException(d.k("endIndex=", resolveDefaultParameter, " < beginIndex=", i2).toString());
        }
        if (i2 == 0 && resolveDefaultParameter == c1279SegmentedByteString.size()) {
            return c1279SegmentedByteString;
        }
        if (i2 == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = segment(c1279SegmentedByteString, i2);
        int segment2 = segment(c1279SegmentedByteString, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) q.V(segment, segment2 + 1, c1279SegmentedByteString.getSegments$okio());
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i5 = segment;
            int i6 = 0;
            while (true) {
                iArr[i6] = Math.min(c1279SegmentedByteString.getDirectory$okio()[i5] - i2, i4);
                int i7 = i6 + 1;
                iArr[i6 + bArr.length] = c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + i5];
                if (i5 == segment2) {
                    break;
                }
                i5++;
                i6 = i7;
            }
        }
        int i8 = segment != 0 ? c1279SegmentedByteString.getDirectory$okio()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i2 - i8) + iArr[length];
        return new C1279SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C1279SegmentedByteString c1279SegmentedByteString) {
        a.s(c1279SegmentedByteString, "<this>");
        byte[] bArr = new byte[c1279SegmentedByteString.size()];
        int length = c1279SegmentedByteString.getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = c1279SegmentedByteString.getDirectory$okio()[length + i2];
            int i6 = c1279SegmentedByteString.getDirectory$okio()[i2];
            int i7 = i6 - i3;
            q.Q(c1279SegmentedByteString.getSegments$okio()[i2], i4, bArr, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C1279SegmentedByteString c1279SegmentedByteString, @NotNull Buffer buffer, int i2, int i3) {
        a.s(c1279SegmentedByteString, "<this>");
        a.s(buffer, "buffer");
        int i4 = i2 + i3;
        int segment = segment(c1279SegmentedByteString, i2);
        while (i2 < i4) {
            int i5 = segment == 0 ? 0 : c1279SegmentedByteString.getDirectory$okio()[segment - 1];
            int i6 = c1279SegmentedByteString.getDirectory$okio()[segment] - i5;
            int i7 = c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i2;
            int i8 = (i2 - i5) + i7;
            Segment segment2 = new Segment(c1279SegmentedByteString.getSegments$okio()[segment], i8, i8 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                a.p(segment3);
                Segment segment4 = segment3.prev;
                a.p(segment4);
                segment4.push(segment2);
            }
            i2 += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i3);
    }

    public static final void forEachSegment(@NotNull C1279SegmentedByteString c1279SegmentedByteString, @NotNull q0.q qVar) {
        a.s(c1279SegmentedByteString, "<this>");
        a.s(qVar, "action");
        int length = c1279SegmentedByteString.getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = c1279SegmentedByteString.getDirectory$okio()[length + i2];
            int i5 = c1279SegmentedByteString.getDirectory$okio()[i2];
            qVar.invoke(c1279SegmentedByteString.getSegments$okio()[i2], Integer.valueOf(i4), Integer.valueOf(i5 - i3));
            i2++;
            i3 = i5;
        }
    }

    public static final int segment(@NotNull C1279SegmentedByteString c1279SegmentedByteString, int i2) {
        a.s(c1279SegmentedByteString, "<this>");
        int binarySearch = binarySearch(c1279SegmentedByteString.getDirectory$okio(), i2 + 1, 0, c1279SegmentedByteString.getSegments$okio().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private static final void forEachSegment(C1279SegmentedByteString c1279SegmentedByteString, int i2, int i3, q0.q qVar) {
        int segment = segment(c1279SegmentedByteString, i2);
        while (i2 < i3) {
            int i4 = segment == 0 ? 0 : c1279SegmentedByteString.getDirectory$okio()[segment - 1];
            int i5 = c1279SegmentedByteString.getDirectory$okio()[segment] - i4;
            int i6 = c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i3, i5 + i4) - i2;
            qVar.invoke(c1279SegmentedByteString.getSegments$okio()[segment], Integer.valueOf((i2 - i4) + i6), Integer.valueOf(min));
            i2 += min;
            segment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C1279SegmentedByteString c1279SegmentedByteString, int i2, @NotNull byte[] bArr, int i3, int i4) {
        a.s(c1279SegmentedByteString, "<this>");
        a.s(bArr, "other");
        if (i2 < 0 || i2 > c1279SegmentedByteString.size() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int segment = segment(c1279SegmentedByteString, i2);
        while (i2 < i5) {
            int i6 = segment == 0 ? 0 : c1279SegmentedByteString.getDirectory$okio()[segment - 1];
            int i7 = c1279SegmentedByteString.getDirectory$okio()[segment] - i6;
            int i8 = c1279SegmentedByteString.getDirectory$okio()[c1279SegmentedByteString.getSegments$okio().length + segment];
            int min = Math.min(i5, i7 + i6) - i2;
            if (!okio.SegmentedByteString.arrayRangeEquals(c1279SegmentedByteString.getSegments$okio()[segment], (i2 - i6) + i8, bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            segment++;
        }
        return true;
    }
}
